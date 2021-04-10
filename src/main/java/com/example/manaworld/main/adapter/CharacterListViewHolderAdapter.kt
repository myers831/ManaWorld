package com.example.manaworld.main.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.manaworld.model.Character
import kotlinx.android.synthetic.main.character_list_item.view.*

class CharacterListViewHolderAdapter(context: Context, private val myDataSet: ArrayList<Character>) :
        RecyclerView.Adapter<CharacterListViewHolderAdapter.MyViewHolder>() {

    private var mInflater: LayoutInflater = LayoutInflater.from(context)

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val myName: TextView = itemView.info_name
        val myJob: TextView = itemView.info_job
        val myHealth: TextView = itemView.info_health
        val myArmor: TextView = itemView.info_armor
        val myStrength: TextView = itemView.info_strength
        val myDexterity: TextView = itemView.info_dexterity
        val myIntelligence: TextView = itemView.info_intelligence
        val myMana: TextView = itemView.info_mana

        init {
            itemView.setOnClickListener(this)
            myName.text = itemView.info_name.text
            myJob.text = itemView.info_job.text
            myHealth.text = itemView.info_health.text
            myArmor.text = itemView.info_armor.text
            myStrength.text = itemView.info_strength.text
            myDexterity.text = itemView.info_dexterity.text
            myIntelligence.text = itemView.info_intelligence.text
            myMana.text = itemView.info_mana.text
        }

        override fun onClick(v: View?) {
//            if (mClickListener != null) mClickListener.onItemClick(v, adapterPosition)
            Toast.makeText(v?.context, myName.text, Toast.LENGTH_SHORT).show()
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // create a new view
        val layout = mInflater.inflate(com.example.manaworld.R.layout.character_list_item, parent, false)
        // set the view's size, margins, paddings and layout parameters

        return MyViewHolder(layout)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        val healthTxt  = "Hp: " + myDataSet[position].health.toString() + " "
        val armorTxt  =  "Ar: " + myDataSet[position].armor.toString()  + " "
        val strengthTxt  = "St: " + myDataSet[position].strength.toString()  + " "
        val dexterityTxt  = "Dt: " + myDataSet[position].dexterity.toString()  + " "
        val intelligenceTxt  =  "It: " + myDataSet[position].intellegence.toString()  + " "
        val manaTxt  =  "Mn: " + myDataSet[position].mana.toString()  + " "

        holder.myName.text = myDataSet[position].name
        holder.myJob.text = myDataSet[position].job
        holder.myHealth.text = healthTxt
        holder.myArmor.text = armorTxt
        holder.myStrength.text =  strengthTxt
        holder.myDexterity.text =  dexterityTxt
        holder.myIntelligence.text = intelligenceTxt
        holder.myMana.text = manaTxt
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataSet.size

    // convenience method for getting data at click position
    fun getItem(id: Int): String {
        return myDataSet[id].name
    }
}