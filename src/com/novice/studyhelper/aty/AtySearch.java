package com.novice.studyhelper.aty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.novice.studyhelper.R;

public class AtySearch extends Activity {

	private ImageView imageview;

	//此按钮只起着替代作用
	private Button bt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search);

		imageview = (ImageView) findViewById(R.id.search_to_main);
		imageview.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		
		//只是用按钮做界面的跳转，实际写的时候应用list项替代
		bt = (Button) findViewById(R.id.temp_bt1);
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(AtySearch.this, AtyCourseDetail.class);
				startActivity(i);
			}
		});
	}

}
