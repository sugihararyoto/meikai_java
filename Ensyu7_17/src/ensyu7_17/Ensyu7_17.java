//パッケージ名の宣言
package ensyu7_17;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_17
 * 概要  :演習7-17クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.27
 */
public class Ensyu7_17 {
	//線形探索の判定をするための変数JUDGMENT_NUMBERを生成し、-1で初期化する
	static final int JUDGMENT_NUMBER = -1;
	/*
	 * 関数名：linearSearchR
	 * 概要：配列aの要素からkeyと一致する最も末尾側の要素の線形探索を行う
	 * テキストによって、int linearSearchR(int[] a, int key)は指定
	 * 引数：int [] a, key
	 * 戻り値：returnNumber（-1か、該当する配列のインデックス）
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.27
	 */
	static int linearSearchR(int[] a, int key) {
		//変数returnNumberを生成し、JUDGMENT_NUMBERで初期化する
		int returnNumber = JUDGMENT_NUMBER;
		/*
		 * 「配列aの要素からkeyと一致する最も末尾側の要素の線形探索を行う」
		 * 変数iを生成し、a.lengthからインデックスと合わせるために
		 * 1を引いた値で初期化する
		 * 変数iの値をデクリメントしながら
		 * 変数iの値が0より小さくなるまで繰り返す
		 */
		for (int i = a.length - 1; 0 <= i;i--) {
			//a[i]の値がkeyの値と等しい場合
			if (a[i] == key) {
				//変数returnNumberにiの値を代入する
				returnNumber = i;
				//繰り返しから抜ける
				break;
			}
		}
		//returnNumberを返す
		return returnNumber;
	}
	
	/*
	 * 関数名：main
	 * 概要：線形探索した結果を受け取るためのメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.27
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
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
		 * 「全要素の値を入力する」
		 * 変数iを生成し、0で初期化する、iの値をインクリメントし、
		 * iの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int i = 0; i < inputNumber; i++) {
			//配列の要素の値の入力を促す
			System.out.print("a[" + i + "]：");
			//arrayNumber[i]にキーボードから入力した値を代入する
			arrayNumber[i] = standardInput.nextInt();
		}
		//画面に探す数値の入力を促す
		System.out.print("探す数値：");
		//変数keyNumberを生成し、キーボードから入力した値で初期化する
		int keyNumber = standardInput.nextInt();
		
		/*
		 * メソッドreceiveNumberの値を受け取るための変数receiveNumberを生成し、
		 * 受け取った値で初期化する
		 */
		int receiveNumber = linearSearchR(arrayNumber, keyNumber);
		
		//変数receiveNumberの値がJUDGMENT_NUMBERではない場合
		if (receiveNumber != JUDGMENT_NUMBER) {
			//画面に入力した値と同じ値を持つ要素を表示する
			System.out.println("それはarrayNumber[" + receiveNumber + "]にあります。");
		//変数receiveNumberの値がJUDGMENT_NUMBERの場合
		} else {
			//画面にそれはありません。と表示する
			System.out.println("それはありません。");
		}
		
	}

}
