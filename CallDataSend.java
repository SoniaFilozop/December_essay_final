package ru.myitschool.vsu2021.filozop_s_a.dec;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public final class CallDataSend extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Пора что-то прочитать!", Toast.LENGTH_LONG).show();
    }
}
