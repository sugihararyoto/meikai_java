//パッケージ名の宣言
package ensyu4_26;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_26
 * 概要  :演習4-26クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.17
 */
public class Ensyu4_26 {
	/*
	 * 関数名：main
	 * 概要：List4-19を書きかえて平均も求めるようにする
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.17
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//画面に整数を加算します。と表示する
		System.out.println("整数を加算します。");
		
		//加算する個数を表す変数countNumberを生成し、0で初期化する
		int countNumber = 0;
		
		//while (inputNumber <= 0)の文までを実行する
		do {
			//画面に何個加算するか入力を促す
			System.out.print("何個加算しますか：");
			//変数inputNumberに、キーボードから入力した値を代入する
			countNumber = standardInput.nextInt();
			//正ではない値が入力された場合
			if (countNumber <= 0) {
				//画面に正ではない値が入力されました。と表示する
				System.out.println("正ではない値が入力されました。");
			}
			
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (countNumber <= 0);
		
		//合計を表す変数sumNumberを生成し、0で初期化する
		int sumNumber = 0;
		//母数を表す変数parameterNumberを生成し、0で初期化する
		int parameterNumber = 0;
		
		/*
		 * 変数incrementNumberを生成し、0で初期化する
		 * 変数incrementNumberの値を一つずつ増やしていき
		 * 変数incrementNumberの値が変数countNumberの値になるまで繰り返す
		 */
		for (int incrementNumber = 0;incrementNumber < countNumber;incrementNumber++) {
			//画面に整数の入力を促す
			System.out.print("整数：");
			//変数inputNumberを生成し、キーボードから入力した値で初期化する
			int inputNumber = standardInput.nextInt();
			//負の数が入力された場合
			if (inputNumber < 0) {
				//画面に負の数は加算しません。と表示する
				System.out.println("負の数は加算しません。");
				//残りの文を飛ばしてfor文を繰り返す
				continue;
			}
			//変数sumNumberに入力された値を加算する
			sumNumber += inputNumber;
			//変数parameterNumberの値をインクリメント
			parameterNumber++;
			
		}
		//画面に合計を表示する
		System.out.println("合計は" + sumNumber + "です。");
		
		//変数parameterNumberの値が0以下の場合
		if (parameterNumber <= 0) {
			//画面に平均を表示する
			System.out.println("平均は" + sumNumber + "です。");
		//変数parameterNumberの値が0以下ではない場合
		} else {
			//画面に平均を表示する
			System.out.println("平均は" + sumNumber / parameterNumber+ "です。");
		}
		
	}

}