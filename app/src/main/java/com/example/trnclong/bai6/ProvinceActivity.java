package com.example.trnclong.bai6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProvinceActivity extends AppCompatActivity {
    TextView txtShow ;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_province);

        anhXa();
        addEvents();

    }

    private void addEvents() {
        String s ="";
        for(int i=0; i<= MainActivity.i; i++) {
            s += MainActivity.arrayList.get(i) +"-- ";
        }
        String a = s.substring(0,s.length()-3);
        txtShow.setText(a);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void anhXa() {
        txtShow = findViewById(R.id.txtHienThi);
        btnBack = findViewById(R.id.btnBack);
    }
}
