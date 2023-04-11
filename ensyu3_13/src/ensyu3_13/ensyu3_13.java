//パッケージ名の宣言
package ensyu3_13;
//importする
import java.util.Scanner;
/*
 * クラス名:ensyu3_13
 * 概要  :演習3-13クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.10
 */
public class ensyu3_13 {
	/* 関数名：main
	 * 概要：キーボードから読み込んだ3つの整数値の
	 * 中央値を求めて表示する
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
		//中央値を表す変数medianNumberにfirstNumberの値を代入する
		int medianNumber = firstNumber;
		//変数medianNumberの値が変数secondNumberの値より大きい場合
		if (medianNumber > secondNumber)
			//変数medianNumberの値が変数thirdNumberの値より大きい場合
			if (medianNumber > thirdNumber)
				//変数thirdNumberの値が変数secondNumberの値より大きい場合
				if (thirdNumber > secondNumber)
					//変数medianNumberに変数thirdNumberの値を代入する
					medianNumber = thirdNumber;
				//変数thirdNumberの値が変数secondNumberの値以下の場合
				else
					//変数medianNumberに変数secondNumberの値を代入する
					medianNumber = secondNumber;
		//変数medianNumberの値が変数secondNumberの値より小さい場合
		if (medianNumber < secondNumber)
			//変数medianNumberの値が変数thirdNumberの値より小さい場合
			if (medianNumber < thirdNumber)
				//変数thirdNumberの値が変数secondNumberの値より小さい場合
				if (thirdNumber < secondNumber)
					//変数medianNumberに変数thirdNumberの値を代入する
					medianNumber = thirdNumber;
				//変数thirdNumberの値が変数secondNumberの値以上の場合
				else
					//変数medianNumberに変数secondNumberの値を代入する
					medianNumber = secondNumber;
		//画面に中央値を表示する
		System.out.println("中央値は" + medianNumber + "です。");
	}

}
