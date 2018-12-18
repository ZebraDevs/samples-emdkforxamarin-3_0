package mono.com.symbol.emdk.payment;


public class PaymentManager_PaymentConnectionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.symbol.emdk.payment.PaymentManager.PaymentConnectionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConnectionChange:(Lcom/symbol/emdk/payment/DeviceInfo;Lcom/symbol/emdk/payment/PaymentManager$ConnectionState;)V:GetOnConnectionChange_Lcom_symbol_emdk_payment_DeviceInfo_Lcom_symbol_emdk_payment_PaymentManager_ConnectionState_Handler:Symbol.XamarinEMDK.Payment.PaymentManager/IPaymentConnectionListenerInvoker, Symbol.XamarinEMDK\n" +
			"";
		mono.android.Runtime.register ("Symbol.XamarinEMDK.Payment.PaymentManager+IPaymentConnectionListenerImplementor, Symbol.XamarinEMDK, Version=2.0.0.1, Culture=neutral, PublicKeyToken=null", PaymentManager_PaymentConnectionListenerImplementor.class, __md_methods);
	}


	public PaymentManager_PaymentConnectionListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == PaymentManager_PaymentConnectionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Symbol.XamarinEMDK.Payment.PaymentManager+IPaymentConnectionListenerImplementor, Symbol.XamarinEMDK, Version=2.0.0.1, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onConnectionChange (com.symbol.emdk.payment.DeviceInfo p0, com.symbol.emdk.payment.PaymentManager.ConnectionState p1)
	{
		n_onConnectionChange (p0, p1);
	}

	private native void n_onConnectionChange (com.symbol.emdk.payment.DeviceInfo p0, com.symbol.emdk.payment.PaymentManager.ConnectionState p1);

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
