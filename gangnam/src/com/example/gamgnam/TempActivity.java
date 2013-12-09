package com.example.gamgnam;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ImageView.ScaleType;

public class TempActivity extends Activity {

	private String photo;
	private String name;
	private String descript;
	
	private TextView tv1;
	private TextView tv2;
	private ImageView iv;
	
	private AssetManager mAssetManager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab1_result1);
		
		this.mAssetManager = this.getResources().getAssets();
		
		Intent intent = getIntent();
		photo = intent.getStringExtra("photo");
		name = intent.getStringExtra("name");
		descript = intent.getStringExtra("description");
		
		tv1 = (TextView) findViewById(R.id.tab1_rtbutton1);
		tv2 = (TextView) findViewById(R.id.tab1_rtbutton2);
		iv=(ImageView) findViewById(R.id.imageView1);
		
		
		InputStream inputPhoto = null;
		
		try {
			inputPhoto = mAssetManager.open(photo, AssetManager.ACCESS_BUFFER);
			iv.setImageBitmap(BitmapFactory.decodeStream(inputPhoto));
			iv.setScaleType(ScaleType.FIT_XY);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		tv1.setText(name);
		tv2.setText(descript);
		
	}
	

}
