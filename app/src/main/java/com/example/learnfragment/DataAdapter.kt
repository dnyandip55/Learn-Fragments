package com.example.learnfragment

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataAdapter(context:Activity,var teams:List<String>) :
    RecyclerView.Adapter<DataAdapter.dataViewHolder>() {

    class dataViewHolder(view:View):RecyclerView.ViewHolder(view) {
         val textView:TextView=view.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): dataViewHolder {
       val view =LayoutInflater.from(parent.context)
           .inflate(R.layout.item_data,parent,false)

        return dataViewHolder(view)
    }

    override fun getItemCount(): Int {
        return teams.size
    }

    override fun onBindViewHolder(holder: dataViewHolder, position: Int) {
        val currentTeam=teams[position]
        holder.textView.text=currentTeam
    }


}
