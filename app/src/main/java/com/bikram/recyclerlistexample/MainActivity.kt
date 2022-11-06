package com.bikram.recyclerlistexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val products = mutableListOf<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val product1 = Product("1127367ASD", "Apple IPad 10th Gen", 200.0, "Black", "@drawable/ipad", "Powerful. Easy to use. Versatile. The new iPad has a beautiful 10.2-inch Retina display, powerful A13 Bionic chip, an Ultra Wide front camera with Center Stage, and works with Apple Pencil and the Smart Keyboard. iPad lets you do more, more easily. All for an incredible value.")
        val product2 = Product("2876ASD676", "Apple MacBook Air with Apple M1 Chip", 900.0, "Space Gray", "@drawable/macbook", "The Apple M1 chip redefines the 13-inch MacBook Pro. Featuring an 8-core CPU that flies through complex workflows in photography, coding, video editing, and more. Incredible 8-core GPU that crushes graphics-intensive tasks and enables super-smooth gaming. An advanced 16-core Neural Engine for more machine learning power in your favorite apps. Superfast unified memory for fluid performance. And the longest-ever battery life in a Mac at up to 20 hours. It?s Apple's most popular pro notebook. Way more performance and way more pro.")
        val product3 = Product("NASBD7651V", "HP DeskJet 2752e All-in-One Wireless Color Inkjet Printer", 64.0, "White", "@drawable/printer", "The HP DeskJet 2752e is ideal for basic home printing and gives you all the essential features you need—easily print, copy and scan from any device. It also offers HP+: the smart printing system that keeps you more secure, more productive, and more sustainable than ever.")
        val product4 = Product("124ASD12DA", "QFX Twin Wireless Bluetooth Speakers", 110.0, "Black", "@drawable/speaker", "QFX's portable twin speaker party pack has you covered for the occasion. This versatile PA speaker system pumps out music and amplifies announcements. With True Wireless Stereo, the two speakers will link via Bluetooth for a beautiful and loud stereo experience for music and speaking. Use the included pair of wired microphones to make announcements or sing along to your favorite song! The speakers are ultra-portable, too, with a rechargeable battery and handles for carrying, two speaker stands, and two remote controls. Stream music from a variety of sources: via Bluetooth-enabled devices, through USB and TF Card slots, or connected with a cable through the aux-in port. No matter what you're playing, the speaker's 8\" woofer and amplifier ensure that everyone can hear clearly. The rechargeable battery lasts for 4-hours so you can stream music even in places without an outlet nearby.")
        val product5 = Product("12313ADW4F", "SAMSUNG 55\" Class 4K Crystal UHD", 378.0, "Silver", "@drawable/tv", "SAMSUNG 55\" Class 4K Crystal UHD (2160P) LED Smart TV with HDR UN55TU7000 - Get enhanced smart capabilities with the TU7000. Crystal Processor 4K automatically upscales your favorite movies, TV shows and sports events to 4K. Smart TV powered by Tizen lets you find content and navigate streaming services easily. PurColor fine tunes colors while HDR steps up to millions of shades of color that go beyond what HDTV can offer. And Direct Lit backlighting technology sharpens visuals and improves clarity.")

        products.add(product1)
        products.add(product2)
        products.add(product3)
        products.add(product4)
        products.add(product5)

        val adapter = RecyclerAdapter(this, products)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)

        recyclerView.adapter = adapter
    }
}