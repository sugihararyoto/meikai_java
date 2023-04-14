//パッケージ名の宣言
package ensyu4_24;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_24
 * 概要  :演習4-24クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.14
 */
public class Ensyu4_24 {
	/*
	 * 関数名：main
	 * 概要：正の整数値を読み込み、それが素数であるかどうかを判定する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.14
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//変数inputNumberを生成し、0で初期化する
		int inputNumber = 0;
		
		//while (inputNumber <= 0)の文までを実行する
		do {
			//画面に整数値の入力を促す
			System.out.print("整数値：");
			//変数inputNumberに、キーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
			//正ではない値が入力された場合
			if (inputNumber <= 0) {
				//画面に正ではない値が入力されました。と表示する
				System.out.println("正ではない値が入力されました。");
			}
			
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0);
		
		//約数を表す変数divisorNumberを生成し、0で初期化する
		int divisorNumber = 0;
		/*
		 * 変数incrementNumberを生成し、1で初期化する
		 * 変数incrementNumberの値を一つずつ増やしていき
		 * 変数incrementNumberの値が変数inputNumberの値より大きくなるまで繰り返す
		 */
		for (int incrementNumber = 1;incrementNumber <= inputNumber;incrementNumber++) {
			//変数inputNumberの値を変数incrementNumberの値で割った余りが0の場合
			if (inputNumber % incrementNumber == 0) {
				//変数divisorNumberの値をインクリメント
				divisorNumber++;
			}
		}
		//変数divisorNumberの値（約数の個数）が2の場合
		if (divisorNumber == 2) {
			//画面にその数は素数です。と表示する
			System.out.println("その数は素数です。");
		//変数divisorNumberの値（約数の個数）が2以外の場合
		} else {
			//画面にその数は素数ではありません。と表示する
			System.out.println("その数は素数ではありません。");
		}
		
	}

}
