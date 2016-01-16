package com.example.teamj_majorproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Tutorial_p2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tutorial_p2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tutorial_p2, menu);
		return true;
	}
	
	public void showTutorial1(View view) {
		Intent tutorial1_intent = new Intent(this, Tutorial_p1.class);		
    	startActivity(tutorial1_intent);
	}

	public void showTutorial3(View view) {
		Intent tutorial3_intent = new Intent(this, Tutorial_p3.class);		
    	startActivity(tutorial3_intent);
	}
	
	public void showQuestionnaire(View view) {
		Intent questionnaire_intent = new Intent(this, Questionnaire.class);		
    	startActivity(questionnaire_intent);
	}
	
}
