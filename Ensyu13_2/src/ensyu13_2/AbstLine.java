//パッケージ名の宣言
package ensyu13_2;
/*
 * クラス名:AbstLine
 * 概要  :直線クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.18
 */
public abstract class AbstLine extends Shape {
	//直線の長さ
	private int length;
	
	/*
	 * コンストラクタ
	 * 概要：直線を生成するコンストラクタ
	 * 引数：int length
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public AbstLine(int length) {
		//生成する直線の長さを設定する
		setLength(length);
	}
	
	/*
	 * 関数名：getLength
	 * 概要：直線の長さを取得するメソッド
	 * 引数：なし
	 * 戻り値：length
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public int getLength() {
		//直線の長さを返却する
		return length;
	}
	
	/*
	 * 関数名：setLength
	 * 概要：直線の長さを設定するメソッド
	 * 引数：int length
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public void setLength(int length) {
		//フィールドの値に仮引数の値を代入する
		this.length = length;
	}
	
	/*
	 * 関数名：toString
	 * 概要：直線に関する図形情報を表す文字列を返却するメソッド
	 * 引数：なし
	 * 戻り値："AbstLine(length:" + length + ")"
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public String toString() {
		//直線に関する図形情報を表す文字列を返却する
		return "AbstLine(length:" + length + ")";
	}
	

}
