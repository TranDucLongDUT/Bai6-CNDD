package com.example.trnclong.bai6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView ;
    public static ArrayList<String> arrayList;
    ArrayAdapter adapter ;
    public static int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khoi tao
        arrayList = new ArrayList<>();
        // Anh Xa
        anhXa();
        // Fake Data
        fakeData();
        // Event
        adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);
        addEvents();
    }

    private void addEvents() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // bien position tra ve vi tri khi nguoi dung click tren listView
                i = position;
                Intent intent = new Intent(MainActivity.this, ProvinceActivity.class);
                startActivity(intent);
            }
        });
    }

    private void fakeData() {
        arrayList.add("Ha Noi");
        arrayList.add("Ha Nam");
        arrayList.add("Ha Tinh");
        arrayList.add("Nghe An");
        arrayList.add("Quang Binh");
        arrayList.add("Quang Tri");
        arrayList.add("Hue");
        arrayList.add("Da Nang");
        arrayList.add("Quang Nam");
        arrayList.add("Quang Ngai");
        arrayList.add("Binh Dinh");
        arrayList.add("Phu Yen");
        arrayList.add("Khanh Hoa");
        arrayList.add("Ninh Thuan");
    }

    private void anhXa() {
        listView = findViewById(R.id.listView);
    }
}
