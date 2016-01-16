package com.example.teamj_majorproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Tutorial_p6 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tutorial_p6);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tutorial_p6, menu);
		return true;
	}
	
	public void showTutorial5(View view) {
		Intent tutorial5_intent = new Intent(this, Tutorial_p5.class);		
    	startActivity(tutorial5_intent);
	}

	public void showQuestionnaire(View view) {
		Intent questionnaire_intent = new Intent(this, Questionnaire.class);		
    	startActivity(questionnaire_intent);
	}
	
}
