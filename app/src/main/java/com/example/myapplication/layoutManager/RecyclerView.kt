package com.example.myapplication.layoutManager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.myapplication.R

class RecyclerView : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var layoutAdapter: LayoutAdapter
    private var data = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
//        recyclerView.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL)
//        recyclerView.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
//        recyclerView.layoutManager = LinearLayoutManager(applicationContext,LinearLayoutManager.HORIZONTAL,false)
//        recyclerView.layoutManager = GridLayoutManager(applicationContext,2)

        layoutAdapter = LayoutAdapter(applicationContext)
        recyclerView.adapter = layoutAdapter

        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))
        data.add(DataModel("Ritik","bsdakasfhasfhsdfhdjsvfgdsvfhjdscsritik keshrikjabrkjsaf fs fdsbfjhs f dsf   qrofdjhsbfhsdf hfhaef",R.drawable.ic_launcher_foreground))

        layoutAdapter.setDataList(data)
    }
}
