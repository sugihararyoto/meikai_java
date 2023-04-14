//パッケージ名の宣言
package ensyu4_21_3;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_21_3
 * 概要  :演習4-21-3クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.14
 */
public class Ensyu4_21_3 {
	/*
	 * 関数名：main
	 * 概要：直角が右下側の直角三角形を表示する
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
		//画面に右下直角の三角形を表示します。と表示する
		System.out.println("右下直角の三角形を表示します。");
		
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
		 * 変数rowNumberを生成し、変数inputNumberの値
		 * から1を引いた値で初期化する
		 * 変数rowNumberの値を一つずつ減らしていき
		 * 変数rowNumberの値が0より小さくなるまで繰り返す
		 */
		for (int rowNumber = inputNumber - 1;0 <= rowNumber;rowNumber--) {
			/*
			 * 変数blankNumberを生成し、変数rowNumberの値で初期化する
			 * 変数blankNumberの値を一つずつ減らしていき
			 * 変数blankNumberの値が0なるまで繰り返す 
			 */
			for (int blankNumber = rowNumber;0 < blankNumber;blankNumber--) {
				//画面に半角スペースを表示する
				System.out.print(" ");
			}
			/*
			 * 変数columnNumberを生成し、0で初期化する
			 * 変数columnNumberの値を一つずつ増やしていき
			 * 変数columnNumberの値が変数inputNumberの値から
			 * 変数rowNumberの値を引いた値になるまで繰り返す
			 */
			for (int columnNumber = 0;columnNumber < inputNumber - rowNumber;columnNumber++) {
				//画面に*を表示する
				System.out.print('*');
			}
			//改行する
			System.out.println();
			
		}
		
	}

}