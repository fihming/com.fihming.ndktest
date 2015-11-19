package com.example.ndktest;

import com.example.ndktest.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

	static {
		System.loadLibrary("HelloC");
	}
	
	public native String helloWorldFromC();
	
	TextView tv;
	String str = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		str = helloWorldFromC();
		tv = (TextView) findViewById(R.id.tv);
		
		tv.setText(str);
	}
}
