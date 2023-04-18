//パッケージ名の宣言
package ensyu6_4;
//importする
import java.util.Random;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu6_4
 * 概要  :演習6-4クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.18
 */
public class Ensyu6_4 {
	/*
	 * 関数名：main
	 * 概要：List6-5を書きかえて、縦向きの棒グラフを表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.18
	 */
	public static void main(String[] args) {
		//乱数を生成する準備
		Random randomNumber = new Random();
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//変数inputNumberを生成し、0で初期化する
		int inputNumber = 0; 
		
		//while (inputNumber <= 0)の文までを実行する
		do {
			//画面に要素数の入力を促す
			System.out.print("要素数：");
			//変数inputNumberに、キーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
			//正ではない値が入力された場合
			if (inputNumber <= 0) {
				//画面に正ではない値が入力されました。と表示する
				System.out.println("正ではない値が入力されました。");
			}
			
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0);
		
		
		//int型で要素数が変数inputNumberの値の配列を生成する
		int [] arrayNumber = new int [inputNumber];
		
		/*
		 * 変数incrementNumberを生成し、0で初期化する
		 * 変数incrementNumberの値をインクリメントしながら
		 * 変数incrementNumberの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int incrementNumber = 0; incrementNumber < inputNumber; incrementNumber++) {
			//arrayNumber[incrementNumber]に1~10の数値をランダムに代入する
			arrayNumber[incrementNumber] = 1 + randomNumber.nextInt(10);
		}
		
		/*
		 * 変数incrementNumberを生成し、10で初期化する
		 * 変数incrementNumberの値をデクリメントしながら
		 * 変数outputNumberの値が0になるまで繰り返す
		 */
		for (int incrementNumber = 10; 0 < incrementNumber; incrementNumber--) {
			/*
			 * 変数outputNumberを生成し、0で初期化する
			 * 変数outputNumberの値をインクリメントしながら
			 * 変数outputNumberの値が変数inputNumberの値になるまで繰り返す
			 */
			for (int outputNumber = 0; outputNumber < inputNumber;outputNumber++) {
				//変数incrementNumberの値がarrayNumber[outputNumber]の値以下の場合
				if (incrementNumber <= arrayNumber[outputNumber]) {
					//画面に*を表示する
					System.out.print("* ");
				//変数incrementNumberの値がarrayNumber[outputNumber]の値以下でない場合
				} else {
					//画面に半角スペースを表示する
					System.out.print("  ");
				}
			}
			//改行する
			System.out.println();
		
		}
		
		/*
		 * 変数outputNumberを生成し、0で初期化する
		 * 変数outputNumberの値をインクリメントしながら
		 * 変数outputNumberの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int outputNumber = 0; outputNumber < inputNumber;outputNumber++) {
			//画面に-を表示する
			System.out.print('-');
		}
		/*
		 * 変数outputNumberを生成し、1で初期化する
		 * 変数outputNumberの値をインクリメントしながら
		 * 変数outputNumberの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int outputNumber = 1; outputNumber < inputNumber;outputNumber++) {
			//画面に-を表示する
			System.out.print('-');
		}
		
		//改行する
		System.out.println();
		
		/*
		 * 変数outputNumberを生成し、0で初期化する
		 * 変数outputNumberの値をインクリメントしながら
		 * 変数outputNumberの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int outputNumber = 0; outputNumber < inputNumber;outputNumber++) {
			//画面に変数outputNumberの値を10で割った余りを表示する
			System.out.print(outputNumber % 10 + " ");
		}
		
		
	}

}

	