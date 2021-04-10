package com.example.manaworld.looadStates

import com.example.manaworld.base.BaseLoadState
import com.example.manaworld.main.viewModel.MainViewModel

class LoadStates: BaseLoadState(){
    companion object{
        fun loadStateCharacterScreen(view: MainViewModel){
            view.loadCharacters()
        }

        fun loadStateLocationScreen(view: MainViewModel){
            view.loadLocations()
        }
    }
}