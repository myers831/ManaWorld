package com.example.manaworld.main.repoository

import com.example.manaworld.data.LocalDataSource
import com.example.manaworld.base.BaseRepositoory
import com.example.manaworld.data.LocalDataSource.Companion.getLocationInhabitants
import com.example.manaworld.data.LocalDataSource.Companion.getLocationName
import com.example.manaworld.data.LocalDataSource.Companion.getLocationProductions
import com.example.manaworld.data.LocalDataSource.Companion.getLocationResources
import com.example.manaworld.model.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class MainRepository: BaseRepositoory(){
    companion object{
        fun getCharacters(): ArrayList<Character> {
            var count = 0
            val characters = ArrayList<Character>()
            val abilities = HashMap<String, Ability>()
            val equipment = HashMap<String, Item>()
            val relations = HashMap<String, CharacterRelation>()

            while(count < 10){
                val character = Character(
                        count.toString(),
                        LocalDataSource.CHARACTER_FIRST_NAMES[LocalDataSource.CHARACTER_FIRST_NAMES_RANDOM_CHOICE] +
                                " " + LocalDataSource.CHARACTER_LAST_NAMES[LocalDataSource.CHARACTER_LAST_NAMES_RANDOM_CHOICE],
                        LocalDataSource.CHARACTER_RACES[LocalDataSource.CHARACTER_RACES_RANDOM_CHOICE],
                        LocalDataSource.CHARACTER_SOCIAL_STATUSES[LocalDataSource.CHARACTER_SOCIAL_STATUSES_RANDOM_CHOICE],
                        LocalDataSource.CHARACTER_JOBS[LocalDataSource.CHARACTER_JOBS_RANDOM_CHOICE],
                        LocalDataSource.CHARACTER_ORDERS[LocalDataSource.CHARACTER_ORDERS_RANDOM_CHOICE],
                        LocalDataSource.getBase50() + 50,
                        LocalDataSource.getBase50(),
                        LocalDataSource.getBase50(),
                        LocalDataSource.getBase50(),
                        LocalDataSource.getBase50(),
                        LocalDataSource.getBase50(),
                        abilities,
                        equipment,
                        relations)

                characters.add(character)
                LocalDataSource.reRandomCharacters()
                count++
            }

            return characters
        }

        fun getLocations(): ArrayList<Location>{
            var count = 0
            val locations = ArrayList<Location>()

            while (count < 10){
                val location = Location(
                        getLocationName(),
                        LocalDataSource.LOCATION_CIV_LEVEL[LocalDataSource.LOCATION_CIV_LEVEL_CHOICE],
                        LocalDataSource.LOCATION_TERRAIN[LocalDataSource.LOCATION_TERRAIN_CHOICE],
                        getLocationProductions(),
                        getLocationResources(),
                        getLocationInhabitants(),
                        getLocationName(),
                        LocalDataSource.LOCATION_COMBAT_LEVEL[LocalDataSource.LOCATION_COMBAT_LEVEL_CHOICE])

                locations.add(location)
                LocalDataSource.reRandomLocations()
                count++
            }

            return locations
        }
    }
}