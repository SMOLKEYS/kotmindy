package com.github.smol.kotmindy.mindustry.world

import mindustry.gen.*
import mindustry.world.*
import com.github.smol.kotmindy.mindustry.*


inline fun <reified T : Building> forEachBuild(
    crossinline predicate: (T) -> Boolean = { it is T },
    crossinline cons: T.() -> Unit
) = Groups.build.each{
    if(predicate(it) && it is T) cons(it)
}


inline fun <T : MUnit> forEachUnit(
    crossinline predicate: (T) -> Boolean = { it is T },
    crossinline cons: T.() -> Unit
) = Groups.unit.each{
    if(predicate(it) && it is T) cons(it)
}