//パッケージ名の宣言
package ensyu13_1;
/*
 * クラス名:HorzLine
 * 概要  :水平直線クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.18
 */
public class HorzLine extends AbstLine{
	/*
	 * コンストラクタ
	 * 概要：水平直線を生成するコンストラクタ
	 * 引数：int length
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public HorzLine(int length) {
		//直線クラスAbstLineのコンストラクタの呼出し
		super(length);
	}
	
	/*
	 * 関数名：toString
	 * 概要：水平直線に関する図形情報を表す文字列を返却するメソッド
	 * 引数：なし
	 * 戻り値："HorzLine(length:" + getLength() + ")"
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public String toString() {
		//水平直線に関する図形情報を表す文字列を返却する
		return "HorzLine(length:" + getLength() + ")";
	}
	
	/*
	 * 関数名：draw
	 * 概要：水平直線を描画するメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public void draw() {
		/*
		 * 「長さと同じ個数'-'を表示する」
		 */
		for (int i = 1; i <= getLength(); i++) {
			//画面に'-'を表示する
			System.out.print('-');
		}
		//改行する
		System.out.println();
	}

}
