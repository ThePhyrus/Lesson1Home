package com.example.lesson1home


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val TAG:String = "@@@"

class MainActivity : AppCompatActivity() {

    private lateinit var person: Person


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val data = Data(1, 1, 1)
        val data2 = data.copy()
        data2.age = 100

        Log.d("@@@", "Data  age: $data")
        Log.d("@@@", "Data2 age: $data2")

        for (one in getArrayList()) {
            Log.d("@@@", "for $one")
        }
        getArrayList().forEach {
            Log.d("@@@", "forEach $it")
        }

        for (i in 1..10){
            Log.d("@@@", "for in 1..10 $i")
        }
        for (i in 1 until 10){
            Log.d("@@@", "for until $i")
        }
        for (i in 10 downTo  1 step 3){
            Log.d("@@@", "for downTo $i")
        }
        var counter = 10
        while (counter-->0){
            Log.d("@@@", "while counter $counter")
        }
        counter = 10
        do {
            Log.d("@@@", "do while counter $counter")
        }while (counter-->0)

    }

    private fun getArrayList() = listOf(1, 2, 3, 4, 5, 8)
}