package com.example.manaworld.model

import java.util.*
import kotlin.collections.HashMap

open class Character(val id: String,

                     var name: String,
                     var rank: String,
                     var race: String,
                     var socialStatus: String,
                     var job: String,
                     var order: String,

                     var power: Int = 0,
                     var durability: Int = 0,
                     var commandLevel: Int = 0,
                     var money: Int = 0,
                     var strength: Int = 0,
                     var intellegence: Int = 0,

                     var manaReserve: HashMap<String, String>,
                     var abilities: HashMap<String, Ability>,
                     var characterRelationships: ArrayList<CharacterRelation>) {

    fun addAbility(ability: Ability){
    }

    fun removeAbility(ability: Ability): Boolean{
        return true
    }

    fun triggerAbility(abilityTrigger: AbilityTrigger): AbilityEffect{
        return AbilityEffect()
    }

    fun useMana(manaCost: ManaCost): Boolean{
        return true
    }

    fun interactWith(character: Character): CharacterResponse{
        return CharacterResponse()
    }

}