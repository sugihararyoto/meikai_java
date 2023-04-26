//パッケージ名の宣言
package ensyu7_12;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_12
 * 概要  :演習7-12クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.25
 */
public class Ensyu7_12 {
	/*
	 * 関数名：lRotate
	 * 概要：テキストによって、int lRotate(int x, int n)は指定
	 * 引数：x, n
	 * 戻り値：sumNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.25
	 */
	static int lRotate(int x, int n) {
		//ビット数を表す変数BIT_NUMBERを生成し、31で初期化する
		final int BIT_NUMBER = 31;
		//2乗を計算するための変数SQUARE_NUMBERを生成し、2で初期化する
		final int SQUARE_NUMBER = 2;
		//変数sumNumberを生成し、0で初期化する
		int sumNumber = 0;
		//変数twiceNumberを生成し、後にSQUARE_NUMBERをかけるため、1で初期化する
		int twiceNumber = 1;
		
		//画面に左に回転した値のビットの内容を表示します。と表示する
		System.out.println("左に回転した値のビットの内容を表示します。");
		
		/*
		 * 「(BIT_NUMBER - n)~0ビット目までのビットをBIT_NUMBER~nビット目までに表示する」
		 * 変数iを生成し、BIT_NUMBER - nの値で初期化する
		 * iの値をデクリメントし、iが0より小さくなるまで繰り返す
		 */
		for (int i = BIT_NUMBER - n; i >= 0; i--) {
			//第iビットが1の場合
			if ((x >>> i & 1) == 1) {
				//画面に1と表示する
				System.out.print('1');
				/*
				 * 「(BIT_NUMBER - n)~0ビット目までのべき乗の計算を行う」
				 * 変数jを生成し、i + nの値で初期化する
				 * jの値をデクリメントし、jが0になるまで繰り返す
				 */
				for (int j = i + n; j > 0; j--) {
					//twiceNumberにSQUARE_NUMBERを掛けてべき乗を作る
					twiceNumber *= SQUARE_NUMBER;
				}
				//変数sumNumberに変数twiceNumberの値を足す
				sumNumber += twiceNumber;
				//次の計算のために変数twiceNumberに1を代入する
				twiceNumber = 1;
			//第iビットが1でない場合
			} else {
				//画面に0と表示する
				System.out.print('0');
			}
		}
		
		/*
		 * 「BIT_NUMBER~(BIT_NUMBER - n)ビット目までのビットを
		 * (n - 1)~0ビット目までに表示、計算を行う」
		 * 変数iを生成し、BIT_NUMBERの値で初期化する
		 * iの値をデクリメントし、iがBIT_NUMBER - nの値より小さくなるまで繰り返す
		 */
		for (int i = BIT_NUMBER; i > BIT_NUMBER - n; i--) {
			//第iビットが1の場合
			if ((x >>> i & 1) == 1) {
				//画面に1と表示する
				System.out.print('1');
				/*
				 * 「BIT_NUMBER~(BIT_NUMBER - n)ビット目までのべき乗の計算を行う」
				 * 変数jを生成し、iから(BIT_NUMBER -(n - 1))を引いた値で初期化する
				 * jの値をデクリメントし、jが0になるまで繰り返す
				 */
				for (int j = i - (BIT_NUMBER - (n - 1)); j > 0; j--) {
					//twiceNumberにSQUARE_NUMBERを掛けてべき乗を作る
					twiceNumber *= SQUARE_NUMBER;
				}
				//変数sumNumberに変数twiceNumberの値を足す
				sumNumber += twiceNumber;
				//次の計算のために変数twiceNumberに1を代入する
				twiceNumber = 1;
			//第iビットが1でない場合
			} else {
				//画面に0と表示する
				System.out.print('0');
			}
		}
		
		//画面に右に回転した値を表示します。と表示する
		System.out.println("\n左に回転した値を表示します。");
		//画面に値と表示する
		System.out.print("値 = ");
		//sumNumberを返す
		return sumNumber;
	}
	/*
	 * 関数名：rRotate
	 * 概要：テキストによって、int rRotate(int x, int n)は指定
	 * 引数：x, n
	 * 戻り値：sumNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.25
	 */
	static int rRotate(int x, int n) {
		//ビット数を表す変数BIT_NUMBERを生成し、31で初期化する
		final int BIT_NUMBER = 31;
		//2乗を計算するための変数SQUARE_NUMBERを生成し、2で初期化する
		final int SQUARE_NUMBER = 2;
		//変数sumNumberを生成し、0で初期化する
		int sumNumber = 0;
		//変数twiceNumberを生成し、後にSQUARE_NUMBERをかけるため、1で初期化する
		int twiceNumber = 1;
		
		//画面に右に回転した値のビットの内容を表示します。と表示する
		System.out.println("右に回転した値のビットの内容を表示します。");
		/*
		 * 「(n - 1)~0ビット目までのビットを
		 * BIT_NUMBER~(BIT_NUMBER - n - 1)ビット目までに表示、計算を行う」
		 * 変数iを生成し、n - 1の値で初期化する
		 * iの値をデクリメントし、iが0より小さくなるまで繰り返す
		 */
		for (int i = n - 1; i >= 0; i--) {
			//第iビットが1の場合
			if ((x >>> i & 1) == 1) {
				//画面に1と表示する
				System.out.print('1');
				/*
				 * 「BIT_NUMBER~(BIT_NUMBER - n - 1)ビット目までのべき乗の計算を行う」
				 * 変数jを生成し、BIT_NUMBERから(n - 1 - i)を引いた値で初期化する
				 * jの値をデクリメントし、jが0になるまで繰り返す
				 */
				for (int j = BIT_NUMBER - (n - 1 - i); j > 0; j--) {
					//twiceNumberにSQUARE_NUMBERを掛けてべき乗を作る
					twiceNumber *= SQUARE_NUMBER;
				}
				//変数sumNumberに変数twiceNumberの値を足す
				sumNumber += twiceNumber;
				//次の計算のために変数twiceNumberに1を代入する
				twiceNumber = 1;
			//第iビットが1でない場合
			} else {
				//画面に0と表示する
				System.out.print('0');
			}
		}
		
		/*
		 * 「BIT_NUMBER~nビット目までのビットを
		 * (BIT_NUMBER - n)~0ビット目までに表示する」
		 * 変数iを生成し、BIT_NUMBERの値で初期化する
		 * iの値をデクリメントし、iがnより小さくなるまで繰り返す
		 */
		for (int i = BIT_NUMBER; i >= n; i--) {
			//第iビットが1の場合
			if ((x >>> i & 1) == 1) {
				//画面に1と表示する
				System.out.print('1');
				/*
				 * 「(BIT_NUMBER - n)~0ビット目までのべき乗の計算を行う」
				 * 変数jを生成し、i - nの値で初期化する
				 * jの値をデクリメントし、jが0になるまで繰り返す
				 */
				for (int j = i - n; j > 0; j--) {
					//twiceNumberにSQUARE_NUMBERを掛けてべき乗を作る
					twiceNumber *= SQUARE_NUMBER;
				}
				//変数sumNumberに変数twiceNumberの値を足す
				sumNumber += twiceNumber;
				//次の計算のために変数twiceNumberに1を代入する
				twiceNumber = 1;
			//第iビットが1でない場合
			} else {
				//画面に0と表示する
				System.out.print('0');
			}
		}
		//画面に右に回転した値を表示します。と表示する
		System.out.println("\n右に回転した値を表示します。");
		//画面に値と表示する
		System.out.print("値 = ");
		//sumNumberを返す
		return sumNumber;
	}
	/*
	 * 関数名：main
	 * 概要：整数と回転するビット数を入力し、右回転と左回転の値を受け取る
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.25
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//intのビット数を表す変数BIT_INTを生成し、32で初期化する
		final int BIT_INT = 32;
		
		//画面に整数の入力を促す
		System.out.print("整数：");
		//変数integerNumberを生成し、キーボードから入力した値で初期化する
		int integerNumber =  standardInput.nextInt();
		
		//変数rotateNumberを生成し、0で初期化する
		int rotateNumber = 0;
		//while (rotateNumber < 0 || rotateNumber > BIT_INT)までの文を実行する
		do {
			//画面に回転するビット数の入力を促す
			System.out.print("回転するビット数：");
			//変数rotateNumberにキーボードから入力した値を代入する
			rotateNumber = standardInput.nextInt();
			//変数rotateNumberの値が0未満かBIT_INT以上の場合
			if (rotateNumber < 0 || rotateNumber > BIT_INT) {
				//画面に0以上BIT_INT以下の値を入力してください。と表示する
				System.out.println("0以上" + BIT_INT + "以下の値を入力してください。");
			}
		//変数rotateNumberの値が0未満かBIT_INT以上のあいだdoからwhileまでを繰り返す
		} while (rotateNumber < 0 || rotateNumber > BIT_INT);
		
		//右に回転した後のビットの内容と整数を表示する
		System.out.println(rRotate(integerNumber, rotateNumber));
		//左に回転した後のビットの内容と整数を表示する
		System.out.println(lRotate(integerNumber, rotateNumber));
	}

}
