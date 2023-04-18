//パッケージ名の宣言
package ensyu6_6;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu6_6
 * 概要  :演習6-6クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.18
 */
public class Ensyu6_6 {
	/*
	 * 関数名：main
	 * 概要：テストの点数(0~100)の合計点・平均点・最高点・最低点を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.18
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//変数inputNumberを生成し、0で初期化する
		int inputNumber = 0; 
		//変数sumNumberを生成し、0で初期化する
		int sumNumber = 0;
		
		//while (inputNumber <= 0)の文までを実行する
		do {
			//画面に人数の入力を促す
			System.out.print("人数：");
			//変数inputNumberに、キーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
			//正ではない値が入力された場合
			if (inputNumber <= 0) {
				//画面に正ではない値が入力されました。と表示する
				System.out.println("正ではない値が入力されました。");
			}
			
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0);
		
		//int型で要素数が変数inputNumberの値の配列を生成する
		int [] pointNumber = new int [inputNumber];
		/*
		 * 変数incrementNumberを生成し、0で初期化する
		 * 変数incrementNumberをインクリメントしながら
		 * 変数incrementNumberの値がpointNumber.lengthになるまで繰り返す
		 */
		for (int incrementNumber = 0; incrementNumber < pointNumber.length; incrementNumber++) {
			/*
			 * while (pointNumber[incrementNumber] < 0 || 100 <pointNumber[incrementNumber])
			 * の文までを実行する
			 */
			do {
				//画面に点数の入力を促す
				System.out.print((incrementNumber + 1) + "番の点数：");
				//pointNumber[incrementNumber]にキーボードから入力した値を代入する
				pointNumber[incrementNumber] = standardInput.nextInt();
				//0未満か100より大きい値が入力された場合
				if (pointNumber[incrementNumber] < 0 || 100 <pointNumber[incrementNumber]) {
					//画面に0～100までの値を入力してください。と表示する
					System.out.println("0～100までの値を入力してください。");
				//0~100の値が入力された場合
				} else {
					//変数sumNumberにpointNumber[incrementNumber]の値を足す
					sumNumber += pointNumber[incrementNumber];
				}
				
			//変数inputNumberの値が0未満か100より大きいあいだdoからwhileまでを繰り返す
			} while (pointNumber[incrementNumber] < 0 || 100 <pointNumber[incrementNumber]);
			
		}
		
		//最大値を表す変数maximumNumberを生成し、pointNumber[0]の値で初期化する
		int maximumNumber = pointNumber[0];
		/*
		 * 変数incrementNumberを生成し、1で初期化する
		 * 変数incrementNumberをインクリメントしながら
		 * 変数incrementNumberの値がpointNumber.lengthになるまで繰り返す
		 */
		for (int incrementNumber = 1; incrementNumber < pointNumber.length; incrementNumber++) {
			//pointNumber[incrementNumber]の値が変数maximumNumberの値より大きい場合
			if (pointNumber[incrementNumber] > maximumNumber) {
				//変数maximumNumberにpointNumber[incrementNumber]の値を代入する
				maximumNumber = pointNumber[incrementNumber];
			}
		}
		
		//最小値を表す変数minimumNumberを生成し、pointNumber[0]の値で初期化する
		int minimumNumber = pointNumber[0];
		/*
		 * 変数incrementNumberを生成し、1で初期化する
		 * 変数incrementNumberをインクリメントしながら
		 * 変数incrementNumberの値がpointNumber.lengthになるまで繰り返す
		 */
		for (int incrementNumber = 1; incrementNumber < pointNumber.length; incrementNumber++) {
			//pointNumber[incrementNumber]の値が変数minimumNumberの値より小さい場合
			if (pointNumber[incrementNumber] < minimumNumber) {
				//変数minimumNumberにpointNumber[incrementNumber]の値を代入する
				minimumNumber = pointNumber[incrementNumber];
			}
		}
		
		//画面に合計値を表示する
		System.out.println("合計は" + sumNumber + "点です。");
		//画面に平均値を表示する
		System.out.println("平均は" + (double)sumNumber / inputNumber + "点です。");
		//画面に最高点を表示する
		System.out.println("最高点は" + maximumNumber + "点です。");
		//画面に最低点を表示する
		System.out.println("最低点は" + minimumNumber + "点です。");
	}

}
