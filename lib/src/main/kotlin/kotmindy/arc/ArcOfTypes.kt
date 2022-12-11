package kotmindy.arc

import arc.struct.*

fun <T> seqOf(vararg elements: T): Seq<T>{
    if(elements.isEmpty()) return Seq.with()
    return Seq.with(*elements)
}
