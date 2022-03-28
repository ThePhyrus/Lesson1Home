package com.example.lesson1home


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val TAG:String = "@@@"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = Data(1, 1, 1)
        val data2 = data.copy()
        data2.age = 100

        Log.d(TAG, "Data  age: $data")
        Log.d(TAG, "Data2 age: $data2")

        for (one in arrList()) {
            Log.d(TAG, "for $one")
        }
        arrList().forEach {
            Log.d(TAG, "forEach $it")
        }

        for (i in 1 until 10){
            Log.d(TAG, "cycle for until $i")
        }
        for (i in 1..10){
            Log.d(TAG, "cycle for in range 1..10 $i")
        }
        for (i in 10 downTo  1 step 3){
            Log.d(TAG, "for downTo $i")
        }
        var counter1 = 10
        while (counter1-->0){
            Log.d(TAG, "while counter $counter1")
        }
        var counter2 = 10
        do {
            Log.d(TAG, "do while counter $counter2")
        }while (counter2-->0)

    }

    private fun arrList() = listOf(1, 2, 3, 4, 5, 8)
}
