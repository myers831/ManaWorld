package com.example.manaworld.model

class Village (val id: String,
               var name: String,
               var routes: HashMap<String, Route>,
               var resources: HashMap<String, Resource>
): Settlement()