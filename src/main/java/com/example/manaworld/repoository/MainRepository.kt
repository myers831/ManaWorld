package com.example.manaworld.repoository

import com.example.manaworld.data.LocalDataSource
import com.example.manaworld.base.BaseRepositoory

class MainRepository: BaseRepositoory(){
    companion object{
        fun getCharacters(): Array<String>{
            return LocalDataSource.CHARACTER_NAMES
        }
    }
}