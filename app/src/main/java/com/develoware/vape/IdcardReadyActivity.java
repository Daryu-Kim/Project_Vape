package com.develoware.vape;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;

import androidx.constraintlayout.widget.ConstraintLayout;

public class IdcardReadyActivity extends Activity {
    // Define
    ImageButton idcard_ready_menu_beforebtn;
    //ConstraintLayout register_agree_content_must_v_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idcard_ready);

        // Declare
        idcard_ready_menu_beforebtn = findViewById(R.id.idcard_ready_menu_beforebtn);
        //register_agree_content_must_v_layout = findViewById(R.id.register_agree_content_must_v_layout);

        // OnClick
        idcard_ready_menu_beforebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
