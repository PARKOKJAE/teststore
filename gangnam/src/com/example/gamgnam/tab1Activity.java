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
	
		dataList.add(new DataStore("gong.png", "�н�", "������, ���� ���� ���~~~"));
		dataList.add(new DataStore("dlcmd.png", "�ѽ�","�ڶ����� �츮����~�ڸ���Ǫ��"));
		dataList.add(new DataStore("phohoa.png","�ƽþ�Ǫ��","�ұ���~~~~����~"));
		dataList.add(new DataStore("bene.png","����Ʈ & Ǫ��","Ŀ������ �ҷ���~?"));
		dataList.add(new DataStore("nolbu.png","�ɾ߽Ĵ�","�߹㿡 �߽��սô�."));
		dataList.add(new DataStore("lima.png","����丮","�Ľ�Ÿ �ϳ� �Ծ��"));
		dataList.add(new DataStore("ujung.png","�ʴٸſ�","�Ĳ� �޾ƿö󺼱�~"));
	
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
			SQLite�� �⺻���� �־� �ξ��ٰ�, �� ��ġ������ db���� �о�ͼ� list ����
		*/
		
		// data ����
		//DataStore dataStore = new DataStore();
		
		// dataStore.setPhotoPath("hb.png");
		//dataStore.setStoreName("����");
		//dataStore.setDescription("�ѱ� ��ȭ ����Դϴ�.");
		
//		menu = new ArrayList<String>();
		
		
		// dataList�� �߰�
	/*	dataList.add(new DataStore("gong.png", "�н�", "������, ���� ���� ���~~~"));
	
		

		customAdapter = new arrayAdapter(this, R.layout.listview, dataList);

		
		setListAdapter(customAdapter);	
		
		
			
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		
		if (oneTouch == false)
			
		{
			dataList.clear();
			dataList.add(new DataStore("gong.png", "�н�", "������, ���� ���� ���~~~"));
			dataList.add(new DataStore("dlcmd.png", "�ѽ�","�ڶ����� �츮����~�ڸ���Ǫ��"));
			dataList.add(new DataStore("phohoa.png","�ƽþ�Ǫ��","�ұ���~~~~����~"));
			dataList.add(new DataStore("bene.png","����Ʈ & Ǫ��","Ŀ������ �ҷ���~?"));
			dataList.add(new DataStore("nolbu.png","�ɾ߽Ĵ�","�߹㿡 �߽��սô�."));
			dataList.add(new DataStore("lima.png","����丮","�Ľ�Ÿ �ϳ� �Ծ��"));
			dataList.add(new DataStore("ujung.png","�ʴٸſ�","�Ĳ� �޾ƿö󺼱�~"));
		
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
