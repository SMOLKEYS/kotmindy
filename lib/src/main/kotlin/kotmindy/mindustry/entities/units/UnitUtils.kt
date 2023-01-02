package kotmindy.mindustry.entities.units

import mindustry.gen.*
import mindustry.type.*
import kotmindy.*
import kotmindy.arc.struct.*
import kotmindy.mindustry.*

fun weaponOf(unit: UnitType, index: Int) = unit.weapons[index]

fun weaponOfOrNull(unit: UnitType, index: Int) = unit.weapons.getOrNull(index)

fun UnitType.weapon(index: Int) = this.weapons[index]

fun UnitType.weaponOrNull(index: Int) = this.weapons.getOrNull(index)

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
