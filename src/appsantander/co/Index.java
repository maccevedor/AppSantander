package appsantander.co;

import android.os.Bundle;
import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.view.View.OnClickListener;



public class Index extends Activity implements OnItemSelectedListener {
	
	private CheckBox checkBox1;
	private Button button1;
	private EditText editText2;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        
        // Spinner element
        
    	addListenerOnCheckBox();
    	
    	// LLama a una clase que se encarga de verificar el Checkbox
    	
    	
    	
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        
        // Spinner click listener
        spinner.setOnItemSelectedListener(this);
        
        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("AMB");
        categories.add("EMAB");
        categories.add("Metrolinea");
        categories.add("Telebucaramanga");
        categories.add("Proactiva Chicamocha");
        categories.add("Claro");
        
        // Creating adapter for spinner
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
		
		// Drop down layout style - list view with radio button
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		// attaching data adapter to spinner
		spinner.setAdapter(dataAdapter);
		
    }
    
    @Override
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
		// On selecting a spinner item
		String item = parent.getItemAtPosition(position).toString();
		
		// Showing selected spinner item
		Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

	}

	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void addListenerOnCheckBox() {
		 
		checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
	 
		checkBox1.setOnClickListener(new OnClickListener() {
	 
		  @Override
		  public void onClick(View v) {
	                //is chkIos checked?
			if (((CheckBox) v).isChecked()) {
				Toast.makeText(Index.this,
			 	   "Hola selecciones el checBox :(", Toast.LENGTH_LONG).show();
				// editText2.setEnabled(false);
				EditText a = (EditText) findViewById(R.id.editText2);
				  a.setText("Anónimo Wamberto");
		          a.setEnabled(false);
		          EditText b = (EditText) findViewById(R.id.editText3);
		          b.setText("Anónimo");
		          b.setEnabled(false);
		          EditText c = (EditText) findViewById(R.id.editText4);
		          c.setText("Anónimo");
		          c.setEnabled(false);
		          EditText d = (EditText) findViewById(R.id.editText5);
		          d.setText("Anónimo");
		          d.setEnabled(false);
			}
			else
			{
				Toast.makeText(Index.this,
					 	   "Has deselecciones el checBox :)", Toast.LENGTH_LONG).show();
				  EditText a = (EditText) findViewById(R.id.editText2);
				  a.setText("");
		          a.setEnabled(true);
		          EditText b = (EditText) findViewById(R.id.editText3);
		          b.setText("");
		          b.setEnabled(true);
		          EditText c = (EditText) findViewById(R.id.editText4);
		          c.setText("");
		          c.setEnabled(true);
		          EditText d = (EditText) findViewById(R.id.editText5);
		          d.setText("");
		          d.setEnabled(true);
			}
		  }
		  
		});
	 
	  }
	 
	  
	
}





