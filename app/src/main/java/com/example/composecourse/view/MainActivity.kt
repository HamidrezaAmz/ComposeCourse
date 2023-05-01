package com.example.composecourse.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.composecourse.R
import com.example.composecourse.view.course_2.Course2Activity
import com.example.composecourse.view.course_3.Course3Activity
import com.example.composecourse.view.course_4.Course4Activity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initListeners()

        // todo: just for dev, will be removed after developing
        navigateToTargetActivity(Course4Activity())
    }

    private fun initListeners() {
        findViewById<AppCompatButton>(R.id.appCompatButton_course_1).setOnClickListener(this)
        findViewById<AppCompatButton>(R.id.appCompatButton_course_2).setOnClickListener(this)
        findViewById<AppCompatButton>(R.id.appCompatButton_course_3).setOnClickListener(this)
        findViewById<AppCompatButton>(R.id.appCompatButton_course_4).setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.appCompatButton_course_1 -> {
                // ...
            }

            R.id.appCompatButton_course_2 -> {
                navigateToTargetActivity(Course2Activity())
            }

            R.id.appCompatButton_course_3 -> {
                navigateToTargetActivity(Course3Activity())
            }

            R.id.appCompatButton_course_4 -> {
                navigateToTargetActivity(Course3Activity())
            }
        }
    }

    private fun navigateToTargetActivity(targetComponentActivity: ComponentActivity) {
        val targetIntent = Intent(this@MainActivity, targetComponentActivity::class.java)
        startActivity(targetIntent)
    }

}
