package com.develoware.vape;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.core.app.ActivityCompat;

public class RegisterInputActivity extends Activity {
    String mCurrentPhotoPath;
    final static int TAKE_PICTURE = 1;
    final static int REQUEST_TAKE_PHOTO = 1;

    // Define
    ImageButton register_input_menu_beforebtn, register_input_content_idcard_btn;
    EditText register_input_content_email_edittext, register_input_content_pw_edittext,
            register_input_content_pw_re_edittext, register_input_content_phone_edittext,
            register_input_content_idcard_edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_input);

        // Declare

        register_input_menu_beforebtn = findViewById(R.id.register_input_menu_beforebtn);
        register_input_content_idcard_btn = findViewById(R.id.register_input_content_idcard_btn);
        register_input_content_email_edittext = findViewById(R.id.register_input_content_email_edittext);
        register_input_content_pw_edittext = findViewById(R.id.register_input_content_pw_edittext);
        register_input_content_pw_re_edittext = findViewById(R.id.register_input_content_pw_re_edittext);
        register_input_content_phone_edittext = findViewById(R.id.register_input_content_phone_edittext);
        register_input_content_idcard_edittext = findViewById(R.id.register_input_content_idcard_edittext);

        // OnClick
        register_input_menu_beforebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        register_input_content_idcard_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i, 0);
            }
        });

    }
}
