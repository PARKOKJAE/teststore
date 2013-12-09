package com.example.gamgnam;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class tab4Activity extends ListActivity {
	
	private ArrayList<DataStore> dataList  = new ArrayList<DataStore>();
	private ArrayAdapter<DataStore> customAdapter;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//////////////////////////////////////////////////////////////////////////
		/*
			SQLite�� �⺻���� �־� �ξ��ٰ�, �� ��ġ������ db���� �о�ͼ� list ����
		*/
		
		// data ����
		//DataStore dataStore = new DataStore();
		
		// dataStore.setPhotoPath("hb.png");
		//dataStore.setStoreName("����");
		//dataStore.setDescription("�ѱ� ��ȭ ����Դϴ�.");
		
		// dataList�� �߰�
		dataList.add(new DataStore("fmsptkdtm.png", "���ﵿ", "���ﵿ ȣ��"));
		dataList.add(new DataStore("intercontinetal.png", "�Ｚ��","�Ｚ�� ȣ��"));
		dataList.add(new DataStore("ellui.png","û�㵿","û�㵿 ȣ��"));
		dataList.add(new DataStore("novotel.png","������","������ ȣ��"));
		dataList.add(new DataStore("river.jpg","�Ż絿","�Ż絿 ȣ��"));
		dataList.add(new DataStore("parkhayat.jpg","��ġ��","��ġ�� ȣ��"));
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
		
		Intent intent = new Intent(tab4Activity.this, TempActivity.class);
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