//パッケージ名の宣言
package ensyu7_13;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_13
 * 概要  :演習7-13クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.26
 */
public class Ensyu7_13 {
	/*
	 * 関数名：printBits
	 * 概要：テキストによって、void printBits(int x)は指定
	 * 引数：x
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.26
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
	 * 関数名：set
	 * 概要：テキストによって、int set(int x, int pos)は指定
	 * 引数：x, pos
	 * 戻り値：returnNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.26
	 */
	static int set(int x, int pos) {
		//変数setNumberを生成し、1で初期化する
		int setNumber = 1;
		//変数returnNumberを生成し、1で初期化する
		int returnNumber = 1;
		//変数setNumberの値を左方へpos分シフトする
		setNumber = setNumber << pos;
		//変数returnNumberにxとsetNumberのビット単位の論理和を代入する
		returnNumber = x | setNumber;
		//returnNumberを返す
		return returnNumber;
	}
	/*
	 * 関数名：reset
	 * 概要：テキストによって、int reset(int x, int pos)は指定
	 * 引数：x, pos
	 * 戻り値：returnNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.26
	 */
	static int reset(int x, int pos) {
		//変数changeNumberを生成し、1で初期化する
		int changeNumber = 1;
		//変数returnNumberを生成し、1で初期化する
		int returnNumber = 1;
		//変数changeNumberの値を左方へpos分シフトする
		changeNumber = changeNumber << pos;
		/*
		 * 変数returnNumberにxのビット単位の補数と
		 * changeNumberのビット単位の論理和を代入する
		 */
		returnNumber = ~x | changeNumber;
		//変数returnNumberに変数returnNumberの値のビット単位の補数を代入する
		returnNumber = ~returnNumber;
		//returnNumberを返す
		return returnNumber;
	}
	/*
	 * 関数名：inverse
	 * 概要：テキストによって、int inverse(int x, int pos)は指定
	 * 引数：x, pos
	 * 戻り値：returnNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.26
	 */
	static int inverse(int x, int pos) {
		//変数inverseNumberを生成し、1で初期化する
		int inverseNumber = 1;
		//変数returnNumberを生成し、1で初期化する
		int returnNumber = 1;
		//変数inverseNumberの値を左方へpos分シフトする
		inverseNumber = inverseNumber << pos;
		//変数returnNumberにxとinverseNumberのビット単位の排他的論理和を代入する
		returnNumber = x ^ inverseNumber;
		//returnNumberを返す
		return returnNumber;
	}
	
	/*
	 * 関数名：main
	 * 概要：入力した整数のposビット目を1にした値、0にした値
	 * 反転した値を受け取る
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.26
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//intのビット数を表す変数BIT_VALUEを生成し、31で初期化する
		final int BIT_VALUE = 31;
		//変数integerNumberを生成し、0で初期化する
		int integerNumber = 0;
		
		//while (integerNumber < 0)までの文を実行する
		do {
			//画面に整数の入力を促す
			System.out.print("整数：");
			//変数integerNumberにキーボードから入力した値を代入する
			integerNumber =  standardInput.nextInt();
			//変数integerNumberの値が0未満の場合
			if (integerNumber < 0) {
				//画面に0以上の値を入力してください。と表示する
				System.out.println("0以上の値を入力してください。");
			}
		//変数integerNumberの値が0未満のあいだdoからwhileまでを繰り返す
		} while (integerNumber < 0);
		
		//変数bitNumberを生成し、0で初期化する
		int bitNumber = 0;
		
		//while (bitNumber < 0)までの文を実行する
		do {
			//画面に整数の入力を促す
			System.out.print("変更するビット目（0~" + BIT_VALUE + "）：");
			//変数bitNumberにキーボードから入力した値を代入する
			bitNumber =  standardInput.nextInt();
			//変数bitNumberの値が0未満かBIT_VALUEより大きい場合
			if (bitNumber < 0 || bitNumber > BIT_VALUE) {
				//画面に0以上BIT_VALUE以下の値を入力してください。と表示する
				System.out.println("0以上" + BIT_VALUE + "以下の値を入力してください。");
			}
		//変数bitNumberの値が0未満かBIT_VALUEより大きいあいだdoからwhileまでを繰り返す
		} while (bitNumber < 0 || bitNumber > BIT_VALUE);
		
		//画面に入力した整数のビットの内容を表示します。と表示する
		System.out.println("入力した整数のビットの内容を表示します。");
		//画面にビットの内容=と表示する
		System.out.print("ビットの内容 = ");
		//入力した整数のビットの内容を表示する
		printBits(integerNumber);
		
		//値を受け取るための変数receiveNumberを生成し、0で初期化する
		int receiveNumber = 0;
		
		//改行する
		System.out.println();
		//画面に1にした値=と表示する
		System.out.print("\n1にした値 = ");
		//変数receiveNumberにメソッドsetから受け取った値を代入する
		receiveNumber = set(integerNumber, bitNumber);
		//入力したビット目を1にした値を表示する
		System.out.println(receiveNumber);
		//画面にビットの内容=と表示する
		System.out.print("ビットの内容 = ");
		//入力したビット目を1にした値のビットの内容を表示する
		printBits(receiveNumber);
		
		//改行する
		System.out.println();
		//画面に0にした値=と表示する
		System.out.print("0にした値 = ");
		//変数receiveNumberにメソッドresetから受け取った値を代入する
		receiveNumber = reset(integerNumber, bitNumber);
		//入力したビット目を0にした値を表示する
		System.out.println(receiveNumber);
		//画面にビットの内容=と表示する
		System.out.print("ビットの内容 = ");
		//入力したビット目を0にした値のビットの内容を表示する
		printBits(receiveNumber);
		
		//改行する
		System.out.println();
		//画面に反転した値=と表示する
		System.out.print("反転した値 = ");
		//変数receiveNumberにメソッドinverseから受け取った値を代入する
		receiveNumber = inverse(integerNumber, bitNumber);
		//入力したビット目を反転した値を表示する
		System.out.println(receiveNumber);
		//画面にビットの内容=と表示する
		System.out.print("ビットの内容 = ");
		//入力したビット目を反転した値のビットの内容を表示する
		printBits(receiveNumber);
		
	}

}
