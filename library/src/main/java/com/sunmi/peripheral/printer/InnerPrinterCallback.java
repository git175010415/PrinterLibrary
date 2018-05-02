package com.sunmi.peripheral.printer;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

/**
 * Created by Administrator on 2017/8/9.
 */

public abstract class InnerPrinterCallback implements ServiceConnection {

    protected abstract void onConnected(SunmiPrinterService service);

    protected abstract void onDisconnected();

    @Override
    public void onServiceConnected(ComponentName name, IBinder service) {
        if(service != null){
            SunmiPrinterService proxy = SunmiPrinterService.Stub.asInterface(service);
            onConnected(proxy);
        }
    }

    @Override
    public void onServiceDisconnected(ComponentName name) {
        onDisconnected();
    }
}
