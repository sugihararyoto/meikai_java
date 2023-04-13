//パッケージ名の宣言
package ensyu4_18;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_18
 * 概要  :演習4-18クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.13
 */
public class Ensyu4_18 {
	/*
	 * 関数名：main
	 * 概要：1から入力した値までの2乗値を表示する
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
			inputNumber = standardInput.nextInt();
			//正ではない値が入力された場合
			if (inputNumber <= 0) {
				//画面に正ではない値が入力されました。と表示する
				System.out.println("正ではない値が入力されました。");
			}
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0);
		
		//合計を表す変数sumNumberを生成し、0で初期化する
		int sumNumber = 0;
		
		/*
		 * 変数incrementNumberを生成し、1で初期化する
		 * 変数incrementNumberの値を一つずつ増やしていき
		 * 変数incrementNumberの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int incrementNumber = 1;incrementNumber <= inputNumber;incrementNumber++) {
			//変数sumNumberに変数incrementNumberを2乗した値を代入する
			sumNumber = incrementNumber * incrementNumber;
			//画面に2乗した数を表示する
			System.out.println(incrementNumber + "の2乗は"+ sumNumber);
			
		}
		
	}

}
