package com.bikram.recyclerlistexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class RecyclerItemDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_item_details)

        val item : Product= intent.getSerializableExtra("item") as Product
        val imageResource: Int = this.resources.getIdentifier(item.image, null, this.packageName)

        val title = findViewById<TextView>(R.id.title)
        val color = findViewById<TextView>(R.id.color)
        val itemId = findViewById<TextView>(R.id.itemId)
        val description = findViewById<TextView>(R.id.description)
        val imageView = findViewById<ImageView>(R.id.image)

        title.text = item.title
        color.text = "Color : ${item.color}"
        itemId.text = "Walmart #: ${item.itemId}"
        description.text = item.description
        imageView.setImageDrawable(ContextCompat.getDrawable(this, imageResource))
    }
}