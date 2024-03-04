package com.example.leaf

data class Feel(val imageId:Int, val title:String)
class FeelList{
    val list2 = arrayListOf(Feel(R.drawable.calm, "Спокойным"),
    Feel(R.drawable.excited, "Взволнованным"),
    Feel(R.drawable.relax, "Расслабленным"),
    Feel(R.drawable.thoughtful, "Задумчивым"),
    Feel(R.drawable.curious, "Любопытным"),
    Feel(R.drawable.dreamy, "Меятательным"),
    Feel(R.drawable.playful, "Игривым"),
    Feel(R.drawable.productive, "Продуктивным"))}