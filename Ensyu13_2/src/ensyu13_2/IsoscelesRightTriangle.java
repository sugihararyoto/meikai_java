//パッケージ名の宣言
package ensyu13_2;
/*
 * クラス名:IsoscelesRightTriangle
 * 概要  :直角二等辺三角形クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.18
 */
public abstract class IsoscelesRightTriangle extends Shape {
	//段数
	private int stepNumber;
	
	/*
	 * コンストラクタ
	 * 概要：直角二等辺三角形を生成するコンストラクタ
	 * 引数：int stepNumber
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public IsoscelesRightTriangle(int stepNumber) {
		//生成する段数を設定する
		setStep(stepNumber);
	}
	
	/*
	 * 関数名：getStep
	 * 概要：直角二等辺三角形の段数を取得するメソッド
	 * 引数：なし
	 * 戻り値：stepNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public int getStep() {
		//直角二等辺三角形の段数を返却する
		return stepNumber;
	}
	
	/*
	 * 関数名：setStep
	 * 概要：直角二等辺三角形の段数を設定するメソッド
	 * 引数：int stepNumber
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public void setStep(int stepNumber) {
		//フィールドの値に仮引数の値を代入する
		this.stepNumber = stepNumber;
	}
	
	/*
	 * 関数名：toString
	 * 概要：直角二等辺三角形に関する図形情報を表す文字列を返却するメソッド
	 * 引数：なし
	 * 戻り値："IsoscelesRightTriangle(step:" + stepNumber + ")"
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public String toString() {
		//直角二等辺三角形に関する図形情報を表す文字列を返却する
		return "IsoscelesRightTriangle(step:" + stepNumber + ")";
	}
	

}