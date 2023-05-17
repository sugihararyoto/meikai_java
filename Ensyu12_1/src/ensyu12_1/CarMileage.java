//パッケージ名の宣言
package ensyu12_1;
/*
 * クラス名:CarMileage
 * 概要  :自動車クラスから派生
 * 作成者:R.Sugihara
 * 作成日:2023.05.16
 */
public class CarMileage extends Car {
	//総走行距離
	private double totalMileage;
	
	/*
	 * コンストラクタ
	 * 概要：初期化を行うためのコンストラクタ
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.16
	 */
	CarMileage(String carName, int carWidth, int carHeight, int carLength, 
			double carFuel, Day purchaseDay, double totalMileage) {
		//自動車クラスCarのコンストラクタの呼出し
		super (carName, carWidth, carHeight, carLength, carFuel, new Day(purchaseDay));
		//フィールドの値に仮引数の値を代入する
		this.totalMileage = totalMileage;
	}
	
	/*
	 * 関数名：getTotalMileage
	 * 概要：総走行距離を調べる
	 * 引数：なし
	 * 戻り値：totalMileage
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.16
	 */
	public double getTotalMileage() {
		//総走行距離を返却する
		return totalMileage;
	}
	
	/*
	 * 関数名：moveMileage
	 * 概要：総走行距離を計算するためのメソッド
	 * 引数：double deltaX, double deltaY
	 * 戻り値：returnNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.16
	 */
	public double moveMileage(double deltaX, double deltaY) {
		//移動をするためのメソッドmoveCarで移動をした場合
		if (moveCar(deltaX, deltaY)) {
			//総走行距離に移動距離を加算する
			totalMileage += Math.sqrt(deltaX * deltaX + deltaY * deltaY);
			//移動をするためのメソッドmoveCarで燃料が足りず、移動できなかった場合
		} else {
			//燃料が足りないことを伝える
			System.out.println("燃料が足りません！");
		}
		
		//総走行距離が代入されている変数totalMileageを返す
		return totalMileage;
	}
	
	
	
}
