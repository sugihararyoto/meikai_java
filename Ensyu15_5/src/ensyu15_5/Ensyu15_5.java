//パッケージ名の宣言
package ensyu15_5;
/*
 * クラス名:Ensyu15_5
 * 概要  :演習15-5クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.22
 */
public class Ensyu15_5 {

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
		//変数computerNumberOneを生成し、0で初期化する
		int computerNumberOne = 0;
		//変数computerNumberTwoを生成し、0で初期化する
		int computerNumberTwo = 0;
		/*
		 * while (humanNumber == computerNumberOne && computerNumberOne == computerNumberTwo
		 *	|| humanNumber != computerNumberOne && computerNumberOne != computerNumberTwo 
		 *	&& humanNumber != computerNumberTwo)までの文を実行する
		 */
		do {
			//HumanPlayer型のクラス型変数playerOneを生成し、インスタンス化する
			HumanPlayer playerOne = new HumanPlayer();
			//ComputerPlayer型のクラス型変数playerTwoを生成し、インスタンス化する
			ComputerPlayer playerTwo = new ComputerPlayer();
			//ComputerPlayer型のクラス型変数playerThreeを生成し、インスタンス化する
			ComputerPlayer playerThree = new ComputerPlayer();
			//ジャンケンで出す手を表示する
			playerOne.printString();
			//ジャンケンで出された手を表示する
			playerTwo.printString();
			//ジャンケンで出された手を表示する
			playerThree.printString();
			//変数humanNumberにジャンケンの値を代入する
			humanNumber = playerOne.getPlayNumber();
			//変数computerNumberOneにジャンケンの値を代入する
			computerNumberOne = playerTwo.getPlayNumber();
			//変数computerNumberTwoにジャンケンの値を代入する
			computerNumberTwo = playerThree.getPlayNumber();
			//あいこの場合
			if (humanNumber == computerNumberOne && computerNumberOne == computerNumberTwo
					|| humanNumber != computerNumberOne && computerNumberOne != computerNumberTwo && humanNumber != computerNumberTwo) {
				//あいこであることを伝える
				System.out.println("あいこです。");
			}
		//あいこのあいだdoからwhileまでを繰り返す
		} while (humanNumber == computerNumberOne && computerNumberOne == computerNumberTwo
				|| humanNumber != computerNumberOne && computerNumberOne != computerNumberTwo && humanNumber != computerNumberTwo);
		//ジャンケンの結果を表示する
		PlayerClass.printResult(humanNumber, computerNumberOne, computerNumberTwo);
		
	}

}
