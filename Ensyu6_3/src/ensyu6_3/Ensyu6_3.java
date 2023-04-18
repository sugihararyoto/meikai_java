//パッケージ名の宣言
package ensyu6_3;
/*
 * クラス名:Ensyu6_3
 * 概要  :演習6-3クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.17
 */
public class Ensyu6_3 {
	/*
	 * 関数名：main
	 * 概要：要素型がdouble型で要素数が5の配列の要素に対して、
	 * 先頭から順に1.1, 2.2, 3.3, 4.4, 5.5を代入して表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.17
	 */
	public static void main(String[] args) {
		//double型で要素数が5の配列を生成する
		double [] realNumber = new double[5];
		//realNumber[0]に1.1を代入する
		realNumber[0] = 1.1;
		//realNumber[1]に2.2を代入する
		realNumber[1] = 2.2;
		//realNumber[2]に3.3を代入する
		realNumber[2] = 3.3;
		//realNumber[3]に4.4を代入する
		realNumber[3] = 4.4;
		//realNumber[4]に5.5を代入する
		realNumber[4] = 5.5;
		/*
		 * 変数arrayNumberを生成し、0で初期化する
		 * 変数arrayNumberをインクリメントし、
		 * 配列の要素数の値になるまで繰り返す
		 */
		for (int arrayNumber = 0; arrayNumber < realNumber.length;arrayNumber++) {
			//画面にrealNumber[arrayNumber]の値を表示する
			System.out.println("realNumber[" + arrayNumber + "] = " + realNumber[arrayNumber]);
		}
	}

}
