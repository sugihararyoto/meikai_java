//パッケージ名の宣言
package ensyu3_18;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu3_18
 * 概要  :演習3-18クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.10
 */
public class Ensyu3_18 {
	/* 関数名：main
	 * 概要：月を1~12の整数値として読み込んで、
	 * それに対応する季節を表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.10
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//画面に整数の入力を促す
		System.out.print("整数を入力せよ：");
		//変数inputNumberを生成し、キーボードから入力した値を代入する
		int inputNumber = standardInput.nextInt();
		//入力された数値から分岐する
		switch (inputNumber) {
		//画面に春と表示して途切れる
		case 3,4,5 : System.out.println("春"); break;
		//画面に夏と表示して途切れる
		case 6,7,8 : System.out.println("夏"); break;
		//画面に秋と表示して途切れる
		case 9,10,11 : System.out.println("秋"); break;
		//画面に冬と表示して途切れる
		case 12,1,2 : System.out.println("冬"); break;
		//画面に対応する季節がありません。と表示して途切れる
		default: System.out.println("対応する季節がありません。"); break;
		
		}
	}

}
