package com.example.listaalumnos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_view_design.view.*
import com.bumptech.glide.Glide

class AlumnoAdapter(private val context: Context, private val listAlumno: List<Alumno>): RecyclerView.Adapter<AlumnoAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = listAlumno[position]

        // sets the image to the imageview from our itemHolder class
        //holder.imageView.setImageResource(ItemsViewModel.imagen)
        Glide.with(context).load(ItemsViewModel.imagen).into(holder.imageView)
        // sets the text to the textview from our itemHolder class
        holder.txtNombre.text = ItemsViewModel.nombre

        // sets the text to the textview from our itemHolder class
        holder.txtCuenta.text = ItemsViewModel.cuenta

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return listAlumno.size
    }
    // Holds the views for adding it to image and text
    class ViewHolder(itView: View) : RecyclerView.ViewHolder(itView) {
        val imageView: ImageView = itemView.findViewById(R.id.imgAlumno)
        val txtNombre: TextView = itemView.findViewById(R.id.nombre)
        val txtCuenta: TextView = itemView.findViewById(R.id.cuenta)

    }

 }
