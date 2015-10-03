package com.example.magic_characterreader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class STEP2 extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_step2);
		TextView tv = (TextView) findViewById(R.id.textView3);
		tv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(STEP2.this,STEP3.class);
				startActivity(i);
			}
		});
	}
}
