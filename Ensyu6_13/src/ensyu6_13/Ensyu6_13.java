//パッケージ名の宣言
package ensyu6_13;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu6_13
 * 概要  :演習6-13クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.19
 */
public class Ensyu6_13 {
	/*
	 * 関数名：main
	 * 概要：配列aの全要素を配列bに対して逆順にコピーする
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.19
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
		
		//int型で要素数が変数inputNumberの値の配列を生成する(配列a)
		int [] firstNumber = new int [inputNumber];
		//int型で要素数が変数inputNumberの値の配列を生成する(配列b)
		int [] secondNumber = new int [inputNumber];
		
		/*
		 * 変数incrementNumberを生成し、0で初期化する
		 * 変数incrementNumberの値をインクリメントしながら
		 * 変数incrementNumberの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int incrementNumber = 0; incrementNumber < inputNumber;incrementNumber++) {
			//画面に(配列a)firstNumber[incrementNumber]の入力を促す
			System.out.print("a[" + incrementNumber + "] = ");
			//firstNumber[incrementNumber]にキーボードから入力した値を代入する
			firstNumber[incrementNumber] = standardInput.nextInt();
		}
		
		/*
		 * 変数incrementNumberを生成し、0で初期化する
		 * 変数incrementNumberの値をインクリメントしながら
		 * 変数incrementNumberの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int incrementNumber = 0; incrementNumber < inputNumber;incrementNumber++) {
			//配列bに配列aの値を代入する
			secondNumber[incrementNumber] = firstNumber[incrementNumber];
		}
		
		/*
		 * 変数incrementNumberを生成し、0で初期化する
		 * 変数incrementNumberの値をインクリメントしながら
		 * 変数incrementNumberの値が変数inputNumberを2で割った値になるまで繰り返す
		 */
		for (int incrementNumber = 0; incrementNumber < inputNumber / 2;incrementNumber++) {
			//変数changeNumberを生成し、firstNumber[incrementNumber]の値で初期化する
			int changeNumber = firstNumber[incrementNumber];
			/*
			 * secondNumber[incrementNumber]に
			 * secondNumber[inputNumber - incrementNumber - 1]の値を代入する
			 */
			secondNumber[incrementNumber] = secondNumber[inputNumber - incrementNumber - 1];
			//secondNumber[inputNumber - incrementNumber - 1]に変数changeNumberの値を代入する
			secondNumber[inputNumber - incrementNumber - 1] = changeNumber;
		}
		
		//画面に配列aの全要素を逆順で配列bにコピーしました。と表示する
		System.out.println("配列aの全要素を逆順で配列bにコピーしました。");
		
		/*
		 * 変数incrementNumberを生成し、0で初期化する
		 * 変数incrementNumberの値をインクリメントしながら
		 * 変数incrementNumberの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int incrementNumber = 0; incrementNumber < inputNumber;incrementNumber++) {
			//画面に(配列b)secondNumber[incrementNumber]の値を表示する
			System.out.println("b[" + incrementNumber + "] = " + secondNumber[incrementNumber]);
		}
		
		
	}

}
