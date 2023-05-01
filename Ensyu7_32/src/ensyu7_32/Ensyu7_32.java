//パッケージ名の宣言
package ensyu7_32;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_32
 * 概要  :演習7-32クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.01
 */
public class Ensyu7_32 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：printBits
	 * 概要：byte型整数のビットの内容を表示するメソッド
	 * テキストによって、void printBits(byte x)は指定
	 * 引数：byte x
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static void printBits(byte x) {
		//ビット数から1を引いた数を表す変数BIT_NUMBERを生成し、7で初期化する
		final int BIT_NUMBER = 7;
		/*
		 * 「byte型整数のビットの内容を表示する」
		 * 変数iを生成し、BIT_NUMBERで初期化する
		 * iの値をデクリメントし、iが0より小さくなるまで繰り返す
		 */
		for (int i = BIT_NUMBER; i >= 0; i--) {
			//第iビットが1の場合
			if ((x >>> i & 1) == 1) {
				//画面に1と表示する
				System.out.print('1');
			//第iビットが1でない場合
			} else {
				//画面に0と表示する
				System.out.print('0');
			}
		}
	}
	/*
	 * 関数名：printBits
	 * 概要：short型整数のビットの内容を表示するメソッド
	 * テキストによって、void printBits(short x)は指定
	 * 引数：short x
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static void printBits(short x) {
		//ビット数から1を引いた数を表す変数BIT_NUMBERを生成し、15で初期化する
		final int BIT_NUMBER = 15;
		/*
		 * 「short型整数のビットの内容を表示する」
		 * 変数iを生成し、BIT_NUMBERで初期化する
		 * iの値をデクリメントし、iが0より小さくなるまで繰り返す
		 */
		for (int i = BIT_NUMBER; i >= 0; i--) {
			//第iビットが1の場合
			if ((x >>> i & 1) == 1) {
				//画面に1と表示する
				System.out.print('1');
			//第iビットが1でない場合
			} else {
				//画面に0と表示する
				System.out.print('0');
			}
		}
	}
	/*
	 * 関数名：printBits
	 * 概要：int型整数のビットの内容を表示するメソッド
	 * テキストによって、void printBits(int x)は指定
	 * 引数：int x
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static void printBits(int x) {
		//ビット数から1を引いた数を表す変数BIT_NUMBERを生成し、31で初期化する
		final int BIT_NUMBER = 31;
		/*
		 * 「int型整数のビットの内容を表示する」
		 * 変数iを生成し、BIT_NUMBERで初期化する
		 * iの値をデクリメントし、iが0より小さくなるまで繰り返す
		 */
		for (int i = BIT_NUMBER; i >= 0; i--) {
			//第iビットが1の場合
			if ((x >>> i & 1) == 1) {
				//画面に1と表示する
				System.out.print('1');
			//第iビットが1でない場合
			} else {
				//画面に0と表示する
				System.out.print('0');
			}
		}
	}
	/*
	 * 関数名：printBits
	 * 概要：long型整数のビットの内容を表示するメソッド
	 * テキストによって、void printBits(long x)は指定
	 * 引数：long x
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static void printBits(long x) {
		//ビット数から1を引いた数を表す変数BIT_NUMBERを生成し、63で初期化する
		final int BIT_NUMBER = 63;
		/*
		 * 「long型整数のビットの内容を表示する」
		 * 変数iを生成し、BIT_NUMBERで初期化する
		 * iの値をデクリメントし、iが0より小さくなるまで繰り返す
		 */
		for (int i = BIT_NUMBER; i >= 0; i--) {
			//第iビットが1の場合
			if ((x >>> i & 1) == 1) {
				//画面に1と表示する
				System.out.print('1');
			//第iビットが1でない場合
			} else {
				//画面に0と表示する
				System.out.print('0');
			}
		}
	}
	/*
	 * 関数名：main
	 * 概要：int型整数の内部のビットを表示するメソッドを他の整数型に対しても行う
	 * 多重定義されたメソッド群から受け取るメインのメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	public static void main(String[] args) {
		//画面にbyte型の値の入力を促す
		System.out.print("byte型の値：");
		//変数firstNumberを生成し、キーボードから入力した値で初期化する
		byte firstNumber = standardInput.nextByte();
		//画面にshort型の値の入力を促す
		System.out.print("short型の値：");
		//変数secondNumberを生成し、キーボードから入力した値で初期化する
		short secondNumber = standardInput.nextShort();
		//画面にint型の値の入力を促す
		System.out.print("int型の値：");
		//変数thirdNumberを生成し、キーボードから入力した値で初期化する
		int thirdNumber = standardInput.nextInt();
		//画面にlong型の値の入力を促す
		System.out.print("long型の値：");
		//変数fourthNumberを生成し、キーボードから入力した値で初期化する
		long fourthNumber = standardInput.nextLong();
		
		//byte型の整数の絶対値を表示することを伝える
		System.out.println("byte型の整数のビットの内容");
		//画面にメソッドprintBitsから受け取ったビットの内容を表示する
		printBits(firstNumber);
		//short型の整数の絶対値を表示することを伝える
		System.out.println("\nshort型の整数のビットの内容");
		//画面にメソッドprintBitsから受け取ったビットの内容を表示する
		printBits(secondNumber);
		//int型の整数の絶対値を表示することを伝える
		System.out.println("\nint型の整数のビットの内容");
		//画面にメソッドprintBitsから受け取ったビットの内容を表示する
		printBits(thirdNumber);
		//long型の整数の絶対値を表示することを伝える
		System.out.println("\nlong型の整数のビットの内容");
		//画面にメソッドprintBitsから受け取ったビットの内容を表示する
		printBits(fourthNumber);
	}

}
