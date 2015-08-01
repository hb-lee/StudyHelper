package com.novice.studyhelper.aty;

import com.novice.studyhelper.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupMenu;
import android.widget.Toast;
import android.widget.PopupMenu.OnMenuItemClickListener;

public class AtyNoteDetail extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.note_item_detail);
		initial();

	}

	private void initial() {
		findViewById(R.id.showItem_to_show).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						finish();
					}
				});
		findViewById(R.id.addition_more).setOnClickListener(
				new OnClickListener() {

					PopupMenu popup = null;

					@Override
					public void onClick(View v) {
						popup = new PopupMenu(getApplicationContext(), v);
						getMenuInflater().inflate(R.menu.for_more,
								popup.getMenu());
						popup.setOnMenuItemClickListener(new OnMenuItemClickListener() {

							@Override
							public boolean onMenuItemClick(MenuItem item) {
								switch (item.getItemId()) {
								case R.id.modify_message:
									startActivity(new Intent(
											getApplicationContext(),
											AtyNoteModify.class));
									break;
								case R.id.change_picture:
									Toast.makeText(getApplicationContext(),
											"假设图片已经拍完...", Toast.LENGTH_SHORT)
											.show();
									new Thread(new Runnable() {
										public void run() {
											try {
												Thread.sleep(2000);
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
										}
									}).start();
									startActivity(new Intent(
											getApplicationContext(),
											AtyNoteModify.class));
									break;
								case R.id.delete_note_item:
									Toast.makeText(getApplicationContext(),
											"此处要用逻辑来实现删除", Toast.LENGTH_SHORT)
											.show();
									break;
								case R.id.quit_for_more:
									popup.dismiss();
									break;
								}
								return true;
							}
						});
						popup.show();
					}

				});

	}

}
