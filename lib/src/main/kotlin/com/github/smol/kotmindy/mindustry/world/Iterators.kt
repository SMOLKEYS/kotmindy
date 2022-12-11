package com.github.smol.kotmindy.mindustry.world

import mindustry.gen.*
import mindustry.world.*
import com.github.smol.kotmindy.mindustry.*


fun <T : Building> forEachBuild(predicate: (T) -> Boolean = { it is T }, cons: T.() -> Unit){
    Groups.build.each{
        if(predicate(it) && it is T) cons(it)
    }
}

fun <T : MUnit> forEachUnit(predicate: (T) -> Boolean = { it is T }, cons: T.() -> Unit){
    Groups.unit.each{
        if(predicate(it) && it is T) cons(it)
    }
}