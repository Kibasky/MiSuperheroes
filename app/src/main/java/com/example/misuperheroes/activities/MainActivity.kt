package com.example.misuperheroes.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.misuperheroes.R
import com.example.misuperheroes.utils.RetrofitProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service = RetrofitProvider.getRetrofit()


        CoroutineScope(Dispatchers.IO).launch {
            val result = service.findSuperheroesByName("super")
            println(result)
        }
    }
}