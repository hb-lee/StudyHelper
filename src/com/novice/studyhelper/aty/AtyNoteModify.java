package com.novice.studyhelper.aty;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.novice.studyhelper.R;

public class AtyNoteModify extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.note_detail_for_modify);
		initial();

	}

	private void initial() {
		findViewById(R.id.ItemModify_to_noteItem).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						finish();
					}
				});

	}
}
