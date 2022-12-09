package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var vid_1=listOf("обезьяна", "белка")
        var animals=Animals(vid=vid_1)
        var print_veg=Animals(vid=vid_1)
        //println(print_veg.vigaterian())
        var print_predator=Animals(vid=vid_1)
        //println(print_predator.predator(weight=5))
        //var print_pitanie3=nutrition.print_pitanie()
        println(nutrition(weight=21,height=10,feeds="Н2О",vid=vid_1).print_pitanie())
    }
}