//パッケージ名の宣言
package ensyu4_2;
//importする
import java.util.Random;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_2
 * 概要  :演習4-2クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.11
 */
public class Ensyu4_2 {
	/* 関数名：main
	 * 概要：2桁の整数値(10~99)を当てさせる数当てゲームを作成する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args) {
		//乱数を生成する準備
		Random randomNumber = new Random();
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		/*
		 * 変数correctNumberを生成し、当てるべき数を10~99からランダムで生成し、
		 * その値で初期化する
		 */
		int correctNumber = randomNumber.nextInt(90) + 10;
		
		//画面に数当てゲーム開始と表示する
		System.out.println("数当てゲーム開始！！");
		//画面に当てる数の範囲を表示する。
		System.out.println("10～99の数を当ててください。");
		
		//プレイヤーが入力した数を代入するための変数inputNumberを生成し、0で初期化する
		int inputNumber = 0;
		//whileまでの文を実行する
		do {
			//画面に入力を促す
			System.out.print("いくつかな：");
			//変数inputNumberにキーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
			
			//変数inputNumberの値が変数correctNumberの値より大きい場合
			if (inputNumber > correctNumber) {
				//画面にもっと小さな数だよ。と表示する
				System.out.println("もっと小さな数だよ。");
			//変数inputNumberの値が変数correctNumberの値より小さい場合
			} else if (inputNumber < correctNumber) {
				//画面にもっと大きな数だよ。と表示する
				System.out.println("もっと大きな数だよ。");
			}
		/* 変数inputNumberの値が変数correctNumberの値が等しくない
		 * あいだdoからwhileまでを繰り返す
		 */
		} while (inputNumber != correctNumber);
		
		//画面に正解です。と表示する
		System.out.println("正解です。");
	}

}
