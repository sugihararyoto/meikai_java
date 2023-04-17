//パッケージ名の宣言
package ensyu5_3;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu5_3
 * 概要  :演習5-3クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.17
 */
public class Ensyu5_3 {
	/*
	 * 関数名：main
	 * 概要：論理型の変数にtrueやfalseを代入して、その値を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.17
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//論理型の変数resultNumberを生成し、trueで初期化する
		boolean resultNumber = true;
		//画面に1かそれ以外の数字の入力を促す
		System.out.print("1…trueを代入,1以外…falseを代入：");
		//変数firstNumberを生成し、キーボードから入力した値で初期化する
		int inputNumber = standardInput.nextInt();
		//1以外が入力された場合
		if (inputNumber != 1) {
			//変数resultNumberにfalseを代入する
			resultNumber = false;
		}
		
		//画面に変数resultNumberの値を表示する
		System.out.println(resultNumber);
		
	}

}
