package com.example.tugas_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private ArrayList<SocmedModel> listsocmed = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv1);
        rv.setHasFixedSize(true);

        listsocmed.addAll(SocmedData.getListData());
        showRecycleList();

    }

    private void showRecycleList() {

        rv.setLayoutManager(new LinearLayoutManager(this));

       SocmedAdapter socmedAdapter = new SocmedAdapter(this);
       socmedAdapter.setSocmedModels(listsocmed);
       rv.setAdapter(socmedAdapter);
    }
}