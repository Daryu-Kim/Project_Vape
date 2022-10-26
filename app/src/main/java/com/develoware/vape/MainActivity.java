package com.develoware.vape;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    ImageButton main_menu_layout_menubtn;
    FrameLayout main_fragment_layout;
    BottomNavigationView main_bnv_layout;
    Fragment feedFragment, homeFragment, profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_menu_layout_menubtn = findViewById(R.id.main_menu_layout_menubtn);
        main_fragment_layout = findViewById(R.id.main_fragment_layout);
        main_bnv_layout = findViewById(R.id.main_bnv_layout);

        main_bnv_layout.setOnItemSelectedListener(listener);

        feedFragment = new FeedFragment();
        homeFragment = new HomeFragment();
        profileFragment = new ProfileFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_layout, homeFragment).commit();
        main_bnv_layout.setSelectedItemId(R.id.item_home);


        main_menu_layout_menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }

    private NavigationBarView.OnItemSelectedListener listener = new NavigationBarView.OnItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.item_feed:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_layout, feedFragment).commit();
                    return true;
                case R.id.item_home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_layout, homeFragment).commit();
                    return true;
                case R.id.item_profile:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_layout, profileFragment).commit();
                    return true;
            }
            return false;
        }
    };
}
