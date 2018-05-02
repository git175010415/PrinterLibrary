package com.sunmi.peripheral.printer;

import android.content.Context;
import android.content.Intent;


/**
 * Created by Administrator on 2017/7/28.
 */

public class InnerPrinterManager {

    private InnerPrinterManager(){
    }
    private static class SingletonContainer{
        private static InnerPrinterManager instance = new InnerPrinterManager();
    }
    public static InnerPrinterManager getInstance(){
        return SingletonContainer.instance;
    }

    public void bindService(Context mContext, InnerPrinterCallback callback) throws InnerPrinterException {
        if(mContext == null || callback == null){
            throw new InnerPrinterException("parameter must be nonull!");
        }
        Intent intent = new Intent();
        intent.setPackage("woyou.aidlservice.jiuiv5");
        intent.setAction("woyou.aidlservice.jiuiv5.IWoyouService");
        mContext.getApplicationContext().bindService(intent, callback, Context.BIND_AUTO_CREATE);
    }

    public void unBindService(Context mContext, InnerPrinterCallback callback) throws InnerPrinterException {
        if(mContext == null || callback == null){
            throw new InnerPrinterException("parameter must be nonull!");
        }
        mContext.getApplicationContext().unbindService(callback);
    }
}
