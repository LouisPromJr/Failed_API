package com.example.pokemonadventure

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.codepath.asynchttpclient.AsyncHttpClient
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler
import okhttp3.Headers


class MainActivity : AppCompatActivity() {
    var pokemonImageURL = " "
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}





private fun getPokemonImageURL() {
    val client = AsyncHttpClient()
    client["https://pokeapi.co/api/v2/pokemon?limit=100", null, object : JsonHttpResponseHandler() {
        override fun onSuccess(statusCode: Int, headers: Headers?, json: JsonHttpResponseHandler.JSON) {
            Log.d("Pokemon", "response successful")
            }

        override fun onFailure(
            stausCode: Int,
            header: Headers?,
            errorResponse: String,
            t: Throwable?) {
        }
    }]

}








