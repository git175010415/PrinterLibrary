/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\sunmi_print\\SunmiPrinterDemo\\SunmiPrinterDemo\\app\\src\\main\\aidl\\woyou\\aidlservice\\jiuiv5\\ITax.aidl
 */
package com.sunmi.peripheral.printer;
/**
 * 打印服务执行结果的回调
 */
public interface ITax extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements ITax
{
private static final String DESCRIPTOR = "woyou.aidlservice.jiuiv5.ITax";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an woyou.aidlservice.jiuiv5.ITax interface,
 * generating a proxy if needed.
 */
public static ITax asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof ITax))) {
return ((ITax)iin);
}
return new Proxy(obj);
}
@Override
public android.os.IBinder asBinder()
{
return this;
}
@Override
public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onDataResult:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
this.onDataResult(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements ITax
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override
public android.os.IBinder asBinder()
{
return mRemote;
}
public String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override
public void onDataResult(byte[] data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(data);
mRemote.transact(Stub.TRANSACTION_onDataResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onDataResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onDataResult(byte[] data) throws android.os.RemoteException;
}
