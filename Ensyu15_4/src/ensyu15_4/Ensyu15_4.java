//パッケージ名の宣言
package ensyu15_4;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu15_4
 * 概要  :演習15-4クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.22
 */
public class Ensyu15_4 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：inputOneNumber
	 * 概要：int型で1以上の数を入力させるためのメソッド
	 * 引数：なし
	 * 戻り値：inputNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	static int inputOneNumber() {
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
	 * 関数名：printDouble
	 * 概要：浮動小数点数値xを小数点以下の部分をp桁で、
	 * 全体を少なくともw桁で表示するメソッド
	 * テキストによってprintDouble(double x, int p, int w)は指定
	 * 引数：double x, int p, int w
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	static void printDouble(double x, int p, int w) {
		//浮動小数点数値xを小数点以下の部分をp桁で、全体を少なくともw桁で表示する
		System.out.printf(String.format("%%" + w + "." + p + "f"), x);
	}
	/*
	 * 関数名：main
	 * 概要：浮動小数点数値xを小数点以下の部分をp桁で、
	 * 全体を少なくともw桁で表示するためのメインのメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public static void main(String[] args) {
		//浮動小数点数値xの値の入力を促す
		System.out.print("浮動小数点数値x：");
		//浮動小数点数値xの値をキーボードから読み込む
		double inputNumber = standardInput.nextDouble();
		//小数点以下の桁数の入力を促す
		System.out.print("小数点以下の桁数p：");
		//小数点以下の桁数をキーボードから読み込む
		int digitNumber = inputOneNumber();
		//全体を少なくとも表示する桁数の入力を促す
		System.out.print("全体を少なくとも表示する桁数w：");
		//全体を少なくとも表示する桁数をキーボードから読み込む
		int wholeDigitNumber = inputOneNumber();
		//浮動小数点数値xを小数点以下の部分をp桁で、全体を少なくともw桁で表示する
		printDouble(inputNumber, digitNumber, wholeDigitNumber);
	}
}
