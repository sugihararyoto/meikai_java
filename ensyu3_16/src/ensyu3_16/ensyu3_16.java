//パッケージ名の宣言
package ensyu3_16;
//importする
import java.util.Scanner;
/*
 * クラス名:ensyu3_16
 * 概要  :演習3-16クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.10
 */
public class ensyu3_16 {
	/* 関数名：main
	 * 概要：3つの整数値を読み込んで昇順（小さい順）にソートする
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
		//変数firstNumberが一番大きい値になる場合
		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			//変数thirdNumberの値が変数secondNumberの値より大きい場合
			if (thirdNumber > secondNumber) {
				//変数fourthNumberを生成して変数firstNumberの値を代入する
				int fourthNumber = firstNumber;
				//変数firstNumberに変数secondNumberの値を代入する
				firstNumber = secondNumber;
				//変数secondNumberに変数thirdNumberの値を代入する
				secondNumber = thirdNumber;
				//変数thirdNumberに変数fourthNumberの値を代入する
				thirdNumber = fourthNumber;
			//変数thirdNumberの値が変数secondNumberの値以下の場合
			} else {
				//変数fourthNumberを生成して変数firstNumberの値を代入する
				int fourthNumber = firstNumber;
				//変数firstNumberに変数thirdNumberの値を代入する
				firstNumber = thirdNumber;
				//変数thirdNumberに変数fourthNumberの値を代入する
				thirdNumber = fourthNumber;
			}
		//変数firstNumberが一番小さい値になる場合
		} else if (firstNumber < secondNumber && firstNumber < thirdNumber) {
			//変数secondNumberの値が変数thirdNumberの値より大きい場合
			if (secondNumber > thirdNumber) {
				//変数fourthNumberを生成して変数secondNumberの値を代入する
				int fourthNumber = secondNumber;
				//変数secondNumberに変数thirdNumberの値を代入する
				secondNumber = thirdNumber;
				//変数thirdNumberに変数fourthNumberの値を代入する
				thirdNumber = fourthNumber;
			}
		//変数firstNumberが中央値になる場合
		} else {
			//変数firstNumberの値が変数secondNumberの値より大きい場合
			if (firstNumber > secondNumber) {
				//変数fourthNumberを生成して変数firstNumberの値を代入する
				int fourthNumber = firstNumber;
				//変数firstNumberに変数secondNumberの値を代入する
				firstNumber = secondNumber;
				//変数secondNumberに変数fourthNumberの値を代入する
				secondNumber = fourthNumber;
			//変数firstNumberの値が変数secondNumberの値以下の場合
			} else {
				//変数fourthNumberを生成して変数firstNumberの値を代入する
				int fourthNumber = firstNumber;
				//変数firstNumberに変数thirdNumberの値を代入する
				firstNumber = thirdNumber;
				//変数thirdNumberに変数secondNumberの値を代入する
				thirdNumber = secondNumber;
				//変数secondNumberに変数fourthNumberの値を代入する
				secondNumber = fourthNumber;
			}	
		}
		//画面に昇順にソートしました。と表示する
		System.out.println("昇順にソートしました。");
		//画面に整数Aの値を表示する
		System.out.println("整数Aは" + firstNumber + "です。");
		//画面に整数Bの値を表示する
		System.out.println("整数Bは" + secondNumber + "です。");
		//画面に整数Cの値を表示する
		System.out.println("整数Bは" + thirdNumber + "です。");
	}

}
