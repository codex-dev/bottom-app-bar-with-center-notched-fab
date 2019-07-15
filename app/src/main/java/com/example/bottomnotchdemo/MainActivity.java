package com.example.bottomnotchdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private LinearLayout babEarning, babHistory, babAgent, babDeals;
    private FloatingActionButton fabHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        babEarning = findViewById(R.id.bab_icon_earning);
        babHistory = findViewById(R.id.bab_icon_history);
        fabHome = findViewById(R.id.fab);
        babAgent = findViewById(R.id.bab_icon_agent);
        babDeals = findViewById(R.id.bab_icon_deals);

        //click event over FAB
        fabHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Home Clicked.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
