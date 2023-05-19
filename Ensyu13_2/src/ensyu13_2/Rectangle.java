//パッケージ名の宣言
package ensyu13_2;
/*
 * クラス名:Rectangle
 * 概要  :長方形クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.18
 */
public class Rectangle extends Shape{
	//長方形の幅
	private int width;
	//長方形の高さ
	private int height;
	
	/*
	 * コンストラクタ
	 * 概要：長方形を生成するコンストラクタ
	 * 引数：int width, int height
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public Rectangle(int width, int height) {
		//フィールドの値に仮引数の値を代入する
		this.width = width;
		//フィールドの値に仮引数の値を代入する
		this.height = height;
	}
	
	/*
	 * 関数名：toString
	 * 概要：長方形に関する図形情報を表す文字列を返却するメソッド
	 * 引数：なし
	 * 戻り値："Rectangle(width:" + width + ", height:" + height + ")"
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public String toString() {
		//長方形に関する図形情報を表す文字列を返却する
		return "Rectangle(width:" + width + ", height:" + height + ")";
	}
	
	/*
	 * 関数名：drawFigure
	 * 概要：長方形を描画するメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public void drawFigure() {
		/*
		 * 「幅の数だけ'*'を表示して改行することをwidth回繰り返す」
		 */
		for (int i = 1; i <= height; i++) {
			/*
			 * 「width回繰り返すためのfor文」
			 */
			for (int j = 1; j <= width; j++) {
				//画面に'*'を表示する
				System.out.print('*');
			}
			//改行する
			System.out.println();
		}
	}
	
}
