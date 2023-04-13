//パッケージ名の宣言
package ensyu4_19;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_19
 * 概要  :演習4-19クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.13
 */
public class Ensyu4_19 {
	/*
	 * 関数名：main
	 * 概要：季節を求めるList4-1の月の読み込みにおいて、
	 * 1~12以外の値が入力された場合は再入力させるように修正する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.13
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//繰り返しのための変数retryNumberを生成し、0で初期化する。
		int retryNumber = 0;
		//月を表す変数monthNumberを生成し、0で初期化する。
		int monthNumber = 0;
		
		//while (retryNumber == 1)までの文を実行する
		do {
			//while (monthNumber < 1 || monthNumber > 12)までの文を実行する
			do {
				//画面に季節を求めます。何月ですかと表示する
				System.out.print("季節を求めます。\n何月ですか：");
				//変数monthNumberにキーボードから入力した値を代入する
				monthNumber = standardInput.nextInt();
				//変数monthNumberの値が3以上5以下の場合
				if (monthNumber >= 3 && monthNumber <= 5) {
					//画面にそれは春です。と表示する
					System.out.println("それは春です。");
				//変数monthNumberの値が6以上8以下の場合
				} else if (monthNumber >= 6 && monthNumber <= 8) {
					//画面にそれは夏です。と表示する
					System.out.println("それは夏です。");
				//変数monthNumberの値が9以上11以下の場合
				} else if (monthNumber >= 9 && monthNumber <= 11) {
					//画面にそれは秋です。と表示する
					System.out.println("それは秋です。");
				//変数monthNumberの値が12,1,2の場合
				} else if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
					//画面にそれは秋です。と表示する
					System.out.println("それは冬です。");
				}
			/*
			 * 変数monthNumberの値が1よりも小さく、12よりも大きいあいだ
			 * doからwhileまでを繰り返す
			 */
			} while (monthNumber < 1 || monthNumber > 12);
			
			//while (retryNumber != 1 && retryNumber != 0)までの文を実行する
			do {
				//画面でもう一回操作を繰り返すかどうかを確認する
				System.out.print("もう一度？ 1…Yes/0…No：");
				//変数retryNumberにキーボードから入力された値を代入する
				retryNumber = standardInput.nextInt();
			//変数retryNumberの値が1でも0でもないあいだ繰り返す
			} while (retryNumber != 1 && retryNumber != 0);
			
		//変数retryNumberの値が1のあいだdoからwhileまでを繰り返す
		} while (retryNumber == 1);
	}

}
