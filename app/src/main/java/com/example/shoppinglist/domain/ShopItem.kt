package com.example.shoppinglist.domain

data class shopItem(

    val name:String,
    val count:Int,
    val enabled:Boolean,
    var id :Int = Undefined_ID


){companion object{
    const val Undefined_ID = -1
}
}
