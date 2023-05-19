//パッケージ名の宣言
package ensyu13_3;
/*
 * クラス名:PlayerClass
 * 概要  :プレーヤクラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.19
 */
public abstract class PlayerClass {
	/*
	 * 関数名：toString
	 * 概要：文字列を返却する抽象メソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.19
	 */
	public abstract String toString();
	/*
	 * 関数名：printString
	 * 概要：画面に文字列を表示するためのメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.19
	 */
	public void printString() {
		//画面にtoString()の内容を表示する
		System.out.println(toString());
	}

}
