package com.github.smol.kotmindy.mindustry.world

import mindustry.gen.*
import mindustry.world.*
import com.github.smol.kotmindy.mindustry.*


inline fun <reified T : Building> forEachBuild(
    crossinline predicate: (T) -> Boolean = { it is T },
    crossinline cons: T.() -> Unit
) = Groups.build.each{
    if(it is T && predicate(it)) cons(it)
}


inline fun <reified T : MUnit> forEachUnit(
    crossinline predicate: (T) -> Boolean = { it is T },
    crossinline cons: T.() -> Unit
) = Groups.unit.each{
    if(it is T && predicate(it)) cons(it)
}