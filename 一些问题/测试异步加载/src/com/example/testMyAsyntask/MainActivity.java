package com.example.testMyAsyntask;

import com.example.testMyAsyntask.until.MyAsyncTask;

import android.os.Bundle;
import android.os.SystemClock;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		new MyAsyncTask() {
			@Override
			public void onPreExecute() {
				Toast.makeText(MainActivity.this, "Ç°", 0).show();
			}

			@Override
			public void onPostExecute() {
				Toast.makeText(MainActivity.this, "ºó", 0).show();
			}

			@Override
			public void doInBackground() {
				//Ë¯5Ãë
				SystemClock.sleep(5000);
			}
		}.execute();

	}

}
