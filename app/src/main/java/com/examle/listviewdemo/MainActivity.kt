package com.examle.listviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.detail.*

class MainActivity : AppCompatActivity() {

    var arDemo= arrayOf(
        "20161707",
        "20161713",
        "20171591",
        "20171592",
        "20171616",
        "20171627",
        "20171641",
        "20171649",
        "20171650",
        "20171653",
        "20171654",
        "20171655",
        "20171656",
        "20171659",
        "20171664",
        "20171666",
        "20171667",
        "20171668",
        "20171669",
        "20171670",
        "20171679",
        "20171688",
        "20171697",
        "20171705",
        "20171707",
        "20171714",
        "20171717",
        "20171731",
        "20171742",
        "20175064",
        "20175980",
        "20175990"
        )
    fun loadDetail()
    {
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var aradpt =  ArrayAdapter<String>(this,R.layout.item,R.id.item_text,arDemo);
        list_view.adapter=aradpt
        list_view.adapter
        list_view.onItemClickListener=AdapterView.OnItemClickListener{
            parent, view, position, id ->
            //
            setContentView(R.layout.detail)
            txtDetailDescription.text="This is the description of "+arDemo[position];
        }

    }
}
