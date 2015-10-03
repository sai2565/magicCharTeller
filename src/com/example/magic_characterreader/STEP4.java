package com.example.magic_characterreader;

import java.util.Random;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class STEP4 extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_step4);
	String s = "Magic Character tells, the character beside your answer is "+STEP3.x;
	TextView tv1 = (TextView) findViewById(R.id.textView2);
	tv1.setText(s);
	String[] s1 = {"you look beautiful","you are genius","you are awsome","Every one like you","you are hard working","you are crazy","I love you","you are going to be, the richest personn in the world","ÿou are heavy","You are going to acquire facebook!"};
	TextView tv2 = (TextView) findViewById(R.id.textView4);
	Random b = new Random();
	String s2 = "Magic Character teller tells, "+s1[b.nextInt(10)] ;
	tv2.setText(s2);
	TextView tv = (TextView) findViewById(R.id.textView3);
	tv.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent i = new Intent(STEP4.this,InstructionsToPlayTheGame.class);
			startActivity(i);
		}
	});
	}
}
