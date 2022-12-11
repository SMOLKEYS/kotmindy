package kotmindy.arc.events

import arc.*
import kotmindy.*

inline fun <reified T> listen(crossinline cons: RunR<T>) = Events.on(T::class.java){ cons(it) }

fun listenTrigger(event: Any, cons: BlankRun) = Events.run(event, cons)
