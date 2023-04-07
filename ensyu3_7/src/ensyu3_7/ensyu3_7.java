//パッケージ名の宣言
package ensyu3_7;
//importする
import java.util.Scanner;
/*
 * クラス名:ensyu3_7
 * 概要  :演習3-7クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.07
 */
public class ensyu3_7 {
	/* 関数名：main
	 * 概要：正の整数値を読み込んで、それを3で割った値に応じて
	 * 「その値は3で割り切れます。」「その値を3で割った余りは1です。」
	 * 「その値を3で割った余りは2です。」と表示し
	 * 正ではない値を読み込んだ場合は「正でない値が入力されました」と表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args) {
		//キーボードを読み込む
		Scanner standardInput = new Scanner(System.in);
		//画面に整数値の入力を促す
		System.out.print("整数値：");
		//変数inputNumberにキーボードから入力した値を代入する
		int inputNumber = standardInput.nextInt();
		//変数inputNumberが0より大きい場合
		if (inputNumber > 0)
			//変数inputNumberが3で割り切れる場合
			if (inputNumber % 3 == 0)
				//画面にその値は3で割り切れます。と表示する
				System.out.println("その値は3で割り切れます。");
			//変数inputNumberを3で割ると余りが1になる場合
			else if (inputNumber % 3 == 1)
				//画面にその値を3で割った余りは1です。と表示する
				System.out.println("その値を3で割った余りは1です。");
			//変数inputNumberを3で割ると余りが2になる場合
			else
				//画面にその値を3で割った余りは2です。と表示する
				System.out.println("その値を3で割った余りは2です。");
		
		//変数inputNumberに正でない値が入力された場合
		else
			//画面に正でない値が入力されました。と表示する
			System.out.println("正でない値が入力されました。");
	}

}
