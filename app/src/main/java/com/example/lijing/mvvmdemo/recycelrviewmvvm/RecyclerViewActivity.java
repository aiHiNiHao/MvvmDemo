package com.example.lijing.mvvmdemo.recycelrviewmvvm;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lijing.mvvmdemo.R;

/**
 * Created by lijing on 2019/3/23.
 */

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        mRecyclerView = findViewById(R.id.rv);
        mRecyclerView.setAdapter(new MvvmAdapter(this));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
