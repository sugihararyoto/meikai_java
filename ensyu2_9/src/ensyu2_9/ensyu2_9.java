//パッケージ名の宣言
package ensyu2_9;
//importする
import java.util.Random;
/*
 * クラス名:ensyu2_9
 * 概要  :演習2-9クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.06
 */
public class ensyu2_9 {
	/* 関数名：main
	 * 概要：0.0以上1.0未満の実数値、0.0以上10.0未満の実数値、
	 * -1.0以上1.0未満の実数値をそれぞれランダムに生成して表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args) {
		//乱数を生成する準備
		Random randomNumber = new Random();
		//変数firstNumberを生成し、0.0以上1.0未満の実数値をランダムで代入する
		double firstNumber =randomNumber.nextDouble();
		//変数secondNumberを生成し、0.0以上10.0未満の実数値をランダムで代入する
		double secondNumber =randomNumber.nextDouble(10);
		//変数thirdNumberを生成し、0.0以上2.0未満の実数値をランダムで代入する
		double thirdNumber =randomNumber.nextDouble(2);
		//画面に0.0以上1.0未満の実数値を表示する
		System.out.println("0.0以上1.0未満の実数値：" + firstNumber);
		//画面に0.0以上10.0未満の実数値を表示する
		System.out.println("0.0以上10.0未満の実数値：" + secondNumber);
		//画面に-1.0以上1.0未満の実数値を表示する
		System.out.println("-1.0以上1.0未満の実数値：" + (thirdNumber - 1));
	}

}
