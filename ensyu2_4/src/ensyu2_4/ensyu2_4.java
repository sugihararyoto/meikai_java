//パッケージ名の宣言
package ensyu2_4;
//importする
import java.util.Scanner;
/*
 * クラス名:ensyu2_4
 * 概要  :演習2-4クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.06
 */
public class ensyu2_4 {
	/* 関数名：main
	 * 概要：キーボードから入力した値に10を加減した値を出力する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args) {
		//キーボードからの読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//整数値の入力を促す
		System.out.print("整数値：");
		//変数inputNumberにキーボードから入力した値を代入する
		int inputNumber = standardInput.nextInt();
		//画面に変数inputNumberに代入した数値から10を加えた数を表示する
		System.out.println("10を加えた値は" + (inputNumber + 10) + "です。");
		//画面に変数inputNumberに代入した数値から10を減じた数を表示する
		System.out.println("10を減じた値は" + (inputNumber - 10) + "です。");
	}
}

