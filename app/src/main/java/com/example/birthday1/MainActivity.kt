package com.example.birthday1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.birthday1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

    fun createbirthdaycard(view: View) {
        val name = binding.nameinput.editableText.toString()
        Toast.makeText(this, "Hey!!! $name", Toast.LENGTH_LONG).show()

        val intent = Intent(this, birthday_activity::class.java)
        intent.putExtra(birthday_activity.NAME_EXTRA,name)
        startActivity(intent)

    }

}