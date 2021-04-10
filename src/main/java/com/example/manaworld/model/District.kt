package com.example.manaworld.model

class District (val id: String,
                var name: String,
                var routes: HashMap<String, Route>,
                var markets: HashMap<String, Market>
)
