package com.example.manaworld.view.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.main_list_item.view.*

class MainHolderViewAdapter(context: Context, private val myDataSet: Array<String>) :
        RecyclerView.Adapter<MainHolderViewAdapter.MyViewHolder>() {

    private var mInflater: LayoutInflater = LayoutInflater.from(context)

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val myTextView: TextView = itemView.info_text

        init {
            myTextView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
//            if (mClickListener != null) mClickListener.onItemClick(v, adapterPosition)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyViewHolder {
        // create a new view
        val layout = mInflater.inflate(com.example.manaworld.R.layout.main_list_item, parent, false)
        // set the view's size, margins, paddings and layout parameters

        return MyViewHolder(layout)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.myTextView.text = myDataSet[position]
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataSet.size

    // convenience method for getting data at click position
    fun getItem(id: Int): String {
        return myDataSet[id]
    }
}