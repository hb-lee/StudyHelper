package com.novice.studyhelper.aty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupMenu;
import android.widget.Toast;
import android.widget.PopupMenu.OnMenuItemClickListener;

import com.novice.studyhelper.R;

public class AtyNote extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.note);
		initial();

	}

	private void initial() {
		findViewById(R.id.note_to_main).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						finish();
					}
				});
		findViewById(R.id.add_mode_note).setOnClickListener(
				new OnClickListener() {

					PopupMenu popup = null;

					@Override
					public void onClick(View v) {
						popup = new PopupMenu(getApplicationContext(), v);
						getMenuInflater().inflate(R.menu.addition_note,
								popup.getMenu());
						popup.setOnMenuItemClickListener(new OnMenuItemClickListener() {

							@Override
							public boolean onMenuItemClick(MenuItem item) {
								switch (item.getItemId()) {
								case R.id.add_category:
									Toast.makeText(getApplicationContext(),
											"此处要弹出一个alert对话框",
											Toast.LENGTH_SHORT).show();
									break;
								case R.id.my_course:
									startActivity(new Intent(
											getApplicationContext(),
											AtyCourse.class));
									break;
								case R.id.quit_addition_note:
									break;
								}
								return true;
							}
						});
						popup.show();
					}

				});
		findViewById(R.id.tempbtn4).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "假设图片已经拍完...",
						Toast.LENGTH_SHORT).show();
				new Thread(new Runnable() {
					public void run() {
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}).start();
				startActivity(new Intent(getApplicationContext(),
						AtyNoteShow.class));
			}
		});
	}
}
