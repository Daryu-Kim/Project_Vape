package com.develoware.vape;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.constraintlayout.widget.ConstraintLayout;

public class LoginActivity extends Activity {
    // Define
    ImageButton login_menu_beforebtn;
    ConstraintLayout login_content_login_phone_btn_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Declare
        login_menu_beforebtn = findViewById(R.id.login_menu_beforebtn);
        login_content_login_phone_btn_layout = findViewById(R.id.login_content_login_phone_btn_layout);

        // OnClick
        login_menu_beforebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        login_content_login_phone_btn_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IdcardReadyActivity.class);
                startActivity(intent);
            }
        });
    }
}
