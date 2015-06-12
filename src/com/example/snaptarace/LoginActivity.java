package com.example.snaptarace;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	//dfd
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		Log.d("SNAP","demarrage");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
	
	public void login(View v){
		EditText login;
		login = (EditText) findViewById (R.id.identifiant);
		
		String log = login.getText().toString();
		Log.d("SNAP",log);
		EditText pass;
		pass = (EditText) findViewById (R.id.passwrd);
		String passd = pass.getText().toString();
		Log.d("SNAP",passd);
		Intent intent = new Intent(this, FormatoinCameraActivity.class);
		Log.d("SNAP","test");
		Toast.makeText(getApplicationContext(), (String) log, Toast.LENGTH_SHORT).show();
		Toast.makeText(getApplicationContext(), (String) passd, Toast.LENGTH_SHORT).show();
		startActivity(intent);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
