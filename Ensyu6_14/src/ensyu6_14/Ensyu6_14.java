//パッケージ名の宣言
package ensyu6_14;
//importする
import java.util.Random;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu6_14
 * 概要  :演習6-14クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.20
 */
public class Ensyu6_14 {
	/*
	 * 関数名：main
	 * 概要：月を1~12の数値として表示して、その英語表現を
	 * 入力させる英単語学習プログラムを作成
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.20
	 */
	public static void main(String[] args) {
		//乱数を生成する準備
		Random randomNumber = new Random();
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//月の数を表す変数MONTH_NUMBERを生成し、12で初期化する
		final int MONTH_NUMBER = 12;
		//繰り返しを行うための変数retryNumberを生成し、0で初期化する
		int retryNumber = 0;
		//連続した月が出題されないように変数resetNumberを生成し、0で初期化する
		int resetNumber = 0;
		//論理型の変数repeatNumberを生成し、trueで初期化する
		boolean repeatNumber = true;
		
		//文字列の配列を生成し、各月の英単語を代入する
		String[] monthString = {
				"January", "Febuary", "March", "April", "May", "June", "July",
				"August", "September","October", "November", "December"
		};
		
		//画面に英語の月名を入力してください。と表示する
		System.out.println("英語の月名を入力してください。");
		//画面に先頭は大文字で、2文字目以降は小文字とすることを表示する
		System.out.println("なお、先頭は大文字で、2文字目以降は小文字とします。");
		
		//while (retryNumber == 1)までの文を実行する
		do {
			//変数repeatNumberにtrueを代入する
			repeatNumber = true;
			//変数problemNumberを生成し、0~11の値をランダムで生成し、その値で初期化する
			int problemNumber = randomNumber.nextInt(MONTH_NUMBER);
			
			/*
			 * 変数retryNumberの値が1（繰り返しを行った）かつ
			 * 変数problemNumberの値が変数resetNumberの値と等しい場合（同じ値が連続した場合）
			 */
			while (problemNumber == resetNumber && retryNumber == 1) {
				//もう一度、変数problemNumberに0~11の値をランダムで生成し、代入する
				problemNumber = randomNumber.nextInt(MONTH_NUMBER);
			}
			
			//変数repeatNumberがtrueであるあいだ繰り返す
			while (repeatNumber == true) {
				//画面に英単語の入力を促す
				System.out.print(problemNumber + 1 + "月：");
				//変数inputStringを生成し、キーボードから入力した文字列で初期化する
				String inputString = standardInput.next();
				
				//monthString[problemNumber]と入力された文字が等しい場合
				if (monthString[problemNumber] .equals (inputString)) {
					//画面に正解です。と表示する
					System.out.println("正解です。");
					//変数resetNumberに変数problemNumberの値を代入する
					resetNumber = problemNumber;
					//画面にもう一度繰り返すかどうか入力を促す
					System.out.print("もう一度？ 1…Yes / 1以外…No：");
					//変数retryNumberにキーボードから入力した値を代入する
					retryNumber = standardInput.nextInt();
					//変数repeatNumberにfalseを代入する
					repeatNumber = false;
				
				//monthString[problemNumber]と入力された文字が等しくない場合
				} else {
					//画面に違います。と表示する
					System.out.println("違います。");
				}
			}
		//変数retryNumberの値が0のあいだdoからwhileまでを繰り返す
		} while (retryNumber == 1);
	}

}
