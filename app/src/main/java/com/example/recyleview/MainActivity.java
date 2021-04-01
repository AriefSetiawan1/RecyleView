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
         mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "999", "081222","email"));
         mahasiswaArrayList.add(new Mahasiswa("Budi", "000", "081222", "email"));
         mahasiswaArrayList.add(new Mahasiswa("Ani", "222", "083333", "email budi"));
         Mahasiswa Sari = new Mahasiswa("Sari", "xxx" , "000", "sari@gmail.com");
         mahasiswaArrayList.add(Sari);
    }
}