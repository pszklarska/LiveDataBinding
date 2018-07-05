package pl.pszklarska.livedatabinding.view

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import pl.pszklarska.livedatabinding.R
import pl.pszklarska.livedatabinding.databinding.ActivityMainBinding
import pl.pszklarska.livedatabinding.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main).apply {
            viewModel = ViewModelProviders.of(this@MainActivity).get(MainViewModel::class.java)
            setLifecycleOwner(this@MainActivity)
        }
    }
}