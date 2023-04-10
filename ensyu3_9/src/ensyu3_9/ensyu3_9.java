//パッケージ名の宣言
package ensyu3_9;
//importする
import java.util.Scanner;
/*
 * クラス名:ensyu3_9
 * 概要  :演習3-9クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.07
 */
public class ensyu3_9 {
	/* 関数名：main
	 * 概要：2つの実数値を読み込んで、大きい値を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//画面に整数Aの入力を促す
		System.out.print("整数A：");
		//変数firstNumberにキーボードから入力した値を代入する
		double firstNumber = standardInput.nextDouble();
		//画面に整数Bの入力を促す
		System.out.print("整数B：");
		//変数secondNumberにキーボードから入力した値を代入する
		double secondNumber = standardInput.nextDouble();
		/* 大きい数字を表す変数largeNumberを生成し
		 * 変数firstNumber > 変数secondNumberならば変数firstNumberの値を代入
		 * そうでないならば、変数secondNumberの値を代入する
		 */
		double largeNumber = firstNumber > secondNumber ? firstNumber : secondNumber;
		//画面に大きい方の値を表示する
		System.out.println("大きい方の値は" + largeNumber + "です。");
		
	}

}
