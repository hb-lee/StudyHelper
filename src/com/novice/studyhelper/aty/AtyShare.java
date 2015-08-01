package com.novice.studyhelper.aty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.novice.studyhelper.R;

public class AtyShare extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.share);
		initial();

	}

	private void initial() {
		// 此按钮只起着替代作用
		// 只是用按钮做界面的跳转，实际写的时候应用list项替代
		findViewById(R.id.temp_bt2).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(AtyShare.this, AtyCourseDetail.class);
				startActivity(i);
			}
		});

		findViewById(R.id.share_to_main).setOnClickListener(
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						finish();
					}
				});

		findViewById(R.id.bt_search_share).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						Toast.makeText(getApplicationContext(), "搜索功能内测中...",
								Toast.LENGTH_SHORT).show();
					}
				});
	}

}
