package com.github.smol.kotmindy.arc.events

import arc.*

fun <reified T> on(cons: T.() -> Unit) = Events.on(T::class.java){ cons(it) }

fun run(event: Any, cons: () -> Unit) = Events.run(event, cons)
