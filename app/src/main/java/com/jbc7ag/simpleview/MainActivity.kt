package com.jbc7ag.simpleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listItems = listOf("1", "2", "3", "4", "5", "6", "7");

        /** RecyclerView Usage**/

         setContentView(R.layout.activity_main)
         val myManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
         val myAdaapter: RecyclerView.Adapter<*> = listAdapter(listItems)
         val recyclerView: RecyclerView = findViewById(R.id.recyclerView);
         recyclerView.layoutManager = myManager;
         recyclerView.adapter = myAdaapter;
         recyclerView.setHasFixedSize(true);

        /** ListView Usage **/

        /** Remove this comments to see it working!! **/
        //setContentView(R.layout.list_view_layout)
        //val listview : ListView = findViewById(R.id.listview)
        //val myAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
        // listview.adapter = myAdapter


    }
}