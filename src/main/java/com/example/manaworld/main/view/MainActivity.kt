package com.example.manaworld.main.view

import android.content.Context
import androidx.lifecycle.Observer
import android.os.Bundle
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProviders
import com.example.manaworld.R
import com.example.manaworld.base.BaseActivity
import com.example.manaworld.looadStates.LoadStates
import com.example.manaworld.main.viewModel.MainViewModel
import com.example.manaworld.model.Character
import com.example.manaworld.model.Location
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(){

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)


        val characterListObserver = Observer<ArrayList<Character>>{
            mainContext = this
            mainContainerOne = main_container_one

            MainController.loadMainScreen(mainViewModel)
        }

        val locationListObserver = Observer<ArrayList<Location>>{
            mainContext = this
            mainContainerOne = main_container_one

            MainController.loadMainScreen(mainViewModel)
        }

        mainViewModel.characterList.observe(this, characterListObserver)
        mainViewModel.locationList.observe(this, locationListObserver)

        LoadStates.loadStateCharacterScreen(mainViewModel)
        LoadStates.loadStateLocationScreen(mainViewModel)

    }

    companion object{
        lateinit var mainContext: Context
        lateinit var mainContainerOne: FrameLayout
    }
}
