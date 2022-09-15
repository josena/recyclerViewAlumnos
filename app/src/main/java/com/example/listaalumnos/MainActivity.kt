package com.example.listaalumnos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<Alumno>()
        data.add(Alumno("José Nabor", "20102345","jmorfin@ucol.mx","https://imagenpng.com/wp-content/uploads/2017/02/pokemon-hulu-pikach.jpg"))
        data.add(Alumno("José Nabor", "20102345","jmorfin@ucol.mx","https://i.pinimg.com/236x/e0/b8/3e/e0b83e84afe193922892917ddea28109.jpg"))
        data.add(Alumno("José Nabor", "20102345","jmorfin@ucol.mx","https://i.pinimg.com/736x/9f/6e/fa/9f6efa277ddcc1e8cfd059f2c560ee53--clipart-gratis-vector-clipart.jpg"))
        data.add(Alumno("José Nabor", "20102345","jmorfin@ucol.mx","https://i.pinimg.com/236x/5c/a4/67/5ca46751512f5ab01e35bd76627ff591--pokemon-pictures-joseph.jpg"))
        data.add(Alumno("José Nabor", "20102345","jmorfin@ucol.mx","https://i.pinimg.com/736x/5d/03/4e/5d034e04172524a510754cc8d857c17b--vector-clipart-pokemon-go.jpg"))

        // This loop will create 20 Views containing



        // This will pass the ArrayList to our Adapter
        val adapter = AlumnoAdapter(this,data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

    }
}