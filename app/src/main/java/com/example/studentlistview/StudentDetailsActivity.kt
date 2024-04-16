package com.example.studentlistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class StudentDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_details)

        val student = intent.getSerializableExtra("student") as? Student

        // Initialize the views
        val imageViewDetail = findViewById<ImageView>(R.id.imageViewDetail)
        val textViewNameDetail = findViewById<TextView>(R.id.textViewNameDetail)
        val textViewIdNumberDetail = findViewById<TextView>(R.id.textViewIdNumberDetail)
        val textViewProgramDetail = findViewById<TextView>(R.id.textViewProgramDetail)
        val listViewSubjects = findViewById<ListView>(R.id.listViewSubjects)

        // Display student data in views
        student?.let {
            // Set the student's profile image
            imageViewDetail.setImageResource(it.imageResId)

            // Set the student's name, ID number, and program
            textViewNameDetail.text = it.name
            textViewIdNumberDetail.text = it.idNumber
            textViewProgramDetail.text = it.program

            // Create an adapter for the list of subjects
            val subjectAdapter = SubjectAdapter(this, it.subjects)

            // Set the adapter for the listView
            listViewSubjects.adapter = subjectAdapter
        }
    }
}