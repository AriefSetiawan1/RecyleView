package com.example.recyleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    ArrayList<Mahasiswa> mahasiswaArrayList;
    private MahasiswaAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.data);

        addData();


         adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

     void addData() {
         mahasiswaArrayList = new ArrayList<>();
         mahasiswaArrayList.add(new Mahasiswa("Lina", "514", "083567","email"));
         mahasiswaArrayList.add(new Mahasiswa("Boni", "693", "082778", "Boni@gmail.com"));
         mahasiswaArrayList.add(new Mahasiswa("Ika", "982", "089123", "email Ika"));
         Mahasiswa Sari = new Mahasiswa("Joko", "291" , "089645", "email");
         mahasiswaArrayList.add(Sari);
    }
}