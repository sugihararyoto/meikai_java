//パッケージ名の宣言
package ensyu5_2;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu5_2
 * 概要  :演習5-2クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.17
 */
public class Ensyu5_2 {
	/*
	 * 関数名：main
	 * 概要：float型の変数とdouble型の変数に値を読み込んで表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.17
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//画面にxはfloat型で、yはdouble型です。と表示する
		System.out.println("xはfloat型で、yはdouble型です。");
		//画面に入力を促す
		System.out.print("x：");
		//変数firstNumberを生成し、キーボードから入力した値で初期化する
		float firstNumber = standardInput.nextFloat();
		//画面に入力を促す
		System.out.print("y：");
		//変数secondNumberを生成し、キーボードから入力した値で初期化する
		double secondNumber = standardInput.nextDouble();
		
		//画面に変数firstNumberの値を表示する
		System.out.println("x = " + firstNumber);
		//画面に変数secondNumberの値を表示する
		System.out.println("y = " + secondNumber);
		
	}

}
