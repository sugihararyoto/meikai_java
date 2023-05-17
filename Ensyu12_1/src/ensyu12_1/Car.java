//パッケージ名の宣言
package ensyu12_1;
/*
 * クラス名:Car
 * 概要  :自動車クラス
 * クラス名は指定
 * 作成者:R.Sugihara
 * 作成日:2023.05.16
 */
public class Car {
	//名前
	private String carName;
	//幅
	private int carWidth;
	//高さ
	private int carHeight;
	//長さ
	private int carLength;
	//現在位置X座標
	private double xCoordinate;
	//現在位置Y座標
	private double yCoordinate;
	//燃料
	private double carFuel;
	//購入日
	private Day purchaseDay;
	
	/*
	 * コンストラクタ
	 * 概要：初期化を行うためのコンストラクタ
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.16
	 */
	public Car(String carName, int carWidth, int carHeight, int carLength, 
			double carFuel, Day purchaseDay) {
		//フィールドの値を仮引数の値で初期化する
		this.carName = carName;
		//フィールドの値を仮引数の値で初期化する
		this.carWidth = carWidth;
		//フィールドの値を仮引数の値で初期化する
		this.carHeight = carHeight;
		//フィールドの値を仮引数の値で初期化する
		this.carLength = carLength;
		//フィールドの値を仮引数の値で初期化する
		this.carFuel = carFuel;
		//X座標とY座標に0.0を代入する
		xCoordinate = yCoordinate = 0.0;
		//フィールドの値を仮引数の値で初期化する
		this.purchaseDay = new Day(purchaseDay);
	}
	/*
	 * 関数名：getX
	 * 概要：現在位置X座標を取得する
	 * 引数：なし
	 * 戻り値：xCoordinate
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.16
	 */
	public double getX() {
		//現在位置X座標を返却する
		return xCoordinate;
	}
	/*
	 * 関数名：getY
	 * 概要：現在位置Y座標を取得する
	 * 引数：なし
	 * 戻り値：yCoordinate
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.16
	 */
	public double getY() {
		//現在位置Y座標を返却する
		return yCoordinate;
	}
	/*
	 * 関数名：getFuel
	 * 概要：残り燃料を取得する
	 * 引数：なし
	 * 戻り値：carFuel
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.16
	 */
	public double getFuel() {
		//残り燃料を返却する
		return carFuel;
	}
	/*
	 * 関数名：getPurchaseDay
	 * 概要：購入日を取得する
	 * 引数：なし
	 * 戻り値：purchaseDay
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.16
	 */
	public Day getPurchaseDay() {
		//購入日を返却する
		return new Day(purchaseDay);
	}
	
	/*
	 * 関数名：putSpec
	 * 概要：スペックを表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.16
	 */
	public void putSpec() {
		//名前を表示する
		System.out.println("名前" + carName);
		//車幅を表示する
		System.out.println("車幅" + carWidth + "mm");
		//車高を表示する
		System.out.println("車高" + carHeight + "mm");
		//車長を表示する
		System.out.println("車長" + carLength + "mm");
	}
	/*
	 * 関数名：moveCar
	 * 概要：X方向にdeltaX, Y方向にdeltaY移動するメソッド
	 * 引数：double deltaX, double deltaY
	 * 戻り値：returnNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.16
	 */
	public boolean moveCar(double deltaX, double deltaY) {
		//true falseを返すための変数returnNumberを生成する
		boolean returnNumber = true;
		
		//移動距離を計算する
		double moveDistance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
		
		//移動するための燃料が足りない場合
		if (moveDistance > carFuel) {
			//燃料不足で移動しない
			returnNumber = false;
		//移動するための燃料が足りる場合
		} else {
			//移動距離の分だけ燃料が減る
			carFuel -= moveDistance;
			//移動した距離をx座標に反映する
			xCoordinate += deltaX;
			//移動した距離をy座標に反映する
			yCoordinate += deltaY;
			//移動を完了
			returnNumber = true;
		}
		//変数returnNumberを返す
		return returnNumber;
	}
	
	
}
