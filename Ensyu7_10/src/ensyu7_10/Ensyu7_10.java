//パッケージ名の宣言
package ensyu7_10;
//importする
import java.util.Random;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_10
 * 概要  :演習7-10クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.24
 */
public class Ensyu7_10 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：confirmRetry
	 * 概要：テキストによって、boolean confirmRetry()は指定
	 * もう一度繰り返すかどうか入力させる
	 * 引数：なし
	 * 戻り値：retryNumber(true, false)
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.24
	 */
	static boolean confirmRetry() {
		//変数retryNumberを生成し、0で初期化する
		int retryNumber = 0;
		//while (retryNumber != 0 && retryNumber != 1)までの文を実行する
		do {
			//画面にもう一度行うかどうか入力を促す
			System.out.print("もう一度？<Yes…1/No…0>：");
			//変数retryNumberにキーボードから入力した値を代入する
			retryNumber = standardInput.nextInt();
		//入力された値が0でも1でもない間繰り返す
		} while (retryNumber != 0 && retryNumber != 1);
		//変数retryNumberの値が1であればtrue、そうでなければfalseを返す
		return retryNumber == 1;
	}
	/*
	 * 関数名：main
	 * 概要：暗算力トレーニングを行う
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.24
	 */
	public static void main(String[] args) {
		//乱数を生成する準備
		Random randomNumber = new Random();
		//問題数を表す変数QUESTION_TOTALを生成し、4で初期化する
		final int QUESTION_TOTAL = 4;
		//画面に暗算力トレーニングを行うことを表示する
		System.out.println("暗算力トレーニング！！");
		//while (confirmRetry())までの文を実行する
		do {
			//変数firstNumberを生成し、ランダムに生成した3桁の値で初期化する
			int firstNumber = randomNumber.nextInt(900) + 100;
			//変数secondNumberを生成し、ランダムに生成した3桁の値で初期化する
			int secondNumber = randomNumber.nextInt(900) + 100;
			//変数thirdNumberを生成し、ランダムに生成した3桁の値で初期化する
			int thirdNumber = randomNumber.nextInt(900) + 100;
			
			//問題を変えるための変数questionNumberを生成し、0で初期化する
			int questionNumber = 0;
			//questionNumberに0~3の値をランダムで生成し、代入する
			questionNumber = randomNumber.nextInt(QUESTION_TOTAL);
			
			//無限ループを行う
			while (true) {
				//変数questionNumberの値が0の場合
				if (questionNumber == 0) {
					//画面にx+y+zの値を表示する
					System.out.print(firstNumber + " + " + secondNumber + " + " + thirdNumber + " = ");
					//変数inputNumberを生成し、キーボードから入力した値で初期化する
					int inputNumber = standardInput.nextInt();
					//入力した値がx+y+zの値と等しい場合
					if (inputNumber == firstNumber + secondNumber + thirdNumber) {
						//画面に正解です。と表示する
						System.out.println("正解です。");
						//while文を抜ける
						break;
					}
					//画面に違いますよと表示する
					System.out.println("違いますよ！！");
				//変数questionNumberの値が1の場合
				} else if (questionNumber == 1) {
					//画面にx+y-zの値を表示する
					System.out.print(firstNumber + " + " + secondNumber + " - " + thirdNumber + " = ");
					//変数inputNumberを生成し、キーボードから入力した値で初期化する
					int inputNumber = standardInput.nextInt();
					//入力した値がx+y-zの値と等しい場合
					if (inputNumber == firstNumber + secondNumber - thirdNumber) {
						//画面に正解です。と表示する
						System.out.println("正解です。");
						//while文を抜ける
						break;
					}
					//画面に違いますよと表示する
					System.out.println("違いますよ！！");
				//変数questionNumberの値が2の場合
				} else if (questionNumber == 2) {
					//画面にx-y+zの値を表示する
					System.out.print(firstNumber + " - " + secondNumber + " + " + thirdNumber + " = ");
					//変数inputNumberを生成し、キーボードから入力した値で初期化する
					int inputNumber = standardInput.nextInt();
					//入力した値がx-y+zの値と等しい場合
					if (inputNumber == firstNumber - secondNumber + thirdNumber) {
						//画面に正解です。と表示する
						System.out.println("正解です。");
						//while文を抜ける
						break;
					}
					//画面に違いますよと表示する
					System.out.println("違いますよ！！");
				//変数questionNumberの値が3の場合
				} else if (questionNumber == 3) {
					//画面にx-y-zの値を表示する
					System.out.print(firstNumber + " - " + secondNumber + " - " + thirdNumber + " = ");
					//変数inputNumberを生成し、キーボードから入力した値で初期化する
					int inputNumber = standardInput.nextInt();
					//入力した値がx-y-zの値と等しい場合
					if (inputNumber == firstNumber - secondNumber - thirdNumber) {
						//画面に正解です。と表示する
						System.out.println("正解です。");
						//while文を抜ける
						break;
					}
					//画面に違いますよと表示する
					System.out.println("違いますよ！！");
				}
				
			}
		/*
		 * もう一度繰り返すかどうかを入力するメソッドを呼び出し、
		 * 入力された値によって、doからwhileまでを繰り返す
		 */
		} while (confirmRetry());
		
	}

}
