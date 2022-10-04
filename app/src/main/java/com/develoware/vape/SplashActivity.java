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

    private void checkPermissions() {
        int call_phone = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);
        int read_phone_numbers = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_NUMBERS);
        int read_phone_state = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE);
        int camera = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA);
        int send_sms = ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);
        int read_sms = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_SMS);
        int record_audio = ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO);
        int access_coarse_location = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION);
        int access_fine_location = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);
        int write_external_storage = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        int read_external_storage = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE);

        if (call_phone == PackageManager.PERMISSION_DENIED ||
                read_phone_numbers == PackageManager.PERMISSION_DENIED ||
                read_phone_state == PackageManager.PERMISSION_DENIED ||
                camera == PackageManager.PERMISSION_DENIED ||
                send_sms == PackageManager.PERMISSION_DENIED ||
                read_sms == PackageManager.PERMISSION_DENIED ||
                record_audio == PackageManager.PERMISSION_DENIED ||
                access_coarse_location == PackageManager.PERMISSION_DENIED ||
                access_fine_location == PackageManager.PERMISSION_DENIED ||
                write_external_storage == PackageManager.PERMISSION_DENIED ||
                read_external_storage == PackageManager.PERMISSION_DENIED) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(
                        new String[]{
                                Manifest.permission.CALL_PHONE,
                                Manifest.permission.READ_PHONE_NUMBERS,
                                Manifest.permission.READ_PHONE_STATE,
                                Manifest.permission.CAMERA,
                                Manifest.permission.SEND_SMS,
                                Manifest.permission.READ_SMS,
                                Manifest.permission.RECORD_AUDIO,
                                Manifest.permission.ACCESS_COARSE_LOCATION,
                                Manifest.permission.ACCESS_FINE_LOCATION,
                                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                                Manifest.permission.READ_EXTERNAL_STORAGE},
                        1000);
            }
            return;
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grandResults) {
        if (requestCode == 1000) {
            boolean check_result = true;

            // 모든 퍼미션을 허용했는지 체크
            for (int result : grandResults) {
                if (result != PackageManager.PERMISSION_GRANTED) {
                    check_result = false;
                    break;
                }
            }

            // 권한 체크에 동의를 하지 않으면 안드로이드 종료
            if (check_result) {
                TelephonyManager telManager = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_SMS) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_NUMBERS) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                String PhoneNum = telManager.getLine1Number();
                if(PhoneNum.startsWith("+82")){
                    PhoneNum = PhoneNum.replace("+82", "0");
                }

                if (PhoneNum.equals("")) {
                    Toast.makeText(this, "전화번호 없음", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
            else {
                Toast.makeText(this, "권한 없음", Toast.LENGTH_SHORT).show();
                finish();
            }
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
