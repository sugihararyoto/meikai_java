//パッケージ名の宣言
package ensyu4_1;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_1
 * 概要  :演習4-1クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.11
 */
public class Ensyu4_1 {
	/* 関数名：main
	 * 概要：月を1~12の整数値として読み込んで、
	 * それに対応する季節を表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.10
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//繰り返しのための変数retryNumberを生成する
		int retryNumber;
		//以降の文を実行する
		do {
			//画面に整数値の入力を促す
			System.out.print("整数値：");
			//変数inputNumberを生成し、キーボードから入力した値を代入する
			int inputNumber = standardInput.nextInt();
			//変数inputNumberの値が0より大きい場合
			if (inputNumber > 0) {
				//画面にその値は正です。と表示する
				System.out.println("その値は正です。");
			//変数inputNumberの値が0より小さい場合
			} else if (inputNumber < 0) {
				//画面にその値は負です。と表示する
				System.out.println("その値は負です。");
			//変数inputNumberの値が0の場合
			} else {
				//画面にその値は0です。と表示する
				System.out.println("その値は0です。");
			}
			//画面でもう一回操作を繰り返すかどうかを確認する
			System.out.print("もう一度？ 1…Yes/0…No：");
			//変数retryNumberにキーボードから入力された値を代入する
			retryNumber = standardInput.nextInt();
		//変数retryNumberの値が1のあいだdo以降を繰り返す
		} while (retryNumber == 1);

	}

}
