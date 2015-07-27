package com.novice.studyhelper.aty;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.novice.studyhelper.R;

public class AtyCourse extends Activity {

	private ImageView imageview1, imageview2;
	private TextView textview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.course);
		imageview1 = (ImageView) findViewById(R.id.course_to_main);
		imageview2 =  (ImageView) findViewById(R.id.add_mode);
		textview = (TextView) findViewById(R.id.week);
		textview.setText("第六周");
		Toast.makeText(this, "周数应该通过系统时间获取", Toast.LENGTH_LONG).show();
		imageview1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		imageview2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(AtyCourse.this, "侧边栏菜单待添加", Toast.LENGTH_SHORT)
						.show();
			}

		});

	}

}
