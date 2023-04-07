//パッケージ名の宣言
package ensyu2_8;
//importする
import java.util.Random;
//キーボードからの入力を行う決まり文句をクラスの前に設置する
import java.util.Scanner;
/*
 * クラス名:ensyu2_8
 * 概要  :演習2-8クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.06
 */
public class ensyu2_8 {
	/* 関数名：main
	 * 概要：キーボードから読み込んだ整数値±5の範囲の整数値を
	 * ランダムに生成して表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args) {
		//乱数を生成する準備
		Random randomNumber = new Random();
		//キーボードからの読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//画面に整数値の入力を促す
		System.out.print("整数値：");
		//変数firstNumberにキーボードから入力した値を代入する
		int firstNumber = standardInput.nextInt();
		//変数randomNumber-に5~5の範囲の値を生成し代入する
		int secondNumber = randomNumber.nextInt(11) - 5;
		//画面にキーボードから読み込んだ整数値±5の範囲の整数値を表示する
		System.out.println("その値の±5の乱数を生成しました。それは" + (firstNumber + secondNumber) + ("です。"));
	}

}
