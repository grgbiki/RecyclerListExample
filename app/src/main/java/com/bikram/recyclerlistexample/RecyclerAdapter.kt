package com.bikram.recyclerlistexample

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter(private val context: Context, private val dataSet: MutableList<Product>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView
        val price: TextView
        val color: TextView
        val imageView: ImageView

        init {
            title = view.findViewById(R.id.title)
            price = view.findViewById(R.id.price)
            color = view.findViewById(R.id.color)
            imageView = view.findViewById(R.id.image)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.recycler_item_view, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val item = dataSet[position]
        val imageResource: Int = context.resources.getIdentifier(item.image, null, context.packageName)

        viewHolder.title.text = item.title
        viewHolder.price.text = "Price : \$${item.price}"
        viewHolder.color.text = "Color : ${item.color}"
        viewHolder.imageView.setImageDrawable(ContextCompat.getDrawable(context, imageResource))

        viewHolder.itemView.setOnClickListener {
            val intent = Intent(context, RecyclerItemDetails::class.java)
            intent.putExtra("item", item)
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataSet.size
}
