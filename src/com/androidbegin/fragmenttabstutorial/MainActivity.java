package com.androidbegin.fragmenttabstutorial;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {
	// Declare Tab Variable
	Tab tab;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Create an actionbar
		ActionBar actionBar = getActionBar();
		// Hide Actionbar Icon
		actionBar.setDisplayShowHomeEnabled(false);
		// Hide Actionbar Title
		actionBar.setDisplayShowTitleEnabled(false);
		// Create Actionbar Tabs
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		// Create first Tab
		tab = actionBar.newTab().setTabListener(new FragmentTab1());
		//tab.setIcon(R.drawable.tab1);
		// Set Tab Title

		tab.setText("News Feed");
		actionBar.addTab(tab);

		// Create Second Tab
		tab = actionBar.newTab().setTabListener(new FragmentTab2());
		tab.setText("Trolley");
		actionBar.addTab(tab);

		// Create Third Tab
		tab = actionBar.newTab().setTabListener(new FragmentTab3());
		tab.setText("Emergencias");
		actionBar.addTab(tab);
		
		//Create Fourth Tab
		tab = actionBar.newTab().setTabListener(new FragmentTab4());
		tab.setText("Escoltas");
		actionBar.addTab(tab);
	}
}
