//パッケージ名の宣言
package ensyu7_14;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_14
 * 概要  :演習7-14クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.27
 */
public class Ensyu7_14 {
	/*
	 * 関数名：printBits
	 * 概要：テキストによって、void printBits(int x)は指定
	 * 引数：x
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.27
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
	 * 関数名：setN
	 * 概要：テキストによって、int setN(int x, int pos, int n)は指定
	 * 引数：x, pos, n
	 * 戻り値：returnNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.27
	 */
	static int setN(int x, int pos, int n) {
		//変数setNumberを生成し、1で初期化する
		int setNumber = 1;
		//変数returnNumberを生成し、1で初期化する
		int returnNumber = 1;
		
		//変数setNumberの値を左方へpos分シフトする
		setNumber = setNumber << pos;
		/*
		 * 「連続するn個を1にする作業を行う」
		 * 変数iを生成し、1で初期化する、変数iをインクリメントしながら
		 * iの値がnになるまで繰り返す
		 */
		for (int i = 1; i < n; i++) {
			//xにxとsetNumberのビット単位の論理和を代入する
			x = x | setNumber;
			//変数setNumberの値を左方へ1つシフトする
			setNumber = setNumber << 1;
		}
		//変数returnNumberにxとsetNumberのビット単位の論理和を代入する
		returnNumber = x | setNumber;
		
		//returnNumberを返す
		return returnNumber;
	}
	/*
	 * 関数名：resetN
	 * 概要：テキストによって、int resetN(int x, int pos, int n)は指定
	 * 引数：x, pos, n
	 * 戻り値：returnNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.27
	 */
	static int resetN(int x, int pos, int n) {
		//変数changeNumberを生成し、1で初期化する
		int changeNumber = 1;
		//変数returnNumberを生成し、1で初期化する
		int returnNumber = 1;
		//変数changeNumberの値を左方へpos分シフトする
		changeNumber = changeNumber << pos;
		/*
		 * 「連続するn個を0にする作業を行う」
		 * 変数iを生成し、1で初期化する、変数iをインクリメントしながら
		 * iの値がnになるまで繰り返す
		 */
		for (int i = 1; i < n; i++) {
			//xにxのビット単位の補数とchangeNumberのビット単位の論理和を代入する
			x = ~x | changeNumber;
			//xにxのビット単位の補数を代入する
			x = ~x;
			//変数changeNumberの値を左方へ1つシフトする
			changeNumber = changeNumber << 1;
		}
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
	 * 関数名：inverseN
	 * 概要：テキストによって、int inverseN(int x, int pos, int n)は指定
	 * 引数：x, pos, n
	 * 戻り値：returnNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.27
	 */
	static int inverseN(int x, int pos, int n) {
		//変数inverseNumberを生成し、1で初期化する
		int inverseNumber = 1;
		//変数returnNumberを生成し、1で初期化する
		int returnNumber = 1;
		//変数inverseNumberの値を左方へpos分シフトする
		inverseNumber = inverseNumber << pos;
		/*
		 * 「連続するn個を反転する作業を行う」
		 * 変数iを生成し、1で初期化する、変数iをインクリメントしながら
		 * iの値がnになるまで繰り返す
		 */
		for (int i = 1; i < n; i++) {
			//xにxとinverseNumberのビット単位の排他的論理和を代入する
			x = x ^ inverseNumber;
			//変数inverseNumberの値を左方へ1つシフトする
			inverseNumber = inverseNumber << 1;
		}
		//変数returnNumberにxとinverseNumberのビット単位の排他的論理和を代入する
		returnNumber = x ^ inverseNumber;
		//returnNumberを返す
		return returnNumber;
	}
	
	/*
	 * 関数名：main
	 * 概要：入力した整数のposビット目を最下位として
	 * 連続するn個のビットを1にした値、0にした値、反転した値を受け取る
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.27
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//intのビット数を表す変数BIT_VALUEを生成し、31で初期化する
		final int BIT_VALUE = 31;
		//連続できる個数の上限を表す変数LIMIT_NUMBERを生成し、32で初期化する
		final int LIMIT_NUMBER = 32;
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
		
		//変更するビット目を表す変数bitNumberを生成し、0で初期化する
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
		
		//連続する個数を入力するための変数consecutiveNumberを生成し、0で初期化する
		int consecutiveNumber = 0;
		
		/*
		 * while (consecutiveNumber < 1 || consecutiveNumber > 
		 * (LIMIT_NUMBER - bitNumber))
		 * までの文を実行する
		 */
		do {
			//画面に連続する個数の入力を促す
			System.out.print("連続する個数：");
			//変数consecutiveNumberにキーボードから入力した値を代入する
			consecutiveNumber = standardInput.nextInt();
			/*
			 * 変数consecutiveNumberの値が1より小さいか
			 * (LIMIT_NUMBER - bitNumber)の値より大きい場合
			 */
			if (consecutiveNumber < 1 || consecutiveNumber > (LIMIT_NUMBER - bitNumber)) {
				//画面に入力できる範囲を表示する
				System.out.println("1以上" + (LIMIT_NUMBER - bitNumber) + "以下の値を入力してください。");
			}
		/*
		 * 変数consecutiveNumberの値が1より小さいか
		 * (LIMIT_NUMBER - bitNumber)の値より大きいあいだdoからwhileを繰り返す
		 */
		} while (consecutiveNumber < 1 || consecutiveNumber > (LIMIT_NUMBER - bitNumber));
		
		
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
		//変数receiveNumberにメソッドsetNから受け取った値を代入する
		receiveNumber = setN(integerNumber, bitNumber, consecutiveNumber);
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
		//変数receiveNumberにメソッドresetNから受け取った値を代入する
		receiveNumber = resetN(integerNumber, bitNumber, consecutiveNumber);
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
		//変数receiveNumberにメソッドinverseNから受け取った値を代入する
		receiveNumber = inverseN(integerNumber, bitNumber, consecutiveNumber);
		//入力したビット目を反転した値を表示する
		System.out.println(receiveNumber);
		//画面にビットの内容=と表示する
		System.out.print("ビットの内容 = ");
		//入力したビット目を反転した値のビットの内容を表示する
		printBits(receiveNumber);
		
	}

}