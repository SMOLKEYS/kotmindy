package com.github.smol.kotmindy.arc.events

import arc.*
import com.github.smol.kotmindy.*

inline fun <reified T> listen(crossinline cons: T.() -> Unit) = Events.on(T::class.java){ cons(it) }

fun listenTrigger(event: Any, cons: BlankRun) = Events.run(event, cons)
