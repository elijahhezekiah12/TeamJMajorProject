package com.example.teamj_majorproject;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Welcome extends Activity{
	
	static String welcome_fullname, welcome_gender;
	static int welcome_age;
	ImageView imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        
        showData();
    }

	@SuppressLint("DefaultLocale")
	public void showData()
    { 
		welcome_fullname = PatientsProfile.name + " " +  PatientsProfile.surname;
        welcome_age = Integer.parseInt(PatientsProfile.age);
        welcome_gender= PatientsProfile.gender.toLowerCase();
		TextView fullname = (TextView) findViewById(R.id.welcome_name);
		TextView age = (TextView) findViewById(R.id.welcome_patientAge);
        fullname.setText(welcome_fullname);
        age.setText("  " + welcome_age);
    
        /* if((welcome_gender == "f")||(welcome_gender == "female")&&(welcome_age>20))
        		{
        	imageview.setImageResource(R.drawable.adult_f);
        	//"....instruction here...."
        		}
        else if((welcome_gender == "m")||(welcome_gender == "male")&&(welcome_age>20))
                {
        	imageview.setImageResource(R.drawable.adult_m);
        	//"....instruction here...."
                } */
        
    }
	
	public void showTutorial1(View view) {
		Intent tutorial1_intent = new Intent(this, Tutorial_p1.class);		
    	startActivity(tutorial1_intent);
	}
	
	public void showQuestionnaire(View view) {
		Intent questionnaire_intent = new Intent(this, Questionnaire.class);		
    	startActivity(questionnaire_intent);
	}
	
}