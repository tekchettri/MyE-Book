package com.ebook;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.ebook.curl.CurlActivity;

public class MyE_BookMainActivity extends ActivityGroup  {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		TabHost tabs = (TabHost) findViewById(R.id.tabhost);

		tabs.setup(getLocalActivityManager());

		TabHost.TabSpec spec = tabs.newTabSpec("tag_import");
		spec.setContent(new Intent(this, RatingListView.class));
		spec.setIndicator("导入");
		tabs.addTab(spec);

		spec = tabs.newTabSpec("tag_bookrack");
		spec.setContent(new Intent(this, CurlActivity.class));
		spec.setIndicator("书架");
		tabs.addTab(spec);
		
		spec = tabs.newTabSpec("tag_setting");
		spec.setContent(new Intent(this, CurlActivity.class));
		spec.setIndicator("设置");
		tabs.addTab(spec);
		
		spec = tabs.newTabSpec("tag_more");
		spec.setContent(new Intent(this, CurlActivity.class));
		spec.setIndicator("更多");
		tabs.addTab(spec);

		tabs.setCurrentTab(0);
	}

}
