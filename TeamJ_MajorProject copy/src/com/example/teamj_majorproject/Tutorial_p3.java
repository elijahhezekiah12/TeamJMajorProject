package com.example.teamj_majorproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Tutorial_p3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tutorial_p3);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tutorial_p3, menu);
		return true;
	}

	public void showTutorial2(View view) {
		Intent tutorial2_intent = new Intent(this, Tutorial_p2.class);		
    	startActivity(tutorial2_intent);
	}
	
	public void showTutorial4(View view) {
		Intent tutorial4_intent = new Intent(this, Tutorial_p4.class);		
    	startActivity(tutorial4_intent);
	}
	
	public void showQuestionnaire(View view) {
		Intent questionnaire_intent = new Intent(this, Questionnaire.class);		
    	startActivity(questionnaire_intent);
	}
	
}