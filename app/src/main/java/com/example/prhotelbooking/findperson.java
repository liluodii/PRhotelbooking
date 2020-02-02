package com.example.prhotelbooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class findperson extends AppCompatActivity {
    RecyclerView rvpersonlist;
    final CustomerRepo customerRepo=CustomerRepo.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findperson);
        rvpersonlist = findViewById(R.id.rvpartner);
        rvpersonlist.setLayoutManager((new LinearLayoutManager(this)));
        PersonAdapter personAdapter = new PersonAdapter(getApplicationContext());
        rvpersonlist.setAdapter(personAdapter);
    }
}
