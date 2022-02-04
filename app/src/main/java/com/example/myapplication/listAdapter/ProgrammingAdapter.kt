package com.example.myapplication.listAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class ProgrammingAdapter : ListAdapter<ProgrammingItemDataClass, ProgrammingAdapter.ViewHolder>(DiffUtil()) {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val initial: TextView = itemView.findViewById(R.id.initial)
        val name: TextView = itemView.findViewById(R.id.name)

        fun bind(item: ProgrammingItemDataClass) {
            initial.text = item.initial
            name.text = item.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class DiffUtil : androidx.recyclerview.widget.DiffUtil.ItemCallback<ProgrammingItemDataClass>() {
        override fun areItemsTheSame(oldItem: ProgrammingItemDataClass, newItem: ProgrammingItemDataClass): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: ProgrammingItemDataClass,
            newItem: ProgrammingItemDataClass
        ): Boolean {
            //Data class by default keep the comparison of the data
            return oldItem == newItem
        }
    }

}