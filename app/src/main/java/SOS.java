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

public class SOS extends AppCompatActivity
{//start class

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {//start onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos);

        if (ContextCompact.checkSelfPermission(MainActivity.this, Manifest.Permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED)
        {//start if1
                if (ActivityCompat.ShouldShowrequestPermissionRationale(MainActivity.this, Manifest.permission.SEND_SMS)
                     {//start if 2
                         ActivityCompat.requestPermissions(MainActivity.this, new String[] {Manifest.permission.SEND_SMS}, 1);
                     }//end if2
                 else
                {//start else1
                     ActivityCompat.requestPermissions(MainActivity.this, new String[] {Manifest.permission.SEND_SMS}, 1);
                }//end else1
        }//end if1
        else
        {//start else2
            //do nothing
        }//end else2
    }//end onCreate

    button = (Button) findViewById(R.id.button);

   Text1(import from user)
      String Text2 =  "SOS please call me";

    button.setOnClickListener(new View.OnClickListener()
    {//start setOn
        @override
        public void onClick(View v)
        {//start onClick
            String number = Text1.getText().toString();
            String sms = Text2;

            try
            {//start try
                smsManager=smsManager.getDefault();
                smsManager.sendTextMessage (number, null, sms, null, null);
                Toast.makeText(MainActivity.this, "Sent", Toast.LENGTH_SHORT).show();
            }//end try
            catch (exception e)
            {//start catch
                Toast.makeText(MainActivity.this, "not sent", Toast.LENGTH_SHORT).show();
            }//end catch
        }//end onClick
    }//end SetOn

    @overridde
    public void onRequestPermissionsResult(int RequestCode, String[] permissions, int[] grantResults)
    {//start onRequest
        switch (requestCode)
        {//start switch
            if (grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {//start if1
                if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.SEND_SMS)== PackageManager.PERMISSION_GRANTED)
                {//start if2
                    Toadt.makeText(this, "Permission granted"), Toast.LENGTH_SHORT).show();
                }//end if2
            }//end if1
            else
            {//start else
                Toast.makeText(this, "permission not granted"), Toast.LENGTH_SHORT).show();
            }//end else
            return;
        }
    }


}//end class
