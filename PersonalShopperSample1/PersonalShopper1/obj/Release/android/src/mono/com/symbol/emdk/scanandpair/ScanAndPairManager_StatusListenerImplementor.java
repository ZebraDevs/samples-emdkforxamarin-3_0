package mono.com.symbol.emdk.scanandpair;


public class ScanAndPairManager_StatusListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.symbol.emdk.scanandpair.ScanAndPairManager.StatusListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onStatus:(Lcom/symbol/emdk/scanandpair/StatusData;)V:GetOnStatus_Lcom_symbol_emdk_scanandpair_StatusData_Handler:Symbol.XamarinEMDK.ScanAndPair.ScanAndPairManager/IStatusListenerInvoker, Symbol.XamarinEMDK\n" +
			"";
		mono.android.Runtime.register ("Symbol.XamarinEMDK.ScanAndPair.ScanAndPairManager+IStatusListenerImplementor, Symbol.XamarinEMDK", ScanAndPairManager_StatusListenerImplementor.class, __md_methods);
	}


	public ScanAndPairManager_StatusListenerImplementor ()
	{
		super ();
		if (getClass () == ScanAndPairManager_StatusListenerImplementor.class)
			mono.android.TypeManager.Activate ("Symbol.XamarinEMDK.ScanAndPair.ScanAndPairManager+IStatusListenerImplementor, Symbol.XamarinEMDK", "", this, new java.lang.Object[] {  });
	}


	public void onStatus (com.symbol.emdk.scanandpair.StatusData p0)
	{
		n_onStatus (p0);
	}

	private native void n_onStatus (com.symbol.emdk.scanandpair.StatusData p0);

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
