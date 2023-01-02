package kotmindy.arc.events

import arc.*
import kotmindy.*

inline fun <reified T> listen(crossinline cons: RunR<T>) = Events.on(T::class.java){ cons(it) }

inline fun <reified T> listenOnce(noinline cons: RunR<T>){
    Events.on(T::class.java){
        cons(it)
        
        Events.remove(T::class.java, cons)
    }
}

fun listenTrigger(event: Any, cons: BlankRun) = Events.run(event, cons)
