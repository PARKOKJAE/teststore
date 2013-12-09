package com.example.gamgnam;


import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;

public class MainActivity extends TabActivity{

	TabHost tabHost = null;
//	boolean bTabTouched = false;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		

		setupTabs();

//		tabHost.setOnTabChangedListener(new OnTabChangeListener() {    
//
//			@Override    
//			public void onTabChanged(String tabId) {    
////				Log.v("hihi", "click");    
////
////				if (bTabTouched == false) {
////					reSetupTabs();
////
////					bTabTouched = true;
////				}
//
//
//				// getTabHost().getCurrentTabView().setOnClickListener(new    
//				// OnClickListener() {    
//				//                      
//				// @Override    
//				// public void onClick(View v) {    
//				// Log.v("", "click");    
//				//                           
//				// }    
//				// });    
//
//				// this overrides the default clicklistener, causing no more tab    
//				// changes...    
//
////				getTabHost().getCurrentTabView().setOnTouchListener(    
////						new OnTouchListener() {    
////
////							@Override    
////							public boolean onTouch(View v, MotionEvent event) {    
////
////								if (bTabTouched == false && event.getAction() == MotionEvent.ACTION_DOWN)    
////								{
////									Log.v("hihi", "touch");
////									reSetupTabs();
////
////									bTabTouched = true;
////								}
////
////
////
////								return false; // returning false seems do the    
////								// trick     
////							}    
////						});
//			}    
//		});    
//

	}

//	public void reSetupTabs()
//	{
//
//		tabHost.clearAllTabs();
//
//		tabHost.addTab(tabHost.newTabSpec("tab1")
//				// .setIndicator("맛집" , getResources().getDrawable(R.drawable.ic_launcher))
//				. setIndicator(" ",getResources().getDrawable(R.drawable.menu1))//탭의 이름추가,여따가 아이콘같이 추가 가능
//				.setContent(new Intent(this, tab1Activity.class)));//보여주고자하는 레이아웃포함 엑티비티 클래스이름
//		tabHost.addTab(tabHost.newTabSpec("tab2")
//				.setIndicator(" ",getResources().getDrawable(R.drawable.menu2))
//				.setContent(new Intent(this,  tab2Activity.class)));
//		tabHost.addTab(tabHost.newTabSpec("tab3")
//				.setIndicator(" ",getResources().getDrawable(R.drawable.menu3))
//				.setContent(new Intent(this,  tab3Activity.class)));
//		tabHost.addTab(tabHost.newTabSpec("tab4")
//				.setIndicator(" ",getResources().getDrawable(R.drawable.menu4))
//				.setContent(new Intent(this,  tab4Activity.class)));
//
//		//탭위젯 색상
//		tabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#66A4B7"));
//		tabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#66A4B7"));
//		tabHost.getTabWidget().getChildAt(2).setBackgroundColor(Color.parseColor("#66A4B7"));
//		tabHost.getTabWidget().getChildAt(3).setBackgroundColor(Color.parseColor("#66A4B7"));
//
//		//탭 사이즈 크기
//		for(int i=0 ; i < tabHost.getTabWidget().getChildCount();++i)
//		{ tabHost.getTabWidget().getChildAt(i).getLayoutParams().height=110;}
//
//		tabHost.getTabWidget().setCurrentTab(0);	
//	}


	/**
	 * setup tab widget
	 */

	public void setupTabs(){

		
		tabHost = (TabHost) findViewById(android.R.id.tabhost);

		tabHost.addTab(tabHost.newTabSpec("tab1")
				// .setIndicator("맛집" , getResources().getDrawable(R.drawable.ic_launcher))
				. setIndicator(" ",getResources().getDrawable(R.drawable.menu1))//탭의 이름추가,여따가 아이콘같이 추가 가능
				.setContent(new Intent(this, tab1Activity.class)));//보여주고자하는 레이아웃포함 엑티비티 클래스이름
		tabHost.addTab(tabHost.newTabSpec("tab2")
				.setIndicator(" ",getResources().getDrawable(R.drawable.menu2))
				.setContent(new Intent(this,  tab2Activity.class)));
		tabHost.addTab(tabHost.newTabSpec("tab3")
				.setIndicator(" ",getResources().getDrawable(R.drawable.menu3))
				.setContent(new Intent(this,  tab3Activity.class)));
		tabHost.addTab(tabHost.newTabSpec("tab4")
				.setIndicator(" ",getResources().getDrawable(R.drawable.menu4))
				.setContent(new Intent(this,  tab4Activity.class)));

		//탭위젯 색상
		tabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#66A4B7"));
		tabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#66A4B7"));
		tabHost.getTabWidget().getChildAt(2).setBackgroundColor(Color.parseColor("#66A4B7"));
		tabHost.getTabWidget().getChildAt(3).setBackgroundColor(Color.parseColor("#66A4B7"));

		//탭 사이즈 크기
		for(int i=0 ; i < tabHost.getTabWidget().getChildCount();++i)
		{ tabHost.getTabWidget().getChildAt(i).getLayoutParams().height=110;}

		tabHost.getTabWidget().setCurrentTab(0);	


	}//setupTabs






}
