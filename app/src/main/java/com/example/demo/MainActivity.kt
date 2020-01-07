package com.example.demo

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    var listA = ArrayList<String>()
    var listB = ArrayList<String>()
    var codeName = MutableLiveData<String>().apply { value = "" }
    val adpaterA = ListAdapter(this, listA,codeName)
    val adpaterB = ListRVAdpater(this, listB)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val layoutManagerA = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        rvList.layoutManager = layoutManagerA

        listA.add("Test 1")
        listA.add("Test 2")
        listA.add("Test 3")
        listA.add("Test 4")


        rvList.adapter = adpaterA

        val layoutManagerB = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        rvTestList.layoutManager = layoutManagerB

        listB.add("Testing 1")
        listB.add("Testing 2")
        listB.add("Testing 3")
        listB.add("Testing 4")
        listB.add("Testing 5")
        listB.add("Testing 6")
        listB.add("Testing 7")

        rvTestList.adapter = adpaterB




        ivArrow.setOnClickListener {
            Log.i("Tag","button clicked")

            if(viewCard.visibility== View.GONE){
                viewCard.visibility = View.VISIBLE
            }else{
                viewCard.visibility= View.GONE
            }



        }

        codeName.observe(this, Observer {

            edText.setText(it, TextView.BufferType.EDITABLE)

            viewCard.visibility= View.GONE

        })

    }
}
