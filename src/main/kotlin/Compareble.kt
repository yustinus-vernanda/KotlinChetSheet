package com.dicoding.kotlin

import java.lang.reflect.Array
import java.util.*
import kotlin.collections.ArrayList


class Person(val firstName:String,val age:Int):Comparable<Person>{
    override fun compareTo(other: Person) :Int{
        return compareValues(this.firstName,other.firstName).inv()
    }
}



fun main() {
    var compare = ArrayList<Person>()
    compare.add(Person("Rudi",19))
    compare.add(Person("Matilda",3))
    compare.add(Person("Anggun",10))
    compare.add(Person("Zeke",10))


    Collections.sort(compare)
    compare.forEach(){
        println(it.firstName)
    }

    val comp = listOf<String>("A","Z","B")
    print(comp.sorted())

}