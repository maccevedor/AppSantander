package appsantander.co;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import java.util.ArrayList;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
public class Index extends Activity {
	
	ListView lista;
	ArrayAdapter<String> adaptador;
	ArrayList<String> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        
        datos = new ArrayList<String>();
		llenarLista();
		lista = (ListView) findViewById(R.id.listaSimple);
		adaptador = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, datos);
		lista.setAdapter(adaptador);
		lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View vista,
					int posicion, long arg3) {
				Toast.makeText(
						getApplication(),
						"Click en: " + (posicion + 1) + " - "
								+ (String) ((TextView) vista).getText(),
						Toast.LENGTH_LONG).show();
			}
		});
    }

	public void llenarLista() {
		datos.add("GuajirAndro");
		datos.add("Android");
		datos.add("Google");
		datos.add("Apple");
		datos.add("Microsoft");
		datos.add("RIM");
		datos.add("J2ME");
		datos.add("XML");
	}
	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.index, menu);
        return true;
    }
    
}
