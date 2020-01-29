package com.example.manaworld.viewModel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.manaworld.repoository.MainRepository

class MainViewModel : ViewModel(){
    val characterList: MutableLiveData<Array<String>> by lazy {MutableLiveData<Array<String>>()}

    private fun loadCharacters(){
       characterList.value = MainRepository.getCharacters()
    }
}