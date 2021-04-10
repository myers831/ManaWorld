package com.example.manaworld.model

abstract class Weapon(val id: String,
                      var name: String,
                      var type: String,
                      var durability: Int,
                      var damageMod: Int){

    abstract fun damageCalc(charStr: Int, charDxt: Int): Int
}