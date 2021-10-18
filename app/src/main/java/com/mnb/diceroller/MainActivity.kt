package com.mnb.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var baslaTusu:Button=findViewById(R.id.baslangic)
     
        var zarGoster:ImageView=findViewById(R.id.imageView)

        zarGoster.setImageResource(R.drawable.dice_1)

        baslaTusu.setOnClickListener {

            var rasgele = (1..6 ).random()

            when(rasgele){
                1->zarGoster.setImageResource(R.drawable.dice_1)
                2->zarGoster.setImageResource(R.drawable.dice_2)
                3->zarGoster.setImageResource(R.drawable.dice_3)
                4->zarGoster.setImageResource(R.drawable.dice_4)
                5->zarGoster.setImageResource(R.drawable.dice_5)
                6->zarGoster.setImageResource(R.drawable.dice_6)


            }


        }

    }}