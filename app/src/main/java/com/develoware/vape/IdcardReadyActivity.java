package com.develoware.vape;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;

public class IdcardReadyActivity extends Activity {

    static final int PERMISSIONS_REQUEST_READ_LOCATION = 0x00000001;
    private String[] PERMISSIONS = {
            Manifest.permission.CAMERA,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    // Define
    ImageButton idcard_ready_menu_beforebtn;
    ConstraintLayout login_content_take_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idcard_ready);

        // Declare
        idcard_ready_menu_beforebtn = findViewById(R.id.idcard_ready_menu_beforebtn);
        login_content_take_layout = findViewById(R.id.login_content_take_layout);

        // OnClick
        idcard_ready_menu_beforebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        login_content_take_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCompat.requestPermissions((Activity) getApplicationContext(), PERMISSIONS, PERMISSIONS_REQUEST_READ_LOCATION);
            }
        });
    }

    public void onRequestPermissionsResult (int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {

        }
    }
}
