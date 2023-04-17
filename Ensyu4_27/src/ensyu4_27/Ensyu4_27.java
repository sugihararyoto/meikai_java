//パッケージ名の宣言
package ensyu4_27;
//importする
import java.util.Random;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_27
 * 概要  :演習4-27クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.17
 */
public class Ensyu4_27 {
	/*
	 * 関数名：main
	 * 概要：数当てゲームに入力できる回数に制限を設けたプログラムを作成
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.17
	 */
	public static void main(String[] args) {
		//乱数を生成する準備
		Random randomNumber = new Random();
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		/*
		 * 変数correctNumberを生成し、当てるべき数を0~99からランダムで生成し、
		 * その値で初期化する
		 */
		int correctNumber = randomNumber.nextInt(100);
		
		//画面に数当てゲーム開始と表示する
		System.out.println("数当てゲーム開始！！");
		//画面に当てる数の範囲を表示する。
		System.out.println("0～99の数を当ててください。");
		
		//回数の上限を表す変数limitNumberを生成し、5で初期化する(5回まで入力できる)
		int limitNumber = 5;
		//プレイヤーが入力した数を代入するための変数inputNumberを生成し、0で初期化する
		int inputNumber = 0;
		//while (inputNumber != correctNumber)までの文を実行する
		do {
			//画面に入力できる回数の残りを表示する
			System.out.println("残り" + limitNumber + "回");
			//画面に入力を促す
			System.out.print("いくつかな：");
			//変数inputNumberにキーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
			
			//変数limitNumberをデクリメント
			limitNumber--;
			
			//残り回数が0になった時
			if (limitNumber == 0) {
				//繰り返しから抜ける
				break;
			}
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
		//変数limitNumberの値が0の場合
		if (limitNumber == 0) {
			//画面に残念。と表示する
			System.out.println("残念。正解は" + correctNumber + "でした。");
		//変数limitNumberの値が0ではない場合
		} else {
			//画面に正解です。と表示する
			System.out.println("正解です。");
		}
	}

}