package com.develoware.vape;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class MyUsageNameActivity extends Activity {

    // Define
    ImageButton my_usage_name_menu_beforebtn;

    ConstraintLayout my_usage_name_content_tab_transfer_layout, my_usage_name_content_tab_positive_layout;

    Boolean limit_clicked = Boolean.FALSE;
    ImageView my_usage_name_content_process_content_01_img, my_usage_name_content_process_content_02_img,
            my_usage_name_content_process_content_03_img, my_usage_name_content_limit_content_01_img;
    ConstraintLayout my_usage_name_content_process_content_01_layout, my_usage_name_content_process_content_01_content_layout,
            my_usage_name_content_process_content_02_layout, my_usage_name_content_process_content_02_content_layout,
            my_usage_name_content_process_content_03_layout, my_usage_name_content_process_content_03_content_layout,
            my_usage_name_content_limit_content_01_layout, my_usage_name_content_limit_content_01_content_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_usage_name);

        // Declare
        my_usage_name_menu_beforebtn = findViewById(R.id.my_usage_name_menu_beforebtn);

        my_usage_name_content_tab_transfer_layout = findViewById(R.id.my_usage_name_content_tab_transfer_layout);
        my_usage_name_content_tab_positive_layout = findViewById(R.id.my_usage_name_content_tab_positive_layout);

        my_usage_name_content_process_content_01_layout = findViewById(R.id.my_usage_name_content_process_content_01_layout);
        my_usage_name_content_process_content_01_img = findViewById(R.id.my_usage_name_content_process_content_01_img);
        my_usage_name_content_process_content_01_content_layout = findViewById(R.id.my_usage_name_content_process_content_01_content_layout);
        my_usage_name_content_process_content_02_layout = findViewById(R.id.my_usage_name_content_process_content_02_layout);
        my_usage_name_content_process_content_02_img = findViewById(R.id.my_usage_name_content_process_content_02_img);
        my_usage_name_content_process_content_02_content_layout = findViewById(R.id.my_usage_name_content_process_content_02_content_layout);
        my_usage_name_content_process_content_03_layout = findViewById(R.id.my_usage_name_content_process_content_03_layout);
        my_usage_name_content_process_content_03_img = findViewById(R.id.my_usage_name_content_process_content_03_img);
        my_usage_name_content_process_content_03_content_layout = findViewById(R.id.my_usage_name_content_process_content_03_content_layout);

        my_usage_name_content_limit_content_01_layout = findViewById(R.id.my_usage_name_content_limit_content_01_layout);
        my_usage_name_content_limit_content_01_img = findViewById(R.id.my_usage_name_content_limit_content_01_img);
        my_usage_name_content_limit_content_01_content_layout = findViewById(R.id.my_usage_name_content_limit_content_01_content_layout);


        // OnClick
        my_usage_name_menu_beforebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // MY_USAGE_NAME Tab Layout
        my_usage_name_content_tab_transfer_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        my_usage_name_content_tab_positive_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        // MY_USAGE_NAME Process Layout
        my_usage_name_content_process_content_01_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fold_Process();
                my_usage_name_content_process_content_01_img.setBackgroundResource(R.drawable.ic_menu_fold_arrow_32dp);
                my_usage_name_content_process_content_01_content_layout.setVisibility(View.VISIBLE);
            }
        });

        my_usage_name_content_process_content_02_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fold_Process();
                my_usage_name_content_process_content_02_img.setBackgroundResource(R.drawable.ic_menu_fold_arrow_32dp);
                my_usage_name_content_process_content_02_content_layout.setVisibility(View.VISIBLE);
            }
        });

        my_usage_name_content_process_content_03_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fold_Process();
                my_usage_name_content_process_content_03_img.setBackgroundResource(R.drawable.ic_menu_fold_arrow_32dp);
                my_usage_name_content_process_content_03_content_layout.setVisibility(View.VISIBLE);
            }
        });

        // MY_USAGE_NAME Limit Layout
        my_usage_name_content_limit_content_01_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fold_Limit();
            }
        });

    }

    public void Fold_Process() {
        my_usage_name_content_process_content_01_content_layout.setVisibility(View.GONE);
        my_usage_name_content_process_content_02_content_layout.setVisibility(View.GONE);
        my_usage_name_content_process_content_03_content_layout.setVisibility(View.GONE);

        my_usage_name_content_process_content_01_img.setBackgroundResource(R.drawable.ic_menu_spread_arrow_32dp);
        my_usage_name_content_process_content_02_img.setBackgroundResource(R.drawable.ic_menu_spread_arrow_32dp);
        my_usage_name_content_process_content_03_img.setBackgroundResource(R.drawable.ic_menu_spread_arrow_32dp);
    }

    public void Fold_Limit() {
        if (limit_clicked == true) {
            limit_clicked = Boolean.FALSE;
            my_usage_name_content_limit_content_01_img.setBackgroundResource(R.drawable.ic_menu_spread_arrow_32dp);
            my_usage_name_content_limit_content_01_content_layout.setVisibility(View.GONE);
        }
        else {
            limit_clicked = Boolean.TRUE;
            my_usage_name_content_limit_content_01_img.setBackgroundResource(R.drawable.ic_menu_fold_arrow_32dp);
            my_usage_name_content_limit_content_01_content_layout.setVisibility(View.VISIBLE);
        }
    }
}
