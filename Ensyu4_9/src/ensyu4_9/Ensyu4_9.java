//パッケージ名の宣言
package ensyu4_9;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_9
 * 概要  :演習4-9クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.12
 */
public class Ensyu4_9 {
	/*
	 * 関数名：main
	 * 概要：正の整数値nを読み込んで、1からnまでの積を求める
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.12
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//変数inputNumberを生成し、0で初期化する
		int inputNumber = 0;
		
		//whileまでの文を実行する
		do {
			//画面に入力を促す
			System.out.print("nの値(正の整数)：");
			//変数inputNumberにキーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
			//正ではない値が入力された場合
			if (inputNumber <= 0) {
				//画面に正ではない値が入力されました。と表示する
				System.out.println("正ではない値が入力されました。");
			}
			//合計がオーバーフローする値が入力された場合
			if (inputNumber >= 13) {
				//画面にオーバーフローしますと表示する
				System.out.println("その値ではオーバーフローします。");
				//変数inputNumberの値に0を代入する
				inputNumber = 0;
			}
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0);
		
		//変数sumNumberを生成し、1で初期化する
		int sumNumber = 1;
		//変数incrementNumberを生成し、1で初期化する
		int incrementNumber = 1;
		
		//変数incrementNumberの値が変数inputNumberの値以下のあいだ繰り返す
		while (incrementNumber <= inputNumber) {
			//変数sumNumberに変数incrementNumberの値をかける
			sumNumber *= incrementNumber;
			//変数incrementNumberの値をインクリメント（値を一つ増やす）
			incrementNumber++;
		}
		
		//画面に1から入力した値までの積を表示する
		System.out.println("1から" + inputNumber + "までの積は" + sumNumber + "です。");
		
	}

}
