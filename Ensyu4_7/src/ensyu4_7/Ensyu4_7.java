//パッケージ名の宣言
package ensyu4_7;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_7
 * 概要  :演習4-7クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.11
 */
public class Ensyu4_7 {
	/*
	 * 関数名：main
	 * 概要：読み込んだ値の個数だけ記号文字を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//画面に入力を促す
		System.out.print("何個表示しますか：");
		//変数inputNumberを生成し、キーボードから入力した値を代入する
		int inputNumber = standardInput.nextInt();
		
		//表示できない値が入力された場合
		if (inputNumber <= 0) {
			//画面にその値では表示できません。と表示する
			System.out.println("その値では表示できません。");
		//正しい数が入力された場合
		} else {
			//変数inputNumberの値が0より大きいあいだ繰り返す
			while (inputNumber > 0) {
				//画面に*と表示する
				System.out.print('*');
				//変数inputNumberの値をデクリメント（値を一つ減らす）
				inputNumber--;
				//変数inputNumberの値が0より大きい場合
				if (inputNumber > 0) {
					//画面に+と表示する
					System.out.print('+');
					//変数inputNumberの値をデクリメント（値を一つ減らす）
					inputNumber--;
				}
			}
		
		}
		
	}

}
