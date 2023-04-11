//パッケージ名の宣言
package ensyu4_8;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_8
 * 概要  :演習4-8クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.11
 */
public class Ensyu4_8 {
	/*
	 * 関数名：main
	 * 概要：正の整数値を読み込んで、その桁数を出力する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//画面に入力を促す
		System.out.print("正の整数値：");
		//変数inputNumberを生成し、キーボードから入力した値を代入する
		int inputNumber = standardInput.nextInt();
		
		//桁数を表す変数digitNumberを生成し、0を代入する
		int digitNumber = 0;
		
		//正の整数値ではない値が入力された場合
		if (inputNumber < 1) {
			//画面に正ではない値が入力されました。と表示する
			System.out.println("正ではない値が入力されました。");
			
		//正の整数値が入力された場合
		} else {
			//変数inputNumberの値が0より大きいあいだは繰り返す
			while (inputNumber > 0) {
				//変数digitNumberの値をインクリメント（値を一つ増やす）
				digitNumber++;
				//変数inputNumberを10で割る
				inputNumber /= 10;
				
			}
			//画面に桁数を表示する
			System.out.println("その値は" + digitNumber + "桁です。");
			
		}
	}

}
