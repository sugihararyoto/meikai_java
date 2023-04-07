//パッケージ名の宣言
package ensyu3_3;
//importする
import java.util.Scanner;
/*
 * クラス名:ensyu3_3
 * 概要  :演習3-3クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.07
 */
public class ensyu3_3 {
	/* 関数名：main
	 * 概要：テキストのList3-5の最後のelseを
	 * else if (n == 0)に変更したらどうなるかを検証する
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
		//変数inputNumberが正である場合に実行する
		if (inputNumber > 0)
			//画面にその値は正です。と表示する
			System.out.println("その値は正です。");
		//変数inputNumberが負である場合に実行する
		else if (inputNumber < 0)
			//画面にその値は負です。と表示する
			System.out.println("その値は負です。");
		//変数inputNumberが0である場合に実行する
		else if (inputNumber == 0)
			//画面にその値は0です。と表示する
			System.out.println("その値は0です。");
		
	}

}
