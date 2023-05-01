//パッケージ名の宣言
package ensyu7_24;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_24
 * 概要  :演習7-24クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.01
 */
public class Ensyu7_24 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：arrayRmvOf
	 * 概要：配列aから要素a[idx]を削除した配列を返却するメソッド
	 * テキストによって、int[] arrayRmvOf (int[] a, int idx)は指定
	 * 引数：int[] a, idx
	 * 戻り値：arrayNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static int[] arrayRmvOf (int[] a, int idx) {
		//要素数を配列aの要素数から削除する要素数を引いた値とした配列arrayNumberを生成する
		int [] arrayNumber = new int [a.length - 1];
		/*
		 * 「削除する要素までの配列の値を代入する」
		 */
		for (int i = 0; i < idx ; i++) {
			//配列arrayNumberに配列aの値を代入する
			arrayNumber[i] = a[i];
		}
		/*
		 * 「削除する要素より後ろの全要素を1つ前方にずらす作業を行う」
		 */
		for (int i = idx; i < arrayNumber.length; i++) {
			//配列arrayNumberに、削除する要素の1つ後ろの要素の値を代入する
			arrayNumber [i] = a[i + 1];
		}
		//要素idxを削除した配列arrayNumberを返す
		return arrayNumber;
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
	 * 関数名：outputArray
	 * 概要：各要素の値を画面に表示するためのメソッド
	 * 引数：oneArray
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
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
	 * 概要：配列aから要素a[idx]を削除した配列を受け取り表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	public static void main(String[] args) {
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
		
		//変数deleteElementを生成し、0で初期化する
		int deleteElement = 0;
		/*
		 * 「削除する要素の入力を行う」
		 * while (deleteElement < 0 || deleteElement >= firstArray.length)
		 */
		do {
			//画面に削除する要素の入力を促す
			System.out.print("削除する要素：");
			//変数deleteElementにキーボードから入力した値を代入する
			deleteElement = standardInput.nextInt();
			//削除する要素が存在しない場合
			if (deleteElement < 0 || deleteElement >= firstArray.length) {
				//画面に存在する要素を入力してください。と表示する
				System.out.println("存在する要素を入力してください。");
			}
		//入力した値が存在しない要素のあいだdoからwhileまでを繰り返す
		} while (deleteElement < 0 || deleteElement >= firstArray.length);
		
		//配列secondArrayを生成し、メソッドarrayRmvOfの配列を受け取る
		int [] secondArray = arrayRmvOf(firstArray, deleteElement);
		
		//返却された配列を表示することを伝える
		System.out.print("返却された配列");
		//メソッドoutputArrayを呼び出し、配列secondArrayの要素の値を表示する
		outputArray(secondArray);
	}

}
