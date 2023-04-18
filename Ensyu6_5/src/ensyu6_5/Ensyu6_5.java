//パッケージ名の宣言
package ensyu6_5;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu6_5
 * 概要  :演習6-5クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.18
 */
public class Ensyu6_5 {
	/*
	 * 関数名：main
	 * 概要：配列の要素数と、個々の要素の値を読み込んで、
	 * 各要素の値を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.18
	 */
	public static void main(String[] args) {
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
		for (int incrementNumber = 0; incrementNumber < inputNumber;incrementNumber++) {
			//画面にarrayNumber[incrementNumber]の入力を促す
			System.out.print("arrayNumber[" + incrementNumber + "] = ");
			//arrayNumber[incrementNumber]にキーボードから入力した値を代入する
			arrayNumber[incrementNumber] = standardInput.nextInt();
		}
		//画面にarrayNumber = {と表示する
		System.out.print("arrayNumber = {");
		
		/*
		 * 変数incrementNumberを生成し、0で初期化する
		 * 変数incrementNumberの値をインクリメントしながら
		 * 変数incrementNumberの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int incrementNumber = 0; incrementNumber < inputNumber;incrementNumber++) {
			//画面にarrayNumber[incrementNumber]の値を表示する
			System.out.print(arrayNumber[incrementNumber]);
			/*
			 * 変数incrementNumberの値が
			 * 変数inputNumberの値から1を引いた値より小さい場合
			 */
			if (incrementNumber < inputNumber - 1) {
				//画面に,を表示する
				System.out.print(", ");
			}
		}
		
		//画面に}と表示する
		System.out.print("}");
	}

}
