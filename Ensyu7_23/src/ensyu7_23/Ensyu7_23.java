//パッケージ名の宣言
package ensyu7_23;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_23
 * 概要  :演習7-23クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.28
 */
public class Ensyu7_23 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：arraySrchIdx
	 * 概要：値がxである全要素のインデックスを先頭から順に格納する
	 * テキストによって、int [] arraySrchIdx(int[] a, int x)は指定
	 * 引数：int[] a, x
	 * 戻り値：arrayNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.28
	 */
	static int [] arraySrchIdx(int[] a, int x) {
		//格納する要素の数を数えるための変数countNumberを生成し、0で初期化する
		int countNumber = 0;
		/*
		 * 「入力した値が配列aに何個含まれるかを調べる」
		 */
		for (int i = 0; i < a.length; i++) {
			//格納する値が見つかった場合
			if (a[i] == x) {
				//countNumberをインクリメントする
				countNumber++;
			}
		}
		//要素数を変数countNumberの値とした配列arrayNumberを生成する
		int [] arrayNumber = new int [countNumber];
		
		//変数incrementNumberを生成し、0で初期化する
		int incrementNumber = 0;
		/*
		 * 「配列arrayNumberにxの値があるインデックスを代入する」
		 */
		for (int i = 0; i < a.length; i++) {
			//格納する値が見つかった場合
			if (a[i] == x) {
				//arrayNumber[incrementNumber]にiの値を代入する
				arrayNumber[incrementNumber] = i;
				//incrementNumberをインクリメント
				incrementNumber++;
			}
		}
		//配列arrayNumberを返す
		return arrayNumber;
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
	 * 概要：値がxである全要素のインデックスを先頭から順に格納した配列
	 * を受け取り、表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.28
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
			//arrayNumber[i]にキーボードから入力した値を代入する
			firstArray[i] = standardInput.nextInt();
		}
		//格納する要素の値の入力を促す
		System.out.print("格納する要素の値：");
		//格納する値を表す変数storageNumberを生成し、キーボードから入力した値で初期化する
		int storageNumber = standardInput.nextInt();
		
		//配列secondArrayを生成し、メソッドarraySrchIdxの配列を受け取る
		int [] secondArray = arraySrchIdx(firstArray, storageNumber);
		
		//返却された配列を表示することを伝える
		System.out.print("返却された配列");
		//メソッドoutputArrayを呼び出し、配列secondArrayの要素の値を表示する
		outputArray(secondArray);
		
	}

}
