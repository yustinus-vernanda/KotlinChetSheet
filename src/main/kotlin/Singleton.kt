package com.dicoding.kotlin

import java.util.*
import kotlin.collections.ArrayList


class Singleton {
    var name : String?=null
    /*private constructor(){
        println("Class created")
    }*/
    companion object{
        val instance:Singleton by lazy{Singleton()}
    }
}


fun main() {
    val single1 = Singleton.instance
    val word :String?=null
    single1.name=word?:"test2"
    val single2 = Singleton.instance
    single2.name=word?:"test3"
    println("${single1.name} ${single2.name}")
}