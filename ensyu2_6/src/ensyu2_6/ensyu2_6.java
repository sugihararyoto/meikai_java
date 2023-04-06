//パッケージ名の宣言
package ensyu2_6;
//キーボードからの入力を行う決まり文句をクラスの前に設置する
import java.util.Scanner;
/*
 * クラス名:ensyu2_6
 * 概要  :演習2-6クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.06
 */
public class ensyu2_6 {
	/* 関数名：main
	 * 概要：三角形の底辺と高さを読み込んで、その面積を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args) {
		//キーボードからの読み込みを行う
		Scanner stdIn = new Scanner(System.in);
		//画面に三角形の面積を求めますと表示する
		System.out.print("三角形の面積を求めます。");
		//画面に底辺：と表示する
		System.out.print("底辺：");
		//変数inputNumberFirstにキーボードから入力した値（小数部を含む）を代入する
		double inputNumberFirst = stdIn.nextDouble();
		//画面に高さ：と表示する
		System.out.print("高さ：");
		//変数inputNumberSecondにキーボードから入力した値（小数部を含む）を代入する
		double inputNumberSecond = stdIn.nextDouble();
		//画面に代入した底辺と高さから求めた三角形の面積を表示する
		System.out.println("面積は" + (inputNumberFirst * inputNumberSecond) /  2 + "です。");
	}
}
