//パッケージ名の宣言
package ensyu4_6_2;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_6_2
 * 概要  :演習4-6-2クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.11
 */
public class Ensyu4_6_2 {
	/*
	 * 関数名：main
	 * 概要：読み込んだ値が1未満であれば改行文字を出力しないように
	 * List4-8を書きかえる
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
		
		//表示できない値が入力された場合
		if (inputNumber <= 0) {
			//画面にその値では表示できません。と表示する
			System.out.println("その値では表示できません。");
		}
		
		//変数incrementNumberを生成し、1を代入する
		int incrementNumber = 1;
		
		//変数incrementNumberが変数inputNumberの値以下のあいだ繰り返す
		while (incrementNumber <= inputNumber) {
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
