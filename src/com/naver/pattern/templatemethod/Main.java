package com.naver.pattern.templatemethod;

import com.naver.pattern.templatemethod.db.AbstGameConnectHelper;
import com.naver.pattern.templatemethod.db.DefaultGameConnectHelper;

public class Main {

	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();
		helper.requestConnection("아이디 암호 등 접속 정보");
	}

}
