//パッケージ名の宣言
package ensyu4_10;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_10
 * 概要  :演習4-10クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.12
 */
public class Ensyu4_10 {
	/*
	 * 関数名：main
	 * 概要：List4-11で読み込んだ値が1未満であれば
	 * 改行文字を出力しないように書きかえる
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.12
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
		/*
		 * 変数incrementNumberを生成し、0から始めて1つずつ増やしながら
		 * 変数inputNumberの値まで繰り返す
		 */
		for (int incrementNumber = 0; incrementNumber < inputNumber; incrementNumber++) {
			//画面に*を表示する
			System.out.print('*');
		}
		
		//変数inputNumberの値が1以上の場合
		if (inputNumber >= 1) {
			//画面を改行する
			System.out.println();
		}
		
	}

}
