package pl.pszklarska.livedatabinding.viewmodel

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField
import android.databinding.ObservableInt

class MainViewModel : ViewModel() {

    private val kittyRepository = KittyRepository()

    val kittyName = ObservableField<String>()
    val kittyAge = ObservableInt()

    init {
        kittyRepository.receiveNewKitties {
            kittyName.set(it.name)
            kittyAge.set(it.age)
        }
    }
}