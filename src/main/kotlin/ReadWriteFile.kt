package com.dicoding.kotlin
import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(){

    ReadFormFile()
    val op = readLine()!!.toInt()
    when(op){
        1->ReadFormFile()
        2->{
            print("Write to File text:")
            val star:String = readLine().toString()
            WriteToFile(star)
        }
    }

}

fun WriteToFile(str:String){
    try{
        val fo = FileWriter("test.txt")
        fo.write(str+"\n")
        fo.close()
    }
    catch (ex :Exception){
        print(ex.message)
    }
}

fun ReadFormFile(){
    try{
        val fin=FileReader("test.txt")

        var c:Int?
        do{
            c=fin.read()
            if(c!=-1)
            print(c.toChar())
        }while(c!=-1)
        fin.close()
    }
    catch (ex:Exception){
        print(ex.message)
    }
}