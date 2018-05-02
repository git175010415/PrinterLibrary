package com.sunmi.printertest;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.sunmi.peripheral.printer.InnerPrinterCallback;
import com.sunmi.peripheral.printer.InnerPrinterException;
import com.sunmi.peripheral.printer.InnerPrinterManager;
import com.sunmi.peripheral.printer.InnerResultCallbcak;
import com.sunmi.peripheral.printer.SunmiPrinterService;
import com.sunmi.printer.R;

public class MainActivity extends AppCompatActivity {

    SunmiPrinterService mService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initService();
    }



    private void initService() {
        try {
            InnerPrinterManager.getInstance().bindService(this, mInnerPrinterManager);
        } catch (InnerPrinterException e) {
            e.printStackTrace();
        }
    }

    InnerPrinterCallback mInnerPrinterManager = new InnerPrinterCallback() {
        @Override
        protected void onConnected(SunmiPrinterService service) {
            mService = service;
        }

        @Override
        protected void onDisconnected() {

        }
    };

    public void test5(View view) {
        try {
            mService.cutPaper(null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void test2(View view) {
        try {
            mService.printBarCode("12345678", 8, 128, 4, 0, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void test4(View view) {
        try {
            mService.sendRAWData(new byte[]{0x1F, 0x1B, 0x1F, 0x53}, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void test3(View view) {
        try {
            mService.printQRCode("http://www.sunmi.com", 2, 2, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void test1(View view) {
        try {
            mService.printText("商米shangmisunmi\n", new InnerResultCallbcak() {
                @Override
                public void onRunResult(boolean isSuccess) throws RemoteException {

                }

                @Override
                public void onReturnString(String result) throws RemoteException {

                }

                @Override
                public void onRaiseException(int code, String msg) throws RemoteException {

                }

                @Override
                public void onPrintResult(int code, String msg) throws RemoteException {

                }
            });
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
