//パッケージ名の宣言
package ensyu7_3;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_3
 * 概要  :演習7-3クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.21
 */
public class Ensyu7_3 {
	/*
	 * 関数名：med
	 * 概要：テキストによって、med(int a, int b, int c)は指定
	 * 中央値を求める
	 * 引数：a, b, c
	 * 戻り値：medianNumber(中央値)
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.21
	 */
	static int med(int a, int b, int c) {
		//中央値を表す変数medianNumberにaの値を代入する
		int medianNumber = a;
		//変数medianNumberの値がbの値より大きい場合
		if (medianNumber > b){
			//変数medianNumberの値がcの値より大きい場合
			if (medianNumber > c) {
				//cの値がbの値よりも大きい場合
				if (c > b) {
					//変数medianNumberにcの値を代入する
					medianNumber = c;
				//cの値がbの値以下の場合
				} else {
					//変数medianNumberにbの値を代入する
					medianNumber = b;
				}
			}
		}
		//変数medianNumberの値がbの値より小さい場合
		if (medianNumber < b) {
			//変数medianNumberの値がcの値より小さい場合
			if (medianNumber < c) {
				//cの値がbの値よりも小さい場合
				if (c < b) {
					//変数medianNumberにcの値を代入する
					medianNumber = c;
				//cの値がbの値以上の場合
				} else {
					//変数medianNumberにbの値を代入する
					medianNumber = b;
				}
			}
		}
		//medianNumberを返す
		return medianNumber;
	}
	/*
	 * 関数名：main
	 * 概要：整数を3つ入力するテスト用のメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.21
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//画面に整数aの入力を促す
		System.out.print("整数a：");
		//変数firstNumberを生成し、キーボードから入力した値で初期化する
		int firstNumber = standardInput.nextInt();
		//画面に整数bの入力を促す
		System.out.print("整数b：");
		//変数secondNumberを生成し、キーボードから入力した値で初期化する
		int secondNumber = standardInput.nextInt();
		//画面に整数cの入力を促す
		System.out.print("整数c：");
		//変数thirdNumberを生成し、キーボードから入力した値で初期化する
		int thirdNumber = standardInput.nextInt();
		
		//画面に中央値を表示する
		System.out.println("中央値は" + med(firstNumber, secondNumber, thirdNumber) + "です。");
		
	}

}
