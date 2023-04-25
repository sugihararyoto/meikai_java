package ensyu7_9;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_9
 * 概要  :演習7-9クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.24
 */
public class Ensyu7_9 {
	/*
	 * 関数名：readPlusInt
	 * 概要：テキストによって、int readPlusInt()は指定
	 * 正の整数値を返却する
	 * 引数：なし
	 * 戻り値：inputNumber(正の整数値)
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.24
	 */
	static int readPlusInt() {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//変数inputNumberを生成し、0で初期化する
		int inputNumber = 0;
		
		//while (inputNumber <= 0)までの文を実行する
		do {
			//画面に正の整数値の入力を促す
			System.out.print("正の整数値：");
			//変数inputNumberにキーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
		//入力された値が正の整数値ではないあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0);
		
		//inputNumberを返す
		return inputNumber;
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
		//メソッドreadPlusIntを呼び出す
		readPlusInt();
	}

}
