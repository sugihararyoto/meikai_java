//パッケージ名の宣言
package ensyu4_13;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_13
 * 概要  :演習4-13クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.12
 */
public class Ensyu4_13 {
	/*
	 * 関数名：main
	 * 概要：List4-10をfor文で実現する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.12
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
		
		//合計を表す変数sumNumberを生成し、0で初期化する
		int sumNumber = 0;
		
		/*
		 * 変数incrementNumberを生成し、1で初期化した後に一つずつ値を増やしながら
		 * 変数inputNumberの値になるまで繰り返す
		 */
		for (int incrementNumber = 1;incrementNumber <= inputNumber;incrementNumber++) {
			//変数sumNumberに変数incrementNumberの値を足す
			sumNumber += incrementNumber;
		}
		
		//画面に1から入力した値までの和を表示する
		System.out.println("1から" + inputNumber + "までの和は" + sumNumber + "です。");
	}

}
