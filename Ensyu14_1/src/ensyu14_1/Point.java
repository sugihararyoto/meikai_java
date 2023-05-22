//パッケージ名の宣言
package ensyu14_1;
/*
 * クラス名:Point
 * 概要  :点クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.18
 */
public class Point extends Shape {
	/*
	 * コンストラクタ
	 * 概要：点を生成するコンストラクタ
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public Point() {
		
	}
	
	/*
	 * 関数名：toString
	 * 概要：点に関する図形情報を表す文字列を返却するメソッド
	 * 引数：なし
	 * 戻り値："Point"
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public String toString() {
		//文字列Pointを返却する
		return "Point";
	}
	/*
	 * 関数名：draw
	 * 概要：点を描画するメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public void drawFigure() {
		//プラス記号'+'を表示して改行する
		System.out.println('+');
	}
	
}