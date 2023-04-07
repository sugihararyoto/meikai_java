//パッケージ名の宣言
package ensyu2_5;
//importする
import java.util.Scanner;
/*
 * クラス名:ensyu2_5
 * 概要  :演習2-5クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.06
 */
public class ensyu2_5 {
	/* 関数名：main
	 * 概要：2つの実数値を読み込み、その和と平均を求めて表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args) {
		//キーボードからの読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//画面に1つ目の値の入力を促す
		System.out.print("1つ目の値：");
		//変数inputNumberFirstにキーボードから入力した値（小数部を含む）を代入する
		double inputNumberFirst = standardInput.nextDouble();
		//画面に2つ目の値の入力を促す
		System.out.print("2つ目の値：");
		//変数inputNumberSecondにキーボードから入力した値（小数部を含む）を代入する
		double inputNumberSecond = standardInput.nextDouble();
		//画面に入力した2つの値の合計を表示する
		System.out.println("合計は" + (inputNumberFirst + inputNumberSecond) + "です。");
		//画面に入力した2つの値の平均を表示する
		System.out.println("平均は" + (inputNumberFirst + inputNumberSecond) /  2 + "です。");
	}

}
