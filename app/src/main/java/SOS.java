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
                Manifest.Permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.ShouldShowrequestPermissionRationale(MainActivity.this,
                        Manifest.permission.SEND_SMS){

                    ActivityCompat.requestPermissions(MainActivity.this,
                            new String[] {Manifest.permission.SEND_SMS}, 1);
            }else {
                ActivityCompat.requestPermissions(MainActivity.this,
                        new String[] {Manifest.permission.SEND_SMS}, 1);
            }

        }else {
            //do nothing
        }
    }

    button = (Button) findViewById(R.id.button);

   Text1(import from user)
      String Text2 =  "SOS please call me";

    button.setOnClickListener(new View.OnClickListener() {
        @override
        public void onClick(View v) {
            String number = Text1.getText().toString();
            String sms = Text2;

            try {
                smsManager=smsManager.getDefault();
                smsManager.sendTextMessage (number, null, sms, null, null);
                Toast.makeText(MainActivity.this, "Sent", Toast.LENGTH_SHORT).show();
            }catch (exception e) {
                Toast.makeText(MainActivity.this, "not sent", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @overridde
    public void onRequestPermissionsResult(int RequestCode, String[] permissions, int[] grantResults){
        switch (requestCode) {
            if (grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                if(ContextCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.SEND_SMS)== PackageManager.PERMISSION_GRANTED){
                    Toadt.makeText(this, "Permission granted"), Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(this, "no permission granted"), Toast.LENGTH_SHORT).show();
            }
            return;
        }
    }


}
