//パッケージ名の宣言
package ensyu7_30;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_30
 * 概要  :演習7-30クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.01
 */
public class Ensyu7_30 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：min
	 * 概要：整数a,bの最小値を求めるメソッド
	 * テキストによって、int min(int a, int b)は指定
	 * 引数：a, b
	 * 戻り値：minimumNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static int min(int a, int b) {
		//最小値を表す変数minimumNumberを生成し、0で初期化する
		int minimumNumber = 0;
		//aの値がbの値よりも大きい場合
		if (a > b) {
			//変数minimumNumberにbの値を代入する
			minimumNumber = b;
		//aの値がbの値よりも小さい場合
		} else {
			//変数minimumNumberにaの値を代入する
			minimumNumber = a;
		}
		//最小値が代入されている変数minimumNumberを返す
		return minimumNumber;
	}
	/*
	 * 関数名：min
	 * 概要：整数a,b,cの最小値を求めるメソッド
	 * テキストによって、int min(int a, int b, int c)は指定
	 * 引数：a, b, c
	 * 戻り値：minimumNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static int min(int a, int b, int c) {
		//最小値を表す変数minimumNumberを生成し、aの値で初期化する
		int minimumNumber = a;
		//bの値が変数minimumNumberの値よりも小さい場合
		if (b < minimumNumber) {
			//変数minimumNumberにbの値を代入する
			minimumNumber = b;
		}
		//cの値が変数minimumNumberの値よりも小さい場合
		if (c < minimumNumber) {
			//変数minimumNumberにcの値を代入する
			minimumNumber = c;
		}
		//最小値が代入されている変数minimumNumberを返す
		return minimumNumber;
	}
	/*
	 * 関数名：min
	 * 概要：配列aの要素の最小値を求めるメソッド
	 * テキストによって、int min(int[] a)は指定
	 * 引数：int[] a
	 * 戻り値：minimumNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static int min(int[] a) {
		//最小値を表す変数minimumNumberを生成し、0で初期化する
		int minimumNumber = a[0];
		/*
		 * 「配列の要素の最小値を求める」
		 * 変数iを生成し、1で初期化する、iの値をインクリメントし、
		 * iの値がa.lengthになるまで繰り返す
		 */
		for (int i = 1; i < a.length; i++) {
			//a[i]の値がminimumNumberより小さい場合
			if (a[i] < minimumNumber) {
				//変数minimumNumberにa[i]の値を代入する
				minimumNumber = a[i];
			}
		}
		//最小値が代入されている変数minimumNumberを返す
		return minimumNumber;
	}
	/*
	 * 関数名：inputElement
	 * 概要：要素数を入力するためのメソッド
	 * 引数：なし
	 * 戻り値：inputNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static int inputElement() {
		//変数inputNumberを生成し、0で初期化する
		int inputNumber = 0;
		/*
		 * 「要素数の入力を行う」
		 * while (inputNumber <= 0)の文までを実行する
		 */
		do {
			//画面に要素数の入力を促す
			System.out.print("要素数：");
			//変数inputNumberに、キーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
			//0以下の値が入力された場合
			if (inputNumber <= 0) {
				//画面に1以上の値を入力してください。と表示する
				System.out.println("1以上の値を入力してください。");
			}
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0);
		//inputNumberを返す
		return inputNumber;
	}
	/*
	 * 関数名：main
	 * 概要：多重定義されたメソッド群から最小値を受け取って表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	public static void main(String[] args) {
		//画面にxの値の入力を促す
		System.out.print("xの値：");
		//変数firstNumberを生成し、キーボードから入力した値で初期化する
		int firstNumber = standardInput.nextInt();
		//画面にyの値の入力を促す
		System.out.print("yの値：");
		//変数secondNumberを生成し、キーボードから入力した値で初期化する
		int secondNumber = standardInput.nextInt();
		//画面にzの値の入力を促す
		System.out.print("zの値：");
		//変数thirdNumberを生成し、キーボードから入力した値で初期化する
		int thirdNumber = standardInput.nextInt();
		
		//配列aの要素数の入力を促す
		System.out.print("配列aの");
		//変数firstElementを生成し、メソッドinputElementから受け取った値で初期化する
		int firstElement = inputElement();
		//要素数がfirstElementの値の配列firstArrayを生成する
		int [] firstArray = new int [firstElement];
		
		/*
		 * 「全要素の値を入力する」
		 * 変数iを生成し、0で初期化する、iの値をインクリメントし、
		 * iの値が変数firstElementの値になるまで繰り返す
		 */
		for (int i = 0; i < firstElement; i++) {
			//配列の要素の値の入力を促す
			System.out.print("a[" + i + "]：");
			//firstArray[i]にキーボードから入力した値を代入する
			firstArray[i] = standardInput.nextInt();
		}
		//画面にx,yの最小値を表示する
		System.out.println("x, yの最小値は" + min(firstNumber, secondNumber) + "です。");
		//画面にx,y,zの最小値を表示する
		System.out.println("x, y, zの最小値は" + min(firstNumber, secondNumber, thirdNumber) + "です。");
		//画面に配列aの最小値を表示する
		System.out.println("配列aの最小値は" + min(firstArray) + "です。");
	}

}
