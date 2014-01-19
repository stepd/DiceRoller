package com.tg.diceroller;

import java.util.Random;

import com.tg.diceroller.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	private Random rng;
	private TextView result;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		rng = new Random(System.currentTimeMillis());
		
		result = (TextView) this.findViewById(R.id.textViewResultLabel);
		result.setText("Please roll a die!");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onClickDieButton(View v) {
		DieButton dieButton = (DieButton) v;
		
		result.setText(String.valueOf(dieButton.rollDie(rng)));
	}
}
