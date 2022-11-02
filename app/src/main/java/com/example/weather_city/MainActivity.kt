package com.example.weather_city

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.weather_city.fragment.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.placeHolder, MainFragment.newInstance())
            .commit()
    }
}
//class MainActivity : AppCompatActivity() {
//
//    private lateinit var binding: ActivityMainBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        binding.bGet.setOnClickListener {
//            getResult("Moscow")
//        }
//    }
//    private fun getResult(name: String){
//        val url = "https://api.weatherapi.com/v1/current.json" +
//                "?key=$API_KEY&q=$name&aqi=no"
//        val queue = Volley.newRequestQueue(this)
//        val stringRequest = StringRequest(
//            Request.Method.GET,
//            url,
//            {
//                    response->
//                val obj = JSONObject(response)
//                val temp = obj.getJSONObject("current")
//                Log.d("MyLog","Response: ${temp.getString("temp_c")}")
//            },
//            {
//                Log.d("MyLog","Volley error: $it")
//            }
//        )
//        queue.add(stringRequest)
//    }
//}