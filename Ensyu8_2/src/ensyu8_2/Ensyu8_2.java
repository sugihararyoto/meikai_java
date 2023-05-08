//パッケージ名の宣言
package ensyu8_2;
//importする
import java.util.Scanner;
/*
 * クラス名:Car
 * 概要  :自動車クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.08
 */
class Car {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	//名前
	private String name;
	//幅
	private int width;
	//高さ
	private int height;
	//長さ
	private int length;
	//車のナンバー
	private String carNumber;
	//現在位置Ｘ座標
	private double x;
	//現在位置Ｙ座標
	private double y;
	//タンク容量
	private double tankNumber;
	//燃費
	private double fuelEfficiency;
	//残り燃料
	private double fuel;

	//--- コンストラクタ ---//
	Car(String name, int width, int height, int length, String carNumber, double tankNumber, double fuelEfficiency, double fuel) {
		//フィールドに仮引数の値を代入する
		this.name = name;
		//フィールドに仮引数の値を代入する
		this.width = width;
		//フィールドに仮引数の値を代入する
		this.height = height;
		//フィールドに仮引数の値を代入する
		this.length = length;
		//フィールドに仮引数の値を代入する
		this.carNumber = carNumber;
		//フィールドに仮引数の値を代入する
		this.tankNumber = tankNumber;
		//フィールドに仮引数の値を代入する
		this.fuelEfficiency = fuelEfficiency;
		//フィールドに仮引数の値を代入する
		this.fuel = fuel;
		//xとyに0を代入する
		x = y = 0.0;
	}

	/*
	 * 関数名：getX
	 * 概要：現在位置Ｘ座標を取得する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.08
	 */
	double getX() { return x; }
	/*
	 * 関数名：getY
	 * 概要：現在位置Ｙ座標を取得する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.08
	 */
	double getY() { return y; }
	/*
	 * 関数名：getFuel
	 * 概要：残り燃料を取得する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.08
	 */
	double getFuel() { return fuel; }
	
	/*
	 * 関数名：putSpec
	 * 概要：各スペックを表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.08
	 */
	void putSpec() {
		//画面に名前を表示する
		System.out.println("名前：" + name);
		//画面に車幅を表示する
		System.out.println("車幅：" + width  + "mm");
		//画面に車高を表示する
		System.out.println("車高：" + height + "mm");
		//画面に車長を表示する
		System.out.println("車長：" + length + "mm");
		//画面に車のナンバーを表示する
		System.out.println("車のナンバー：" + carNumber);
		//画面にタンク容量を表示する
		System.out.println("タンク容量：" + tankNumber + "L");
		//画面に燃費を表示する
		System.out.println("燃費：" + fuelEfficiency + "km/L");
		
	}
	/*
	 * 関数名：move
	 * 概要：Ｘ方向にdx・Ｙ方向にdy移動するメソッド
	 * テキストによって、boolean move(double dx, double dy)は指定
	 * 引数：double dx, double dy
	 * 戻り値：returnNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.08
	 */
	boolean move(double dx, double dy) {
		//true falseを返すための変数returnNumberを生成する
		boolean returnNumber = true;
		//移動距離を求めて変数distに代入する
		double dist = Math.sqrt(dx * dx + dy * dy);
		
		//移動するための燃料が足りない場合
		if (dist / fuelEfficiency > fuel) {
			//燃料不足で移動しない
			returnNumber = false;
		//移動するための燃料が足りる場合
		} else {
			//移動距離の分だけ燃料が減る（燃費を考慮）
			fuel -= (dist / fuelEfficiency);
			//移動した距離をx座標に反映する
			x += dx;
			//移動した距離をy座標に反映する
			y += dy;
			//移動を完了
			returnNumber = true;
		}
		//変数returnNumberを返す
		return returnNumber;
	}
	
	/*
	 * 関数名：plusFuel
	 * 概要：給油するためのメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.08
	 */
	void plusFuel() {
		//変数inputPlusを生成し、0で初期化する
		double inputPlus = 0;
		//while (tankNumber < fuel + inputPlus)の文まで実行する
		do {
			//給油する量の入力を促す
			System.out.print("給油量：");
			//給油量をキーボードから読み込む
			inputPlus = standardInput.nextDouble();
			if (tankNumber < fuel + inputPlus) {
				//タンク容量を超えていることを伝える
				System.out.println("タンク容量を超えています。");
			}
		//タンク容量を超えて給油しようとしているあいだは繰り返す
		} while (tankNumber < fuel + inputPlus);
		
		//fuelにinputPlusの値を足す（給油する）
		fuel += inputPlus;
	}
	
}

/*
 * クラス名:Ensyu8_2
 * 概要  :演習8-2クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.08
 */
