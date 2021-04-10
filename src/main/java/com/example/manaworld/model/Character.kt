package com.example.manaworld.model

import java.util.*
import kotlin.collections.HashMap

open class Character(val id: String,
                     var name: String,
                     var race: String,
                     var socialStatus: String,
                     var job: String,
                     var order: String,

                     var health: Int,
                     var armor: Int,
                     var strength: Int,
                     var dexterity: Int,
                     var intellegence: Int,
                     var mana: Int,

                     var abilities: HashMap<String, Ability>,
                     var equipment: HashMap<String, Item>,

                     var characterRelationships: HashMap<String, CharacterRelation>) {

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