package com.example.demo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*

class ListAdapter(private val context: Context, private val array: ArrayList<String>, var codeName: MutableLiveData<String>) :
    RecyclerView.Adapter<ListAdapter.ViewHolder>() {



    override fun getItemCount(): Int {
        return array.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val name = array[position]



        //val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri)

        holder.tvName.text = name

        holder.tvName.setOnClickListener {

            codeName.postValue(name)


            Toast.makeText(
                context,
                name,
                Toast.LENGTH_LONG
            ).show()


        }


    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName = view.tvListName

    }
}