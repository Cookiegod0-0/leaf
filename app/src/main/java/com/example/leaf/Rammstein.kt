package com.example.leaf

data class Rammstein(val imageId:Int, val title:String, val title11:String)
class RammsteinList{
    val list4 = arrayListOf(Rammstein(R.drawable.till, "Тилль Линдеманн","вокалист"),
        Rammstein(R.drawable.flake, "Флаке Лоренц","клавишник"),
        Rammstein(R.drawable.rihard, "Рихард Круспе","гитарист"),
        Rammstein(R.drawable.paul, "Пауль Ландерс","гитарист"),
        Rammstein(R.drawable.schneider, "Кристоф Шнайдер","барабанщик"))}
