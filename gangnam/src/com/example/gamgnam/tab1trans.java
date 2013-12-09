package com.example.gamgnam;
import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class tab1trans extends ListActivity {
	private ArrayList<DataStore> dataList  = new ArrayList<DataStore>();
	private ArrayAdapter<DataStore> customAdapter;
	private int menu;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		

		Intent intent = getIntent();
		menu = intent.getIntExtra("menu", -1);
		Log.e("menu", "menu type은 " + menu +" 입니다.");
		
		
		// dataList에 추가
		switch(menu) {
		case 0:
			dataList.add(new DataStore("hb.png", "김밥천국", "분식 메뉴1"));
			dataList.add(new DataStore("icon.png", "죠스","분식 메뉴2"));
		case 1:
			dataList.add(new DataStore("hb.png", "보물섬", "짱개 메뉴1"));
			dataList.add(new DataStore("icon.png", "현해탄","짱개 메뉴2"));
	
			
		}
		
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
		

		Intent intent = new Intent(tab1trans.this, TempActivity.class);
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
