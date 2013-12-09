package com.example.gamgnam;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class tab3Activity extends ListActivity {
	
	private ArrayList<DataStore> dataList  = new ArrayList<DataStore>();
	private ArrayAdapter<DataStore> customAdapter;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//////////////////////////////////////////////////////////////////////////
		/*
			SQLite에 기본정보 넣어 두었다가, 본 위치에서는 db에서 읽어와서 list 생성
		*/
		
		// data 생성
		//DataStore dataStore = new DataStore();
		
		// dataStore.setPhotoPath("hb.png");
		//dataStore.setStoreName("현빈");
		//dataStore.setDescription("한국 영화 배우입니다.");
		
		// dataList에 추가
		dataList.add(new DataStore("phone.png", "휴대폰", "휴대폰 관련 a/s는 여기~"));
		dataList.add(new DataStore("as.jpg", "가전제품","가전제품관련은 여기~~~!"));
		
		/////////////////////////////////////////////////////////////////////////
		
		
		
		customAdapter = new arrayAdapter(this, R.layout.listview, dataList);
		setListAdapter(customAdapter);
		
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		
		// super.onListItemClick(l, v, position, id);
		int index = position;
		DataStore clickedData = customAdapter.getItem(index);
		
		String name = clickedData.getStoreName();
		String description = clickedData.getDescription();
		String photo = clickedData.getPhotoPath();
		
		Bundle bundle = this.getIntent().getExtras();
		
		Intent intent = new Intent(tab3Activity.this, TempActivity.class);
		intent.putExtra("photo", photo);
		intent.putExtra("name", name);
		intent.putExtra("description", description);
		
		startActivity(intent);
		
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
