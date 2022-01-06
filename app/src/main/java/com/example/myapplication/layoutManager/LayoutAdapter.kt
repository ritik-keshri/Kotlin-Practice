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

class LayoutAdapter(val applicationContext: Context) :
    RecyclerView.Adapter<LayoutAdapter.ViewHolder>() {

    private var dataList = emptyList<DataModel>()
    internal fun setDataList(dataList: List<DataModel>) {
        this.dataList = dataList

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView = itemView.findViewById(R.id.imageView)
        var name: TextView = itemView.findViewById(R.id.name)
        var details: TextView = itemView.findViewById(R.id.details)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_manager_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]
        holder.image.setImageResource(data.image)
        holder.name.text = data.name
        holder.details.text = data.details

        holder.image.setOnClickListener(View.OnClickListener {
            Toast.makeText(applicationContext, "fffff" + position, Toast.LENGTH_SHORT).show()

        })
    }

    override fun getItemCount() = dataList.size
}