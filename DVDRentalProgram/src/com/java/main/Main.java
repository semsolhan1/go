package com.java.main;

import com.java.view.AppUI;

//import static com.java.view.AppUi.inputInteger;
//자동 완성으로 사용 가능.클래스 이름 없이 사용 가능.

public class Main {

	public static void main(String[] args) {
		
		AppController controller = new AppController();
		
		while(true) {
			AppUI.startScreen();
			int selectNumber = AppUI.inputInteger(); //import static 쓰면 클래스 이름 없이 사용가능
			controller.chooseSystem(selectNumber);
		}

	}

}
