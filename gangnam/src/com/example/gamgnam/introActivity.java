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
		//Ÿ��Ʋ�� ���� �ϱ� ����
		setContentView(R.layout.intro);
		h = new Handler();
		h.postDelayed(irun, 2000); // �� 4�ʰ� ��Ʈ�� ȭ��
	
		
	}
	Runnable irun= new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Intent i = new Intent(introActivity.this,MainActivity.class);			
			startActivity(i);

			overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
			
			finish();
			
			//fade in���� �����Ͽ� fade out ���� ��Ʈ�� ȭ���� ������ �ִϸ��̼� �߰�
			
		}
	};
	
	//��Ʈ��ȭ�� �߰��� �ڷΰ��� ��ư�� ������ ������ �� 4�� �� ������������ �ߴ� ���� ����
	public void onBackPressed(){
		super.onBackPressed();
		h.removeCallbacks(irun);
	}
	
	


}
