package kotmindy.mindustry.ui

import mindustry.*
import kotmindy.*

private val pair = RunDen({}, {})

fun showInfo(text: String, exit: BlankRun = {}) = Vars.ui.showInfoOnHidden(text, exit)

fun showError(text: String) = Vars.ui.showErrorMessage(text)

fun showException(text: String? = null, source: Throwable) = if(text != null) Vars.ui.showException(text, source) else Vars.ui.showException(source)

fun showConfirm(text: String, confirmed: BlankRun = {}) = Vars.ui.showConfirm(text, confirmed)

fun showTitledConfirm(title: String, text: String, confirmed: BlankRun = {}) = Vars.ui.showConfirm(title, text, confirmed)

fun customConfirm(title: String, text: String, yes: String = "Yes", no: String = "No", confirmed: BlankRun, denied: BlankRun) = Vars.ui.showCustomConfirm(title, text, yes, no, confirmed, denied)

fun customConfirm(title: String, text: String, yes: String = "Yes", no: String = "No", oncall: RunDen.() -> Unit){
    pair.confirmed = {}
    pair.denied = {}
    
    oncall(pair)
    
    val (conf, deny) = pair
    
    customConfirm(title, text, yes, no, conf, deny)
}
