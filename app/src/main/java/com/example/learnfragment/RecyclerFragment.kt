package com.example.learnfragment

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class RecyclerFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_recycler, container, false)
        val recyclerView=view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(requireContext())
        recyclerView.adapter=DataAdapter(context as Activity,getSampleData())
        return  view

    }
   private  fun getSampleData():List<String>{
        return listOf("RCB","CSK","MI","PK","DC","SRH","KKR","GT","LSG","RR")
    }

}