//パッケージ名の宣言
package ensyu4_21_2;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_21_2
 * 概要  :演習4-21-2クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.14
 */
public class Ensyu4_21_2 {
	/*
	 * 関数名：main
	 * 概要：直角が右上側の直角三角形を表示する
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
		//画面に右上直角の三角形を表示します。と表示する
		System.out.println("右上直角の三角形を表示します。");
		
		//while (inputNumber <= 0)の文までを実行する
		do {
			//画面に段数の入力を促す
			System.out.print("段数は：");
			//変数inputNumberに、キーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
			//正ではない値が入力された場合
			if (inputNumber <= 0) {
				//画面に正ではない値が入力されました。と表示する
				System.out.println("正ではない値が入力されました。");
			}
			
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0);
		
		/*
		 * 変数rowNumberを生成し、0で初期化する
		 * 変数rowNumberの値を一つずつ増やしていき
		 * 変数rowNumberの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int rowNumber = 0;rowNumber < inputNumber;rowNumber++) {
			/*
			 * 変数blankNumberを生成し、0で初期化する
			 * 変数blankNumberの値を一つずつ増やしていき
			 * 変数blankNumberの値が変数rowNumberの値になるまで繰り返す
			 */
			for (int blankNumber = 0;blankNumber < rowNumber;blankNumber++) {
				//画面に半角スペースを表示する
				System.out.print(" ");
			
			}
			/*
			 * 変数columnNumberを生成し、変数inputNumberから
			 * 変数のrowNumberの値を引いた値で初期化する
			 * 変数columnNumberの値を一つずつ減らしていき
			 * 変数columnNumberの値が0になるまで繰り返す
			 */
			for (int columnNumber = inputNumber - rowNumber;0 < columnNumber;columnNumber--) {
				//画面に*を表示する
				System.out.print('*');
			}
			//改行する
			System.out.println();
			
		}
		
	}

}