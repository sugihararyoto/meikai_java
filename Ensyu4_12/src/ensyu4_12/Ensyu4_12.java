//パッケージ名の宣言
package ensyu4_12;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_12
 * 概要  :演習4-12クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.12
 */
public class Ensyu4_12 {
	/*
	 * 関数名：main
	 * 概要：
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.12
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//画面にカウントアップします。と表示する
		System.out.println("カウントアップします。");
		
		/*
		 * キーボードから入力した値を代入するための変数inputNumberを生成し、
		 * 0で初期化する
		 */
		int inputNumber = 0;
		
		//while (inputNumber <= 0)までの文を実行する
		do {
			//画面に正の整数値の入力を促す
			System.out.print("正の整数値：");
			//変数にキーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
			//正の整数値ではない数が入力された場合
			if(inputNumber < 1) {
				//画面に正ではない値が入力されました。と表示する
				System.out.println("正ではない値が入力されました。");
			}
		/*
		 * 変数inputNumberの値が0以下のあいだ
		 * doからwhileまでを繰り返す
		 */
		} while (inputNumber <= 0);
		
		/*
		 * 変数incrementNumberを生成し、0で初期化した後に一つずつ値を増やしながら
		 * 変数inputNumberの値になるまで繰り返す
		 */
		for (int incrementNumber = 0;incrementNumber <= inputNumber;incrementNumber++) {
			//画面に変数inputNumberの値を表示する
			System.out.println(incrementNumber);
		}
		
		
	}

}
