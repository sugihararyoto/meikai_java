//パッケージ名の宣言
package ensyu8_1;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu8_1
 * 概要  :演習8-1クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.08
 */
public class Ensyu8_1 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：main
	 * 概要：人間クラスを扱うためのメインメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.08
	 */
	public static void main(String[] args) {
		//クラス型変数yamadaTaroを生成し、人間クラスを参照する
		HumanClass yamadaTaro = new HumanClass("山田太郎", 203.5, 125.8);
		//yamadaTaroの内容を画面に表示する
		yamadaTaro.outputClass();
		
		//身長の増減量の入力を促す
		System.out.print("身長の増減量：");
		//変数inputHeightを生成し、キーボードから入力した値で初期化する
		double inputHeight = standardInput.nextDouble();
		//身長を増減させる
		yamadaTaro.changeHeight(inputHeight);
		//体重の増減量の入力を促す
		System.out.print("体重の増減量：");
		//変数inputWeightを生成し、キーボードから入力した値で初期化する
		double inputWeight = standardInput.nextDouble();
		//体重を増減させる
		yamadaTaro.changeWeight(inputWeight);
		//yamadaTaroの内容を画面に表示する
		yamadaTaro.outputClass();
		
	}

}
