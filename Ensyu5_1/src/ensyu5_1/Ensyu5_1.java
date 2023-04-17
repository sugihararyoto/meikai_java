//パッケージ名の宣言
package ensyu5_1;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu5_1
 * 概要  :演習5-1クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.17
 */
public class Ensyu5_1 {
	/*
	 * 関数名：main
	 * 概要：10進整数を読み込んで、その値を8進数と16進数で表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.17
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
			if (inputNumber < 0) {
				//画面に表示できない値が入力されました。と表示する
				System.out.println("表示できない値が入力されました。");
			}
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber < 0);
		
		//画面に入力した値を8進数で表示する
		System.out.printf("8進数では%oです。\n", inputNumber);
		//画面に入力した値を16進数で表示する
		System.out.printf("16進数では%xです。\n", inputNumber);
	}
}