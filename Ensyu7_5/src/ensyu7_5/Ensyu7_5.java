//パッケージ名の宣言
package ensyu7_5;
/*
 * クラス名:Ensyu7_5
 * 概要  :演習7-5クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.24
 */
public class Ensyu7_5 {
	/*
	 * 関数名：hello
	 * 概要：テキストによって、void hello()は指定
	 * 画面にこんにちは。と表示して改行する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.24
	 */
	static void hello() {
		//画面にこんにちは。と表示する
		System.out.println("こんにちは。");
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
		//画面にこんにちは。と表示します。と表示する
		System.out.println("こんにちは。と表示します。");
		//メソッドhelloを呼び出す
		hello();
		
	}

}
