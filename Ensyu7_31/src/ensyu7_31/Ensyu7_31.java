//パッケージ名の宣言
package ensyu7_31;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_31
 * 概要  :演習7-31クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.01
 */
public class Ensyu7_31 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：absolute
	 * 概要：int型の整数xの絶対値を求めるメソッド
	 * テキストによって、int absolute(int x)は指定
	 * 引数：int x
	 * 戻り値：returnNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static int absolute(int x) {
		//変数returnNumberを生成し、xの値で初期化する
		int returnNumber = x;
		//xの値が負の場合
		if (x < 0) {
			//変数returnNumberに-xの値を代入する
			returnNumber = -x;
		}
		//絶対値が代入されている変数returnNumberを返す
		return returnNumber;
	}
	/*
	 * 関数名：absolute
	 * 概要：long型の整数xの絶対値を求めるメソッド
	 * テキストによって、long absolute(long x)は指定
	 * 引数：long x
	 * 戻り値：returnNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static long absolute(long x) {
		//変数returnNumberを生成し、xの値で初期化する
		long returnNumber = x;
		//xの値が負の場合
		if (x < 0) {
			//変数returnNumberに-xの値を代入する
			returnNumber = -x;
		}
		//絶対値が代入されている変数returnNumberを返す
		return returnNumber;
	}
	/*
	 * 関数名：absolute
	 * 概要：float型の実数xの絶対値を求めるメソッド
	 * テキストによって、float absolute(float x)は指定
	 * 引数：float x
	 * 戻り値：returnNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static float absolute(float x) {
		//変数returnNumberを生成し、xの値で初期化する
		float returnNumber = x;
		//xの値が負の場合
		if (x < 0) {
			//変数returnNumberに-xの値を代入する
			returnNumber = -x;
		}
		//絶対値が代入されている変数returnNumberを返す
		return returnNumber;
	}
	/*
	 * 関数名：absolute
	 * 概要：double型の実数xの絶対値を求めるメソッド
	 * テキストによって、double absolute(double x)は指定
	 * 引数：double x
	 * 戻り値：returnNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static double absolute(double x) {
		//変数returnNumberを生成し、xの値で初期化する
		double returnNumber = x;
		//xの値が負の場合
		if (x < 0) {
			//変数returnNumberに-xの値を代入する
			returnNumber = -x;
		}
		//絶対値が代入されている変数returnNumberを返す
		return returnNumber;
	}
	/*
	 * 関数名：main
	 * 概要：多重定義されたメソッド群から絶対値を受け取って表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	public static void main(String[] args) {
		//画面にint型の値の入力を促す
		System.out.print("int型の値：");
		//変数firstNumberを生成し、キーボードから入力した値で初期化する
		int firstNumber = standardInput.nextInt();
		//画面にlong型の値の入力を促す
		System.out.print("long型の値：");
		//変数secondNumberを生成し、キーボードから入力した値で初期化する
		long secondNumber = standardInput.nextLong();
		//画面にfloat型の値の入力を促す
		System.out.print("float型の値：");
		//変数thirdNumberを生成し、キーボードから入力した値で初期化する
		float thirdNumber = standardInput.nextFloat();
		//画面にfloat型の値の入力を促す
		System.out.print("double型の値：");
		//変数fourthNumberを生成し、キーボードから入力した値で初期化する
		double fourthNumber = standardInput.nextDouble();
		
		//int型の整数の絶対値を表示することを伝える
		System.out.print("int型の整数の絶対値：");
		//画面にメソッドabsoluteから受け取った絶対値を表示する
		System.out.println(absolute(firstNumber));
		//long型の整数の絶対値を表示することを伝える
		System.out.print("long型の整数の絶対値：");
		//画面にメソッドabsoluteから受け取った絶対値を表示する
		System.out.println(absolute(secondNumber));
		//float型の実数の絶対値を表示することを伝える
		System.out.print("float型の実数の絶対値：");
		//画面にメソッドabsoluteから受け取った絶対値を表示する
		System.out.println(absolute(thirdNumber));
		//double型の実数の絶対値を表示することを伝える
		System.out.print("double型の実数の絶対値：");
		//画面にメソッドabsoluteから受け取った絶対値を表示する
		System.out.println(absolute(fourthNumber));
		
	}
}
