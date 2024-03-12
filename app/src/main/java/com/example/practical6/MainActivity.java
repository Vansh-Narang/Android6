package com.example.practical6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        t1=findViewById(R.id.editTextTextPersonName);


    }

    public void next(View view) {
        SmsManager mg= SmsManager.getDefault();
         mg.sendTextMessage("+916388680151",null,t1.getText().toString(),null,null);
    }
}