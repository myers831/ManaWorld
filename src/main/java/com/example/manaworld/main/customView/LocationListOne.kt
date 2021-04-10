package com.example.manaworld.main.customView

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.manaworld.R
import com.example.manaworld.base.BaseCustomView
import com.example.manaworld.main.adapter.LocationListViewHolderAdapter
import com.example.manaworld.model.Location

class LocationListOne(context: Context) : BaseCustomView(context)  {
    var view: View = View.inflate(context, R.layout.main_layout, null)
    var recyclerView: RecyclerView

    init {
        recyclerView = view.findViewById(R.id.my_recycler_view)
        addView(view)
    }

    fun setData(mainData: ArrayList<Location>){

        if(recyclerView.adapter != null){
            recyclerView.adapter =  null
            recyclerView.layoutManager = null
        }

        recyclerView.layoutManager = LinearLayoutManager(context)
        val viewAdapter = LocationListViewHolderAdapter(context, mainData)
        recyclerView.adapter = viewAdapter
    }
}