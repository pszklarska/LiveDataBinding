package pl.pszklarska.livedatabinding

import android.databinding.DataBindingUtil.setContentView
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import pl.pszklarska.livedatabinding.databinding.ActivityMainBinding
import pl.pszklarska.livedatabinding.model.Kitty


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = setContentView(this, R.layout.activity_main)
        val kitty = Kitty("Fluffy", 3)
        binding.kitty = kitty
    }
}
