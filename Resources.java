package com.example.myapplication;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Resources extends AppCompatActivity {//start resources
    private static final String a = ("Resources");

    @Override
    protected void onCreate(Bundle savedInstanceState) {//start on create
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);

    }//end on create

    public void BtnSetSuicide_onClick(View view1) {//start buttonS
        String number1 = "18002738255";
        Intent Intent1 = new Intent (Intent.ACTION_CALL);
        Intent1.setData(Uri.parse("Tel:" + number1));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        startActivity(Intent1);
        BtnSetSuicide_onClick(view1.VISIBLE);
    }//end buttonS

    private void BtnSetSuicide_onClick(int visible) {
    }

    public void BtnSetLGBT_onClick(View view2) {//start buttonL
        String number2 = "18888434564";
        Intent intent2 = new Intent (Intent.ACTION_CALL);
        intent2.setData(Uri.parse("Tel:" + number2));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        startActivity(intent2);
        
        BtnSetLGBT_onClick(view2.VISIBLE);
    }//end buttonL

    private void BtnSetLGBT_onClick(int visible) {
    }

    public void BtnSetAssault_onClick(View view3) {//start buttonA
        String number3 = "18006564673";
        Intent intent3 = new Intent (Intent.ACTION_CALL);
        intent3.setData(Uri.parse("Tel:" + number3));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        startActivity(intent3);
        BtnSetAssault_onClick(view3.VISIBLE);
    }//end buttonA

    private void BtnSetAssault_onClick(int visible) 
    {
    }
}//end resources




