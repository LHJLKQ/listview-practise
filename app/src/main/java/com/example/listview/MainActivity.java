package com.example.listview;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {
    private List<Fruit> fruitList = new ArrayList<Fruit>();
    private String[] data = {"20161707",
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
            "20175990"};
    int imageId[] = {R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8,R.drawable.a9,R.drawable.a10,R.drawable.a11,R.drawable.a12,R.drawable.a13,R.drawable.a14,R.drawable.a15,R.drawable.a16,
            R.drawable.a17,R.drawable.a18,R.drawable.a19,R.drawable.a20,R.drawable.a21,R.drawable.a22,R.drawable.a23,R.drawable.a24,R.drawable.a25,R.drawable.a26,R.drawable.a27,R.drawable.a28,R.drawable.a29,R.drawable.a30,R.drawable.a31,R.drawable.a32};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits(); // 初始化水果数据
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initFruits() {

        for(int i =0;i<32;i++){
            Fruit people = new Fruit(data[i], imageId[i]);
            fruitList.add(people);
        }

    }
}

