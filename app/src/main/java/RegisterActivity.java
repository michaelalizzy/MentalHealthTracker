package com.example.alidp.wichacks2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = (EditText) findViewById(R.id.name);
        final EditText username = (EditText) findViewById(R.id.userName);
        final EditText password = (EditText) findViewById(R.id.password);
        EditText eName = (EditText) findViewById(R.id.eName);
        EditText enumber = (EditText) findViewById(R.id.eNumber);
        EditText eMessage = (EditText) findViewById(R.id.panicMessage);

        final Button bRegister = (Button) findViewById(R.id.register);
    }
}
