//パッケージ名の宣言
package ensyu2_1;
/*
 * クラス名:ensyu2_1
 * 概要  :演習2-1クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.05
 */
public class ensyu2_1 {
	/* 関数名：main
	 * 概要：小数部をもつ実数値を代入するように変更した結果
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.05
	 */
	public static void main(String[] args) {
		//最初の数値を表す変数firstNumberを生成する
		int firstNumber;
		//2つ目の数値を表す変数secondNumberを生成する
		int secondNumber;
		
		//最初の数値を表す変数firstNumberに63.5を代入する
		firstNumber = 63.5;
		//2つ目の数値を表す変数secondNumberに18.5を代入する
		secondNumber = 18.5;
		
		//画面に変数firstNumberに代入された値を表示する
		System.out.println("firstNumberの値は" + firstNumber + "です。");
		//画面に変数secondNumberに代入された値を表示する
		System.out.println("secondNumberの値は" + secondNumber + "です。");
		/*画面に変数firstNumberに代入された値と
		 * 変数secondNumberに代入された値の合計を表示する
		 */
		System.out.println("合計は" + (firstNumber + secondNumber) + "です。");
		/*画面に変数firstNumberに代入された値と
		 * 変数secondNumberに代入された値の平均を表示する
		 */
		System.out.println("平均は" + (firstNumber + secondNumber) / 2 + "です。");
		
	}

}
