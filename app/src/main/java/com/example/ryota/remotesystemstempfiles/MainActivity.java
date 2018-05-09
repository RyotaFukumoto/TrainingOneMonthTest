package com.example.ryota.remotesystemstempfiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RowClickListener{
    private List<VideoRowData> dataset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        VideoListAdapter adapter = new VideoListAdapter(this, this.createDataset(), this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void rowClick(VideoRowData rowData){
        Intent intent = new Intent(MainActivity.this,VideoPlayActivity.class);
        intent.putExtra("text",rowData.getVideoName());
        startActivity(intent);
    }


    private List<VideoRowData> createDataset() {

        this.dataset = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            VideoRowData data = new VideoRowData();
            data.setVideoName("曲" + i + '番');

            Log.d("videodata", String.valueOf(i));
            this.dataset.add(data);
        }
        return this.dataset;
    }

    @Override
    public void rowClicked(VideoRowData rowData) {
        Log.d("test","test");
        Intent intent = new Intent(MainActivity.this,VideoPlayActivity.class);
        intent.putExtra("text",rowData.getVideoName());
        startActivity(intent);
    }
}
