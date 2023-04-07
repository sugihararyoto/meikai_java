//パッケージ名の宣言
package ensyu3_5;
//importする
import java.util.Scanner;
/*
 * クラス名:ensyu3_5
 * 概要  :演習3-5クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.07
 */
public class ensyu3_5 {
	/* 関数名：main
	 * 概要：正の整数値を読み込んで5で割り切れれば「その値は5で割り切れます。」
	 * そうでなければ、「その値は5で割り切れません。」と表示し
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
			//変数inputNumberが5で割り切れる場合
			if (inputNumber % 5 == 0)
				//画面にその値は5で割り切れます。と表示する
				System.out.println("その値は5で割り切れます。");
			//変数inputNumberが5で割り切れない場合
			else
				//画面にその値は5で割り切れません。と表示する
				System.out.println("その値は5で割り切れません。");
		//変数inputNumberに正でない値が入力された場合
		else
			//画面に正でない値が入力されました。と表示する
			System.out.println("正でない値が入力されました。");
		
	}

}
