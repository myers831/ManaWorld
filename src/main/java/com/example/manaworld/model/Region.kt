package com.example.manaworld.model

class Region (val id: String,
              var name: String,
              var climate: String,
              var settlements: HashMap<String, Settlement>
)