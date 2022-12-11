package kotmindy.mindustry.world.meta

import mindustry.type.*
import mindustry.world.meta.*

fun Stats.replace(stat: Stat, value: Float, statUnit: StatUnit){
    this.remove(stat)
    this.add(stat, StatValues.number(value, statUnit))
}

fun Stats.replace(stat: Stat, value: Float){
    this.remove(stat)
    this.add(stat, value)
}

fun Stats.replacePercent(stat: Stat, value: Float){
    this.remove(stat)
    this.add(stat, StatValues.number((value * 100f).toInt(), StatUnit.percent))
}

fun Stats.replace(stat: Stat, value: Boolean){
    this.remove(stat)
    this.add(stat, StatValues.bool(value))
}

fun Stats.replace(stat: Stat, item: Item){
    this.remove(stat)
    this.add(stat, StatValues.items(ItemStack(item, 1)))
}

//TODO other methods
