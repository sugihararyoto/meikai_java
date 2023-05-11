//パッケージ名の宣言
package ensyu10_3;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu10_3
 * 概要  :演習10-3クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.11
 */
public class Ensyu10_3 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
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
	 * 概要：MinMaxをテストするためのメインのメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.11
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
		System.out.println("x, yの最小値は" + MinMax.findMinimum(firstNumber, secondNumber) + "です。");
		//画面にx,y,zの最小値を表示する
		System.out.println("x, y, zの最小値は" + MinMax.findMinimum(firstNumber, secondNumber, thirdNumber) + "です。");
		//画面に配列aの最小値を表示する
		System.out.println("配列aの最小値は" + MinMax.findMinimum(firstArray) + "です。");
		//改行する
		System.out.println();
		//画面にx,yの最大値を表示する
		System.out.println("x, yの最大値は" + MinMax.findMaximum(firstNumber, secondNumber) + "です。");
		//画面にx,y,zの最大値を表示する
		System.out.println("x, y, zの最大値は" + MinMax.findMaximum(firstNumber, secondNumber, thirdNumber) + "です。");
		//画面に配列aの最大値を表示する
		System.out.println("配列aの最大値は" + MinMax.findMaximum(firstArray) + "です。");
	}

}