public class Ensyu8_2 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：plusNumber
	 * 概要：double型で0以上の数を入力させるためのメソッド
	 * 引数：なし
	 * 戻り値：inputNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.08
	 */
	static double plusNumber() {
		//変数inputNumberを生成し、0で初期化する
		double inputNumber = 0;
		/*
		 * 「数の入力を行う」
		 * while (inputNumber < 0)の文までを実行する
		 */
		do {
			//変数inputNumberに、キーボードから入力した値を代入する
			inputNumber = standardInput.nextDouble();
			//0より小さい値が入力された場合
			if (inputNumber < 0) {
				//画面に0以上の値を入力してください。と表示する
				System.out.println("0以上の値を入力してください。");
				//再入力を促す
				System.out.print("再入力：");
			}
		//変数inputNumberの値が0より小さいあいだdoからwhileまでを繰り返す
		} while (inputNumber < 0);
		//inputNumberを返す
		return inputNumber;
	}
	/*
	 * 関数名：overNumber
	 * 概要：double型で0より大きい数を入力させるためのメソッド
	 * 引数：なし
	 * 戻り値：inputNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.08
	 */
	static double overNumber() {
		//変数inputNumberを生成し、0で初期化する
		double inputNumber = 0;
		/*
		 * 「数の入力を行う」
		 * while (inputNumber <= 0)の文までを実行する
		 */
		do {
			//変数inputNumberに、キーボードから入力した値を代入する
			inputNumber = standardInput.nextDouble();
			//0以下の値が入力された場合
			if (inputNumber <= 0) {
				//画面に0より大きい値を入力してください。と表示する
				System.out.println("0より大きい値を入力してください。");
				//再入力を促す
				System.out.print("再入力：");
			}
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0);
		//inputNumberを返す
		return inputNumber;
	}
	/*
	 * 関数名：oneNumber
	 * 概要：int型で1以上の数を入力させるためのメソッド
	 * 引数：なし
	 * 戻り値：inputNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.08
	 */
	static int oneNumber() {
		//変数inputNumberを生成し、0で初期化する
		int inputNumber = 0;
		/*
		 * 「数の入力を行う」
		 * while (inputNumber <= 0)の文までを実行する
		 */
		do {
			//変数inputNumberに、キーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
			//0以下の値が入力された場合
			if (inputNumber <= 0) {
				//画面に1以上の値を入力してください。と表示する
				System.out.println("1以上の値を入力してください。");
				//再入力を促す
				System.out.print("再入力：");
			}
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0);
		//inputNumberを返す
		return inputNumber;
	}
	/*
	 * 関数名：main
	 * 概要：自動車クラスを利用するためのメインメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.08
	 */
	public static void main(String[] args) {
		//車のデータの入力を促す
		System.out.println("車のデータを入力せよ。");
		//名前の入力を促す
		System.out.print("名前は：");
		//名前をキーボードから読み込む
		String inputName = standardInput.next();
		//車幅の入力を促す
		System.out.print("車幅は：");
		//車幅をキーボードから読み込む
		int inputWidth = oneNumber();
		//高さの入力を促す
		System.out.print("高さは：");
		//高さをキーボードから読み込む
		int inputHeight = oneNumber();
		//長さの入力を促す
		System.out.print("長さは：");
		//長さをキーボードから読み込む
		int inputLength = oneNumber();
		//車のナンバーの入力を促す
		System.out.print("車のナンバー：");
		//車のナンバーをキーボードから読み込む
		String inputCar = standardInput.next();
		//タンク容量の入力を促す
		System.out.print("タンク容量：");
		//タンク容量をキーボードから読み込む
		double inputTank = overNumber();
		//燃費の入力を促す
		System.out.print("燃費：");
		double inputFuelEfficiency = overNumber();
		//ガソリン量の入力を促す
		System.out.print("ガソリン量は：");
		//ガソリン量をキーボードから読み込む
		double inputFuel = plusNumber();
		//inputFuelの値がinputTankの値より大きいあいだ繰り返す
		while (inputFuel > inputTank) {
			//タンク容量を超えていることを伝える
			System.out.println("タンク容量を超えています。");
			//ガソリン量の入力を促す
			System.out.print("ガソリン量は：");
			//ガソリン量をキーボードから読み込む
			inputFuel = plusNumber();
		}
		
		//自動車クラスを参照する
		Car myCar = new Car(inputName, inputWidth, inputHeight, inputLength, inputCar, inputTank, inputFuelEfficiency, inputFuel);
		//車のスペックを表示する
		myCar.putSpec();
		
		//無限ループ文
		while (true) {
			//現在地と残り燃料を表示する
			System.out.println("現在地(" + myCar.getX() + ", " + myCar.getY() + ")・残り燃料 " + myCar.getFuel());
			//移動するかどうか問う
			System.out.print("移動しますか[0以外…Yes／0…No]：");
			//0が入力された場合
			if (standardInput.nextInt() == 0) {
				//while文から抜ける
				break;
			}
			//x方向の移動距離の入力を促す
			System.out.print("Ｘ方向の移動距離：");
			//x方向の移動距離をキーボードから読み込む
			double dxNumber = standardInput.nextDouble();
			//y方向の移動距離の入力を促す
			System.out.print("Ｙ方向の移動距離：");
			//y方向の移動距離をキーボードから読み込む
			double dyNumber = standardInput.nextDouble();
			
			//燃料が足りない場合
			if (!myCar.move(dxNumber, dyNumber)) {
				//燃料が足りないことを伝える
				System.out.println("燃料が足りません！");
				//給油するかどうか問う
				System.out.print("給油しますか？[0以外…Yes／0…No]：");
				//0が入力された場合
				if (standardInput.nextInt() == 0) {
					//while文から抜ける 
					break;
				//0以外が入力された場合
				} else {
					//給油する
					myCar.plusFuel();
				}
			}
			
		}
	}
}