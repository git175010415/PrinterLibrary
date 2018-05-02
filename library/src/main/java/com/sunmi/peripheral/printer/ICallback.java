/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\sunmi_print\\SunmiPrinterDemo\\SunmiPrinterDemo\\app\\src\\main\\aidl\\woyou\\aidlservice\\jiuiv5\\ICallback.aidl
 */
package com.sunmi.peripheral.printer;

import android.os.IBinder;

public interface ICallback extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements ICallback {
        private static final String DESCRIPTOR = "woyou.aidlservice.jiuiv5.ICallback";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an woyou.aidlservice.jiuiv5.ICallback interface,
         * generating a proxy if needed.
         */
        public static ICallback asInterface(IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof ICallback))) {
                return ((ICallback) iin);
            }
            return new Proxy(obj);
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            switch (code) {
                case INTERFACE_TRANSACTION: {
                    reply.writeString(DESCRIPTOR);
                    return true;
                }
                case TRANSACTION_onRunResult: {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _arg0;
                    _arg0 = (0 != data.readInt());
                    this.onRunResult(_arg0);
                    return true;
                }
                case TRANSACTION_onReturnString: {
                    data.enforceInterface(DESCRIPTOR);
                    String _arg0;
                    _arg0 = data.readString();
                    this.onReturnString(_arg0);
                    return true;
                }
                case TRANSACTION_onRaiseException: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    String _arg1;
                    _arg1 = data.readString();
                    this.onRaiseException(_arg0, _arg1);
                    return true;
                }
                case TRANSACTION_onPrintResult: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    String _arg1;
                    _arg1 = data.readString();
                    this.onPrintResult(_arg0, _arg1);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements ICallback {
            private IBinder mRemote;

            Proxy(IBinder remote) {
                mRemote = remote;
            }

            @Override
            public IBinder asBinder() {
                return mRemote;
            }

            public String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            /**
             * 返回执行结果
             *
             * @param isSuccess: true执行成功，false 执行失败
             */
            @Override
            public void onRunResult(boolean isSuccess) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(((isSuccess) ? (1) : (0)));
                    mRemote.transact(Stub.TRANSACTION_onRunResult, _data, null, IBinder.FLAG_ONEWAY);
                } finally {
                    _data.recycle();
                }
            }

            @Override
            public void onReturnString(String result) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(result);
                    mRemote.transact(Stub.TRANSACTION_onReturnString, _data, null, IBinder.FLAG_ONEWAY);
                } finally {
                    _data.recycle();
                }
            }

            @Override
            public void onRaiseException(int code, String msg) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(code);
                    _data.writeString(msg);
                    mRemote.transact(Stub.TRANSACTION_onRaiseException, _data, null, IBinder.FLAG_ONEWAY);
                } finally {
                    _data.recycle();
                }
            }

            @Override
            public void onPrintResult(int code, String msg) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(code);
                    _data.writeString(msg);
                    mRemote.transact(Stub.TRANSACTION_onPrintResult, _data, null, IBinder.FLAG_ONEWAY);
                } finally {
                    _data.recycle();
                }
            }
        }

        static final int TRANSACTION_onRunResult = (IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_onReturnString = (IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_onRaiseException = (IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_onPrintResult = (IBinder.FIRST_CALL_TRANSACTION + 3);
    }

    public void onRunResult(boolean isSuccess) throws android.os.RemoteException;

    public void onReturnString(String result) throws android.os.RemoteException;

    public void onRaiseException(int code, String msg) throws android.os.RemoteException;

    public void onPrintResult(int code, String msg) throws android.os.RemoteException;
}
