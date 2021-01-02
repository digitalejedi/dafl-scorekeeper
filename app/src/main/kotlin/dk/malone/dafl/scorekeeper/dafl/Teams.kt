package dk.malone.dafl.scorekeeper.dafl

import androidx.annotation.DrawableRes
import dk.malone.dafl.scorekeeper.R

enum class Teams(
    val tfrId: Int,
    val displayName: String,
    @DrawableRes val icon: Int
){
    // TODO Helsingborg
    KANGAROOS(6, "Aalborg Kangaroos", R.drawable.aafc),
    BOMBERS(16, "Aarhus Bombers", R.drawable.ic_launcher_background), // TODO
    CATS(27, "Farum Cats", R.drawable.faf_cats),
    MAULERS(52, "Port Malmö Maulers", R.drawable.ic_launcher_background), // TODO
    LIONS(401, "Odense Lions", R.drawable.olfc),
    GIANTS(454, "Copenhagen Giants", R.drawable.faf_giants),
    BARRACUDAS(455, "Copenhagen Barracudas", R.drawable.caf),
}