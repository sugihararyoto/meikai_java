//パッケージ名の宣言
package ensyu15_2;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu15_2
 * 概要  :演習15-2クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.22
 */
public class Ensyu15_2 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：main
	 * 概要：文字列を読み込んで、その全文字の文字コードを表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public static void main(String[] args) {
		//文字列の入力を促す
		System.out.print("文字列s：");
		//文字列をキーボードから読み込む
		String inputString = standardInput.nextLine();
		/*
		 * 「文字コードを表示するためのfor文」
		 */
		for (int i = 0; i < inputString.length(); i++) {
			//s[i]の文字コードを表示する
			System.out.println("s[" + i + "] = " + inputString.codePointAt(i));
		}
	}

}
