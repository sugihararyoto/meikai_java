//パッケージ名の宣言
package ensyu13_2;
/*
 * クラス名:LowerRight
 * 概要  :右下直角クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.18
 */
public class LowerRight extends IsoscelesRightTriangle {
	/*
	 * コンストラクタ
	 * 概要：右下直角二等辺三角形を生成するコンストラクタ
	 * 引数：int stepNumber
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public LowerRight(int stepNumber) {
		//直角二等辺三角形クラスIsoscelesRightTriangleのコンストラクタの呼出し
		super(stepNumber);
	}
	
	/*
	 * 関数名：toString
	 * 概要：右下直角二等辺三角形に関する図形情報を表す文字列を返却するメソッド
	 * 引数：なし
	 * 戻り値："LowerRight(step:" + getStep() + ")"
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public String toString() {
		//右下直角二等辺三角形に関する図形情報を表す文字列を返却する
		return "LowerRight(step:" + getStep() + ")";
	}
	
	/*
	 * 関数名：drawFigure
	 * 概要：右下直角二等辺三角形を描画するメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public void drawFigure() {
		/*
		 * 「右下直角二等辺三角形を描画するためのfor文」
		 */
		for (int i = getStep() - 1; 0 <= i; i--) {
			/*
			 * 「右下直角二等辺三角形を描画するためのfor文」
			 */
			for (int j = i; 0 < j; j--) {
				//画面に" "を表示する
				System.out.print(" ");
			}
			/*
			 * 「右下直角二等辺三角形を描画するためのfor文」
			 */
			for (int j = 0; j < getStep() - i; j++) {
				//画面に'*'を表示する
				System.out.print('*');
			}
			//改行する
			System.out.println();
		}
	}

}