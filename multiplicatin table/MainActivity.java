package com.example.multipicationtable;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {
	EditText l;
	Button b;
	TextView t;
	int num;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=(EditText)findViewById(R.id.editText1);
        b=(Button)findViewById(R.id.button1);
        t=(TextView)findViewById(R.id.textView2);
        b.setOnClickListener(new OnClickListener() {
        	
        	String msg=" ";
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				num=Integer.parseInt(l.getText().toString());
				for(int i=1;i<11;i++){
					int res=i*num;
					String mul=i+"x"+num+"="+res+"\n";
					msg=msg+mul;
					
					
				}
				t.setText(msg);
				msg="";
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
