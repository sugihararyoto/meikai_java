package ensyu7_16;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_16
 * 概要  :演習7-16クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.27
 */
public class Ensyu7_16 {
	/*
	 * 関数名：minOf
	 * 概要：テキストによって、int minOf(int [] a)は指定
	 * 引数：int [] a
	 * 戻り値：minimumNumber（最小値）
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.27
	 */
	static int minOf(int [] a) {
		//合計を表す変数sumNumberを生成し、0で初期化する
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
		//minimumNumberを返す
		return minimumNumber;
	}
	/*
	 * 関数名：main
	 * 概要：配列aの全要素の最小値を表示する
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
		//画面に配列aの全要素の合計を表示する
		System.out.println("配列aの要素の最小値 = " + minOf(arrayNumber));
		
	}

}