//パッケージ名の宣言
package ensyu7_21;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_21
 * 概要  :演習7-21クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.28
 */
public class Ensyu7_21 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：aryExchng
	 * 概要：配列aと配列bの全要素の値を交換する
	 * テキストによって、void aryExchng(int[] a, int[] b)は指定
	 * 引数：int[] a, int[] b
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.28
	 */
	static void aryExchng(int[] a, int[] b) {
		//交換を行うための変数exchangeNumberを生成し、0で初期化する
		int exchangeNumber = 0;
		/*
		 * 「配列aの要素数が配列bの要素数より小さい場合」
		 * 小さい方の配列の要素数から配列を生成し、交換作業を行う
		 */
		if (a.length < b.length) {
			//exchangeNumberに配列aの要素数を代入する
			exchangeNumber = a.length;
			//要素数をexchangeNumberの値にした配列arrayNumberを生成する
			int [] arrayNumber = new int [exchangeNumber];
			//全要素の交換を行うための交換作業を行う
			for (int i = 0; i < a.length; i++) {
				//arrayNumber[i]にa[i]の値を代入する
				arrayNumber[i] = a[i];
			}
			//全要素の交換を行うための交換作業を行う
			for (int i = 0; i < a.length; i++) {
				//a[i]にb[i]の値を代入する
				a[i] = b[i];
			}
			//全要素の交換を行うための交換作業を行う
			for (int i = 0; i < a.length; i++) {
				//b[i]にarrayNumber[i]の値を代入する
				b[i] = arrayNumber[i];
			}
		/*
		 * 「配列aの要素数が配列bの要素数より大きい場合」
		 * 小さい方の配列の要素数から配列を生成し、交換作業を行う
		 */
		} else if (a.length > b.length) {
			//exchangeNumberに配列bの要素数を代入する
			exchangeNumber = b.length;
			//要素数をexchangeNumberの値にした配列arrayNumberを生成する
			int [] arrayNumber = new int [exchangeNumber];
			//全要素の交換を行うための交換作業を行う
			for (int i = 0; i < b.length; i++) {
				//arrayNumber[i]にb[i]の値を代入する
				arrayNumber[i] = b[i];
			}
			//全要素の交換を行うための交換作業を行う
			for (int i = 0; i < b.length; i++) {
				//b[i]にa[i]の値を代入する
				b[i] = a[i];
			}
			//全要素の交換を行うための交換作業を行う
			for (int i = 0; i < b.length; i++) {
				//a[i]にarrayNumber[i]の値を代入する
				a[i] = arrayNumber[i];
			}
		/*
		 * 「2つの配列の要素数が等しい場合」
		 * 2つの配列の要素を入れ替える
		 */
		} else {
			//exchangeNumberに配列aの要素数を代入する
			exchangeNumber = a.length;
			//要素数をexchangeNumberの値にした配列arrayNumberを生成する
			int [] arrayNumber = new int [exchangeNumber];
			//全要素の交換を行うための交換作業を行う
			for (int i = 0; i < a.length; i++) {
				//arrayNumber[i]にa[i]の値を代入する
				arrayNumber[i] = a[i];
			}
			//全要素の交換を行うための交換作業を行う
			for (int i = 0; i < a.length; i++) {
				//a[i]にb[i]の値を代入する
				a[i] = b[i];
			}
			//全要素の交換を行うための交換作業を行う
			for (int i = 0; i < a.length; i++) {
				//b[i]にarrayNumber[i]の値を代入する
				b[i] = arrayNumber[i];
			}
		}
	}
	/*
	 * 関数名：inputElement
	 * 概要：要素数を入力するためのメソッド
	 * 引数：なし
	 * 戻り値：inputNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.28
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
	 * 関数名：outputArray
	 * 概要：各要素の値を画面に表示するためのメソッド
	 * 引数：oneArray
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.28
	 */
	static void outputArray(int [] oneArray) {
		//画面に= {を表示する
		System.out.print(" = {");
		/*
		 * 「配列oneArrayの要素の値を表示する」
		 * 変数iを生成し、0で初期化する
		 * 変数iの値をインクリメントしながら
		 * 変数iの値が変数oneArray.lengthの値になるまで繰り返す
		 */
		for (int i = 0; i < oneArray.length;i++) {
			//画面にoneArray[i]の値を表示する
			System.out.print(oneArray[i]);
			//変数iの値が変数oneArray.lengthの値から1を引いた値より小さい場合
			if (i < oneArray.length - 1) {
				//画面に,を表示する
				System.out.print(", ");
			}
		}
		//画面に}と表示する
		System.out.print("}");
	}
	/*
	 * 関数名：main
	 * 概要：配列aと配列bの全要素を交換し、それぞれの配列を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.28
	 */
	public static void main(String[] args) {
		//配列aの要素数の入力を促す
		System.out.println("配列aの要素数を入力してください。");
		//変数firstElementを生成し、メソッドinputElementから受け取った値で初期化する
		int firstElement = inputElement();
		//要素数がfirstElementの値の配列firstArray(配列a)を生成する
		int [] firstArray = new int [firstElement];
		
		/*
		 * 「全要素の値を入力する」
		 * 変数iを生成し、0で初期化する、iの値をインクリメントし、
		 * iの値が変数firstElementの値になるまで繰り返す
		 */
		for (int i = 0; i < firstElement; i++) {
			//配列の要素の値の入力を促す
			System.out.print("a[" + i + "]：");
			//arrayNumber[i]にキーボードから入力した値を代入する
			firstArray[i] = standardInput.nextInt();
		}
		//配列bの要素数の入力を促す
		System.out.println("配列bの要素数を入力してください。");
		//変数secondElementを生成し、メソッドinputElementから受け取った値で初期化する
		int secondElement = inputElement();
		//要素数がsecondElementの値の配列secondArray(配列b)を生成する
		int [] secondArray = new int [secondElement];
		
		/*
		 * 「全要素の値を入力する」
		 * 変数iを生成し、0で初期化する、iの値をインクリメントし、
		 * iの値が変数secondElementの値になるまで繰り返す
		 */
		for (int i = 0; i < secondElement; i++) {
			//配列の要素の値の入力を促す
			System.out.print("b[" + i + "]：");
			//secondArray[i]にキーボードから入力した値を代入する
			secondArray[i] = standardInput.nextInt();
		}
		
		//メソッドaryExchngを呼び出す
		aryExchng(firstArray, secondArray);
		
		//配列aを表示することを伝える
		System.out.print("a");
		//メソッドoutputArrayを呼び出し、配列firstArrayの要素の値を表示する
		outputArray(firstArray);
		
		//配列bを表示することを伝える
		System.out.print("\nb");
		//メソッドoutputArrayを呼び出し、配列secondArrayの要素の値を表示する
		outputArray(secondArray);
	}

}
