//パッケージ名の宣言
package ensyu4_22;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_22
 * 概要  :演習4-22クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.14
 */
public class Ensyu4_22 {
	/*
	 * 関数名：main
	 * 概要：入力された段数のピラミッドを表示する
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
		//画面にピラミッドを表示します。と表示する
		System.out.println("ピラミッドを表示します。");
		
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
		 * 変数rowNumberを生成し、1で初期化する
		 * 変数rowNumberの値を一つずつ増やしていき
		 * 変数rowNumberの値が変数inputNumberの値より大きくなるまで繰り返す 
		 */
		for (int rowNumber = 1;rowNumber <= inputNumber;rowNumber++) {
			/*
			 * 変数blankNumberを生成し、0で初期化する
			 * 変数blankNumberの値を一つずつ増やしていき
			 * 変数blankNumberの値が変数inputNumberの値から
			 * 変数rowNumberの値を引いた値になるまで繰り返す 
			 */
			for (int blankNumber = 0;blankNumber < inputNumber - rowNumber;blankNumber++) {
				//画面に半角スペースを表示する
				System.out.print(" ");
			}
			/*
			 * 変数columnNumberを生成し、0で初期化する
			 * 変数columnNumberの値を一つずつ増やしていき
			 * 変数columnNumberの値が変数rowNumberの値から
			 * 1を引いた値に2をかけて1を足した値になるまで繰り返す
			 */
			for (int columnNumber = 0;columnNumber < (rowNumber - 1) * 2 + 1;columnNumber++) {
				//画面に*を表示する
				System.out.print('*');
			}
			
			//改行する
			System.out.println();
			
		}
		
	}

}