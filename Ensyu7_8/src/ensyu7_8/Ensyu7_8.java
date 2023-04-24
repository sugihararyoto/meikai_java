//パッケージ名の宣言
package ensyu7_8;
//importする
import java.util.Random;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_8
 * 概要  :演習7-8クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.24
 */
public class Ensyu7_8 {
	/*
	 * 関数名：random
	 * 概要：テキストによって、int random(int a, int b)は指定
	 * 引数：a, b
	 * 戻り値：randomValue(a以上b未満の値)
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.24
	 */
	static int random(int a, int b) {
		//乱数を生成する準備
		Random randomNumber = new Random();
		//乱数を代入する変数randomValueを生成し、0で初期化する
		int randomValue = 0;
		
		//bの値がaより小さい場合
		if (a > b) {
			//変数randomValueにaの値を代入する
			randomValue = a;
		//bの値がaより大きい場合
		} else {
			//変数randomValueにa以上b未満の値をランダムで生成し、代入する
			randomValue = randomNumber.nextInt(b - a) + a;
		}
		//randomValueを返す
		return randomValue;
	}
	/*
	 * 関数名：main
	 * 概要：整数a,bの値を入力するテスト用のメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.24
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//画面にa以上b未満の乱数を生成します。と表示する
		System.out.println("a以上b未満の乱数を生成します。");
		//画面に整数aの入力を促す
		System.out.print("整数a：");
		//変数firstNumberを生成し、キーボードから入力した値で初期化する
		int firstNumber = standardInput.nextInt();
		
		//変数secondNumberを生成し、0で初期化する
		int secondNumber = 0;
		//while (firstNumber == secondNumber)までの文を実行する
		do {
			//画面に整数bの入力を促す
			System.out.print("整数b：");
			//変数secondNumberにキーボードから入力した値を代入する
			secondNumber = standardInput.nextInt();
			//整数bに整数aと同じ値が入力された場合
			if (firstNumber == secondNumber) {
				//画面にaと異なる数値を入力してください。と表示する
				System.out.println("aと異なる数値を入力してください。");
			}
		//変数firstNumberの値が変数secondNumberの値と等しいあいだdoからwhileまでを繰り返す
		} while (firstNumber == secondNumber);
		
		//画面に返却された値を表示する
		System.out.println("返却された値：" + random(firstNumber, secondNumber));
	}

}
