//パッケージ名の宣言
package ensyu12_1;
//importする
import java.util.Scanner;

/*
 * クラス名:Ensyu12_1
 * 概要  :演習12-1クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.16
 */
public class Ensyu12_1 {
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
	 * 概要：総走行距離を追加した自動車クラスを試すためのメインのメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.16
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
		//ガソリン量の入力を促す
		System.out.print("ガソリン量は：");
		//ガソリン量をキーボードから読み込む
		double inputFuel = plusNumber();
		
		//CarMileage型のクラス型変数myCarを生成し、インスタンス化する
		CarMileage myCar = new CarMileage(inputName, inputWidth, inputHeight, inputLength, inputFuel, new Day(), 0.0);
		
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
			System.out.print("X方向の移動距離：");
			//x方向の移動距離をキーボードから読み込む
			double dxNumber = standardInput.nextDouble();
			//y方向の移動距離の入力を促す
			System.out.print("Y方向の移動距離：");
			//y方向の移動距離をキーボードから読み込む
			double dyNumber = standardInput.nextDouble();
			
			//移動を行った後に総走行距離を表示する
			System.out.println("総走行距離：" + myCar.moveMileage(dxNumber, dyNumber));
			
			
		}
	}

}
