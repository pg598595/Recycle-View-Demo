package com.example.demo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*

class ListRVAdpater(private val context: Context, private val array: ArrayList<String>) :
    RecyclerView.Adapter<ListRVAdpater.ViewHolder>() {



    override fun getItemCount(): Int {
        return array.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_rv_test_list, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val file = array[position]


        holder.tvName.text = file

        holder.tvName.setOnClickListener {


        }


    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName = view.tvListName

    }
}