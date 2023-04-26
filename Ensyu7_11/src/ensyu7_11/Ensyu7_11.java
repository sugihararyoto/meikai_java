//パッケージ名の宣言
package ensyu7_11;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_11
 * 概要  :演習7-11クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.24
 */
public class Ensyu7_11 {
	/*
	 * 関数名：printBits
	 * 概要：テキストによって、void printBits(int x)は指定
	 * 引数：x
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.24
	 */
	static void printBits(int x) {
		//ビット数を表す変数BIT_NUMBERを生成し、31で初期化する
		final int BIT_NUMBER = 31;
		/*
		 * 「int型整数のビットの内容を表示する」
		 * 変数iを生成し、31で初期化する
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
	 * 概要：整数を左右にシフトした値が、2のべき乗での乗算や除算と
	 * 等しくなることを確認する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.24
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//2のべき乗を計算するための変数MULTIPLICATION_NUMBERを生成し、2で初期化する
		final int MULTIPLICATION_NUMBER = 2;
		//整数として表示するための変数INTEGER_VALUEを生成し、10000で初期化する
		final int INTEGER_VALUE = 10000;
		//シフトするビット数を表示するための変数SHIFT_VALUEを生成し、3で初期化する
		final int SHIFT_VALUE = 3;
		//左方シフトした時に掛ける値を表す変数leftShiftを生成し、1で初期化する
		int leftShift = 1;
		//右方シフトした時に割る値を表す変数rightShiftを生成し、1で初期化する
		int rightShift = 1;
		
		
		//変数integerNumberを生成し、INTEGER_VALUEで初期化する
		int integerNumber = INTEGER_VALUE;
		
		//画面に整数を表示する
		System.out.println("整数：" + INTEGER_VALUE);
		
		//変数shiftNumberを生成し、SHIFT_VALUEで初期化する
		int shiftNumber = SHIFT_VALUE;
		
		//画面にシフトするビット数を表示する
		System.out.println("シフトするビット数：" + SHIFT_VALUE);
		
		/*
		 * 「2のべき乗を作る」
		 * 変数iを生成し、0で初期化する
		 * iの値をインクリメントし、変数shiftNumberの値になるまで繰り返す
		 */
		for (int i = 0; i < shiftNumber; i++) {
			//変数leftShiftに変数MULTIPLICATION_NUMBERの値を掛ける
			leftShift *= MULTIPLICATION_NUMBER;
			//変数rightShiftに変数MULTIPLICATION_NUMBERの値を掛ける
			rightShift *= MULTIPLICATION_NUMBER;
		}
		//画面に整数=と表示する
		System.out.print(  "整数    = ");
		//int型整数のビットの内容を表示する
		printBits(integerNumber);
		//画面にx << n = と表示する
		System.out.print("\nx <<  n = ");
		//左方へシフトしたint型整数のビットの内容を表示する
		printBits(integerNumber << shiftNumber);
		//画面にx >> n = と表示する
		System.out.print("\nx >>  n = ");
		//右方へ算術シフトしたint型整数のビットの内容を表示する
		printBits(integerNumber >> shiftNumber);
		
		//画面に整数を左方へシフトした値を表示する
		System.out.println("\n2の" + shiftNumber + "乗を乗算した数：" + (integerNumber << shiftNumber));
		//画面に乗算した整数のビットの内容を表示します。を表示する
		System.out.println("乗算した整数のビットの内容を表示します。");
		//画面に整数=と表示する
		System.out.print(  "整数    = ");
		//左方へシフトした値のビットの内容を表示する
		printBits(integerNumber * leftShift);
		//画面に整数を右方へシフトした値を表示する
		System.out.println("\n2の" + shiftNumber + "乗を除算した数：" + (integerNumber >> shiftNumber));
		//画面に除算した整数のビットの内容を表示します。を表示する
		System.out.println("除算した整数のビットの内容を表示します。");
		//画面に整数=と表示する
		System.out.print(  "整数    = ");
		//右方へシフトした値のビットの内容を表示する
		printBits(integerNumber / rightShift);
		
		
	}

}
