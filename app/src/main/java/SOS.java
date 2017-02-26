package com.example.sos;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

import static android.R.attr.phoneNumber;
import static android.R.id.message;

public class SOS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos);

        if (ContextCompact.checkSelfPermission(MainActivity.this,
                Manifest.Permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.ShouldShowrequestPermissionRationale(MainActivity.this,
                        Manifest.permission.READ_PHONE_STATE){

                    ActivityCompat.requestPermissions(MainActivity.this,
                            new String[] {Manifest.permission.READ_PHONE_STATE}, 1);
            }else {
                ActivityCompat.requestPermissions(MainActivity.this,
                        new String[] {Manifest.permission.READ_PHONE_STATE}, 1);
            }

        }else {
            //do nothing
        }
    }



    @overridde
    public void onRequestPermissionsResult(int RequestCode, String[] permissions, int[] grantResults){
        switch (requestCode) {
            if (grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                if(ContextCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.READ_PHONE_STATE)== PackageManager.PERMISSION_GRANTED){
                    Toadt.makeText(this, "Permission granted"), Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(this, "no permission granted"), Toast.LENGTH_SHORT).show();
            }
            return;
        }
    }


}
