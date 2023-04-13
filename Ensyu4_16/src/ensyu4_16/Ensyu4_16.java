//パッケージ名の宣言
package ensyu4_16;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_16
 * 概要  :演習4-16クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.13
 */
public class Ensyu4_16 {
	/*
	 * 関数名：main
	 * 概要：読み込んだ個数*を表示するList4-11のプログラムを書きかえて
	 * 5個表示するごとに改行する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.13
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//画面に何個*を表示しますかと表示する
		System.out.print("何個*を表示しますか：");
		//変数inputNumberを生成し、キーボードから入力された値で初期化する
		int inputNumber = standardInput.nextInt();
		//表示できない値が入力された場合
		if (inputNumber <= 0) {
			//画面にその値では表示できません。と表示する
			System.out.println("その値では表示できません。");
		}
		/*
		 * 変数incrementNumberを生成し、0で初期化する、そして
		 * 変数newlineNumberを生成し、1で初期化する
		 * それぞれの変数の値を一つずつ増やしていき
		 * 変数incrementNumberの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int incrementNumber = 0,newlineNumber = 1;incrementNumber < inputNumber;incrementNumber++,newlineNumber++) {
			//画面に*を表示する
			System.out.print('*');
			//変数newlineNumberの値が5以上の時
			if (newlineNumber >= 5) {
				//改行する
				System.out.println();
				//newlineNumberに0を代入する
				newlineNumber = 0;
			}
		}
		//改行する
		System.out.println();
	}

}
