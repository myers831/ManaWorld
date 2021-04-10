package com.example.manaworld.data

import java.util.*
import kotlin.collections.ArrayList

class LocalDataSource{
    companion object{

        //********************//
        //***BASE 50 DATA***//
        //********************//
        private var BASE_50 = Random().nextInt(1000)
        var STAT_GENERATOR_BASE_50 = BASE_50 - (BASE_50%50)

        fun getBase50(): Int{
            runBase50Random()
            return STAT_GENERATOR_BASE_50
        }

        fun runBase50Random(){
            BASE_50 = Random().nextInt(1000)
            STAT_GENERATOR_BASE_50 = BASE_50 - (BASE_50%50)
        }

        //********************//
        //***CHARACTER DATA***//
        //********************//
        val CHARACTER_FIRST_NAMES = arrayOf("Zaidan", "Kain", "Ezra", "Phantom", "Iron", "Lira", "Ken")
        val CHARACTER_LAST_NAMES = arrayOf("Black", "Gold", "Silver", "Seekers", "Guard", "White", "Winters")
        val CHARACTER_RACES = arrayOf("Human", "Dwarf", "Dragon", "Elf", "Goblin", "Gorgon", "Mermaid/Merman")
        val CHARACTER_SOCIAL_STATUSES = arrayOf("Peasant", "Commoner", "Official", "Nobel", "Royal")
        val CHARACTER_JOBS = arrayOf("Ronin", "Assassin", "Blacksmith", "Farmer", "Knight", "Hunter", "Professor", "Explorer", "Councilor", "Baron", "Count", "Duke", "King")
        val CHARACTER_ORDERS = arrayOf("Soul Guardian Order", "Skull Guardian Order", "Forest Guardian Order", "Snow Guardian Order", "Mountain Guardian Order", "Storm Guardian Order", "Ocean Guardian Order", "Land Guardian Order", "Desert Guardian Order", "Sky Guardian Order")

        var CHARACTER_FIRST_NAMES_RANDOM_CHOICE = (CHARACTER_FIRST_NAMES.indices).random()
        var CHARACTER_LAST_NAMES_RANDOM_CHOICE = (CHARACTER_LAST_NAMES.indices).random()
        var CHARACTER_RACES_RANDOM_CHOICE = (CHARACTER_RACES.indices).random()
        var CHARACTER_SOCIAL_STATUSES_RANDOM_CHOICE = (CHARACTER_SOCIAL_STATUSES.indices).random()
        var CHARACTER_JOBS_RANDOM_CHOICE = (CHARACTER_JOBS.indices).random()
        var CHARACTER_ORDERS_RANDOM_CHOICE = (CHARACTER_ORDERS.indices).random()

        fun reRandomCharacters(){
            runBase50Random()
            CHARACTER_FIRST_NAMES_RANDOM_CHOICE = (CHARACTER_FIRST_NAMES.indices).random()
            CHARACTER_LAST_NAMES_RANDOM_CHOICE = (CHARACTER_LAST_NAMES.indices).random()
            CHARACTER_RACES_RANDOM_CHOICE = (CHARACTER_RACES.indices).random()
            CHARACTER_SOCIAL_STATUSES_RANDOM_CHOICE = (CHARACTER_SOCIAL_STATUSES.indices).random()
            CHARACTER_JOBS_RANDOM_CHOICE = (CHARACTER_JOBS.indices).random()
            CHARACTER_ORDERS_RANDOM_CHOICE = (CHARACTER_ORDERS.indices).random()
        }

        //********************//
        //***LOCATION DATA***//
        //********************//
        val LOCATION_FIRST_NAME = arrayOf("Wood", "Stone", "Iron", "Windy", "Sandy", "Leafy", "Swampy", "Icy", "Rusty", "Coal")
        val LOCATION_LAST_NAME = arrayOf("Forest", "Mountain", "Lake", "River", "Field", "Valley", "Creek", "Meadow", "Yard", "Cave", "Desert")
        val LOCATION_CIV_LEVEL = arrayOf("Camp", "Village", "Town", "City", "Capital")
        val LOCATION_TERRAIN = arrayOf("Forest","Mountain","Swamp", "Island", "Cave", "Desert", "Plains", "Tundra", "Wetland")
        val LOCATION_PRODUCTION = arrayOf("Metalwork", "Woodwork", "Stonework" ,"Food", "Cloth_work", "Leather_work")
        val LOCATION_RESOURCE = arrayOf("Wood", "Stone", "Coal", "Ore", "Rich Soil")
        val LOCATION_INHABITANTS = arrayOf("Human", "Dwarf", "Dragon", "Elf", "Goblin", "Gorgon", "Mermaid/Merman", "Beast")
        val LOCATION_COMBAT_LEVEL = arrayOf("Civilians", "Guard Squad" , "Guard Unit", "Guard Platoon", "Guard Regiment")

        var LOCATION_FIRST_NAME_CHOICE = (LOCATION_FIRST_NAME.indices).random()
        var LOCATION_LAST_NAME_CHOICE = (LOCATION_LAST_NAME.indices).random()
        var LOCATION_CIV_LEVEL_CHOICE = (LOCATION_CIV_LEVEL.indices).random()
        var LOCATION_TERRAIN_CHOICE = (LOCATION_TERRAIN.indices).random()
        var LOCATION_PRODUCTION_CHOICE = (LOCATION_PRODUCTION.indices).random()
        var LOCATION_RESOURCE_CHOICE = (LOCATION_RESOURCE.indices).random()
        var LOCATION_INHABITANTS_CHOICE = (LOCATION_INHABITANTS.indices).random()
        var LOCATION_COMBAT_LEVEL_CHOICE = (LOCATION_COMBAT_LEVEL.indices).random()

        fun reRandomLocations(){
            runBase50Random()
            LOCATION_FIRST_NAME_CHOICE = (LOCATION_FIRST_NAME.indices).random()
            LOCATION_LAST_NAME_CHOICE = (LOCATION_LAST_NAME.indices).random()
            LOCATION_CIV_LEVEL_CHOICE = (LOCATION_CIV_LEVEL.indices).random()
            LOCATION_TERRAIN_CHOICE = (LOCATION_TERRAIN.indices).random()
            LOCATION_PRODUCTION_CHOICE = (LOCATION_PRODUCTION.indices).random()
            LOCATION_RESOURCE_CHOICE = (LOCATION_RESOURCE.indices).random()
            LOCATION_INHABITANTS_CHOICE = (LOCATION_INHABITANTS.indices).random()
            LOCATION_COMBAT_LEVEL_CHOICE = (LOCATION_COMBAT_LEVEL.indices).random()
        }

        fun getLocationName(): String{
            reRandomLocations()
            return LOCATION_FIRST_NAME[LOCATION_FIRST_NAME_CHOICE] + " " + LOCATION_LAST_NAME[LOCATION_LAST_NAME_CHOICE]
        }

        fun getLocationProductions(): String{
            val productions = ArrayList<String>()
            var maxAmt = Random().nextInt(3)
            var count = 0
            var productionsString = ""

            if(maxAmt < 1) maxAmt = 1

            while(count < maxAmt){
                productions.add(LOCATION_PRODUCTION[LOCATION_PRODUCTION_CHOICE])
                reRandomLocations()
                count++
            }

            for(i in productions){
                productionsString = "$productionsString| $i"
            }

            return productionsString
        }

        fun getLocationResources(): String{
            val resources = ArrayList<String>()
            var maxAmt = Random().nextInt(3)
            var count = 0
            var resourcesString = ""

            if(maxAmt < 1) maxAmt = 1

            while(count < maxAmt){
                resources.add(LOCATION_RESOURCE[LOCATION_RESOURCE_CHOICE])
                reRandomLocations()
                count++
            }

            for(i in resources){
                resourcesString = "$resourcesString| $i"
            }

            return resourcesString
        }

        fun getLocationInhabitants(): String{
            val inhabitants = ArrayList<String>()
            var maxAmt = Random().nextInt(3)
            var count = 0
            var inhabitantsString = ""

            if(maxAmt < 1) maxAmt = 1

            while(count < maxAmt){
                inhabitants.add(LOCATION_INHABITANTS[LOCATION_INHABITANTS_CHOICE])
                reRandomLocations()
                count++
            }

            for(i in inhabitants){
                inhabitantsString = "$inhabitantsString| $i"
            }

            return inhabitantsString
        }
    }
}