//パッケージ名の宣言
package ensyu4_17;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_17
 * 概要  :演習4-17クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.13
 */
public class Ensyu4_17 {
	/*
	 * 関数名：main
	 * 概要：List4-13を書きかえて、約数の表示が終わった後に、
	 * 約数の個数を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.13
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
			//変数inputNumberを生成し、キーボードから入力した値で初期化する
			inputNumber =standardInput.nextInt();
			//正ではない値が入力された場合
			if (inputNumber <= 0) {
				//画面に正ではない値が入力されました。と表示する
				System.out.println("正ではない値が入力されました。");
			}
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0);
		
		//変数divisorNumberを生成し、1で初期化する
		int divisorNumber = 0;
		/*
		 * 変数incrementNumberを生成し、1で初期化する
		 * 変数incrementNumberの値を一つずつ増やしていき
		 * 変数incrementNumberの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int incrementNumber = 1;incrementNumber <= inputNumber;incrementNumber++) {
			//
			if (inputNumber % incrementNumber == 0) {
				//画面に変数incrementNumberの値を表示する
				System.out.println(incrementNumber);
				//変数divisorNumberの値をインクリメント
				divisorNumber++;
			}
		}
		//画面に約数の個数を表示する
		System.out.println("約数は" + divisorNumber + "個です。");
		
	}

}
