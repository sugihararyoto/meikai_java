//パッケージ名の宣言
package ensyu3_12;
//importする
import java.util.Scanner;
/*
 * クラス名:ensyu3_12
 * 概要  :演習3-12クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.10
 */
public class ensyu3_12 {
	/* 関数名：main
	 * 概要：キーボードから読み込んだ3つの整数値の
	 * 最小値を求めて表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.10
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//画面に整数Aの入力を促す
		System.out.print("整数A：");
		//変数firstNumberにキーボードから入力した値を代入する
		int firstNumber = standardInput.nextInt();
		//画面に整数Bの入力を促す
		System.out.print("整数B：");
		//変数secondNumberにキーボードから入力した値を代入する
		int secondNumber = standardInput.nextInt();
		//画面に整数Cの入力を促す
		System.out.print("整数C：");
		//変数thirdNumberにキーボードから入力した値を代入する
		int thirdNumber = standardInput.nextInt();
		//最小値を表す変数minimumNumberにfirstNumberの値を代入する
		int minimumNumber = firstNumber;
		//変数minimumNumberの値が変数secondNumberの値より大きい場合
		if (minimumNumber > secondNumber)
			//変数minimumNumberに変数secondNumberの値を代入する
			minimumNumber = secondNumber;
		//変数minimumNumberの値が変数thirdNumberの値より大きい場合
		if (minimumNumber > thirdNumber)
			//変数minimumNumberに変数thirdNumberの値を代入する
			minimumNumber = thirdNumber;
		//画面に最小値を表示する
		System.out.println("最小値は" + minimumNumber + "です。");
		
		
		
	}

}
