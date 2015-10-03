package com.example.magic_characterreader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class STEP3 extends ActionBarActivity {
static String x;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_step3);
		ArrayList<String> a = new ArrayList<String> ();
		a.add("!");a.add("@");a.add("#");a.add("$");a.add("%");a.add("^");a.add("&");a.add("*");a.add("(");a.add(")");
		a.add("-");a.add("=");a.add("+");a.add("<");a.add(">");a.add("?");a.add(":");a.add("[]");a.add("{}");a.add("/");
		Collections.shuffle(a);
		String[] s1 = new String[20];
		for(int i=0;i<20;i++){
			s1[i] = a.get(i);
		}
	    Random b = new Random();
		x = s1[b.nextInt(20)];
		String[] s = new String[100];
		for(int j=0;j<100;j++){
			if((j+1)%9 == 0){s[j] = (j+1)+"   ---   "+x ;}
			else{s[j] = (j+1)+"   ---   "+s1[b.nextInt(20)] ;}
		}
		Random rnd = new Random();
	    for (int i = s.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      // Simple swap
	      String a1 = s[index];
	      s[index] = s[i];
	      s[i] = a1;
	    }
		ListView lv = (ListView) findViewById(R.id.listView1);
		ArrayAdapter<String> aa = new ArrayAdapter<String> (
				this,
				R.layout.item,
				s);
		lv.setAdapter(aa);
		TextView tv = (TextView) findViewById(R.id.textView1);
		tv.setOnClickListener(new  OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(STEP3.this,STEP4.class);
				startActivity(i);
			}
		});
	}
}