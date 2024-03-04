package com.example.leaf
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class Rammstein_adapter (val con: Context, val list4:ArrayList<Rammstein>): RecyclerView.Adapter<Rammstein_adapter.Link>() {
    class Link(itemView: View):RecyclerView.ViewHolder(itemView) {
        val im_di: ImageView =itemView.findViewById(R.id.imageView12)
        val te_di: TextView =itemView.findViewById(R.id.textView16)
        val text_di: TextView =itemView.findViewById(R.id.textView17)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Rammstein_adapter.Link {
        val root = LayoutInflater.from(con).inflate(R.layout.rammstein_item,parent,false)
        return Rammstein_adapter.Link(root)
    }
    override fun onBindViewHolder(holder: Rammstein_adapter.Link, position: Int) {
        holder.im_di.setImageResource(list4[position].imageId)
        holder.te_di.setText(list4[position].title)
        holder.text_di.setText(list4[position].title11)
    }
    override fun getItemCount(): Int {
        return list4.size
    }
}