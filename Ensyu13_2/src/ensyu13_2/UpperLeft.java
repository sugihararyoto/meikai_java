//パッケージ名の宣言
package ensyu13_2;
/*
 * クラス名:UpperLeft
 * 概要  :左上直角クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.18
 */
public class UpperLeft extends IsoscelesRightTriangle {
	/*
	 * コンストラクタ
	 * 概要：左上直角二等辺三角形を生成するコンストラクタ
	 * 引数：int stepNumber
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public UpperLeft(int stepNumber) {
		//直角二等辺三角形クラスIsoscelesRightTriangleのコンストラクタの呼出し
		super(stepNumber);
	}
	
	/*
	 * 関数名：toString
	 * 概要：左上直角二等辺三角形に関する図形情報を表す文字列を返却するメソッド
	 * 引数：なし
	 * 戻り値："UpperLeft(step:" + getStep() + ")"
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public String toString() {
		//左上直角二等辺三角形に関する図形情報を表す文字列を返却する
		return "UpperLeft(step:" + getStep() + ")";
	}
	
	/*
	 * 関数名：drawFigure
	 * 概要：左上直角二等辺三角形を描画するメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public void drawFigure() {
		/*
		 * 「左上直角二等辺三角形を描画するためのfor文」
		 */
		for (int i = 0; i < getStep(); i++) {
			/*
			 * 「左上直角二等辺三角形を描画するためのfor文」
			 */
			for (int j = getStep() - i; 0 < j; j--) {
				//画面に'*'を表示する
				System.out.print('*');
			}
			//改行する
			System.out.println();
		}
	}

}