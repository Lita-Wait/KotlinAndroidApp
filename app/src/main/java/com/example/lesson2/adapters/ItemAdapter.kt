package com.example.lesson2.adapters

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson2.Item
import com.example.lesson2.R

class ItemAdapter (val context: Context, val list: List<Item>):
RecyclerView.Adapter<ItemAdapter.MyVH>()
{
    class MyVH (itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView:ImageView = itemView.findViewById(R.id.imageFill)
        val textView: TextView = itemView.findViewById(R.id.textFill)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.item_shape,parent,false)
        return MyVH(root);
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: MyVH, position: Int) {
        holder.imageView.setImageDrawable(context.getDrawable(list[position].image))
        holder.textView.text = list[position].title
    }

    override fun getItemCount(): Int {
        return list.size
    }


}