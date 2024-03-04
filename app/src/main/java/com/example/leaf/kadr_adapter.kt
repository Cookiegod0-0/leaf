package com.example.leaf
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class kadr_adapter (val con:Context, val list3:ArrayList<kadr>):RecyclerView.Adapter<kadr_adapter.Link>() {
    class Link(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val im_di: ImageView = itemView.findViewById(R.id.imageView10)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): kadr_adapter.Link {
        val root = LayoutInflater.from(con).inflate(R.layout.kadr_item,parent,false)
        return kadr_adapter.Link(root)
    }
    override fun onBindViewHolder(holder: kadr_adapter.Link, position: Int) {
        holder.im_di.setImageResource(list3[position].imageId)
    }
    override fun getItemCount(): Int {
        return list3.size
    }

}