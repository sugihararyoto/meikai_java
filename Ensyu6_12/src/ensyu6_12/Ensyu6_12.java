//パッケージ名の宣言
package ensyu6_12;
//importする
import java.util.Random;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu6_12
 * 概要  :演習6-12クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.19
 */
public class Ensyu6_12 {
	/*
	 * 関数名：main
	 * 概要：配列の要素の並びをシャッフルする
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.19
	 */
	public static void main(String[] args) {
		//乱数を生成する準備
		Random randomNumber = new Random();
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//変数inputNumberを生成し、0で初期化する
		int inputNumber = 0; 
		
		//while (inputNumber <= 0)の文までを実行する
		do {
			//画面に要素数の入力を促す
			System.out.print("要素数：");
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
		int [] arrayNumber = new int [inputNumber];
		
		/*
		 * 変数generateNumberを生成し、0で初期化する
		 * 変数generateNumberの値をインクリメントしながら
		 * 変数generateNumberの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int generateNumber = 0; generateNumber < inputNumber; generateNumber++) {
			//arrayNumber[generateNumber]に1~10の値をランダムに生成し、代入する
			arrayNumber[generateNumber] = randomNumber.nextInt(90) + 10;
			//画面にarrayNumber[generateNumber]の値を表示する
			System.out.println("arrayNumber[" + generateNumber + "] = " + arrayNumber[generateNumber]);
		}
		
		/*
		 * 変数incrementNumberを生成し、0で初期化する
		 * 変数incrementNumberの値をインクリメントしながら
		 * 変数incrementNumberの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int incrementNumber = 0; incrementNumber < inputNumber; incrementNumber++) {
			//変数changeNumberを生成し、arrayNumber[incrementNumber]の値を代入する
			int changeNumber = arrayNumber[incrementNumber];
			/*
			 * 変数shuffleNumberを生成し、0~入力した値から1を引いた値を
			 * ランダムで生成し、その値で初期化する
			 */
			int shuffleNumber = randomNumber.nextInt(inputNumber);
			//arrayNumber[incrementNumber]にarrayNumber[shuffleNumber]の値を代入する
			arrayNumber[incrementNumber] = arrayNumber[shuffleNumber];
			//arrayNumber[shuffleNumber]に変数changeNumberの値を代入する
			arrayNumber[shuffleNumber] = changeNumber;
		}
		
		//画面に要素の並びをシャッフルしました。と表示する
		System.out.println("要素の並びをシャッフルしました。");
		/*
		 * 変数generateNumberを生成し、0で初期化する
		 * 変数generateNumberの値をインクリメントしながら
		 * 変数generateNumberの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int generateNumber = 0; generateNumber < inputNumber; generateNumber++) {
			//画面にarrayNumber[generateNumber]の値を表示する
			System.out.println("arrayNumber[" + generateNumber + "] = " + arrayNumber[generateNumber]);
		}
	}

}
