package com.shadiya.addtwonum;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	
	EditText t1,t2;
	Button b;
	TextView res;
	int num1,num2,sum;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText)findViewById(R.id.editText1);
        t2=(EditText)findViewById(R.id.editText2);
        b=(Button)findViewById(R.id.button1);
        res=(TextView)findViewById(R.id.textView1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
					num1=Integer.parseInt(t1.getText().toString());
					num2=Integer.parseInt(t2.getText().toString());
					sum=num1+num2;
					
					res.setText("Result:" +sum);
				
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
