//パッケージ名の宣言
package ensyu7_1;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_1
 * 概要  :演習7-1クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.21
 */
public class Enysu7_1 {
	/*
	 * 関数名：signOf
	 * 概要：テキストによって、signOf(int n)は指定
	 * 引数：n (正の数なら1、0なら0、負の数なら-1)
	 * 戻り値：returnNumber(-1,0,1)
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.21
	 */
	static int signOf(int n) {
		//変数returnNumberを生成し、0で初期化する
		int returnNumber = 0;
		//nが0より大きい場合
		if (n > 0) {
			//nに1を代入する
			returnNumber = 1;
		//nが0より小さい場合
		} else if (n < 0) {
			//nに-1を代入する
			returnNumber = -1;
		//nが0の場合
		} else {
			//nに0を代入する
			returnNumber = 0;
		}
		//returnNumberを返す
		return returnNumber;
	}
	/*
	 * 関数名：main
	 * 概要：テスト用のメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.21
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//画面に整数値の入力を促す
		System.out.print("整数値：");
		//変数inputNumberを生成し、キーボードから入力された値で初期化する
		int inputNumber = standardInput.nextInt();
		//画面に返却された値を表示する
		System.out.println("返却された値：" + signOf(inputNumber));
		
	}

}
