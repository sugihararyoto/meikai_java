//パッケージ名の宣言
package ensyu15_1;
//importする
import java.util.Scanner;

/*
 * クラス名:Ensyu15_1
 * 概要  :演習15-1クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.22
 */
public class Ensyu15_1 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：main
	 * 概要：文字列を読み込んで、その文字列を逆順に表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public static void main(String[] args) {
		//文字列の入力を促す
		System.out.print("文字列：");
		//文字列をキーボードから読み込む
		String inputString = standardInput.next();
		/*
		 * 「文字列を逆順に表示するためのfor文」
		 */
		for (int i = inputString.length() - 1; 0 <= i; i--) {
			//画面に入力した文字列の先頭からi個後ろの文字を表示する
			System.out.print(inputString.charAt(i));
			
		}
	}

}
