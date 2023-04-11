//パッケージ名の宣言
package ensyu4_6;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_6
 * 概要  :演習4-6クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.11
 */
public class Ensyu4_6 {
	/*
	 * 関数名：main
	 * 概要：読み込んだ値が1未満であれば改行文字を出力しないように
	 * List4-7を書きかえる
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//画面に入力を促す
		System.out.print("何個*を表示しますか：");
		//変数inputNumberを生成し、キーボードから入力した値を代入する
		int inputNumber = standardInput.nextInt();
		
		//変数incrementNumberを生成し、0を代入する
		int incrementNumber = 0;
		//変数incrementNumberが変数inputNumberの値より小さいあいだ繰り返す
		while (incrementNumber < inputNumber) {
			//画面に*を表示する
			System.out.print('*');
			//変数incrementNumberの値をインクリメント（値を一つ増やす）
			incrementNumber++;
		}
		//変数inputNumberの値が1以上の場合
		if (inputNumber >= 1) {
			//画面を改行する
			System.out.println("");
		}
		
	}

}
