package com.novice.studyhelper.aty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import com.novice.studyhelper.R;

public class AtyNoteShow extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.note_show);
		initial();
	}

	private void initial() {
		findViewById(R.id.show_to_note).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						finish();
					}
				});
		((TextView) findViewById(R.id.show_courses_name)).setText("微积分I");
		Toast.makeText(getApplicationContext(), "课程名称应该通过逻辑来获取",
				Toast.LENGTH_SHORT).show();
		findViewById(R.id.tempbtn3).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(getApplicationContext(),
						AtyNoteDetail.class));
			}
		});
	}

}
