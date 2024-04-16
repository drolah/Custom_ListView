package com.example.studentlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class SubjectAdapter(private val context: Context, private val subjects: List<Subject>) : BaseAdapter() {

    override fun getCount(): Int = subjects.size

    override fun getItem(position: Int): Subject = subjects[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View

        // Check if the convertView is null
        if (convertView == null) {
            // Inflate the subject item layout
            view = LayoutInflater.from(context).inflate(R.layout.list_item_subject, parent, false)
        } else {
            view = convertView
        }

        // Get the subject
        val subject = getItem(position)

        // Set subject name, grade, and status
        val textViewSubjectName = view.findViewById<TextView>(R.id.textViewSubjectName)
        val textViewGrade = view.findViewById<TextView>(R.id.textViewGrade)
        val textViewStatus = view.findViewById<TextView>(R.id.textViewStatus)

        // Bind subject data to views
        textViewSubjectName.text = subject.name
        textViewGrade.text = subject.grade.toString()
        textViewStatus.text = subject.getStatus()

        return view
    }
}