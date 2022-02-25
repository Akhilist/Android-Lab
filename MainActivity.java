package com.example.radiobutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	RadioButton male,female;
	RadioGroup rg;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		male=(RadioButton)findViewById(R.id.radioButton1);
		female=(RadioButton)findViewById(R.id.radioButton2);
		rg=(RadioGroup)findViewById(R.id.radiogroup1);
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int chekedId) {
				// TODO Auto-generated method stub
				if(male.isChecked()){
					Toast.makeText(getApplicationContext(),"You select MALE...!",Toast.LENGTH_LONG).show();
					
				}
				if(female.isChecked()){
					Toast.makeText(getApplicationContext(),"You select FEMALE...! ",Toast.LENGTH_LONG).show();
				}
			}
		});
	}

}
