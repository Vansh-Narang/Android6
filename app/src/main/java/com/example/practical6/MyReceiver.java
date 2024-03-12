package com.example.practical6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Bundle bundle=intent.getExtras();
        Object [] pdus=(Object[]) bundle.get("pdus");
        SmsMessage message=SmsMessage.createFromPdu((byte[]) pdus[0]);
        Toast.makeText(context,message.getMessageBody(),Toast.LENGTH_SHORT).show();
        Toast.makeText(context,message.getDisplayOriginatingAddress(),Toast.LENGTH_SHORT).show();


        throw new UnsupportedOperationException("Not yet implemented");
    }
}