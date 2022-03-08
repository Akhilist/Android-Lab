package com.shadiya.checkbox;

import javax.xml.datatype.Duration;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	
	CheckBox cb1,cb2,cb3,cb4;
	Button b;
	TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1=(CheckBox)findViewById(R.id.checkBox1);
        cb2=(CheckBox)findViewById(R.id.checkBox2);
        cb3=(CheckBox)findViewById(R.id.checkBox3);
        cb4=(CheckBox)findViewById(R.id.checkBox4);
        b=(Button)findViewById(R.id.button1);
        t=(TextView)findViewById(R.id.textView2);
      
        
       
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				 StringBuilder msg=new StringBuilder();
				 msg.append("Selected Items:");
				 
				 if(cb1.isChecked()){
					 
					 msg.append("\nApple");
					}
				 if(cb2.isChecked()){
						 msg.append("\nMango");}
				 if(cb3.isChecked()){
							 msg.append("\nOrange");}
				 if(cb4.isChecked()){
								 msg.append("\nGraps");}	
				
				t.setText(msg);
					 
				 }
			
			 
				 
				
		
		});
       
      
        	
        }
    
       
        
        
    }


   

