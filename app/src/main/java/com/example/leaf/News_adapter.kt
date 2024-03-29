package com.example.leaf

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class News_adapter (val con: Context, val list:ArrayList<news>): RecyclerView.Adapter<News_adapter.Link>() {
    class Link(itemView: View):RecyclerView.ViewHolder(itemView) {
        val im_di: ImageView =itemView.findViewById(R.id.imageView6)
        val te_di: TextView =itemView.findViewById(R.id.textView13)
        val text_di: TextView =itemView.findViewById(R.id.textView12)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): News_adapter.Link {
        val root = LayoutInflater.from(con).inflate(R.layout.news_item,parent,false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: News_adapter.Link, position: Int) {
        holder.im_di.setImageResource(list[position].imageId)
        holder.te_di.setText(list[position].title)
        holder.text_di.setText(list[position].title11)
    }
    override fun getItemCount(): Int {
        return list.size
    }

}