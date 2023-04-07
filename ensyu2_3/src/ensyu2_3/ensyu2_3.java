//パッケージ名の宣言
package ensyu2_3;
//importする
import java.util.Scanner;
/*
 * クラス名:ensyu2_3
 * 概要  :演習2-3クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.06
 */
public class ensyu2_3 {
	/* 関数名：main
	 * 概要：キーボードから読み込んだ整数値をそのまま反復して表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args) {
		//キーボードからの読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//画面に整数値の入力を促す
		System.out.print("整数値：");
		//変数inputNumberにキーボードから入力した値を代入する
		int inputNumber = standardInput.nextInt();
		//画面に[変数inputNumberに代入した数値]と[と入力しましたね]と表示する
		System.out.println(inputNumber + "と入力しましたね。");
	}

}
