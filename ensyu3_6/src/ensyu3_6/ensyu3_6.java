//パッケージ名の宣言
package ensyu3_6;
//importする
import java.util.Scanner;
/*
 * クラス名:ensyu3_6
 * 概要  :演習3-6クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.07
 */
public class ensyu3_6 {
	/* 関数名：main
	 * 概要：正の整数値を読み込んで10の倍数であれば「その値は10の倍数です。」
	 * そうでなければ、「その値は10の倍数ではありません。」と表示し
	 * 正でない値を読み込んだ時は「正でない値が入力されました。」と表示する
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
		//変数inputNumberが0より大きい場合
		if (inputNumber > 0)
			//変数inputNumberが10の倍数である場合
			if (inputNumber % 10 == 0)
				//画面にその値は10の倍数です。と表示する
				System.out.println("その値は10の倍数です。");
			//変数inputNumberが10の倍数ではない場合
			else
				//画面にその値は10の倍数ではありません。と表示する
				System.out.println("その値は10の倍数ではありません。");
		//変数inputNumberに正でない値が入力された場合
		else
			//画面に正でない値が入力されました。と表示する
			System.out.println("正でない値が入力されました。");
	}

}
