//パッケージ名の宣言
package ensyu3_11;
//importする
import java.util.Scanner;
/*
 * クラス名:ensyu3_11
 * 概要  :演習3-11クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.07
 */
public class ensyu3_11 {
	/* 関数名：main
	 * 概要：
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//画面に整数Aの入力を促す
		System.out.print("整数A：");
		//変数firstNumberにキーボードから入力した値を代入する
		int firstNumber = standardInput.nextInt();
		//画面に整数Bの入力を促す
		System.out.print("整数B：");
		//変数secondNumberにキーボードから入力した値を代入する
		int secondNumber = standardInput.nextInt();
		/* 差を表す変数differenceNumberを生成し
		 * 変数firstNumber > 変数secondNumberならば
		 * 変数firstNumber - 変数secondNumberの値を代入
		 * そうでないならば、変数secondNumber - 変数firstNumberの値を代入する
		 */
		int differenceNumber = firstNumber > secondNumber ? firstNumber - secondNumber: secondNumber - firstNumber;
		//変数differenceNumberの値（差）が10以下である場合に実行する
		if (differenceNumber <= 10 )
			//画面にそれらの差は10以下です。と表示する
			System.out.println("それらの差は10以下です。");
		//変数differenceNumberの値（差）が11以上の場合に実行する
		else
			//画面にそれらの差は11以上です。と表示する
			System.out.println("それらの差は11以上です。");
		
	}

}
