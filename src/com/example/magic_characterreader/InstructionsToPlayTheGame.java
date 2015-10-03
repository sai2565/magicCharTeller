package com.example.magic_characterreader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class InstructionsToPlayTheGame extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions_to_play_the_game);
    TextView tv = (TextView) findViewById(R.id.textView6);
    tv.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent i = new Intent(InstructionsToPlayTheGame.this,STEP1.class);
			startActivity(i);
		}
	});
    }
}
