package com.ebook.bookrack;

import java.util.ArrayList;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

public class BookrackActivity extends Activity{
	private final String BOOK_LIST = "book_list.xml";
	private final String BOOK_NAME = "name";
	private final String BOOK_LOCAL = "local";
	
	
	private  SharedPreferences mySharedPreferences;
	private  SharedPreferences.Editor editor;
	private ArrayList<String> book_list;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		init();
	}
	
	private void init(){
		mySharedPreferences = getSharedPreferences(BOOK_LIST, Activity.MODE_PRIVATE);
		editor = mySharedPreferences.edit();
		editor.putString(BOOK_NAME, "����");
		editor.putString(BOOK_NAME, "�������ɴ�");
		editor.putString(BOOK_NAME, "���ģʽ");
		editor.putString(BOOK_NAME, "Ӣ��־");
		editor.putString(BOOK_LOCAL, "");
		
		book_list = new ArrayList<String>();
	}
	
//	private ArrayList<String> getAllBook(){
//		return 
//	}

	
	
	
	
}
