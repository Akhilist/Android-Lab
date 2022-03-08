package com.example.backgroundimage;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	
	RelativeLayout rl;
	ToggleButton b;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rl=(RelativeLayout)findViewById(R.id.relativelayout);
        b=(ToggleButton)findViewById(R.id.toggleButton1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b.isChecked()){
				rl.setBackgroundResource(R.drawable.rb2);
				}else{
					rl.setBackgroundResource(R.drawable.rb1);
				}
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
