package com.example.manaworld.main.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import android.view.View
import com.example.manaworld.main.customView.BottomNavCustomView
import com.example.manaworld.main.customView.CharacterListOne
import com.example.manaworld.main.customView.LocationListOne
import com.example.manaworld.main.repoository.MainRepository
import com.example.manaworld.model.Character
import com.example.manaworld.model.Location

class MainViewModel() : ViewModel(){
    val characterList: MutableLiveData<ArrayList<Character>> by lazy {MutableLiveData<ArrayList<Character>>()}
    val locationList: MutableLiveData<ArrayList<Location>> by lazy {MutableLiveData<ArrayList<Location>>()}

    var characterView: CharacterListOne? = null
    var locationView: LocationListOne? = null
    var bottomNavVM: BottomNavCustomView? = null

    fun loadCharacters(){
        characterList.value = MainRepository.getCharacters()
    }

    fun loadLocations(){
        locationList.value = MainRepository.getLocations()
    }

    fun getBottomNavView(view: View): View?{
        bottomNavVM = BottomNavCustomView(view.context)
        return bottomNavVM
    }

    fun getCharacterListView(view: View): View?{
        characterView = CharacterListOne(view.context)
        characterView!!.setData(characterList.value!!)
        return characterView
    }

    fun getLocationListView(view: View): View?{
        locationView = LocationListOne(view.context)
        locationView!!.setData(locationList.value!!)
        return locationView
    }
}