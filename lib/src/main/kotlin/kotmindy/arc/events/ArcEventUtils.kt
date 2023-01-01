package kotmindy.arc.events

import arc.*
import kotmindy.*

inline fun <reified T> listen(crossinline cons: RunR<T>) = Events.on(T::class.java){ cons(it) }

inline fun <reified T> listenOnce(crossinline cons: RunR<T>){
    val tee = T::class.java
    val consu = cons
    
    Events.on(tee){
        cons(it)
        
        Events.remove(tee, consu)
    }
}

fun listenTrigger(event: Any, cons: BlankRun) = Events.run(event, cons)