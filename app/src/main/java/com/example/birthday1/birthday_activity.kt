package com.example.birthday1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView



class birthday_activity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday)
        //finding birthdayText
        val birthdayText = findViewById<TextView>(R.id.birthdayGreeting)

        val name = this.intent.getStringExtra(NAME_EXTRA)
        birthdayText.text = "Happy Birthday\n$name"

    }
}