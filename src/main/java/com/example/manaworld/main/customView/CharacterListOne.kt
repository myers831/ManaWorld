package com.example.manaworld.main.customView

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import com.example.manaworld.R
import com.example.manaworld.base.BaseCustomView
import com.example.manaworld.main.adapter.CharacterListViewHolderAdapter
import com.example.manaworld.model.Character

class CharacterListOne(context: Context) : BaseCustomView(context) {

    var view: View = View.inflate(context, R.layout.main_layout, null)
    var recyclerView: RecyclerView

    init {
        recyclerView = view.findViewById(R.id.my_recycler_view)
        addView(view)
    }

    fun setData(mainData: ArrayList<Character>){

        if(recyclerView.adapter != null){
            recyclerView.adapter =  null
            recyclerView.layoutManager = null
        }

        recyclerView.layoutManager = LinearLayoutManager(context)
        val viewAdapter = CharacterListViewHolderAdapter(context, mainData)
//        viewAdapter.setClickListener(this)
        recyclerView.adapter = viewAdapter
    }
}