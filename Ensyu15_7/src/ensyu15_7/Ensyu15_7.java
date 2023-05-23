//パッケージ名の宣言
package ensyu15_7;
/*
 * クラス名:Ensyu15_7
 * 概要  :演習15-7クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.22
 */
public class Ensyu15_7 {
	/*
	 * 関数名：main
	 * 概要：List15-15のfor文を拡張for文で実現したプログラムを作成する
	 * 引数：String[] args
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public static void main(String[] args) {
		//合計値を表す変数sumNumberを生成し、0.0で初期化する
		double sumNumber = 0.0;
		/*
		 * 「合計を計算するための拡張for文」
		 */
		for (String i : args) {
			//sumNumberにiの値を加算する
			sumNumber += Double.parseDouble(i);
		}
		
		//合計を表示する
		System.out.println("合計は" + sumNumber + "です。");
	}

}
