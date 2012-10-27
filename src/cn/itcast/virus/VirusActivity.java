package cn.itcast.virus;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Bundle;
import android.widget.TextView;

public class VirusActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Œ“ «≤°∂æ");
        setContentView(tv);
        
        try {
        	 PackageInfo info =getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_SIGNATURES);
        	 Signature[] s = info.signatures;
        	 StringBuffer sb = new StringBuffer();
        	 for(int i =0;i<s.length;i++){
        		  sb.append(s[i]);
        	 }
        	 System.out.println(MD5Encoder.encode(sb.toString()) )	  ;
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}