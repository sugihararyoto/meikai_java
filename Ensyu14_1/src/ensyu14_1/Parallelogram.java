//パッケージ名の宣言
package ensyu14_1;
/*
 * クラス名:Parallelogram
 * 概要  :平行四辺形クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.19
 */
public class Parallelogram extends Shape implements Plane2D {
	//底辺の幅
	private int width;
	//高さ
	private int height;
	
	/*
	 * コンストラクタ
	 * 概要：平行四辺形を生成するコンストラクタ
	 * 引数：int width, int height
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.19
	 */
	public Parallelogram(int width, int height) {
		//フィールドの値に仮引数の値を代入する
		this.width = width;
		//フィールドの値に仮引数の値を代入する
		this.height = height;
	}
	
	/*
	 * 関数名：toString
	 * 概要：平行四辺形に関する図形情報を表す文字列を返却するメソッド
	 * 引数：なし
	 * 戻り値："Parallelogram(width:" + width + ", height:" + height + ")"
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.19
	 */
	public String toString() {
		//平行四辺形に関する図形情報を表す文字列を返却する
		return "Parallelogram(width:" + width + ", height:" + height + ")";
	}
	
	/*
	 * 関数名：drawFigure
	 * 概要：平行四辺形を描画するメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.19
	 */
	public void drawFigure() {
		/*
		 * 「平行四辺形を描画するためのfor文」
		 */
		for (int i = 1; i <= height; i++) {
			/*
			 * 「平行四辺形を描画するためのfor文」
			 */
			for (int j = 1; j <= height - i; j++) {
				//画面に' 'を表示する
				System.out.print(' ');
			}
			/*
			 * 「平行四辺形を描画するためのfor文」
			 */
			for (int j = 1; j <= width; j++) {
				//画面に'#'を表示する
				System.out.print('#');
			}
			//改行する
			System.out.println();
		}
		
	}
	/*
	 * 関数名：getArea
	 * 概要：面積を求めるメソッド
	 * 引数：なし
	 * 戻り値：width * height
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.19
	 */
	public int getArea() {
		//求めた面積を返却する
		return width * height;
	}
	

}
