package com.alexkand.homeworkkotlin_12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //Сделайте приложение в котором будут четыре activity.
    // Главный экран и три других экрана. На главном экране будут три кнопки.
    // С надписями: First activity, second activity, third activity,
    // которые соответственно переносят на соответствующие экраны.
    // На каждом экране, кроме главного экрана, будут TextView с текстом соответствующим данному экрану
    // (например: First activity) и кнопка с надписью "Home",
    // которая переносит на главный экран. В дизайне приложения желательно использовать LinearLayout.

        btn_go_to_1_activity.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }

        btn_go_to_2_activity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        btn_go_to_3_activity.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}