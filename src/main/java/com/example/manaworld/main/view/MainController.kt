package com.example.manaworld.main.view

import android.view.View
import android.widget.Toast
import com.example.manaworld.R
import com.example.manaworld.looadStates.LoadStates
import com.example.manaworld.main.view.MainActivity.Companion.mainContainerOne
import com.example.manaworld.main.view.MainActivity.Companion.mainContext
import com.example.manaworld.main.viewModel.MainViewModel

class MainController {
    companion object{
        private lateinit var bottomBar: View
        fun loadMainScreen(mainViewModel: MainViewModel){
            bottomBar = mainViewModel.getBottomNavView(mainContainerOne)!!
            mainContainerOne.addView(bottomBar)
            setCharacterView(mainViewModel)

            mainViewModel.bottomNavVM?.bottomNav?.setOnNavigationItemSelectedListener { item ->
                when(item.itemId) {
                    R.id.page_1 -> {
                        // Respond to navigation item 1 click
                        Toast.makeText(mainContext, "Page 1",
                                Toast.LENGTH_SHORT).show()
                        setCharacterView(mainViewModel)
                        true
                    }
                    R.id.page_2 -> {
                        // Respond to navigation item 2 click
                        Toast.makeText(mainContext, "Page 2",
                                Toast.LENGTH_SHORT).show()
                        setLocationView(mainViewModel)
                        true
                    }
                    else -> false
                }
            }
        }

        private fun setCharacterView(mainViewModel: MainViewModel){
            mainContainerOne.removeAllViews()
            mainContainerOne.addView(mainViewModel.getCharacterListView(mainContainerOne))
            mainContainerOne.addView(bottomBar)
        }

        private fun setLocationView(mainViewModel: MainViewModel){
            mainContainerOne.removeAllViews()
            mainContainerOne.addView(mainViewModel.getLocationListView(mainContainerOne))
            mainContainerOne.addView(bottomBar)
        }
    }
}