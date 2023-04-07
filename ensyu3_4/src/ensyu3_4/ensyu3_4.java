//パッケージ名の宣言
package ensyu3_4;
//importする
import java.util.Scanner;
/*
 * クラス名:ensyu3_4
 * 概要  :演習3-4クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.07
 */
public class ensyu3_4 {
	/* 関数名：main
	 * 概要：2つの変数に値を読み込んで大小関係を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args) {
		//キーボードからの読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//画面に1つ目の値：と表示する
		System.out.print("1つ目の値：");
		//変数inputFirstNumberにキーボードから入力した値を代入する
		double inputFirstNumber = standardInput.nextDouble();
		//画面に2つ目の値：と表示する
		System.out.print("2つ目の値：");
		//変数inputNumberSecondにキーボードから入力した値を代入する
		double inputSecondNumber = standardInput.nextDouble();
		
		//変数inputFirstNumberがinputSecondNumberより大きい場合
		if (inputFirstNumber > inputSecondNumber)
			//画面に1つ目の値のほうが大きいです。と表示する
			System.out.println("1つ目の値のほうが大きいです。");
		//変数inputFirstNumberがinputSecondNumberより小さい場合
		else if (inputFirstNumber < inputSecondNumber)
			//画面に2つ目の値のほうが大きいです。と表示する
			System.out.println("2つ目の値のほうが大きいです。");
		//変数inputFirstNumberとinputSecondNumberが同じ場合
		else
			//画面に1つ目の値と2つ目の値は同じです。と表示する
			System.out.println("1つ目の値と2つ目の値は同じです。");
			
	}

}
