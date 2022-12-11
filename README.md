# KotMindy

A library for kotlin mindustry mods which adds some utilities.

Said utilities can be used to make more simpler code and so on.

This library also provides some UI utilities, but for more better ones, check out the MKUI library.

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
import mindustry.world.blocks.storage.*
import mindustry.world.blocks.distribution.*
import kotmindy.arc.events.*
import kotmindy.mindustry.ui.*
import kotmindy.mindustry.world.*
import kotmindy.mindustry.events.*


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
                    customConfirm("Pick", "Pick again.", "Routers", "Cores"){
                        confirm{
                            forEachBuild<CoreBlock.CoreBuild>{ kill() }
                        }
                        
                        deny{
                            forEachBuild<Router.RouterBuild>{ kill() }
                        }
                    }
                }
            }
        }
    }
    
    listen<UnitCreateEvent>{
        Log.info("$this")
    }
    
    onUpdate{ if(Random.nextBoolean()) Log.warn("Be warned!") }
}

```
