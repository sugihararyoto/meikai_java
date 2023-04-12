//パッケージ名の宣言
package ensyu4_3;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_3
 * 概要  :演習4-3クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.11
 */
public class Ensyu4_3 {
	/*
	 * 関数名：main
	 * 概要：2つの整数値を読み込んで、小さいほうの数以上で大きいほうの数以下の
	 * 整数値を小さいほうから順に表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//画面に整数値の入力を促す
		System.out.print("整数A：");
		//変数firstNumberを生成し、キーボードから入力された値で初期化する
		int firstNumber = standardInput.nextInt();
		//画面に整数値の入力を促す
		System.out.print("整数B：");
		//変数secondNumberを生成し、キーボードから入力された値で初期化する
		int secondNumber = standardInput.nextInt();
		
		/*
		 * 変数minimumNumberを生成し、変数firstNumberと変数secondNumberのうち
		 * 小さいほうの値で初期化する
		 */
		int minimumNumber = (firstNumber < secondNumber ? firstNumber : secondNumber);
		/*
		 * 変数maximumNumberを生成し、変数firstNumberと変数secondNumberのうち
		 * 大きいほうの値で初期化する
		 */
		int maximumNumber = (firstNumber > secondNumber ? firstNumber : secondNumber);
		
		//while (minimumNumber <= maximumNumber)までの文を実行する
		do {
			//画面に小さい方の数を表示する
			System.out.print(minimumNumber);
			//画面に空白を表示する
			System.out.print(" ");
			//変数minimumNumberの数値に1を足す
			minimumNumber = minimumNumber + 1;
		/*
		 * 変数minimumNumberの値が変数maximumNumberの値以下の
		 * あいだdoからwhileまでを繰り返す
		 */
		} while (minimumNumber <= maximumNumber);
		
		
	}

}
