package kotmindy

typealias BlankRun = () -> Unit
typealias Run<T> = (T) -> Unit
typealias RunR<T> = T.() -> Unit
typealias RunE<T, R> = (T) -> R
typealias RunRE<T, R> = T.() -> R

data class MutablePair<A, B>(var first: A, var second: B)

data class RunDen(var confirmed: BlankRun, var denied: BlankRun){
    fun confirm(new: BlankRun){
        confirmed = new
    }
    
    fun deny(new: BlankRun){
        denied = new
    }
}
