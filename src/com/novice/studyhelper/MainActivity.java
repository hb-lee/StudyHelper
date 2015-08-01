package com.novice.studyhelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.novice.studyhelper.aty.AtyAboutUS;
import com.novice.studyhelper.aty.AtyCourse;
import com.novice.studyhelper.aty.AtyHelp;
import com.novice.studyhelper.aty.AtyNote;
import com.novice.studyhelper.aty.AtySearch;
import com.novice.studyhelper.aty.AtyShare;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		initial();

	}

	private void initial() {
		// TODO Auto-generated method stub
		findViewById(R.id.search_layout).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActivity(new Intent(getApplicationContext(),
								AtySearch.class));
					}
				});
		findViewById(R.id.course_layout).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActivity(new Intent(getApplicationContext(),
								AtyCourse.class));
					}
				});
		findViewById(R.id.share_layout).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActivity(new Intent(getApplicationContext(),
								AtyShare.class));
					}
				});
		findViewById(R.id.reminder_layout).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						Toast.makeText(getApplicationContext(), "内测中...",
								Toast.LENGTH_SHORT).show();
					}
				});
		findViewById(R.id.note_layout).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActivity(new Intent(getApplicationContext(),
								AtyNote.class));
					}
				});
		findViewById(R.id.help_layout).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActivity(new Intent(getApplicationContext(),
								AtyHelp.class));
					}
				});
		findViewById(R.id.app_details).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActivity(new Intent(getApplicationContext(),
								AtyAboutUS.class));
					}
				});
	}

}
