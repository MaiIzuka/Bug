package inheritanceTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 蝶クラス
 * 
 * @author m-izuka
 * 
 */
public class Butterfly extends Bug {
	//フィールド
	int breednum;
	boolean flyFlg;

	//自動生成のコンストラクタ
	public Butterfly(String name, String color) {
		super(name, color);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	//flyメソッド
	public void fly() {
		Random fly = new Random();
		flyFlg = fly.nextBoolean();

		if (flyFlg) {
			System.out.println("ひらひらと舞います。");
		} else {
			System.out.println("疲れて飛べません。");
		}
	}

	//自己紹介メソッド　蝶オリジナル追加文
	public void butterflyProfile() {
		System.out.println("ですわ。");
		Random num = new Random();
		breednum = num.nextInt(100);

		List<String> wingList = new ArrayList<String>();
		wingList.add("青い宝石のような羽");
		wingList.add("黒縁でカラフルな羽");
		wingList.add("顔のように見える羽");
		wingList.add("白く透き通るような羽");
		Collections.shuffle(wingList);

		System.out.println(wingList.get(0) + "の柄で、仲間は"
				+ breednum + "匹います。");
	}

}
