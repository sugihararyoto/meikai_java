//パッケージ名の宣言
package ensyu4_15;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_15
 * 概要  :演習4-15クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.13
 */
public class Ensyu4_15 {
	/*
	 * 関数名：main
	 * 概要：身長と標準体重の対応表を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.13
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//変数firstNumberを生成し、0で初期化する
		int firstNumber = 0;
		//変数secondNumberを生成し、0で初期化する
		int secondNumber = 0;
		//変数thirdNumberを生成し、0で初期化する
		int thirdNumber = 0;
		
		//while (firstNumber <= 100)までの文を実行する
		do {
			//画面に入力を促す
			System.out.print("何cmから：");
			//変数firstNumberにキーボードから入力した値を代入する
			firstNumber = standardInput.nextInt();
			//計算できない値が入力された場合
			if (firstNumber <= 100) {
				//画面に計算できない値が入力されました。と表示する
				System.out.println("計算できない値が入力されました。");
			} 
		//変数firstNumberの値が100以下のあいだdoからwhileまでを繰り返す
		} while (firstNumber <= 100);
		
		//while (secondNumber <= 100)までの文を実行する
		do {
			//画面に入力を促す
			System.out.print("何cmまで：");
			//変数firstNumberにキーボードから入力した値を代入する
			secondNumber = standardInput.nextInt();
			//計算できない値が入力された場合
			if (secondNumber <= 100) {
				//画面に計算できない値が入力されました。と表示する
				System.out.println("計算できない値が入力されました。");
			} else if (secondNumber < firstNumber) {
				//画面に最初の値より大きい数値を入力してください。と表示する
				System.out.println("最初の値より大きい数値を入力してください。");
				//繰り返すために変数secondNumberに0を代入する
				secondNumber = 0;
			}
		//変数secondNumberの値が100以下のあいだdoからwhileまでを繰り返す
		} while (secondNumber <= 100);
		
		//while (thirdNumber <= 0)までの文を実行する
		do {
			//画面に入力を促す
			System.out.print("何cmごと：");
			//変数firstNumberにキーボードから入力した値を代入する
			thirdNumber = standardInput.nextInt();
			//正ではない値が入力された場合
			if (thirdNumber <= 0) {
				//画面に正ではない値が入力されました。と表示する
				System.out.println("正ではない値が入力されました。");
			} else if (thirdNumber > secondNumber - firstNumber) {
				//画面に計算できない値が入力されました。と表示する
				System.out.println("計算できない値が入力されました。");
				//繰り返すために変数thirdNumberに0を代入する
				thirdNumber = 0;
			}
			
		//変数thirdNumberの値が0以下のあいだdoからwhileまでを繰り返す	
		} while (thirdNumber <= 0);
		
		//画面に身長と表示する
		System.out.print("身長");
		//画面に半角スペースを表示する
		System.out.print(" ");
		//画面に標準体重と表示する
		System.out.println("標準体重");
		
		//変数weightNumberを生成し、0で初期化する
		double weightNumber = 0;
		
		//while (firstNumber <= secondNumber)までの文を実行する
		do {
			//画面に変数firstNumberの値を表示する
			System.out.print(firstNumber);
			//画面に半角スペースを表示する
			System.out.print(" ");
			//変数weightNumberに
			weightNumber = (firstNumber - 100) * 0.9;
			//画面に変数weightNumberの値を表示する
			System.out.println(weightNumber);
			//変数firstNumberに変数thirdNumberの値を足す
			firstNumber += thirdNumber;
		/*
		 * 変数firstNumberの値が変数secondNumberの値以下のあいだ
		 * doからwhileまでを繰り返す	
		 */
		} while (firstNumber <= secondNumber);
		
	}

}
