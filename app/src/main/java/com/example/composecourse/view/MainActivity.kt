package com.example.composecourse.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.composecourse.R
import com.example.composecourse.view.course_1.Course1Activity
import com.example.composecourse.view.course_2.Course2Activity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initListeners()

        // todo: just for dev, will be removed after developing
        navigateToTargetActivity(Course2Activity())
    }

    private fun initListeners() {
        findViewById<AppCompatButton>(R.id.appCompatButton_course_1).setOnClickListener(this)
        findViewById<AppCompatButton>(R.id.appCompatButton_course_2).setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.appCompatButton_course_1 -> {
                navigateToTargetActivity(Course1Activity())
            }

            R.id.appCompatButton_course_2 -> {
                navigateToTargetActivity(Course2Activity())
            }

        }
    }

    private fun navigateToTargetActivity(targetComponentActivity: ComponentActivity) {
        val targetIntent = Intent(this@MainActivity, targetComponentActivity::class.java)
        startActivity(targetIntent)
    }

}
