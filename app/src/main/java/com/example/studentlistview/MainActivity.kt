package com.example.studentlistview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ListView
import javax.security.auth.Subject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Create a list of students
        val students = listOf(
            Student(
                name = "Kim Harold",
                idNumber = "12345",
                program = "Information Technology",
                imageResId = R.drawable.img_19,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),
            Student(
                name = "Kit Harvey",
                idNumber = "67890",
                program = "IEngineering",
                imageResId = R.drawable.img_4,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),
            Student(
                name = "Katris Han",
                idNumber = "14141",
                program = "Nursing",
                imageResId = R.drawable.img,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),

            Student(
                name = "Ken Harlon",
                idNumber = "52621",
                program = "Electronics",
                imageResId = R.drawable.img_5,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),
            Student(
                name = "Andrea Marie",
                idNumber = "23537",
                program = "Information Technology",
                imageResId = R.drawable.img_1,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),
            Student(
                name = "Ruffa Mae",
                idNumber = "54468",
                program = "Information Technology",
                imageResId = R.drawable.img_2,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),
            Student(
                name = "Jon Wilson",
                idNumber = "34575",
                program = "Information Technology",
                imageResId = R.drawable.img_6,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),
            Student(
                name = "Abigail Dave",
                idNumber = "25734",
                program = "Information Technology",
                imageResId = R.drawable.img_3,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),
            Student(
                name = "Timothy Miles",
                idNumber = "18876",
                program = "Information Technology",
                imageResId = R.drawable.img_7,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),
            Student(
                name = "Eon Seth",
                idNumber = "15067",
                program = "Information Technology",
                imageResId = R.drawable.img_8,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),
            Student(
                name = "Jule Brian",
                idNumber = "23470",
                program = "Information Technology",
                imageResId = R.drawable.img_10,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),
            Student(
                name = "Jethro Limpag",
                idNumber = "72673",
                program = "Information Technology",
                imageResId = R.drawable.img_9,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),
            Student(
                name = "John Patrick",
                idNumber = "44363",
                program = "Information Technology",
                imageResId = R.drawable.img_11,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),
            Student(
                name = "Jefferson Paul",
                idNumber = "67890",
                program = "Information Technology",
                imageResId = R.drawable.img_12,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),
            Student(
                name = "Jomar Zosa",
                idNumber = "73466",
                program = "Information Technology",
                imageResId = R.drawable.img_13,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),
            Student(
                name = "Edriane Amistoso",
                idNumber = "90098",
                program = "Information Technology",
                imageResId = R.drawable.img_14,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),
            Student(
                name = "Shannon Yase",
                idNumber = "99880",
                program = "Information Technology",
                imageResId = R.drawable.img_15,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),
            Student(
                name = "Joseph Villariasa",
                idNumber = "66645",
                program = "Information Technology",
                imageResId = R.drawable.img_16,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),
            Student(
                name = "Earl Brando",
                idNumber = "22342",
                program = "Information Technology",
                imageResId = R.drawable.img_17,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            ),
            Student(
                name = "Antonio",
                idNumber = "45451",
                program = "Information Technology",
                imageResId = R.drawable.img_18,
                subjects = listOf(
                    Subject(
                        name = "SYSAD",
                        grade = 1.8
                    ),
                    Subject(
                        name = "TECHNO",
                        grade = 1.4
                    ),
                    Subject(
                        name = "IMDBSYS32",
                        grade = 2.9
                    ),
                    Subject(
                        name = "PE103",
                        grade = 1.5
                    ),
                    Subject(
                        name = "FREDTHINK",
                        grade = 3.5
                    ),
                    Subject(
                        name = "INTPROG32",
                        grade = 1.9
                    ),
                    Subject(
                        name = "SYSARCH32",
                        grade = 2.5
                    ),
                    Subject(
                        name = "ELBIZAN",
                        grade = 3.3
                    ),
                    Subject(
                        name = "INFOSEC",
                        grade = 2.0
                    ),
                    Subject(
                        name = "WEBDEV31",
                        grade = 2.9
                    )
                )
            )
        )

        // Find the ListView in the layout
        val listView = findViewById<ListView>(R.id.listView)

        // Create the custom adapter for students
        val studentAdapter = CustomAdapter(this, students)

        // Set the adapter to the ListView
        listView.adapter = studentAdapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            // Get the selected student
            val selectedStudent = students[position]

            // Create an intent to launch StudentDetailsActivity
            val intent = Intent(this, StudentDetailsActivity::class.java)

            // Pass the student data as an extra
            intent.putExtra("student", selectedStudent)

            // Start StudentDetailsActivity
            startActivity(intent)
        }

    }
}