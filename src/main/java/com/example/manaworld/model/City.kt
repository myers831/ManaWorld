package com.example.manaworld.model

class City (val id: String,
            var name: String,
            var districts: HashMap<String, District>,
            var resources: HashMap<String, Resource>,
            var markets: HashMap<String, Market>,
            var industries: HashMap<String, Industry>
): Settlement()