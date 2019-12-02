package com.avichai.pay.and.asdfghjnm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.RV);

        List<String> l = new ArrayList<>();
        l.add("asd");
        l.add("asd");
        l.add("asd");
        l.add("asd");
        MyAdapter myAdapter = new MyAdapter(this, l);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        recyclerView.setAdapter(myAdapter);
    }
}
