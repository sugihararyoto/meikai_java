//パッケージ名の宣言
package ensyu6_8;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu6_8
 * 概要  :演習6-8クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.19
 */
public class Ensyu6_8 {
	/*
	 * 関数名：main
	 * 概要：double型の配列の全要素の合計値と平均値を求める
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.19
	 */
	public static void main(String[] args) {
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
		
		//double型で要素数が変数inputNumberの値の配列を生成する
		double [] arrayNumber = new double [inputNumber];
		
		/*
		 * 変数incrementNumberを生成し、0で初期化する
		 * 変数incrementNumberの値をインクリメントしながら
		 * 変数incrementNumberの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int incrementNumber = 0; incrementNumber < inputNumber;incrementNumber++) {
			//画面にarrayNumber[incrementNumber]の入力を促す
			System.out.print("arrayNumber[" + incrementNumber + "] = ");
			//arrayNumber[incrementNumber]にキーボードから入力した値を代入する
			arrayNumber[incrementNumber] = standardInput.nextDouble();
		}
		
		//変数sumNumberを生成し、0で初期化する
		double sumNumber = 0;
		
		//配列arrayNumberを走査する
		for (double incrementNumber : arrayNumber) {
			//変数incrementNumberに変数incrementNumberの値を足す
			sumNumber += incrementNumber;
		}
		
		//画面に全要素の和を表示する
		System.out.println("全要素の和は" + sumNumber + "です。");
		//画面に全要素の平均を表示する
		System.out.println("全要素の平均は" + sumNumber / inputNumber + "です。");
		
	}

}
