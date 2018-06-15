package pl.pszklarska.livedatabinding.viewmodel

import pl.pszklarska.livedatabinding.model.Kitty
import java.util.*
import java.util.concurrent.TimeUnit

typealias NewKittiesReceived = (Kitty) -> Unit

class KittyRepository {
    private val timer = Timer()
    private val random = Random()
    private val period = TimeUnit.SECONDS.toMillis(1)
    internal fun receiveNewKitties(newKittiesReceived: NewKittiesReceived) {
        timer.schedule(object : TimerTask() {
            override fun run() {
                val arrayOfKittyNames = KittyNames.values()
                val nameRandom = random.nextInt(arrayOfKittyNames.size)
                val ageRandom = random.nextInt(5)
                newKittiesReceived.invoke(Kitty(arrayOfKittyNames[nameRandom].name, ageRandom))
            }
        }, 0, period)
    }
}