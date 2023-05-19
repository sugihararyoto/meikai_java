//パッケージ名の宣言
package ensyu13_3;
/*
 * クラス名:Ensyu13_3
 * 概要  :演習13-3クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.19
 */
public class Ensyu13_3 {
	/*
	 * 関数名：printResult
	 * 概要：ジャンケンの勝敗を決めるメソッド
	 * 引数：int playerOne, int playerTwo
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.19
	 */
	static void printResult(int playerOne, int playerTwo) {
		//出した手によって分岐する
		switch (playerOne) {
			//グーを出した場合
			case 1:
				//チョキを出された場合
				if (playerTwo == 2) {
					//勝ったことを伝える
					System.out.println("あなたの勝ちです。");
					//switch文から抜ける
					break;
				//パーを出された場合
				} else if (playerTwo == 3) {
					//負けたことを伝える
					System.out.println("あなたの負けです。");
					//switch文から抜ける
					break;
				}
			//チョキを出した場合
			case 2:
				//グーを出された場合
				if (playerTwo == 1) {
					//負けたことを伝える
					System.out.println("あなたの負けです。");
					//switch文から抜ける
					break;
				//パーを出された場合
				} else if (playerTwo == 3) {
					//勝ったことを伝える
					System.out.println("あなたの勝ちです。");
					//switch文から抜ける
					break;
				}
			//パーを出した場合
			case 3:
				//グーを出された場合
				if (playerTwo == 1) {
					//勝ったことを伝える
					System.out.println("あなたの勝ちです。");
					//switch文から抜ける
					break;
				//チョキを出された場合
				} else if (playerTwo == 2) {
					//負けたことを伝える
					System.out.println("あなたの負けです。");
					//switch文から抜ける
					break;
				}
		}
		
	}
	/*
	 * 関数名：main
	 * 概要：ジャンケンをするためのメインのメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.19
	 */
	public static void main(String[] args) {
		//ジャンケンをすることを伝える
		System.out.println("ジャンケンをします。");
		//変数humanNumberを生成し、0で初期化する
		int humanNumber = 0;
		//変数computerNumberを生成し、0で初期化する
		int computerNumber = 0;
		//while (humanNumber == computerNumber)までの文を実行する
		do {
			//HumanPlayer型のクラス型変数playerOneを生成し、インスタンス化する
			HumanPlayer playerOne = new HumanPlayer();
			//ComputerPlayer型のクラス型変数playerTwoを生成し、インスタンス化する
			ComputerPlayer playerTwo = new ComputerPlayer();
			//ジャンケンで出す手を表示する
			playerOne.printString();
			//ジャンケンで出された手を表示する
			playerTwo.printString();
			//変数humanNumberにジャンケンの値を代入する
			humanNumber = playerOne.getPlayNumber();
			//変数computerNumberにジャンケンの値を代入する
			computerNumber = playerTwo.getPlayNumber();
			//あいこの場合
			if (humanNumber == computerNumber) {
				//あいこであることを伝える
				System.out.println("あいこです。");
			}
		//あいこのあいだdoからwhileまでを繰り返す
		} while (humanNumber == computerNumber);
		//ジャンケンの結果を表示する
		printResult(humanNumber, computerNumber);
		
	}

}
