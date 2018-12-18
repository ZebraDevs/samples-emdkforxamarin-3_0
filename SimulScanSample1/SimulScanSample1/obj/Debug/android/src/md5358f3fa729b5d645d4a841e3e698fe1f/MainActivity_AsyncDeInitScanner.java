package md5358f3fa729b5d645d4a841e3e698fe1f;


public class MainActivity_AsyncDeInitScanner
	extends android.os.AsyncTask
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_doInBackground:([Ljava/lang/Object;)Ljava/lang/Object;:GetDoInBackground_arrayLjava_lang_Object_Handler\n" +
			"";
		mono.android.Runtime.register ("Symbol.XamarinEMDK.SimulScanSample1.MainActivity+AsyncDeInitScanner, SimulScanSample1, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MainActivity_AsyncDeInitScanner.class, __md_methods);
	}


	public MainActivity_AsyncDeInitScanner () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MainActivity_AsyncDeInitScanner.class)
			mono.android.TypeManager.Activate ("Symbol.XamarinEMDK.SimulScanSample1.MainActivity+AsyncDeInitScanner, SimulScanSample1, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public java.lang.Object doInBackground (java.lang.Object[] p0)
	{
		return n_doInBackground (p0);
	}

	private native java.lang.Object n_doInBackground (java.lang.Object[] p0);

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
