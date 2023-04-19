//パッケージ名の宣言
package ensyu6_11;
//importする
import java.util.Random;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu6_11
 * 概要  :演習6-11クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.19
 */
public class Ensyu6_11 {
	/*
	 * 関数名：main
	 * 概要：異なる要素が同じ値を持つことが無いように演習6-9の
	 * プログラムを書きかえる
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.19
	 */
	public static void main(String[] args) {
		//乱数を生成する準備
		Random randomNumber = new Random();
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//変数inputNumberを生成し、0で初期化する
		int inputNumber = 0; 
		
		//while (inputNumber <= 0 || 10 < inputNumber)の文までを実行する
		do {
			//画面に要素数の入力を促す
			System.out.print("要素数：");
			//変数inputNumberに、キーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
			//正ではない値が入力された場合
			if (inputNumber <= 0 || 10 < inputNumber) {
				//画面に1～10までの値を入力してください。と表示する
				System.out.println("1～10までの値を入力してください。");
			}
			
		//変数inputNumberの値が0以下か10より大きいあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0 || 10 < inputNumber);
		
		//int型で要素数が変数inputNumberの値の配列を生成する
		int [] arrayNumber = new int [inputNumber];
		
		/*
		 * 変数generateNumberを生成し、0で初期化する
		 * 変数generateNumberの値をインクリメントしながら
		 * 変数generateNumberの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int generateNumber = 0; generateNumber < inputNumber; generateNumber++) {
			//arrayNumber[generateNumber]に1~10の値をランダムに生成し、代入する
			arrayNumber[generateNumber] = randomNumber.nextInt(10) + 1;
			/*
			 * 変数resetNumberを生成し、0で初期化する
			 * 変数resetNumberの値をインクリメントしながら
			 * 変数resetNumberの値が変数generateNumberの値になるまで繰り返す
			 */
			for (int resetNumber = 0; resetNumber < generateNumber;resetNumber++) {
				/*
				 * arrayNumber[resetNumber]の値がarrayNumber[generateNumber]の値と
				 * 等しいあいだ繰り返す
				 */
				while (arrayNumber[resetNumber] == arrayNumber[generateNumber]) {
					//arrayNumber[generateNumber]に1~10の値をランダムに生成し、代入する
					arrayNumber[generateNumber] = randomNumber.nextInt(10) + 1;
					//resetNumberに0を代入する
					resetNumber = 0;
				}
			}
		}
		
		//画面に{と表示する
		System.out.print("{");
		
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
