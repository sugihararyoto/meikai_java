//パッケージ名の宣言
package ensyu2_2;
/*
 * クラス名:ensyu2_2
 * 概要  :演習2-2クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.05
 */
public class ensyu2_2 {
	/* 関数名：main
	 * 概要：3つのint型変数に値を代入し、合計と平均を求めるプラグラム
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
		//3つ目の数値を表す変数thirdNumberを生成する
		int thirdNumber;
		
		//最初の数値を表す変数firstNumberに63を代入する
		firstNumber = 63;
		//2つ目の数値を表す変数secondNumberに18を代入する
		secondNumber = 18;
		//3つ目の数値を表す変数thirdNumberに25を代入する
		thirdNumber = 25;
		
		//画面に変数firstNumberに代入された値を表示する
		System.out.println("firstNumberの値は" + firstNumber + "です。");
		//画面に変数secondNumberに代入された値を表示する
		System.out.println("secondNumberの値は" + secondNumber + "です。");
		//画面に変数thirdNumberに代入された値を表示する
		System.out.println("thirdNumberの値は" + thirdNumber + "です。");
		/*画面に変数firstNumberに代入された値と
		 * 変数secondNumberに代入された値と
		 * 変数thirdNumberに代入された値の合計を表示する
		 */
		System.out.println("合計は" + (firstNumber + secondNumber + thirdNumber) + "です。");
		/*画面に変数firstNumberに代入された値と
		 * 変数secondNumberに代入された値と
		 * 変数thirdNumberに代入された値の平均を表示する
		 */
		System.out.println("平均は" + (firstNumber + secondNumber + thirdNumber) / 3 + "です。");
	}
}
