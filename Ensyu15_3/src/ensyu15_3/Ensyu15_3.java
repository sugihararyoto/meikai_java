//パッケージ名の宣言
package ensyu15_3;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu15_3
 * 概要  :演習15-3クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.22
 */
public class Ensyu15_3 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：main
	 * 概要：文字列探索のプログラムを書きかえて、
	 * 一致する部分が上下で揃うように表示するようにする。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public static void main(String[] args) {
		//文字列の入力を促す
		System.out.print("文字列s1：");
		//文字列をキーボードから読み込む
		String stringOne = standardInput.next();
		//文字列の入力を促す
		System.out.print("文字列s2：");
		//文字列をキーボードから読み込む
		String stringTwo = standardInput.next();
		
		//stringOneにstringTwoは含まれるか判定
		int indexNumber = stringOne.indexOf(stringTwo);
		//stringOneにstringTwoが含まれていない場合
		if (indexNumber == -1) {
			//stringOneにstringTwoが含まれていないことを伝える
			System.out.println("s1にs2は含まれません。");
		//stringOneにstringTwoが含まれている場合
		} else {
			//文字列s1の文字列を表示する
			System.out.println("s1：" + stringOne);
			//文字列s2の文字列を表示することを伝える
			System.out.print("s2：");
			/*
			 * 「上下を揃えて文字列を表示するためのfor文」
			 */
			for (int i = 0; i < stringOne.length(); i++) {
				//文字が一致した場合
				if (indexNumber == i) {
					//文字列s2の文字列を表示する
					System.out.print(stringTwo);
					//for文から抜ける
					break;
				//文字が一致していない場合
				} else {
					//画面に" "を表示する
					System.out.print(" ");
				}
				
			}
		}
		
	}

}
