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


    }

    public void BtnSetSOS_onClick(View view2)
    {//start buttonSOS
        String number = n;
        Intent intent = new Intent (Intent.ACTION_TE);
        intent.setData(Uri.parse("Tel:" + number));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
            return;

        private void sendSMS(String phoneNumber, String message)
        {
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(phoneNumber, null, message, null, null);
        }
        startActivity(intent);

    }//end buttonSOS
}
