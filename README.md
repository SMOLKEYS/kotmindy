# KotMindy

A library for kotlin mindustry mods which adds some utilities.

## Documentation

Yet to be made.

## Implementation

```
implementation("com.github.SMOLKEYS:kotmindy:<shortcommit/version>")
```

## Implementation Requisites

Kotlin: None, works as-is.

Java: Kotlin STDLIB
```
Why even? Java doesn't support the majority of the features Kotlin can use.
```

## Usage

```kotlin
//example code, do not actually use this!
import arc.util.*
import mindustry.game.EventType.*
import com.github.smol.kotmindy.arc.events.*
import com.github.smol.kotmindy.mindustry.ui.*
import com.github.smol.kotmindy.mindustry.world.*
import com.github.smol.kotmindy.mindustry.events.*


fun main(){
    clientLoad{ Log.info("Cool and good!") }
    
    worldLoad{
        showInfo("Death."){
            customConfirm("Pick", "Pick a side.", "Blocks", "Units"){
                confirm{
                    showConfirm("Health > 100?"){
                        forEachUnit{ kill() }
                    }
                }
                
                deny{
                    forEachBuild{ kill() }
                }
            }
        }
    }
    
    listen<UnitCreateEvent>{
        Log.info("$this")
    }
    
    updateT{ if(Random.nextBoolean()) Log.warn("Be warned!") }
}

```
