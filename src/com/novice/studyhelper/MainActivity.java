package com.novice.studyhelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.novice.studyhelper.aty.AtySearch;

public class MainActivity extends Activity {

	private ImageView search;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		search = (ImageView) findViewById(R.id.search);
		search.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, AtySearch.class);
				startActivity(i);
			}
		});
	}

}
