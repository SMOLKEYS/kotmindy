package kotmindy.mindustry.world

import mindustry.gen.*
import mindustry.world.*
import kotmindy.mindustry.*


inline fun <reified T : Building> forEachBuild(
    crossinline predicate: RunRE<T, Boolean> = { it is T },
    crossinline cons: RunR<T>
) = Groups.build.each{
    if(it is T && predicate(it)) cons(it)
}


inline fun <reified T : MUnit> forEachUnit(
    crossinline predicate: RunRE<T, Boolean> = { it is T },
    crossinline cons: RunR<T>
) = Groups.unit.each{
    if(it is T && predicate(it)) cons(it)
}
