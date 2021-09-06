package com.example.recycleview_bai3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Folder_Adapter adapter;
    ArrayList<Folder> folders;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle_view);

        folders = new ArrayList<Folder>();
        folders.add(new Folder("Video"));
        folders.add(new Folder("Android"));
        folders.add(new Folder("Applock"));
        folders.add(new Folder("Books"));
        folders.add(new Folder("map"));
        folders.add(new Folder("NewFolder"));

        adapter= new Folder_Adapter(folders,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}