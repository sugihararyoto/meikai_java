//パッケージ名の宣言
package ensyu3_2;
//importする
import java.util.Scanner;
/*
 * クラス名:ensyu3_2
 * 概要  :演習3-2クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.07
 */
public class ensyu3_2 {
	/* 関数名：main
	 * 概要：2つの正の整数値を読み込んで、後者が前者の約数であれば
	 * 「BはAの約数です。」と表示し、後者が前者の約数でなければ
	 * 「BはAの約数ではありません。」と表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args) {
		//キーボードからの読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//画面に整数Aの入力を促す
		System.out.print("整数A：");
		//変数inputNumberFirstにキーボードから入力した値を代入する
		int inputFirstNumber = standardInput.nextInt();
		//画面に整数Bの入力を促す
		System.out.print("整数B：");
		//変数inputNumberSecondにキーボードから入力した値を代入する
		int inputSecondNumber = standardInput.nextInt();
		//BがAの約数である場合
		if (inputFirstNumber % inputSecondNumber == 0)
			//画面にBはAの約数です。と表示する
			System.out.println("BはAの約数です。");
		//BがAの約数でない場合
		else
			//画面にBはAの約数ではありません。と表示する
			System.out.println("BはAの約数ではありません。");
	}

}
