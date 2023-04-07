//パッケージ名の宣言
package ensyu2_7;
//importする
import java.util.Random;
/*
 * クラス名:ensyu2_7
 * 概要  :演習2-7クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.06
 */
public class ensyu2_7 {
	/* 関数名：main
	 * 概要：1桁の正の整数値、1桁の負の整数値、2桁の正の整数値を
	 * それぞれランダムに生成して表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args) {
		//乱数を生成する準備
		Random randomNumber = new Random();
		//変数firstNumberを生成し、0~8までの値をランダムで代入する
		int firstNumber =randomNumber.nextInt(9);
		//変数secondNumberを生成し、0~8までの値をランダムで代入する
		int secondNumber =randomNumber.nextInt(9);
		//変数thirdNumberを生成し、0~89までの値をランダムで代入する
		int thirdNumber =randomNumber.nextInt(90);
		//画面に1桁の正の整数値を表示する
		System.out.println("1桁の正の整数値：" + (firstNumber + 1));
		//画面に1桁の負の整数値を表示する
		System.out.println("1桁の負の整数値：" + -(secondNumber + 1));
		//画面に2桁の正の整数値を表示する
		System.out.println("2桁の正の整数値：" + (thirdNumber + 10));
	}

}
