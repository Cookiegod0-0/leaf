package com.example.leaf

data class news(val imageId:Int, val title:String, val title11:String)
class NewsList{
    val list = arrayListOf(news(R.drawable.dreamy, "Новости понедельника","Выходные закончились, наступила новая неделя"),
    news(R.drawable.dreamy,"Новости вторника","Вторник как понедельника, только вторник"),
    news(R.drawable.dreamy,"Новости среды","Ну вот и наступила середина недели"),
    news(R.drawable.dreamy,"Новости четверга","Четверг - хороший день, ведь завтра пятница"),
    news(R.drawable.dreamy,"Новости пятницы","Наконец-то пятница, завтра выходные!"),
    news(R.drawable.dreamy,"Новости субботы","В субботу можно выспаться!"),
    news(R.drawable.dreamy,"Новости воскресенья","Хороший день, но завтра по делам"))}