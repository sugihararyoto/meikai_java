//パッケージ名の宣言
package ensyu5_5;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu5_5
 * 概要  :演習5-5クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.17
 */
public class Ensyu5_5 {
	/*
	 * 関数名：main
	 * 概要：3つの整数値を読み込んで、その合計と平均を表示する、
	 * その時、平均はキャスト演算子を利用して求め、実数として表示する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.17
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//画面に整数値xとyとzの合計値と平均値を求めます。と表示する
		System.out.println("整数値xとyとzの合計値と平均値を求めます。");
		//画面にxの値の入力を促す
		System.out.print("xの値：");
		//変数firstNumberを生成し、キーボードから入力された値で初期化する
		int firstNumber = standardInput.nextInt();
		//画面にyの値の入力を促す
		System.out.print("yの値：");
		//変数firstNumberを生成し、キーボードから入力された値で初期化する
		int secondNumber = standardInput.nextInt();
		//画面にzの値の入力を促す
		System.out.print("zの値：");
		//変数firstNumberを生成し、キーボードから入力された値で初期化する
		int thirdNumber = standardInput.nextInt();
		
		/*
		 * 合計を表す変数sumNumberを生成し、変数firstNumberの値と変数secondNumberの値と
		 * 変数thirdNumberの値を足した数で初期化する
		 */
		int sumNumber = firstNumber + secondNumber + thirdNumber;
		/*
		 * 平均を表す変数averageNumberを生成し、
		 * 変数sumNumberの値をdounle型に変換し、3で割った値で初期化する
		 */
		double averageNumber = (double)sumNumber / 3;
		//画面に入力された値の合計値を表示する
		System.out.println("xとyとzの合計値は" + sumNumber + "です。");
		//画面に入力された値の平均値を表示する
		System.out.println("xとyとzの平均値は" + averageNumber + "です。");
	}

}
