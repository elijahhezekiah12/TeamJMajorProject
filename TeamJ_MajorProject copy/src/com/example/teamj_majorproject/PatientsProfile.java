package com.example.teamj_majorproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
//import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class PatientsProfile extends Activity{
	
	static String name, surname, age, gender;
	static  EditText edittext1, edittext2, edittext3, edittext4;
	Spinner spinner;
	TextView viewClicked;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patients_profile);
        // storing string resources into Array
       spinner = (Spinner) findViewById(R.id.questionnaires);
     viewClicked = (TextView) findViewById(R.id.spinner_textView);
      String[] questionnaires = {"Questionnaire 1","Questionnaire 2","Questionnaire 3"};
      ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(this, R.layout.patients_profile, R.id.questionnaires, questionnaires);
      
        spinner.setOnItemSelectedListener(new function());
       spinner.setAdapter(adapter);
         // here you store the array of string you got from the database
  
    }


	public void addData()
    {
     edittext1 = (EditText) findViewById(R.id.name);
     edittext2 = (EditText) findViewById(R.id.surname);
     edittext3 = (EditText) findViewById(R.id.age);
     edittext4 = (EditText) findViewById(R.id.gender);
    name = edittext1.getText().toString();
    name = name.substring(0,1).toUpperCase()+ name.substring(1).toLowerCase();
    surname = edittext2.getText().toString();
    surname = surname.substring(0,1).toUpperCase()+ surname.substring(1).toLowerCase();
    age = edittext3.getText().toString();
    gender = edittext4.getText().toString();
    }

    public class function implements OnItemSelectedListener {
    	public void onItemSelected(AdapterView<?> parent, View arg1, int pos, long id)
    	{
    		String str=parent.getItemAtPosition(pos).toString();
    		viewClicked.setText(str);
    	}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			
		}
    }
	/*public void populateListView(){
		 // storing string resources into Array
	    String[] questionnaires = {"Questionnaire 1","Questionnaire 2","Questionnaire 3"};
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.patients_profile, questionnaires);
	    
	    //configure the listView
	   ListView list = (ListView) findViewById(R.id.questionnaires);
	   list.setAdapter(adapter);
	}
	
	public void  registerClickCallBack()
	{
		ListView list = (ListView) findViewById(R.id.questionnaires);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> paret, View viewClicked, int position,
					long id) {
				// TODO Auto-generated method stub
				TextView textView = (TextView) viewClicked;
				String message = "The questionnaire at position" + position + "( " +textView.getText().toString() + ") has been clicked";
				Toast.makeText(PatientsProfile.this, message, Toast.LENGTH_LONG).show();
			}
		});
	}
	
	 // Binding Array to ListAdapter
    this.setListAdapter(new ArrayAdapter<String>(this, R.layout.patients_profile, R.id.questionnaires);
    // refer the ArrayAdapter Document in developer.android.com
    ListView lv = populateListView();
     
     // This space is dedicated for the QUESTIONNAIRE LIST code
    
     
     //public class AndroidListViewActivity extends ListActivity {

   

    // listening to single list item on click
    lv.setOnItemClickListener(new OnItemClickListener() {
      public void onItemClick(AdapterView<?> parent, View view,
          int position, long id) {

          // selected item 
          String num = ((TextView) view).getText().toString();

          // Launching new Activity on selecting single List Item
          Intent i = new Intent(getApplicationContext(), SingleListItem.class);
          // sending data to new activity
          i.putExtra("number", num);
          startActivity(i);

      }
    });
}
}

*/
    
    public void showWelcome(View view) {
    	addData();
    	Intent welcome_intent = new Intent(this, Welcome.class);		
    	startActivity(welcome_intent);
    }
    
}