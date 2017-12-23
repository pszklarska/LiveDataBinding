package pl.pszklarska.livedatabinding.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import pl.pszklarska.livedatabinding.model.Kitty

class MainViewModel : ViewModel() {

    private val kittyRepository = KittyRepository()
    private val kittyData = MutableLiveData<Kitty>()

    init {
        kittyRepository.receiveNewKitties({ kitty -> kittyData.postValue(kitty) })
    }

    fun getKittyData(): LiveData<Kitty> {
        return kittyData
    }
}