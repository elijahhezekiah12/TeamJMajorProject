package com.example.teamj_majorproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Tutorial_p1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tutorial_p1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tutorial_p1, menu);
		return true;
	}
	
	public void showTutorial2(View view) {
		Intent tutorial2_intent = new Intent(this, Tutorial_p2.class);		
    	startActivity(tutorial2_intent);
	}
	
	public void showQuestionnaire(View view) {
		Intent questionnaire_intent = new Intent(this, Questionnaire.class);		
    	startActivity(questionnaire_intent);
	}

}
