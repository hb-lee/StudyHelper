package com.novice.studyhelper.aty;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.novice.studyhelper.R;

public class AtyCourseSelect extends Activity {

	private ImageView imageview;
	private Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.course_select);
		imageview = (ImageView) findViewById(R.id.select_to_detail);
		button = (Button) findViewById(R.id.coure_select);
		imageview.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog();
			}

		});
	}

	private void showDialog() {
		// TODO Auto-generated method stub
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("注意");
		builder.setIcon(R.drawable.alert);
		builder.setMessage("将会添加到我的课程表中");
		builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(AtyCourseSelect.this, "编程时表示将数据传入了",
						Toast.LENGTH_SHORT).show();
			}
		});
		builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(AtyCourseSelect.this, "点击了取消按钮",
						Toast.LENGTH_SHORT).show();
			}
		});
		AlertDialog dialog = builder.create();
		dialog.show();
	}
	
}
