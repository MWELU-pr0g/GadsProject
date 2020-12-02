package com.mweluh.gadsproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class LeaderBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader_board);

        ViewPager2 page = findViewById(R.id.pager);
        page.setAdapter(new MyPageAdapter(this));

    }
}