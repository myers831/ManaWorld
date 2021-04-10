package com.example.manaworld.main.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.manaworld.model.Location
import kotlinx.android.synthetic.main.location_list_item.view.*

class LocationListViewHolderAdapter(context: Context, private val myDataSet: ArrayList<Location>) :
        RecyclerView.Adapter<LocationListViewHolderAdapter.MyViewHolder>() {

    private var mInflater: LayoutInflater = LayoutInflater.from(context)

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val myLocationName: TextView = itemView.info_location_name
        val myCivLevel: TextView = itemView.info_location_civ_level
        val myTerrain: TextView = itemView.info_location_terrain
        val myProduction: TextView = itemView.info_location_production
        val myResource: TextView = itemView.info_location_resource
        val myInhabitants: TextView = itemView.info_location_inhabitants
        val myParentLocation: TextView = itemView.info_location_parent_location
        val myCombatLevel: TextView = itemView.info_location_combat_level

        init {
            itemView.setOnClickListener(this)
            myLocationName.text = itemView.info_location_name.text
            myCivLevel.text = itemView.info_location_civ_level.text
            myTerrain.text = itemView.info_location_terrain.text
            myProduction.text = itemView.info_location_production.text
            myResource.text = itemView.info_location_resource.text
            myInhabitants.text = itemView.info_location_inhabitants.text
            myParentLocation.text = itemView.info_location_parent_location.text
            myCombatLevel.text = itemView.info_location_combat_level.text
        }

        override fun onClick(v: View?) {
            Toast.makeText(v?.context, myLocationName.text, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // create a new view
        val layout = mInflater.inflate(com.example.manaworld.R.layout.location_list_item, parent, false)
        // set the view's size, margins, paddings and layout parameters

        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val locationNameTxt  = myDataSet[position].name
        val civLevelTxt  =  myDataSet[position].civLevel
        val terrainTxt  = "Terrain: " + myDataSet[position].terrain
        val productionTxt  = "Production: " + myDataSet[position].production
        val resourceTxt  = "Resources: " + myDataSet[position].resources
        val inhabitantsTxt  = "Inhabitants: " + myDataSet[position].inhabitants
        val parentLocationTxt  = "Parent Location: " + myDataSet[position].parentLocation
        val combatLevelTxt  = "Combat Lv: : " + myDataSet[position].combatLevel

        holder.myLocationName.text = locationNameTxt
        holder.myCivLevel.text = civLevelTxt
        holder.myTerrain.text = terrainTxt
        holder.myProduction.text = productionTxt
        holder.myResource.text = resourceTxt
        holder.myInhabitants.text = inhabitantsTxt
        holder.myParentLocation.text = parentLocationTxt
        holder.myCombatLevel.text = combatLevelTxt
    }

    override fun getItemCount() = myDataSet.size
}