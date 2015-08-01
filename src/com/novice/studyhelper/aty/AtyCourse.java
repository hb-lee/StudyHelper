package com.novice.studyhelper.aty;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.TextView;
import android.widget.Toast;

import com.novice.studyhelper.R;

public class AtyCourse extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.course);
		initial();

	}

	private void initial() {
		findViewById(R.id.course_to_main).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						finish();
					}
				});
		findViewById(R.id.add_mode_course).setOnClickListener(new OnClickListener() {

			PopupMenu popup = null;

			@Override
			public void onClick(View v) {
				popup = new PopupMenu(getApplicationContext(), v);
				getMenuInflater().inflate(R.menu.addition_course,
						popup.getMenu());
				popup.setOnMenuItemClickListener(new OnMenuItemClickListener() {

					@Override
					public boolean onMenuItemClick(MenuItem item) {
						switch (item.getItemId()) {
						case R.id.add_from_exist:
							break;
						case R.id.add_new_course:
							break;
						case R.id.edit_course:
							break;
						case R.id.quit_addition_course:
							popup.dismiss();
							break;
						}
						return true;
					}
				});
				popup.show();
			}

		});
		((TextView) findViewById(R.id.week)).setText("第六周");
		Toast.makeText(this, "周数应该通过系统时间获取", Toast.LENGTH_LONG).show();

	}

}
