//パッケージ名の宣言
package ensyu13_2;
/*
 * クラス名:LowerLeft
 * 概要  :左下直角クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.18
 */
public class LowerLeft extends IsoscelesRightTriangle {
	/*
	 * コンストラクタ
	 * 概要：左下直角二等辺三角形を生成するコンストラクタ
	 * 引数：int stepNumber
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public LowerLeft(int stepNumber) {
		//直角二等辺三角形クラスIsoscelesRightTriangleのコンストラクタの呼出し
		super(stepNumber);
	}
	
	/*
	 * 関数名：toString
	 * 概要：左下直角二等辺三角形に関する図形情報を表す文字列を返却するメソッド
	 * 引数：なし
	 * 戻り値："LowerLeft(step:" + getStep() + ")"
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public String toString() {
		//左下直角二等辺三角形に関する図形情報を表す文字列を返却する
		return "LowerLeft(step:" + getStep() + ")";
	}
	
	/*
	 * 関数名：drawFigure
	 * 概要：左下直角二等辺三角形を描画するメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public void drawFigure() {
		/*
		 * 「左下直角二等辺三角形を描画するためのfor文」
		 */
		for (int i = 1; i <= getStep(); i++) {
			/*
			 * 「左下直角二等辺三角形を描画するためのfor文」
			 */
			for (int j = 1; j <= i; j++) {
				//画面に'*'を表示する
				System.out.print('*');
			}
			//改行する
			System.out.println();
		}
	}

}