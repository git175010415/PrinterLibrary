package com.sunmi.peripheral.printer;

import android.os.Build;
import android.os.RemoteException;

/**
 * @author kaltin
 */
public interface SunmiPrinterService extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements SunmiPrinterService {
        private static final String DESCRIPTOR = "woyou.aidlservice.jiuiv5.IWoyouService";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an  IWoyouServiceT1 interface,
         * generating a proxy if needed.
         */
        public static SunmiPrinterService asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof SunmiPrinterService))) {
                return ((SunmiPrinterService) iin);
            }
            return new Proxy(obj);
        }

        @Override
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case INTERFACE_TRANSACTION: {
                    reply.writeString(DESCRIPTOR);
                    return true;
                }
                case TRANSACTION_updateFirmware: {
                    data.enforceInterface(DESCRIPTOR);
                    this.updateFirmware();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getFirmwareStatus: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getFirmwareStatus();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_getServiceVersion: {
                    data.enforceInterface(DESCRIPTOR);
                    String _result = this.getServiceVersion();
                    reply.writeNoException();
                    reply.writeString(_result);
                    return true;
                }
                case TRANSACTION_printerInit: {
                    data.enforceInterface(DESCRIPTOR);
                    ICallback _arg0;
                    _arg0 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printerInit(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_printerSelfChecking: {
                    data.enforceInterface(DESCRIPTOR);
                    ICallback _arg0;
                    _arg0 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printerSelfChecking(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getPrinterSerialNo: {
                    data.enforceInterface(DESCRIPTOR);
                    String _result = this.getPrinterSerialNo();
                    reply.writeNoException();
                    reply.writeString(_result);
                    return true;
                }
                case TRANSACTION_getPrinterVersion: {
                    data.enforceInterface(DESCRIPTOR);
                    String _result = this.getPrinterVersion();
                    reply.writeNoException();
                    reply.writeString(_result);
                    return true;
                }
                case TRANSACTION_getPrinterModal: {
                    data.enforceInterface(DESCRIPTOR);
                    String _result = this.getPrinterModal();
                    reply.writeNoException();
                    reply.writeString(_result);
                    return true;
                }
                case TRANSACTION_getPrintedLength: {
                    data.enforceInterface(DESCRIPTOR);
                    ICallback _arg0;
                    _arg0 = ICallback.Stub.asInterface(data.readStrongBinder());
                    int _result = this.getPrintedLength(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_lineWrap: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    ICallback _arg1;
                    _arg1 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.lineWrap(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_sendRAWData: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    ICallback _arg1;
                    _arg1 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.sendRAWData(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_setAlignment: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    ICallback _arg1;
                    _arg1 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.setAlignment(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_setFontName: {
                    data.enforceInterface(DESCRIPTOR);
                    String _arg0;
                    _arg0 = data.readString();
                    ICallback _arg1;
                    _arg1 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.setFontName(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_setFontSize: {
                    data.enforceInterface(DESCRIPTOR);
                    float _arg0;
                    _arg0 = data.readFloat();
                    ICallback _arg1;
                    _arg1 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.setFontSize(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_printText: {
                    data.enforceInterface(DESCRIPTOR);
                    String _arg0;
                    _arg0 = data.readString();
                    ICallback _arg1;
                    _arg1 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printText(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_printTextWithFont: {
                    data.enforceInterface(DESCRIPTOR);
                    String _arg0;
                    _arg0 = data.readString();
                    String _arg1;
                    _arg1 = data.readString();
                    float _arg2;
                    _arg2 = data.readFloat();
                    ICallback _arg3;
                    _arg3 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printTextWithFont(_arg0, _arg1, _arg2, _arg3);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_printColumnsText: {
                    data.enforceInterface(DESCRIPTOR);
                    String[] _arg0;
                    _arg0 = data.createStringArray();
                    int[] _arg1;
                    _arg1 = data.createIntArray();
                    int[] _arg2;
                    _arg2 = data.createIntArray();
                    ICallback _arg3;
                    _arg3 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printColumnsText(_arg0, _arg1, _arg2, _arg3);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_printBitmap: {
                    data.enforceInterface(DESCRIPTOR);
                    android.graphics.Bitmap _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    ICallback _arg1;
                    _arg1 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printBitmap(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_printBarCode: {
                    data.enforceInterface(DESCRIPTOR);
                    String _arg0;
                    _arg0 = data.readString();
                    int _arg1;
                    _arg1 = data.readInt();
                    int _arg2;
                    _arg2 = data.readInt();
                    int _arg3;
                    _arg3 = data.readInt();
                    int _arg4;
                    _arg4 = data.readInt();
                    ICallback _arg5;
                    _arg5 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printBarCode(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_printQRCode: {
                    data.enforceInterface(DESCRIPTOR);
                    String _arg0;
                    _arg0 = data.readString();
                    int _arg1;
                    _arg1 = data.readInt();
                    int _arg2;
                    _arg2 = data.readInt();
                    ICallback _arg3;
                    _arg3 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printQRCode(_arg0, _arg1, _arg2, _arg3);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_printOriginalText: {
                    data.enforceInterface(DESCRIPTOR);
                    String _arg0;
                    _arg0 = data.readString();
                    ICallback _arg1;
                    _arg1 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printOriginalText(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_commitPrint: {
                    data.enforceInterface(DESCRIPTOR);
                    TransBean[] _arg0;
                    _arg0 = data.createTypedArray(TransBean.CREATOR);
                    ICallback _arg1;
                    _arg1 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.commitPrint(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_commitPrinterBuffer: {
                    data.enforceInterface(DESCRIPTOR);
                    this.commitPrinterBuffer();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_cutPaper: {
                    data.enforceInterface(DESCRIPTOR);
                    ICallback _arg0;
                    _arg0 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.cutPaper(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getCutPaperTimes: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getCutPaperTimes();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_openDrawer: {
                    data.enforceInterface(DESCRIPTOR);
                    ICallback _arg0;
                    _arg0 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.openDrawer(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getOpenDrawerTimes: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getOpenDrawerTimes();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_enterPrinterBuffer: {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _arg0;
                    _arg0 = (0 != data.readInt());
                    this.enterPrinterBuffer(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_exitPrinterBuffer: {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _arg0;
                    _arg0 = (0 != data.readInt());
                    this.exitPrinterBuffer(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_tax: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    ITax _arg1;
                    _arg1 = ITax.Stub.asInterface(data.readStrongBinder());
                    this.tax(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getPrinterFactory: {
                    data.enforceInterface(DESCRIPTOR);
                    ICallback _arg0;
                    _arg0 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.getPrinterFactory(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_clearBuffer: {
                    data.enforceInterface(DESCRIPTOR);
                    this.clearBuffer();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_commitPrinterBufferWithCallback: {
                    data.enforceInterface(DESCRIPTOR);
                    ICallback _arg0;
                    _arg0 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.commitPrinterBufferWithCallback(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_exitPrinterBufferWithCallback: {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _arg0;
                    _arg0 = (0 != data.readInt());
                    ICallback _arg1;
                    _arg1 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.exitPrinterBufferWithCallback(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_printColumnsString: {
                    data.enforceInterface(DESCRIPTOR);
                    String[] _arg0;
                    _arg0 = data.createStringArray();
                    int[] _arg1;
                    _arg1 = data.createIntArray();
                    int[] _arg2;
                    _arg2 = data.createIntArray();
                    ICallback _arg3;
                    _arg3 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printColumnsString(_arg0, _arg1, _arg2, _arg3);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_updatePrinterState: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.updatePrinterState();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_sendLCDCommand: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    this.sendLCDCommand(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_sendLCDString: {
                    data.enforceInterface(DESCRIPTOR);
                    String _arg0;
                    _arg0 = data.readString();
                    ILcdCallback _arg1;
                    _arg1 = ILcdCallback.Stub.asInterface(data.readStrongBinder());
                    this.sendLCDString(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_sendLCDBitmap: {
                    data.enforceInterface(DESCRIPTOR);
                    android.graphics.Bitmap _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    ILcdCallback _arg1;
                    _arg1 = ILcdCallback.Stub.asInterface(data.readStrongBinder());
                    this.sendLCDBitmap(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getPrinterMode:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getPrinterMode();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_getPrinterBBMDistance:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getPrinterBBMDistance();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_printBitmapCustom:
                {
                    data.enforceInterface(DESCRIPTOR);
                    android.graphics.Bitmap _arg0;
                    if ((0!=data.readInt())) {
                        _arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
                    }
                    else {
                        _arg0 = null;
                    }
                    int _arg1;
                    _arg1 = data.readInt();
                    ICallback _arg2;
                    _arg2 = ICallback.Stub.asInterface(data.readStrongBinder());
                    this.printBitmapCustom(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getForcedDouble:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getForcedDouble();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_isForcedAntiWhite:
                {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _result = this.isForcedAntiWhite();
                    reply.writeNoException();
                    reply.writeInt(((_result)?(1):(0)));
                    return true;
                }
                case TRANSACTION_isForcedBold:
                {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _result = this.isForcedBold();
                    reply.writeNoException();
                    reply.writeInt(((_result)?(1):(0)));
                    return true;
                }
                case TRANSACTION_isForcedUnderline:
                {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _result = this.isForcedUnderline();
                    reply.writeNoException();
                    reply.writeInt(((_result)?(1):(0)));
                    return true;
                }
                case TRANSACTION_getForcedRowHeight:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getForcedRowHeight();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_getFontName:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getFontName();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_sendLCDDoubleString:
                {
                    data.enforceInterface(DESCRIPTOR);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    java.lang.String _arg1;
                    _arg1 = data.readString();
                    ILcdCallback _arg2;
                    _arg2 = ILcdCallback.Stub.asInterface(data.readStrongBinder());
                    this.sendLCDDoubleString(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getPrinterPaper:
                {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getPrinterPaper();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        public static class Proxy implements SunmiPrinterService {
            private android.os.IBinder mRemote;
            private int[] transaction_table;

            Proxy(android.os.IBinder remote) {
                mRemote = remote;
                setTable();
            }

            private void setTable() {
                if(Build.MODEL.contains("P1") || Build.MODEL.contains("p1")
                        || Build.MODEL.contains("V1s") || Build.MODEL.contains("v1s") ){
                    transaction_table = Stub.TRANSCTION_DATASHEET[0];
                }else if(Build.MODEL.contains("mini")){
                    transaction_table = Stub.TRANSCTION_DATASHEET[1];
                }else if(Build.MODEL.contains("V1") || Build.MODEL.contains("v1")){
                    transaction_table = Stub.TRANSCTION_DATASHEET[2];
                }else if(Build.MODEL.contains("T1") || Build.MODEL.contains("t1")
                        || Build.MODEL.contains("T2") || Build.MODEL.contains("t2")
                        || Build.MODEL.contains("S2") || Build.MODEL.contains("s2")){
                    transaction_table = Stub.TRANSCTION_DATASHEET[3];
                }else{
                    transaction_table = Stub.TRANSCTION_DATASHEET[4];
                }
            }

            @Override
            public android.os.IBinder asBinder() {
                return mRemote;
            }

            public String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            /**
             * 打印机固件升级(只供系统组件调用,开发者调用无效)
             */
            @Override
            public void updateFirmware() throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_updateFirmware, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public int getFirmwareStatus() throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getFirmwareStatus, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            /**
             * 取WoyouService服务版本
             */
            @Override
            public String getServiceVersion() throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getServiceVersion, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public void printerInit(ICallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_printerInit, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            /**
             * 打印机自检，打印机会打印自检页
             *
             * @param callback 回调
             */
            @Override
            public void printerSelfChecking(ICallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _reply.readException();
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_printerSelfChecking, _data, _reply, 0);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            /**
             * 获取打印机板序列号
             */
            @Override
            public String getPrinterSerialNo() throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getPrinterSerialNo, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            /**
             * 获取打印机固件版本号
             */
            @Override
            public String getPrinterVersion() throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getPrinterVersion, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            /**
             * 获取打印机型号
             */
            @Override
            public String getPrinterModal() throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getPrinterModal, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            /**
             * 获取打印头打印长度
             */
            @Override
            public int getPrintedLength(ICallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();

                if (Build.MODEL.contains("T1") || Build.MODEL.contains("t1")) {
                    int _result;
                    try {
                        _data.writeInterfaceToken(DESCRIPTOR);
                        mRemote.transact(Stub.TRANSACTION_getPrintedLength, _data, _reply, 0);
                        _reply.readException();
                        _result = _reply.readInt();
                    } finally {
                        _reply.recycle();
                        _data.recycle();
                    }
                    return _result;
                } else {
                    try {
                        _data.writeInterfaceToken(DESCRIPTOR);
                        _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                        mRemote.transact(Stub.TRANSACTION_getPrintedLength, _data, _reply, 0);
                        _reply.readException();
                    } finally {
                        _reply.recycle();
                        _data.recycle();
                    }
                    return 0;
                }
            }

            @Override
            public void lineWrap(int n, ICallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(n);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_lineWrap, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            /**
             * 使用原始指令打印
             *
             * @param data     指令
             * @param callback 结果回调
             */
            @Override
            public void sendRAWData(byte[] data, ICallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(data);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_sendRAWData, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void setAlignment(int alignment, ICallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(alignment);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_setAlignment, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            /**
             * 设置打印字体, 对之后打印有影响，除非初始化
             * (目前只支持一种字体"gh"，gh是一种等宽中文字体，之后会提供更多字体选择)
             *
             * @param typeface: 字体名称
             */
            @Override
            public void setFontName(String typeface, ICallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(typeface);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_setFontName, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            /**
             * 设置字体大小, 对之后打印有影响，除非初始化
             * 注意：字体大小是超出标准国际指令的打印方式，
             * 调整字体大小会影响字符宽度，每行字符数量也会随之改变，
             * 因此按等宽字体形成的排版可能会错乱
             *
             * @param fontsize: 字体大小
             */
            @Override
            public void setFontSize(float fontsize, ICallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeFloat(fontsize);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_setFontSize, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            /**
             * 打印文字，文字宽度满一行自动换行排版，不满一整行不打印除非强制换行
             *
             * @param text: 要打印的文字字符串
             */
            @Override
            public void printText(String text, ICallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(text);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_printText, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            /**
             * 打印指定字体的文本，字体设置只对本次有效
             *
             * @param text:     要打印文字
             * @param typeface: 字体名称（目前只支持"gh"字体）
             * @param fontsize: 字体大小
             */
            @Override
            public void printTextWithFont(String text, String typeface, float fontsize, ICallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(text);
                    _data.writeString(typeface);
                    _data.writeFloat(fontsize);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_printTextWithFont, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            /**
             * 打印表格的一行，可以指定列宽、对齐方式
             *
             * @param colsTextArr  各列文本字符串数组
             * @param colsWidthArr 各列宽度数组(以英文字符计算, 每个中文字符占两个英文字符, 每个宽度大于0)
             * @param colsAlign    各列对齐方式(0居左, 1居中, 2居右)
             *                     备注: 三个参数的数组长度应该一致, 如果colsText[i]的宽度大于colsWidth[i], 则文本换行
             */
            @Override
            public void printColumnsText(String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, ICallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStringArray(colsTextArr);
                    _data.writeIntArray(colsWidthArr);
                    _data.writeIntArray(colsAlign);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_printColumnsText, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            /**
             * 打印图片
             *
             * @param bitmap: 图片bitmap对象(最大宽度384像素，超过无法打印并且回调callback异常函数)
             */
            @Override
            public void printBitmap(android.graphics.Bitmap bitmap, ICallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((bitmap != null)) {
                        _data.writeInt(1);
                        bitmap.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_printBitmap, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            /**
             * 打印一维条码
             *
             * @param data:         条码数据
             * @param symbology:    条码类型
             *                      0 -- UPC-A，
             *                      1 -- UPC-E，
             *                      2 -- JAN13(EAN13)，
             *                      3 -- JAN8(EAN8)，
             *                      4 -- CODE39，
             *                      5 -- ITF，
             *                      6 -- CODABAR，
             *                      7 -- CODE93，
             *                      8 -- CODE128
             * @param height:       条码高度, 取值1到255, 默认162
             * @param width:        条码宽度, 取值2至6, 默认2
             * @param textposition: 文字位置 0--不打印文字, 1--文字在条码上方, 2--文字在条码下方, 3--条码上下方均打印
             */
            @Override
            public void printBarCode(String data, int symbology, int height, int width, int textposition, ICallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(data);
                    _data.writeInt(symbology);
                    _data.writeInt(height);
                    _data.writeInt(width);
                    _data.writeInt(textposition);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_printBarCode, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            /**
             * 打印二维条码
             *
             * @param data:       二维码数据
             * @param modulesize: 二维码块大小(单位:点, 取值 1 至 16 )
             * @param errorlevel: 二维码纠错等级(0 至 3)，
             *                    0 -- 纠错级别L ( 7%)，
             *                    1 -- 纠错级别M (15%)，
             *                    2 -- 纠错级别Q (25%)，
             *                    3 -- 纠错级别H (30%)
             */
            @Override
            public void printQRCode(String data, int modulesize, int errorlevel, ICallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(data);
                    _data.writeInt(modulesize);
                    _data.writeInt(errorlevel);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_printQRCode, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            /**
             * 打印文字，文字宽度满一行自动换行排版，不满一整行不打印除非强制换行
             * 文字按矢量文字宽度原样输出，即每个字符不等宽
             *
             * @param text: 要打印的文字字符串
             *              Ver 1.7.6中增加
             */
            @Override
            public void printOriginalText(String text, ICallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(text);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_printOriginalText, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void commitPrint(TransBean[] transbean, ICallback callback) throws RemoteException {
                if(transaction_table[19] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeTypedArray(transbean, 0);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_commitPrint, _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            /**
             * 打印缓冲区内容
             */
            @Override
            public void commitPrinterBuffer() throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_commitPrinterBuffer + transaction_table[0], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            /**
             * 切纸
             */
            @Override
            public void cutPaper(ICallback callback) throws RemoteException {
                if(transaction_table[10] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_cutPaper + transaction_table[10], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public int getCutPaperTimes() throws RemoteException {
                if(transaction_table[11] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_getCutPaperTimes + transaction_table[11], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            /**
             * 打开钱柜
             */
            @Override
            public void openDrawer(ICallback callback) throws RemoteException {
                if(transaction_table[12] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_openDrawer + transaction_table[12], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public int getOpenDrawerTimes() throws RemoteException {
                if(transaction_table[13] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_getOpenDrawerTimes + transaction_table[13], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            /**
             * 进入缓冲模式，所有打印调用将缓存，调用commitPrinterBuffe()后打印
             *
             * @param clean: 是否清除缓冲区内容
             */
            @Override
            public void enterPrinterBuffer(boolean clean) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(((clean) ? (1) : (0)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_enterPrinterBuffer + transaction_table[1], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            /**
             * 退出缓冲模式
             *
             * @param commit: 是否打印出缓冲区内容
             */
            @Override
            public void exitPrinterBuffer(boolean commit) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(((commit) ? (1) : (0)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_exitPrinterBuffer + transaction_table[2], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void tax(byte[] data, ITax callback) throws RemoteException {
                if(transaction_table[3] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(data);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_tax + transaction_table[3], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void getPrinterFactory(ICallback callback) throws RemoteException {
                if(transaction_table[4] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_getPrinterFactory + transaction_table[4], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void clearBuffer() throws RemoteException {
                if(transaction_table[5] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_clearBuffer + transaction_table[5], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void commitPrinterBufferWithCallback(ICallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_commitPrinterBufferWithCallback + transaction_table[6], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void exitPrinterBufferWithCallback(boolean commit, ICallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(((commit) ? (1) : (0)));
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_exitPrinterBufferWithCallback + transaction_table[7], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void printColumnsString(String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, ICallback callback) throws RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStringArray(colsTextArr);
                    _data.writeIntArray(colsWidthArr);
                    _data.writeIntArray(colsAlign);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_printColumnsString + transaction_table[8], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public int updatePrinterState() throws RemoteException {
                if(transaction_table[9] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("the interface is null!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_updatePrinterState + transaction_table[9], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            /*
            * @param flag 1 初始化 2 唤醒LCD 3休眠LCD 4清屏
            */
            @Override
            public void sendLCDCommand(int flag) throws RemoteException {
                if(transaction_table[14] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(flag);
                    boolean res = mRemote.transact(Stub.TRANSACTION_sendLCDCommand +transaction_table[14], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }


            @Override
            public void sendLCDString(String string, ILcdCallback callback) throws RemoteException {
                if(transaction_table[15] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(string);
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_sendLCDString + transaction_table[15], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void sendLCDBitmap(android.graphics.Bitmap bitmap, ILcdCallback callback) throws RemoteException {
                if(transaction_table[16] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((bitmap != null)) {
                        _data.writeInt(1);
                        bitmap.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    _data.writeStrongBinder((((callback != null)) ? (callback.asBinder()) : (null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_sendLCDBitmap + transaction_table[16], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override public int getPrinterMode() throws RemoteException
            {
                if(transaction_table[17] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_getPrinterMode + transaction_table[17], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override public int getPrinterBBMDistance() throws RemoteException
            {
                if(transaction_table[18] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_getPrinterBBMDistance + transaction_table[18], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override public void printBitmapCustom(android.graphics.Bitmap bitmap, int type, ICallback callback) throws android.os.RemoteException
            {
                if(transaction_table[20] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((bitmap!=null)) {
                        _data.writeInt(1);
                        bitmap.writeToParcel(_data, 0);
                    }
                    else {
                        _data.writeInt(0);
                    }
                    _data.writeInt(type);
                    _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_printBitmapCustom + transaction_table[20], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public int getForcedDouble() throws android.os.RemoteException
            {
                if(transaction_table[21] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_getForcedDouble + transaction_table[21], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public boolean isForcedAntiWhite() throws android.os.RemoteException
            {
                if(transaction_table[22] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_isForcedAntiWhite + transaction_table[22], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public boolean isForcedBold() throws android.os.RemoteException
            {
                if(transaction_table[23] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_isForcedBold + transaction_table[23], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            /**
             * 是否强制启用下划线样式
             * @return true:启用 false：未启用
             */
            @Override public boolean isForcedUnderline() throws android.os.RemoteException
            {
                if(transaction_table[24] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_isForcedUnderline + transaction_table[24], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                    _result = (0!=_reply.readInt());
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public int getForcedRowHeight() throws android.os.RemoteException
            {
                if(transaction_table[25] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_getForcedRowHeight + transaction_table[25], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public int getFontName() throws android.os.RemoteException
            {
                if(transaction_table[26] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_getFontName + transaction_table[26], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
            @Override public void sendLCDDoubleString(java.lang.String topText, java.lang.String bottomText, ILcdCallback callback) throws android.os.RemoteException
            {
                if(transaction_table[27] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(topText);
                    _data.writeString(bottomText);
                    _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
                    boolean res = mRemote.transact(Stub.TRANSACTION_sendLCDDoubleString + transaction_table[27], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            @Override public int getPrinterPaper() throws android.os.RemoteException
            {
                if(transaction_table[28] == Stub.TRANSACTION_STOP){
                    throw new InnerPrinterException("it does not support this method!");
                }
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean res = mRemote.transact(Stub.TRANSACTION_getPrinterPaper + transaction_table[28], _data, _reply, 0);
                    if(!res){
                        throw new InnerPrinterException("the version is not support this method!");
                    }
                    _reply.readException();
                    _result = _reply.readInt();
                }
                finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
        }

        //int[] transaction_table is offset
        //0: TRANSACTION_commitPrinterBuffer
        //1: TRANSACTION_enterPrinterBuffer
        //2: TRANSACTION_exitPrinterBuffer
        //3: TRANSACTION_tax
        //4: TRANSACTION_getPrinterFactory
        //5: TRANSACTION_clearBuffer
        //6: TRANSACTION_commitPrinterBufferWithCallback
        //7: TRANSACTION_exitPrinterBufferWithCallback
        //8: TRANSACTION_printColumnsString
        //9: TRANSACTION_updatePrinterState
        //10:TRANSACTION_cutPaper
        //11:TRANSACTION_getCutPaperTimes
        //12:TRANSACTION_openDrawer
        //13:TRANSACTION_getOpenDrawerTimes
        //14:TRANSACTION_sendLCDCommand
        //15:TRANSACTION_sendLCDString
        //16:TRANSACTION_sendLCDBitmap
        //17:TRANSACTION_getPrinterMode
        //18:TRANSACTION_getPrinterBBMDistance
        //19:TRANSACTION_commitPrint
        //20:TRANSACTION_printBitmapCustom
        //21:TRANSACTION_getForcedDouble
        //22:TRANSACTION_isForcedAntiWhite
        //23:TRANSACTION_isForcedBold
        //24:TRANSACTION_isForcedUnderline
        //25:TRANSACTION_getForcedRowHeight
        //26:TRANSACTION_getFontName
        //27:TRANSACTION_sendLCDDoubleString
        //28:TRANSACTION_getPrinterPaper
        static final int[][] TRANSCTION_DATASHEET = new int[][]{
                //P1、P14g、V1s
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                 Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, 0,
                -9, -9, -9, -9, -9, -9, -9, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP},
                //T1mini、T2mini
                {-1, 3, 3, 3, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, 8, 8, 1, 1,
                 -10, -10, -10, -10, -3, -3, -3, -10, -10, Stub.TRANSACTION_STOP,
                -2, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, -10, Stub.TRANSACTION_STOP},
                //V1
                {0, 0, 0, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, 0, 0, -5, Stub.TRANSACTION_STOP,
                 Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, 0,
                -15, -15, -15, -15, -15, -15, -15, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP},
                //T1、T2、S2
                {-1, 3, 3, 3, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, 5, 5, 1, 1,
                -10, -10, -10, -10, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, -10, -10, Stub.TRANSACTION_STOP,
                -6, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, -13},
                //others
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP, 0,
                -9, -9, -9, -9, -9, -9, -9, Stub.TRANSACTION_STOP, Stub.TRANSACTION_STOP},
        };

        static final int TRANSACTION_STOP = 9527;
        //所有机器均匹配
        static final int TRANSACTION_updateFirmware = (android.os.IBinder.FIRST_CALL_TRANSACTION);
        static final int TRANSACTION_getFirmwareStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_getServiceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_printerInit = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
        static final int TRANSACTION_printerSelfChecking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
        static final int TRANSACTION_getPrinterSerialNo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
        static final int TRANSACTION_getPrinterVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
        static final int TRANSACTION_getPrinterModal = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
        static final int TRANSACTION_getPrintedLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
        static final int TRANSACTION_lineWrap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
        static final int TRANSACTION_sendRAWData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
        static final int TRANSACTION_setAlignment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
        static final int TRANSACTION_setFontName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
        static final int TRANSACTION_setFontSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
        static final int TRANSACTION_printText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
        static final int TRANSACTION_printTextWithFont = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
        static final int TRANSACTION_printColumnsText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
        static final int TRANSACTION_printBitmap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
        static final int TRANSACTION_printBarCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
        static final int TRANSACTION_printQRCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
        static final int TRANSACTION_printOriginalText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
        //不同机型可能不存在以下接口
        static final int TRANSACTION_commitPrint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
        static final int TRANSACTION_commitPrinterBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
        static final int TRANSACTION_enterPrinterBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
        static final int TRANSACTION_exitPrinterBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
        static final int TRANSACTION_tax = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
        static final int TRANSACTION_getPrinterFactory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
        static final int TRANSACTION_clearBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
        static final int TRANSACTION_commitPrinterBufferWithCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
        static final int TRANSACTION_exitPrinterBufferWithCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
        static final int TRANSACTION_printColumnsString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
        static final int TRANSACTION_updatePrinterState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
        static final int TRANSACTION_cutPaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
        static final int TRANSACTION_getCutPaperTimes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
        static final int TRANSACTION_openDrawer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
        static final int TRANSACTION_getOpenDrawerTimes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
        static final int TRANSACTION_sendLCDCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
        static final int TRANSACTION_sendLCDString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
        static final int TRANSACTION_sendLCDBitmap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
        //除T1 T1mini外均无此接口
        static final int TRANSACTION_getPrinterMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
        static final int TRANSACTION_getPrinterBBMDistance = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
        static final int TRANSACTION_printBitmapCustom = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
        static final int TRANSACTION_getForcedDouble = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
        static final int TRANSACTION_isForcedAntiWhite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
        static final int TRANSACTION_isForcedBold = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
        static final int TRANSACTION_isForcedUnderline = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
        static final int TRANSACTION_getForcedRowHeight = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
        static final int TRANSACTION_getFontName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
        static final int TRANSACTION_sendLCDDoubleString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
        static final int TRANSACTION_getPrinterPaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
    }

    public void updateFirmware() throws RemoteException;

    public int getFirmwareStatus() throws RemoteException;

    public String getServiceVersion() throws RemoteException;

    public void printerInit(ICallback callback) throws RemoteException;

    public void printerSelfChecking(ICallback callback) throws RemoteException;

    public String getPrinterSerialNo() throws RemoteException;

    public String getPrinterVersion() throws RemoteException;

    public String getPrinterModal() throws RemoteException;

    public int getPrintedLength(ICallback callback) throws RemoteException;

    public void lineWrap(int n, ICallback callback) throws RemoteException;

    /**
     * 使用原始指令打印
     *
     * @param data     指令
     * @param callback 结果回调
     */
    public void sendRAWData(byte[] data, ICallback callback) throws RemoteException;

    public void setAlignment(int alignment, ICallback callback) throws RemoteException;

    public void setFontName(String typeface, ICallback callback) throws RemoteException;

    public void setFontSize(float fontsize, ICallback callback) throws RemoteException;

    public void printText(String text, ICallback callback) throws RemoteException;

    public void printTextWithFont(String text, String typeface, float fontsize, ICallback callback) throws RemoteException;

    public void printColumnsText(String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, ICallback callback) throws RemoteException;

    public void printBitmap(android.graphics.Bitmap bitmap, ICallback callback) throws RemoteException;

    public void printBarCode(String data, int symbology, int height, int width, int textposition, ICallback callback) throws RemoteException;

    public void printQRCode(String data, int modulesize, int errorlevel, ICallback callback) throws RemoteException;

    public void printOriginalText(String text, ICallback callback) throws RemoteException;

    public void commitPrint(TransBean[] transbean, ICallback callback) throws RemoteException;

    public void commitPrinterBuffer() throws RemoteException;

    public void cutPaper(ICallback callback) throws RemoteException;

    public int getCutPaperTimes() throws RemoteException;

    public void openDrawer(ICallback callback) throws RemoteException;

    public int getOpenDrawerTimes() throws RemoteException;

    public void enterPrinterBuffer(boolean clean) throws RemoteException;

    public void exitPrinterBuffer(boolean commit) throws RemoteException;

    public void tax(byte[] data, ITax callback) throws RemoteException;

    public void getPrinterFactory(ICallback callback) throws RemoteException;

    public void clearBuffer() throws RemoteException;

    public void commitPrinterBufferWithCallback(ICallback callback) throws RemoteException;

    public void exitPrinterBufferWithCallback(boolean commit, ICallback callback) throws RemoteException;

    public void printColumnsString(String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, ICallback callback) throws RemoteException;

    public int updatePrinterState() throws RemoteException;

    public void sendLCDCommand(int flag) throws RemoteException;

    public void sendLCDString(String string, ILcdCallback callback) throws RemoteException;

    public void sendLCDBitmap(android.graphics.Bitmap bitmap, ILcdCallback callback) throws RemoteException;

    public int getPrinterMode() throws RemoteException;

    public int getPrinterBBMDistance() throws RemoteException;

    public void printBitmapCustom(android.graphics.Bitmap bitmap, int type, ICallback callback) throws android.os.RemoteException;

    public int getForcedDouble() throws android.os.RemoteException;

    public boolean isForcedAntiWhite() throws android.os.RemoteException;

    public boolean isForcedBold() throws android.os.RemoteException;

    public boolean isForcedUnderline() throws android.os.RemoteException;

    public int getForcedRowHeight() throws android.os.RemoteException;

    public int getFontName() throws android.os.RemoteException;

    public void sendLCDDoubleString(java.lang.String topText, java.lang.String bottomText, ILcdCallback callback) throws android.os.RemoteException;

    public int getPrinterPaper() throws android.os.RemoteException;
}
