package com.example.gamgnam;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.Toast;


public class introActivity extends Activity {
	
Handler h;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		//타이틀바 없이 하기 위함
		setContentView(R.layout.intro);
		h = new Handler();
		h.postDelayed(irun, 2000); // 약 4초간 인트로 화면
	
		
	}
	Runnable irun= new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Intent i = new Intent(introActivity.this,MainActivity.class);			
			startActivity(i);

			overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
			
			finish();
			
			//fade in으로 시작하여 fade out 으로 인트로 화면이 꺼지게 애니메이션 추가
			
		}
	};
	
	//인트로화면 중간에 뒤로가기 버튼을 눌러서 꺼졌을 시 4초 후 메인페이지가 뜨는 것을 방지
	public void onBackPressed(){
		super.onBackPressed();
		h.removeCallbacks(irun);
	}
	
	


}
