//パッケージ名の宣言
package ensyu7_4;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_4
 * 概要  :演習7-4クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.24
 */
public class Ensyu7_4 {
	/*
	 * 関数名：sumUp
	 * 概要：テキストによって、int sumUp(int n)は指定
	 * 引数：n
	 * 戻り値：sumNumber(1から入力した値までの和)
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.24
	 */
	static int sumUp(int n) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//合計を表す変数sumNumberを生成し、0で初期化する
		int sumNumber = 0;
		/*
		 * 変数iを生成し、0で初期化した後に一つずつ値を増やしながら
		 * nの値を超えるまで繰り返す
		 */
		for (int i = 0; i <= n; i++) {
			//変数sumNumberに変数iの値を足す
			sumNumber += i;
		}
		//sumNumberを返す
		return sumNumber;
		
	}
	/*
	 * 関数名：main
	 * 概要：整数を入力するテスト用のメソッド
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
		
		//while (inputNumber <= 0)までの文を実行する
		do {
			//画面に入力を促す
			System.out.print("nの値(正の整数)：");
			//変数inputNumberにキーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
			//正ではない値が入力された場合
			if (inputNumber <= 0) {
				//画面に正ではない値が入力されました。と表示する
				System.out.println("正ではない値が入力されました。");
			}
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0);
		
		//画面に1から入力した値までの和を表示する
		System.out.println("1から" + inputNumber + "までの和は" + sumUp(inputNumber) + "です。");
	}

}
