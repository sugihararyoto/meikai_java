//パッケージ名の宣言
package ensyu4_20;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_20
 * 概要  :演習4-20クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.13
 */
public class Ensyu4_20 {
	/*
	 * 関数名：main
	 * 概要：入力された値と同じ段の正方形を表示する
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
			//画面に正の整数値の入力を促す
			System.out.print("正の整数値を入力してください：");
			//変数inputNumberを生成し、キーボードから入力した値で初期化する
			inputNumber = standardInput.nextInt();
			//正ではない値が入力された場合
			if (inputNumber <= 0) {
				//画面に正ではない値が入力されました。と表示する
				System.out.println("正ではない値が入力されました。");
			}
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0);
		
		/*
		 * 変数incrementFirstNumberを生成し、1で初期化する
		 * 変数incrementFirstNumberの値を一つずつ増やしていき
		 * 変数incrementFirstNumberの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int incrementFirstNumber = 1;incrementFirstNumber <= inputNumber;incrementFirstNumber++) {
			/*
			 * 変数incrementSecondNumberを生成し、1で初期化する
			 * 変数incrementSecondNumberの値を一つずつ増やしていき
			 * 変数incrementSecondNumberの値が変数inputNumberの値になるまで繰り返す
			 */
			for (int incrementSecondNumber = 1;incrementSecondNumber <= inputNumber;incrementSecondNumber++) {
				//画面に*を表示する
				System.out.print('*');
			}
			//改行する
			System.out.println();
		}

	}

}
