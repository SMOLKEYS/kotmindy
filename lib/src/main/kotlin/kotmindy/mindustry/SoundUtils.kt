package kotmindy.mindustry

import arc.*

fun setMusicVolume(level: Int) = Core.settings.put("musicvol", level)

fun setSfxVolume(level: Int) = Core.settings.put("sfxvol", level)

fun setAmbientVolume(level: Int) = Core.settings.put("ambientvol", level)