package com.sunmi.peripheral.printer;

import android.os.RemoteException;

/**
 * Created by Administrator on 2017/8/9.
 */

public class InnerPrinterException extends RemoteException {
    public InnerPrinterException(String message) {
        super(message);
    }
}
