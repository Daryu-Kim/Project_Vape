package com.develoware.vape;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.kakao.sdk.common.util.Utility;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        checkPermissions();
    }

    private void checkPhoneNumber() {

        TelephonyManager telManager = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_SMS) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_NUMBERS) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {

        } else {
            @SuppressLint("HardwareIds") String PhoneNum = telManager.getLine1Number();
            Log.d("TAG", PhoneNum);
            if (PhoneNum.equals("")) {
                Toast.makeText(this, "전화번호 없음", Toast.LENGTH_SHORT).show();
                //finish();
            } else {

            }
        }

    }

    private void checkPermissions() {
        int call_phone = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);
        int read_phone_numbers = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_NUMBERS);
        int read_phone_state = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE);
        int camera = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA);
        int send_sms = ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);
        int read_sms = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_SMS);
        int write_external_storage = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        int read_external_storage = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE);

        if (call_phone == PackageManager.PERMISSION_DENIED ||
                read_phone_numbers == PackageManager.PERMISSION_DENIED ||
                read_phone_state == PackageManager.PERMISSION_DENIED ||
                camera == PackageManager.PERMISSION_DENIED ||
                send_sms == PackageManager.PERMISSION_DENIED ||
                read_sms == PackageManager.PERMISSION_DENIED ||
                write_external_storage == PackageManager.PERMISSION_DENIED ||
                read_external_storage == PackageManager.PERMISSION_DENIED) {
            Intent intent = new Intent(getApplicationContext(), PermissionActivity.class);
            startActivity(intent);
            finish();
        } else {
            moveMain(1);
        }

    }

    private void moveMain(int sec) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1000 * sec);
    }
}
