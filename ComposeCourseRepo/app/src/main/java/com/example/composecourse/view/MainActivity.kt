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
import com.example.composecourse.view.course_5.Course5Activity
import com.example.composecourse.view.course_6.Course6Activity
import com.example.composecourse.view.course_7.Course7Activity
import com.example.composecourse.view.course_8.Course8Activity
import com.example.composecourse.view.course_9.Course9Activity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initListeners()

        // todo: just for dev, will be removed after developing
        navigateToTargetActivity(Course9Activity())
    }

    private fun initListeners() {
        findViewById<AppCompatButton>(R.id.appCompatButton_course_1).setOnClickListener(this)
        findViewById<AppCompatButton>(R.id.appCompatButton_course_2).setOnClickListener(this)
        findViewById<AppCompatButton>(R.id.appCompatButton_course_3).setOnClickListener(this)
        findViewById<AppCompatButton>(R.id.appCompatButton_course_4).setOnClickListener(this)
        findViewById<AppCompatButton>(R.id.appCompatButton_course_5).setOnClickListener(this)
        findViewById<AppCompatButton>(R.id.appCompatButton_course_6).setOnClickListener(this)
        findViewById<AppCompatButton>(R.id.appCompatButton_course_7).setOnClickListener(this)
        findViewById<AppCompatButton>(R.id.appCompatButton_course_8).setOnClickListener(this)
        findViewById<AppCompatButton>(R.id.appCompatButton_course_9).setOnClickListener(this)
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
                navigateToTargetActivity(Course4Activity())
            }

            R.id.appCompatButton_course_5 -> {
                navigateToTargetActivity(Course5Activity())
            }

            R.id.appCompatButton_course_6 -> {
                navigateToTargetActivity(Course6Activity())
            }

            R.id.appCompatButton_course_7 -> {
                navigateToTargetActivity(Course7Activity())
            }

            R.id.appCompatButton_course_8 -> {
                navigateToTargetActivity(Course8Activity())
            }

            R.id.appCompatButton_course_9 -> {
                navigateToTargetActivity(Course9Activity())
            }
        }
    }

    private fun navigateToTargetActivity(targetComponentActivity: ComponentActivity) {
        val targetIntent = Intent(this@MainActivity, targetComponentActivity::class.java)
        startActivity(targetIntent)
    }

}
