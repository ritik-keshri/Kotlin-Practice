package com.example.myapplication.layoutManager

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class LayoutAdapter(applicationContext: Context,  data: MutableList<DataModel>) : RecyclerView.Adapter<LayoutAdapter.ViewHolder>() {
    var dataa : MutableList<DataModel>? = null
    init {
        this.dataa = data
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return dataa!!.size
    }

//    private var dataList = emptyList<DataModel>()
//    internal fun setDataList(dataList: List<DataModel>) {
//        this.dataList = dataList
//        notifyDataSetChanged()
//    }

//    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        var image: ImageView = itemView.findViewById(R.id.imageView)
//        var name: TextView = itemView.findViewById(R.id.name)
//        var details: TextView = itemView.findViewById(R.id.details)
//    }

//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_manager_layout, parent, false)
//        return RecyclerView.ViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        val data = dataList[position]
//        holder.image.setImageResource(data.image)
//        holder.name.text = data.name
//        holder.details.text=data.details
//
//        holder.image.setOnClickListener(View.OnClickListener {
//            //Toast.makeText(this,""+position,Toast.LENGTH_SHORT)
//            Toast.makeText(applicationContext,"fffff",Toast.LENGTH_SHORT).show()
//
//        })
//    }
//
//    override fun getItemCount() = dataList.size
}