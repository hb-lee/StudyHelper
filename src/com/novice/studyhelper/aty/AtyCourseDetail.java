package com.novice.studyhelper.aty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.novice.studyhelper.R;

public class AtyCourseDetail extends Activity {
	private ImageView imageview;
	private Button button1,button2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.course_detail);
		imageview = (ImageView) findViewById(R.id.detail_to_search);
		imageview.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		button1 = (Button) findViewById(R.id.look_course);
		button2 = (Button) findViewById(R.id.add_search_plan);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(AtyCourseDetail.this, AtyCourse.class);
				startActivity(i);
			}
		});
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(AtyCourseDetail.this, AtyCourseSelect.class);
				startActivity(i);
			}
		});
	}
	
}
