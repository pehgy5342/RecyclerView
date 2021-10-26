package com.example.pehgy.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.pehgy.recyclerview.R.id.recyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//這裡有一個版面問題，當有問題時去改變recycler_view.xml的layout_height改成wrap_content

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fun getInfoList(): MutableList<Info> {
            val datas = mutableListOf<Info>(

                Info("標題一", "123456789"),
                Info("標題二", "987654321")


            )
            return datas
        }
        val myadapter = MainAdapter(this,getInfoList())
        recyclerView.adapter = myadapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }


}
