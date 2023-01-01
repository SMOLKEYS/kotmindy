package kotmindy.mindustry.entities.units

import mindustry.gen.*
import mindustry.type.*
import kotmindy.*
import kotmindy.arc.*
import kotmindy.mindustry.*

fun weaponOf(unit: UnitType, index: Int): Weapon{
    return unit.weapons[index]
}

fun weaponOfOrNull(unit: UnitType, index: Int): Weapon?{
    return unit.weapons.getOrNull(index)
}

fun UnitType.forEachInWorld(cons: Run<MUnit>){
    Groups.unit.each{
        if(it.type == this) cons(it)
    }
}

fun UnitType.letForEachInWorld(cons: RunR<MUnit>){
    Groups.unit.each{
        if(it.type == this) cons(it)
    }
}
