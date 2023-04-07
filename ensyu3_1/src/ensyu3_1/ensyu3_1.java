//パッケージ名の宣言
package ensyu3_1;
//importする
import java.util.Scanner;
/*
 * クラス名:ensyu3_1
 * 概要  :演習3-1クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.07
 */
public class ensyu3_1 {
	/* 関数名：main
	 * 概要：整数値を読み込んで絶対値を求めて表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args) {
		//キーボードからの読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//画面に整数値の入力を促す
		System.out.print("整数値：");
		//変数inputNumberにキーボードから入力した値を代入する
		int inputNumber = standardInput.nextInt();
		//inputNumberが0より小さい値の場合に実行する
		if (inputNumber < 0)
			//画面に読み込んだ整数値の絶対値を表示する
			System.out.println("その絶対値は" + -inputNumber + "です。");
		//(inputNumber < 0)に当てはまらない場合に実行する
		else
			//画面に読み込んだ整数値の絶対値を表示する
			System.out.println("その絶対値は" + inputNumber + "です。");
		
	}


}
