package com.example.myapplication

class Nutrition (weight:Int,
                 height:Int,
                 feeds:String,
                 vid:List<String>,
                 var pitanie:String="фруктами"
):Animals(weight,height,feeds,vid)
{

    fun print_pitanie()
    {
        println("вид $vid питается $pitanie")
    }

}