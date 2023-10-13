package inheritanceTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 蟻クラス
 * 
 * @author m-izuka
 * 
 */
public class Ant extends Bug {
	//自動生成コンストラクタ
	public Ant(String name, String color) {
		super(name, color);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	//フィールド
	int breedNum;
	boolean poisonFlg;

	//巣の作り方メソッド
	public void makeNest() {
		
		List<String> nests = new ArrayList<String>();
		nests.add("不明");
		nests.add("「アクリルケースの中に土を入れて穴を開ける」");
		nests.add("「木の幹の中に穴を開ける」");
		nests.add("「コンクリートの隙間に作る」");
		Collections.shuffle(nests);
		
		System.out.println("巣の作り方は" + nests.get(0) + "です。");
	}

	//自己紹介メソッド　蟻オリジナル追加文
	public void antProfile() {
		System.out.println("でアリんす。");

		Random num = new Random();
		breedNum = num.nextInt(100);
		System.out.print(breedNum + "匹で生活していて、毒は");

		Random poison = new Random();
		poisonFlg = poison.nextBoolean();

		if (poisonFlg) {
			System.out.println("アリます。");
		} else {
			System.out.println("アリません。");
		}
	}

}
