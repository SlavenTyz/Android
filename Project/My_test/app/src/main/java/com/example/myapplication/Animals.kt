package com.example.myapplication

open class Animals ( //попробуй изменить параметры функции
    var weight:Int=22,
    var height:Int=11,
    var feeds:String="вода",
    var vid:List<String>
)
{
    fun vigaterian()

    {
        println("vigaterian вида=$vid   c весом = $weight")
    }
    fun predator(weight:Int=32)
    {
        println("predator c весом = $weight")
    }

}