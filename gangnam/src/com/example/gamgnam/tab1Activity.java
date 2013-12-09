package com.example.gamgnam;

import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class tab1Activity extends ListActivity {
	
	private ArrayList<DataStore> dataList  = new ArrayList<DataStore>();
	private ArrayAdapter<DataStore> customAdapter;
	private int menu;
	
	/*TextView textView1111;
	
	boolean oneTouch = false;*/
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		dataList.add(new DataStore("gong.png", "분식", "떡볶기, 오뎅 맛집 골라~~~"));
		dataList.add(new DataStore("dlcmd.png", "한식","자랑스런 우리나라~코리아푸드"));
		dataList.add(new DataStore("phohoa.png","아시안푸드","쌀국수~~~~먹자~"));
		dataList.add(new DataStore("bene.png","디저트 & 푸드","커피한잔 할래요~?"));
		dataList.add(new DataStore("nolbu.png","심야식당","야밤에 야식합시다."));
		dataList.add(new DataStore("lima.png","세계요리","파스타 하나 먹어보자"));
		dataList.add(new DataStore("ujung.png","맵다매워","후끈 달아올라볼까~"));
	
		/////////////////////////////////////////////////////////////////////////
		
		
		
		customAdapter = new arrayAdapter(this, R.layout.listview, dataList);
		setListAdapter(customAdapter);
		
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		
		// super.onListItemClick(l, v, position, id);
		int index = position;
		DataStore clickedData = customAdapter.getItem(index);
	
		
		Bundle bundle = this.getIntent().getExtras();
		
		switch(position)
		{
		case 0:
			menu = 0;
			
			break;
		case 1:
			menu = 1;
			break;
			//.....
		}
		
		Intent intent = new Intent(tab1Activity.this, tab1trans.class);
		intent.putExtra("menu", menu);
		
		startActivity(intent);
		
		
		//////////////////////////////////////////////////////////////////////////
		/*
			SQLite에 기본정보 넣어 두었다가, 본 위치에서는 db에서 읽어와서 list 생성
		*/
		
		// data 생성
		//DataStore dataStore = new DataStore();
		
		// dataStore.setPhotoPath("hb.png");
		//dataStore.setStoreName("현빈");
		//dataStore.setDescription("한국 영화 배우입니다.");
		
//		menu = new ArrayList<String>();
		
		
		// dataList에 추가
	/*	dataList.add(new DataStore("gong.png", "분식", "떡볶기, 오뎅 맛집 골라~~~"));
	
		

		customAdapter = new arrayAdapter(this, R.layout.listview, dataList);

		
		setListAdapter(customAdapter);	
		
		
			
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		
		if (oneTouch == false)
			
		{
			dataList.clear();
			dataList.add(new DataStore("gong.png", "분식", "떡볶기, 오뎅 맛집 골라~~~"));
			dataList.add(new DataStore("dlcmd.png", "한식","자랑스런 우리나라~코리아푸드"));
			dataList.add(new DataStore("phohoa.png","아시안푸드","쌀국수~~~~먹자~"));
			dataList.add(new DataStore("bene.png","디저트 & 푸드","커피한잔 할래요~?"));
			dataList.add(new DataStore("nolbu.png","심야식당","야밤에 야식합시다."));
			dataList.add(new DataStore("lima.png","세계요리","파스타 하나 먹어보자"));
			dataList.add(new DataStore("ujung.png","맵다매워","후끈 달아올라볼까~"));
		
			/////////////////////////////////////////////////////////////////////////
			
			
			
			
			
			customAdapter = new arrayAdapter(this, R.layout.listview, dataList);

			
			setListAdapter(customAdapter);	
			
			
			oneTouch = true;
			
			return;
		}
		
		
		
		// super.onListItemClick(l, v, position, id);
		int index = position;
		DataStore clickedData = customAdapter.getItem(index);
	
		
		Bundle bundle = this.getIntent().getExtras();
		
		switch(position)
		{
		case 0:
			menu = 0;
			
			break;
		case 1:
			menu = 1;
			break;
			//.....
		}
		
		Intent intent = new Intent(tab1Activity.this, tab1trans.class);
		intent.putExtra("menu", menu);
		
		startActivity(intent);
		
		*/
	}
	
	


	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}
	
	

}
