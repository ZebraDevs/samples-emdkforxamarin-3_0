package mono.com.symbol.emdk.payment;


public class PaymentDevice_DataListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.symbol.emdk.payment.PaymentDevice.DataListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onData:(Lcom/symbol/emdk/payment/PaymentData;)V:GetOnData_Lcom_symbol_emdk_payment_PaymentData_Handler:Symbol.XamarinEMDK.Payment.PaymentDevice/IDataListenerInvoker, Symbol.XamarinEMDK\n" +
			"";
		mono.android.Runtime.register ("Symbol.XamarinEMDK.Payment.PaymentDevice+IDataListenerImplementor, Symbol.XamarinEMDK, Version=2.0.0.1, Culture=neutral, PublicKeyToken=null", PaymentDevice_DataListenerImplementor.class, __md_methods);
	}


	public PaymentDevice_DataListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == PaymentDevice_DataListenerImplementor.class)
			mono.android.TypeManager.Activate ("Symbol.XamarinEMDK.Payment.PaymentDevice+IDataListenerImplementor, Symbol.XamarinEMDK, Version=2.0.0.1, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onData (com.symbol.emdk.payment.PaymentData p0)
	{
		n_onData (p0);
	}

	private native void n_onData (com.symbol.emdk.payment.PaymentData p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
