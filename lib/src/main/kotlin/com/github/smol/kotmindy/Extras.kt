package com.github.smol.kotmindy

typealias BlankRun = () -> Unit

data class MutablePair<A, B>(var first: A, var second: B)

data class RunDen(var confirmed: BlankRun, var denied: BlankRun){
    fun confirm(new: BlankRun){
        confirmed = new
    }
    
    fun deny(new: BlankRun){
        denied = new
    }
}
