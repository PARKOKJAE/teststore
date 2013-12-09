package com.example.gamgnam;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;

public class arrayAdapter extends ArrayAdapter<DataStore>{

	private ArrayList<DataStore> list;
	private int rsrc;
	private LayoutInflater Inflater;
	private AssetManager mAssetManager;
	
	public arrayAdapter(Context context, int textViewResourceId, ArrayList<DataStore> objects) {
		super(context, textViewResourceId, objects);
		this.mAssetManager = context.getResources().getAssets();
		this.list = objects;
		this.rsrc = textViewResourceId;
		this.Inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = convertView;
		
		if(view == null) {
			view = Inflater.inflate(rsrc, parent, false);			
		}
		
		DataStore data = list.get(position);
		if(data != null) {
			
			if(data.getPhotoPath() != null)
			{
				InputStream inputPhoto = null;
				try {
					
					// 이미지 경로가 존재할 경우 AssetManager를 통해 이미지 설정
					inputPhoto = mAssetManager.open(data.getPhotoPath(), AssetManager.ACCESS_BUFFER);
					((ImageView) view.findViewById(R.id.custom_photo)).setImageBitmap(BitmapFactory.decodeStream(inputPhoto));
					((ImageView) view.findViewById(R.id.custom_photo)).setScaleType(ScaleType.FIT_XY);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				// 맛집 사진 경로가 null 일 경우 기본 이미지로 대체
				// R.drawable.hb => 기본 이미지 drawable로 변경
				((ImageView) view.findViewById(R.id.custom_photo)).setImageResource(R.drawable.icon);
			}

			((TextView) view.findViewById(R.id.custom_name)).setText(data.getStoreName());
			((TextView) view.findViewById(R.id.custom_descript)).setText(data.getDescription());
		}
		
		// return super.getView(position, convertView, parent);
		return view;
	}

	
	
	

}
