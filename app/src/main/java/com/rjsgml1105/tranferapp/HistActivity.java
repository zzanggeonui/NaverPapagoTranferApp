package com.rjsgml1105.tranferapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rjsgml1105.tranferapp.adapter.HistoryAdapter;
import com.rjsgml1105.tranferapp.model.History;

import java.util.ArrayList;

public class HistActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    HistoryAdapter adapter;
    ArrayList<History> historyList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hist);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(HistActivity.this));

        historyList = (ArrayList<History>) getIntent().getSerializableExtra("historyList");

        adapter = new HistoryAdapter(HistActivity.this, historyList);
        recyclerView.setAdapter(adapter);
    }
}