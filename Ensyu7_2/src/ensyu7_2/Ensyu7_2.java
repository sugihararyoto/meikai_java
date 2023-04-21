//パッケージ名の宣言
package ensyu7_2;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_2
 * 概要  :演習7-2クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.21
 */
public class Ensyu7_2 {
	/*
	 * 関数名：min
	 * 概要：テキストによって、min(int a, int b, int c)は指定
	 * 最小値を求める
	 * 引数：a, b, c
	 * 戻り値：minimumNumber(最小値)
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.21
	 */
	static int min(int a, int b, int c) {
		//変数minimumNumberを生成し、aの値で初期化する
		int minimumNumber = a;
		//変数minimumNumberの値がbより大きい場合
		if (minimumNumber > b) {
			//変数minimumNumberにbの値を代入する
			minimumNumber = b;
		}
		//変数minimumNumberの値がcより大きい場合
		if (minimumNumber > c) {
			//変数minimumNumberにcの値を代入する
			minimumNumber = c;
		}
		//minimumNumberを返す
		return minimumNumber;
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
		
		//画面に最小値を表示する
		System.out.println("最小値は" + min(firstNumber, secondNumber, thirdNumber) + "です。");
		
	}

}
