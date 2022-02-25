package com.shadiya.toast;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

   
    
    protected void onResume(){
    	Toast.makeText(getApplicationContext(),"Helo World ",Toast.LENGTH_LONG).show();
    	super.onResume();
    }
    
}
