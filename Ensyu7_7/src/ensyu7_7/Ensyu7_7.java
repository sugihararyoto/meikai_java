//パッケージ名の宣言
package ensyu7_7;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_7
 * 概要  :演習7-7クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.24
 */
public class Ensyu7_7 {
	/*
	 * 関数名：putChars
	 * 概要：テキストによって、void putChars(char c, int n)は指定
	 * 引数：c, n
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.24
	 */
	static void putChars(char c, int n) {
		//nをデクリメントし、0になるまで繰り返す
		while (n-- > 0) {
			//画面にcを表示する
			System.out.print(c);
		}
	}
	/*
	 * 関数名：putStars
	 * 概要：テキストによって、void putStars(int n)は指定
	 * 引数：n
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.24
	 */
	static void putStars(int n) {
		/*
		 * 変数iを生成し、0で初期化する
		 * iをインクリメントしていき、変数iの値がnになるまで繰り返す
		 */
		for (int i = 1; i <= n; i++) {
			//メソッドputCharsを呼び出す
			putChars('*', i);
			//改行する
			System.out.println();
		}
		
	}
	/*
	 * 関数名：main
	 * 概要：テスト用のメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.24
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//変数inputNumberを生成し、0で初期化する
		int inputNumber = 0;
		//画面に左上直角の三角形を表示します。と表示する
		System.out.println("左下直角の三角形を表示します。");
		
		//while (inputNumber <= 0)の文までを実行する
		do {
			//画面に段数の入力を促す
			System.out.print("段数は：");
			//変数inputNumberに、キーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
			//正ではない値が入力された場合
			if (inputNumber <= 0) {
				//画面に正ではない値が入力されました。と表示する
				System.out.println("正ではない値が入力されました。");
			}
			
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0);
		//メソッドputStarsを呼び出す
		putStars(inputNumber);
		
		
	}

}
