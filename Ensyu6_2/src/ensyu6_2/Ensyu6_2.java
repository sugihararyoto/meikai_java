//パッケージ名の宣言
package ensyu6_2;
/*
 * クラス名:Ensyu6_2
 * 概要  :演習6-2クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.17
 */
public class Ensyu6_2 {
	/*
	 * 関数名：main
	 * 概要：要素型がint型で要素数が5の配列の要素に対して、
	 * 先頭から順に5,4,3,2,1を代入して表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.17
	 */
	public static void main(String[] args) {
		//int型で要素数が5の配列を生成する
		int [] integerNumbers = new int[5];
		/*
		 * 変数arrayNumberを生成し、0で初期化する
		 * 変数arrayNumberをインクリメントし、
		 * 配列の要素数の値になるまで繰り返す
		 */
		for (int arrayNumber = 0; arrayNumber < integerNumbers.length;arrayNumber++) {
			/*
			 * integerNumbers[arrayNumber]に配列の要素数の値から
			 * 変数arrayNumberの値を引いた値を代入する
			 */
			integerNumbers[arrayNumber] = integerNumbers.length - arrayNumber;
		}
		/*
		 * 変数arrayNumberを生成し、0で初期化する
		 * 変数arrayNumberをインクリメントし、
		 * 配列の要素数の値になるまで繰り返す
		 */
		for (int arrayNumber = 0; arrayNumber < integerNumbers.length;arrayNumber++) {
			//画面にintegerNumbers[arrayNumber]の値を表示する
			System.out.println("integerNumbers[" + arrayNumber + "] = " + integerNumbers[arrayNumber]);
		}
	}

}
