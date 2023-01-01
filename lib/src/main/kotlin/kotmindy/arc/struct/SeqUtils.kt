package kotmindy.arc.struct

import arc.struct.*

inline fun <reified T> Seq<T>.getOrNull(index: Int): T?{
    try{
        return this[index]
    }catch(e: Exception){
        return null
    }
}