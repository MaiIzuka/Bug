package inheritanceTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 虫クラス
 * 
 * @author m-izuka
 * 
 */

public class Bug {
	//フィールド
	private String name;
	private String color;

	//コンストラクタ
	public Bug(String name, String color) {
		this.name = name;
		this.color = color;
	}

	//自己紹介メソッド　基本
	public void showProfile() {
		System.out.print("名前は" + name + "、" + color + "色");
	}

	//飼育方法メソッド
	public void breed() {

		List<String> shiiku = new ArrayList<String>();
		shiiku.add("不明");
		shiiku.add("「室内で虫かごで飼う」");
		shiiku.add("「専用の温室で飼う」");
		Collections.shuffle(shiiku);

		System.out.println("飼育方法は" + shiiku.get(0) + "です。");
	}
}
