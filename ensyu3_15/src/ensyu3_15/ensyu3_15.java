//パッケージ名の宣言
package ensyu3_15;
//importする
import java.util.Scanner;
/*
 * クラス名:ensyu3_15
 * 概要  :演習3-15クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.10
 */
public class ensyu3_15 {
	/* 関数名：main
	 * 概要：2つの整数値を読み込んで降順（大きい順）にソートする
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
		//変数firstNumberの値が変数secondNumberの値よりも小さい場合
		if (firstNumber < secondNumber) {
			//変数thirdNumberを生成し、変数firstNumberの値を代入する
			int thirdNumber = firstNumber;
			//変数firstNumberに変数secondNumberの値を代入する
			firstNumber = secondNumber;
			//変数secondNumberに変数thirdNumberの値を代入する
			secondNumber = thirdNumber;
		}
		//画面に降順にソートしました。と表示する
		System.out.println("降順にソートしました。");
		//画面に整数Aの値を表示する
		System.out.println("整数Aは" + firstNumber + "です。");
		//画面に整数Bの値を表示する
		System.out.println("整数Bは" + secondNumber + "です。");
	}

}
