package ensyu8_1;
/*
 * クラス名:HumanClass
 * 概要  :人間クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.08
 */
public class HumanClass {
	//名前を表す変数humanNameを生成する
	private String humanName;
	//身長を表す変数humanHeightを生成する
	private double humanHeight;
	//体重を表す変数humanWeightを生成する
	private double humanWeight;
	/*
	 * 「コンストラクタ」
	 * 仮引数：String humanName, double humanHeight, double humanWeight
	 */
	HumanClass(String humanName, double humanHeight, double humanWeight) {
		//フィールドに仮引数の値を代入する
		this.humanName = humanName;
		//フィールドに仮引数の値を代入する
		this.humanHeight = humanHeight;
		//フィールドに仮引数の値を代入する
		this.humanWeight = humanWeight;
	}
	
	/*
	 * 関数名：getHumanHeight
	 * 概要：身長を取得する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.08
	 */
	double getHumanHeight() { return humanHeight; }
	
	/*
	 * 関数名：getHumanWeight
	 * 概要：体重を取得する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.08
	 */
	double getHumanWeight() { return humanWeight; }
	
	/*
	 * 関数名：changeHeight
	 * 概要：身長を増減させる
	 * 引数：double changeNumber
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.08
	 */
	void changeHeight(double changeNumber) {
		//humanHeightにchangeNumberの値を足す
		humanHeight += changeNumber;
	}
	/*
	 * 関数名：changeWeight
	 * 概要：体重を増減させる
	 * 引数：double changeNumber
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.08
	 */
	void changeWeight(double changeNumber) {
		//humanWeightにchangeNumberの値を足す
		humanWeight += changeNumber;
	}
	/*
	 * 関数名：outputClass
	 * 概要：名前、身長、体重を表示するためのメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.08
	 */
	void outputClass() {
		//画面に名前を表示する
		System.out.println("名前：" + humanName);
		//画面に身長を表示する
		System.out.printf("身長：%3.1f cm\n", humanHeight);
		//画面に体重を表示する
		System.out.printf("体重：%3.1f kg\n", humanWeight);
	}
}