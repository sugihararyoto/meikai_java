//パッケージ名の宣言
package ensyu14_1;
/*
 * クラス名:Shape
 * 概要  :図形クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.18
 */
public abstract class Shape {
	/*
	 * 関数名：toString
	 * 概要：図形情報の文字列を返却する抽象メソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public abstract String toString();
	/*
	 * 関数名：drawFigure
	 * 概要：図形を描画するための抽象メソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public abstract void drawFigure();
	/*
	 * 関数名：printFigure
	 * 概要：図形情報の表示と図形の描画を行うメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public void printFigure() {
		//メソッドtoStringが返却する文字列を表示して改行する
		System.out.println(toString());
		//メソッドdrawを呼び出して図形の描画を行う
		drawFigure();
	}

}