package com.example.manaworld.model

class Town (val id: String,
            var name: String,
            var routes: HashMap<String, Route>,
            var resources: HashMap<String, Resource>,
            var markets: HashMap<String, Market>
): Settlement()