//パッケージ名の宣言
package ensyu10_3;
/*
 * クラス名:MinMax
 * 概要  :2値、3値、配列の最小値、最大値を求めるメソッドを
 * 集めたユーティリティクラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.11
 */
public class MinMax {
	/*
	 * 関数名：findMinimum
	 * 概要：2つの整数の最小値を求めるメソッド
	 * 引数：firstNumber, secondNumber
	 * 戻り値：minimumNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.11
	 */
	public static int findMinimum(int firstNumber, int secondNumber) {
		//最小値を表す変数minimumNumberを生成し、0で初期化する
		int minimumNumber = 0;
		//firstNumberの値がsecondNumberの値よりも大きい場合
		if (firstNumber > secondNumber) {
			//変数minimumNumberにsecondNumberの値を代入する
			minimumNumber = secondNumber;
		//firstNumberの値がsecondNumberの値よりも小さい場合
		} else {
			//変数minimumNumberにfirstNumberの値を代入する
			minimumNumber = firstNumber;
		}
		//最小値が代入されている変数minimumNumberを返す
		return minimumNumber;
	}
	/*
	 * 関数名：findMinimum
	 * 概要：3つの整数の最小値を求めるメソッド
	 * 引数：firstNumber, secondNumber, thirdNumber
	 * 戻り値：minimumNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	public static int findMinimum(int firstNumber, int secondNumber, int thirdNumber) {
		//最小値を表す変数minimumNumberを生成し、firstNumberの値で初期化する
		int minimumNumber = firstNumber;
		//secondNumberの値が変数minimumNumberの値よりも小さい場合
		if (secondNumber < minimumNumber) {
			//変数minimumNumberにsecondNumberの値を代入する
			minimumNumber = secondNumber;
		}
		//thirdNumberの値が変数minimumNumberの値よりも小さい場合
		if (thirdNumber < minimumNumber) {
			//変数minimumNumberにthirdNumberの値を代入する
			minimumNumber = thirdNumber;
		}
		//最小値が代入されている変数minimumNumberを返す
		return minimumNumber;
	}
	/*
	 * 関数名：findMinimum
	 * 概要：配列の要素の最小値を求めるメソッド
	 * 引数：int[] firstArray
	 * 戻り値：minimumNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	public static int findMinimum(int[] firstArray) {
		//最小値を表す変数minimumNumberを生成し、firstArray[0]で初期化する
		int minimumNumber = firstArray[0];
		/*
		 * 「配列の要素の最小値を求める」
		 * 変数iを生成し、1で初期化する、iの値をインクリメントし、
		 * iの値がfirstArray.lengthになるまで繰り返す
		 */
		for (int i = 1; i < firstArray.length; i++) {
			//firstArray[i]の値がminimumNumberより小さい場合
			if (firstArray[i] < minimumNumber) {
				//変数minimumNumberにfirstArray[i]の値を代入する
				minimumNumber = firstArray[i];
			}
		}
		//最小値が代入されている変数minimumNumberを返す
		return minimumNumber;
	}
	
	
	/*
	 * 関数名：findMaximum
	 * 概要：2つの整数の最大値を求めるメソッド
	 * 引数：firstNumber, secondNumber
	 * 戻り値：maximumNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.11
	 */
	public static int findMaximum(int firstNumber, int secondNumber) {
		//最大値を表す変数maximumNumberを生成し、0で初期化する
		int maximumNumber = 0;
		//firstNumberの値がsecondNumberの値よりも小さい場合
		if (firstNumber < secondNumber) {
			//変数maximumNumberにsecondNumberの値を代入する
			maximumNumber = secondNumber;
		//firstNumberの値がsecondNumberの値よりも大きい場合
		} else {
			//変数maximumNumberにfirstNumberの値を代入する
			maximumNumber = firstNumber;
		}
		//最大値が代入されている変数maximumNumberを返す
		return maximumNumber;
	}
	/*
	 * 関数名：findMaximum
	 * 概要：3つの整数の最大値を求めるメソッド
	 * 引数：firstNumber, secondNumber, thirdNumber
	 * 戻り値：maximumNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	public static int findMaximum(int firstNumber, int secondNumber, int thirdNumber) {
		//最小値を表す変数maximumNumberを生成し、firstNumberの値で初期化する
		int maximumNumber = firstNumber;
		//secondNumberの値が変数maximumNumberの値よりも大きい場合
		if (secondNumber > maximumNumber) {
			//変数maximumNumberにsecondNumberの値を代入する
			maximumNumber = secondNumber;
		}
		//thirdNumberの値が変数maximumNumberの値よりも大きい場合
		if (thirdNumber > maximumNumber) {
			//変数maximumNumberにthirdNumberの値を代入する
			maximumNumber = thirdNumber;
		}
		//最小値が代入されている変数maximumNumberを返す
		return maximumNumber;
	}
	/*
	 * 関数名：findMaximum
	 * 概要：配列の要素の最大値を求めるメソッド
	 * 引数：int[] firstArray
	 * 戻り値：maximumNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	public static int findMaximum(int[] firstArray) {
		//最大値を表す変数maximumNumberを生成し、firstArray[0]で初期化する
		int maximumNumber = firstArray[0];
		/*
		 * 「配列の要素の最大値を求める」
		 * 変数iを生成し、1で初期化する、iの値をインクリメントし、
		 * iの値がfirstArray.lengthになるまで繰り返す
		 */
		for (int i = 1; i < firstArray.length; i++) {
			//firstArray[i]の値がmaximumNumberより大きい場合
			if (firstArray[i] > maximumNumber) {
				//変数maximumNumberにfirstArray[i]の値を代入する
				maximumNumber = firstArray[i];
			}
		}
		//最大値が代入されている変数maximumNumberを返す
		return maximumNumber;
	}
	
}
