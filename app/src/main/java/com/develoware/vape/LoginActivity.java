package com.develoware.vape;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LoginActivity extends Activity {
    // Define
    ImageButton login_menu_beforebtn, login_content_login_social_kakao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Declare
        login_menu_beforebtn = findViewById(R.id.login_menu_beforebtn);
        login_content_login_social_kakao = findViewById(R.id.login_content_login_social_kakao);

        // OnClick
        login_menu_beforebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        login_content_login_social_kakao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IdcardReadyActivity.class);
                startActivity(intent);
            }
        });
    }
}
