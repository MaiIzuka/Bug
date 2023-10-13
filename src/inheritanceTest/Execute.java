package inheritanceTest;

import java.util.ArrayList;
import java.util.List;

public class Execute {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//インスタンス化
		Bug ant0 = new Ant("ムッシー", "黒");
		Bug ant1 = new Ant("アントワネット", "白");
		Bug ant2 = new Ant("アリリア", "茶");
		Bug butt1 = new Butterfly("てふてふ", "紫");
		Bug butt2 = new Butterfly("竜崎麗香", "白");

		//リスト作成
		List<Bug> list = new ArrayList<Bug>();
		list.add(ant0);
		list.add(ant1);
		list.add(ant2);
		list.add(butt1);
		list.add(butt2);

		//出力用メソッド
		for (Bug bugs : list) {
			bugs.showProfile();
			if (bugs instanceof Ant) {
				((Ant) bugs).antProfile();
				((Ant) bugs).makeNest();
			} else if (bugs instanceof Butterfly) {
				((Butterfly) bugs).butterflyProfile();
				((Butterfly) bugs).fly();
				bugs.breed();
			}
			System.out.println("");
		}

	}

}
