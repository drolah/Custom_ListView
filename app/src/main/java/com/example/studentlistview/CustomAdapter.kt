package com.example.studentlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import java.io.Serializable

class CustomAdapter(
    private val context: Context,
    private val items: List<Student>
) : BaseAdapter() {

    override fun getCount(): Int = items.size

    override fun getItem(position: Int): Student = items[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val viewHolder: ViewHolder

        // Check if convertView is null (if not, reuse it)
        if (convertView == null) {
            // Inflate a new view from list_item.xml
            view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)

            // Create a new ViewHolder
            viewHolder = ViewHolder(view)

            // Store the ViewHolder in the view's tag
            view.tag = viewHolder
        } else {
            // Reuse convertView and its associated ViewHolder
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        // Get the current student item
        val student = getItem(position)

        // Set data to the views
        viewHolder.imageViewItem.setImageResource(student.imageResId)
        viewHolder.textViewName.text = student.name
        viewHolder.textViewIdNumber.text = student.idNumber
        viewHolder.textViewProgram.text = student.program

        // Return the view
        return view
    }

    // ViewHolder class to hold view references
    private class ViewHolder(view: View) {
        val imageViewItem: ImageView = view.findViewById(R.id.imageViewItem)
        val textViewName: TextView = view.findViewById(R.id.textViewName)
        val textViewIdNumber: TextView = view.findViewById(R.id.textViewIdNumber)
        val textViewProgram: TextView = view.findViewById(R.id.textViewProgram)
    }
}

data class Student(
    val name: String,
    val idNumber: String,
    val program: String,
    val imageResId: Int,
    val subjects: List<Subject>
) : Serializable

data class Subject(
    val name: String,
    val grade: Double
) : Serializable {
    fun getStatus(): String {
        return if (grade > 3.0) {
            "Fail"
        } else {
            "Pass"
        }
    }
}
