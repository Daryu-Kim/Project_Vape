package com.develoware.vape;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;

import androidx.constraintlayout.widget.ConstraintLayout;

public class RegisterAgreeActivity extends Activity {
    // Define
    CheckBox register_agree_content_all_check, register_agree_content_must_check;
    ConstraintLayout register_agree_content_must_v_layout, register_agree_content_must_deal_layout,
            register_agree_content_must_personal_layout, register_agree_content_must_confirm_layout,
            register_agree_content_must_membership_layout, register_agree_next_layout;
    ImageButton register_agree_menu_beforebtn, register_agree_next_img;
    Boolean all_checked = Boolean.FALSE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_agree);

        // Declare
        register_agree_menu_beforebtn = findViewById(R.id.register_agree_menu_beforebtn);
        register_agree_content_all_check = findViewById(R.id.register_agree_content_all_check);
        register_agree_content_must_check = findViewById(R.id.register_agree_content_must_check);
        register_agree_content_must_v_layout = findViewById(R.id.register_agree_content_must_v_layout);
        register_agree_content_must_deal_layout = findViewById(R.id.register_agree_content_must_deal_layout);
        register_agree_content_must_personal_layout = findViewById(R.id.register_agree_content_must_personal_layout);
        register_agree_content_must_confirm_layout = findViewById(R.id.register_agree_content_must_confirm_layout);
        register_agree_content_must_membership_layout = findViewById(R.id.register_agree_content_must_membership_layout);
        register_agree_next_layout = findViewById(R.id.register_agree_next_layout);
        register_agree_next_img = findViewById(R.id.register_agree_next_img);

        register_agree_content_all_check.setChecked(false);
        register_agree_content_must_check.setChecked(false);
        register_agree_next_img.setBackgroundResource(R.drawable.base_register_deactive_btn);

        // OnClick
        register_agree_menu_beforebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        register_agree_content_all_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (register_agree_content_all_check.isChecked()) {
                    register_agree_content_all_check.setChecked(true);
                    register_agree_content_must_check.setChecked(true);
                    register_agree_next_img.setBackgroundResource(R.drawable.base_register_active_btn);
                    all_checked = Boolean.TRUE;
                } else {
                    register_agree_content_all_check.setChecked(false);
                    register_agree_content_must_check.setChecked(false);
                    register_agree_next_img.setBackgroundResource(R.drawable.base_register_deactive_btn);
                    all_checked = Boolean.FALSE;
                }
            }
        });

        register_agree_content_must_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (register_agree_content_must_check.isChecked()) {
                    register_agree_content_all_check.setChecked(true);
                    register_agree_content_must_check.setChecked(true);
                    register_agree_next_img.setBackgroundResource(R.drawable.base_register_active_btn);
                    all_checked = Boolean.TRUE;
                } else {
                    register_agree_content_all_check.setChecked(false);
                    register_agree_content_must_check.setChecked(false);
                    register_agree_next_img.setBackgroundResource(R.drawable.base_register_deactive_btn);
                    all_checked = Boolean.FALSE;
                }
            }
        });

        register_agree_next_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (all_checked == Boolean.TRUE) {
                    Intent intent = new Intent(getApplicationContext(), RegisterInputActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
