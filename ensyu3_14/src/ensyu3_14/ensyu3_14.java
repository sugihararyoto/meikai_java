//パッケージ名の宣言
package ensyu3_14;
//importする
import java.util.Scanner;
/*
 * クラス名:ensyu3_14
 * 概要  :演習3-14クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.10
 */
public class ensyu3_14 {
	/* 関数名：main
	 * 概要：2つの整数値を読み込んで、小さいほうの値と大きいほうの値の
	 * 両方を表示し、2つの整数値が等しい場合は、「二つの値は同じです。」と表示する
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
		//同じ値の場合
		if(firstNumber == secondNumber) {
			//画面に二つの値は同じです。と表示する
			System.out.println("二つの値は同じです。");
		//同じ値ではない場合
		} else {
			/* 小さい数字を表す変数minimumNumberを生成し
			 * 変数firstNumberと変数secondNumberのうち
			 * 小さいほうの値を変数minimumNumberに代入する
			 */
			int minimumNumber = (firstNumber < secondNumber ? firstNumber : secondNumber);
			/* 大きい数字を表す変数maximumNumberを生成し
			 * 変数firstNumberと変数secondNumberのうち
			 * 大きいほうの値を変数maximumNumberに代入する
			 */
			int maximumNumber = (firstNumber > secondNumber ? firstNumber : secondNumber);
			//画面に小さいほうの値を表示する
			System.out.println("小さいほうの値は" + minimumNumber + "です。");
			//画面に大きいほうの値を表示する
			System.out.println("大きいほうの値は" + maximumNumber + "です。");
		}
		
	}

}
