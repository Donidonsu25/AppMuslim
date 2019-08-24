package com.example.sonyvaio.appmuslim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class Doa_Harian extends AppCompatActivity {
    private String[] doa = {"Doa Masuk Masjid", "Doa Keluar Masjid", "Doa Kedua Orang Tua"};
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_harian);

        ListView listView = findViewById(R.id.listitem);
        data = new ArrayList<>();
        getData();

        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, R.layout.support_simple_spinner_dropdown_item, data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String getName = data.get(position);

                Intent sendData = new Intent(Doa_Harian.this, DataDoa.class);
                sendData.putExtra("MyName", getName);
                startActivity(sendData);

            }
        });
    }

    private void getData() {
        Collections.addAll(data, doa);
    }
}
