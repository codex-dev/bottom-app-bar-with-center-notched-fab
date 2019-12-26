package com.example.bottomnotchdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout babEarning, babHistory, babAgent, babDeals;
    private FloatingActionButton fabHome;
    private ImageView ivEarning, ivHistory, ivAgent, ivDeals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("iPay");

        babEarning = findViewById(R.id.bab_icon_earning);
        ivEarning = findViewById(R.id.iv_earning);
        babHistory = findViewById(R.id.bab_icon_history);
        ivHistory = findViewById(R.id.iv_history);
        fabHome = findViewById(R.id.fab);
        babAgent = findViewById(R.id.bab_icon_agent);
        ivAgent = findViewById(R.id.iv_agent);
        babDeals = findViewById(R.id.bab_icon_deals);
        ivDeals = findViewById(R.id.iv_deals);

        babEarning.setOnClickListener(this);
        babHistory.setOnClickListener(this);
        fabHome.setOnClickListener(this);
        babAgent.setOnClickListener(this);
        babDeals.setOnClickListener(this);

//        ViewPager viewPager = findViewById(R.id.viewpager);
        BottomAppBar bottomAppBar = findViewById(R.id.bottomAppBar);

    }

    @Override
    public void onClick(View view) {
        String txt = "";
        switch (view.getId()) {
            case R.id.bab_icon_earning:
                txt = "Spendings";
                ivEarning.setColorFilter(ContextCompat.getColor(this, R.color.fab_bg), android.graphics.PorterDuff.Mode.SRC_IN);
                ivHistory.setColorFilter(ContextCompat.getColor(this, R.color.bottom_app_bar_icon), android.graphics.PorterDuff.Mode.SRC_IN);
                fabHome.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.tab));
                fabHome.setImageTintList(ContextCompat.getColorStateList(this, R.color.bottom_app_bar_icon));
                ivAgent.setColorFilter(ContextCompat.getColor(this, R.color.bottom_app_bar_icon), android.graphics.PorterDuff.Mode.SRC_IN);
                ivDeals.setColorFilter(ContextCompat.getColor(this, R.color.bottom_app_bar_icon), android.graphics.PorterDuff.Mode.SRC_IN);
                break;
            case R.id.bab_icon_history:
                txt = "History";
                ivEarning.setColorFilter(ContextCompat.getColor(this, R.color.bottom_app_bar_icon), android.graphics.PorterDuff.Mode.SRC_IN);
                ivHistory.setColorFilter(ContextCompat.getColor(this, R.color.fab_bg), android.graphics.PorterDuff.Mode.SRC_IN);
                fabHome.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.tab));
                fabHome.setImageTintList(ContextCompat.getColorStateList(this, R.color.bottom_app_bar_icon));
                ivAgent.setColorFilter(ContextCompat.getColor(this, R.color.bottom_app_bar_icon), android.graphics.PorterDuff.Mode.SRC_IN);
                ivDeals.setColorFilter(ContextCompat.getColor(this, R.color.bottom_app_bar_icon), android.graphics.PorterDuff.Mode.SRC_IN);
                break;
            case R.id.fab:
                txt = "Pay";
                ivEarning.setColorFilter(ContextCompat.getColor(this, R.color.bottom_app_bar_icon), android.graphics.PorterDuff.Mode.SRC_IN);
                ivHistory.setColorFilter(ContextCompat.getColor(this, R.color.bottom_app_bar_icon), android.graphics.PorterDuff.Mode.SRC_IN);
                fabHome.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.fab_bg));
                fabHome.setImageTintList(ContextCompat.getColorStateList(this, R.color.white));
                ivAgent.setColorFilter(ContextCompat.getColor(this, R.color.bottom_app_bar_icon), android.graphics.PorterDuff.Mode.SRC_IN);
                ivDeals.setColorFilter(ContextCompat.getColor(this, R.color.bottom_app_bar_icon), android.graphics.PorterDuff.Mode.SRC_IN);
                break;
            case R.id.bab_icon_agent:
                txt = "Deals";
                ivEarning.setColorFilter(ContextCompat.getColor(this, R.color.bottom_app_bar_icon), android.graphics.PorterDuff.Mode.SRC_IN);
                ivHistory.setColorFilter(ContextCompat.getColor(this, R.color.bottom_app_bar_icon), android.graphics.PorterDuff.Mode.SRC_IN);
                fabHome.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.tab));
                fabHome.setImageTintList(ContextCompat.getColorStateList(this, R.color.bottom_app_bar_icon));
                ivAgent.setColorFilter(ContextCompat.getColor(this, R.color.fab_bg), android.graphics.PorterDuff.Mode.SRC_IN);
                ivDeals.setColorFilter(ContextCompat.getColor(this, R.color.bottom_app_bar_icon), android.graphics.PorterDuff.Mode.SRC_IN);
                break;
            case R.id.bab_icon_deals:
                txt = "More";
                ivEarning.setColorFilter(ContextCompat.getColor(this, R.color.bottom_app_bar_icon), android.graphics.PorterDuff.Mode.SRC_IN);
                ivHistory.setColorFilter(ContextCompat.getColor(this, R.color.bottom_app_bar_icon), android.graphics.PorterDuff.Mode.SRC_IN);
                fabHome.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.tab));
                fabHome.setImageTintList(ContextCompat.getColorStateList(this, R.color.bottom_app_bar_icon));
                ivAgent.setColorFilter(ContextCompat.getColor(this, R.color.bottom_app_bar_icon), android.graphics.PorterDuff.Mode.SRC_IN);
                ivDeals.setColorFilter(ContextCompat.getColor(this, R.color.fab_bg), android.graphics.PorterDuff.Mode.SRC_IN);
                break;
        }

        Snackbar snackbar = Snackbar.make(findViewById(R.id.container), "Clicked \"" + txt + "\"", Snackbar.LENGTH_LONG);
        snackbar.setAction("Hide", view1 -> snackbar.dismiss());
        snackbar.setActionTextColor(Color.GREEN);
        snackbar.getView().setBackground(ContextCompat.getDrawable(this, R.drawable.bg_snackbar));
        snackbar.show();
    }
}
