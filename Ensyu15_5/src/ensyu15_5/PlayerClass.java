//パッケージ名の宣言
package ensyu15_5;
/*
 * クラス名:PlayerClass
 * 概要  :プレーヤクラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.19
 */
public abstract class PlayerClass {
	/*
	 * 関数名：toString
	 * 概要：文字列を返却する抽象メソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.19
	 */
	public abstract String toString();
	/*
	 * 関数名：printString
	 * 概要：画面に文字列を表示するためのメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.19
	 */
	public void printString() {
		//画面にtoString()の内容を表示する
		System.out.println(toString());
	}
	/*
	 * 関数名：printResult
	 * 概要：ジャンケンの勝敗を決めるメソッド
	 * 引数：int playerOne, int playerTwo
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.19
	 */
	static void printResult(int playerOne, int playerTwo, int playerThree) {
		//出した手によって分岐する
		switch (playerOne) {
			//グーを出した場合
			case 1:
				//playerTwoにチョキを出された場合
				if (playerTwo == 2) {
					//勝ったことを伝える
					System.out.println("あなたの勝ちです。");
					//switch文から抜ける
					break;
				//playerTwoにグーを出された場合
				} else if (playerTwo == 1) {
					//playerThreeにチョキを出された場合
					if (playerThree == 2) {
						//勝ったことを伝える
						System.out.println("あなたの勝ちです。");
						//switch文から抜ける
						break;
					//playerThreeにパーを出された場合
					} else {
						//負けたことを伝える
						System.out.println("あなたの負けです。");
						//switch文から抜ける
						break;
					}
				//playerTwoにパーを出された場合
				} else if (playerTwo == 3) {
					//負けたことを伝える
					System.out.println("あなたの負けです。");
					//switch文から抜ける
					break;
				}
			//チョキを出した場合
			case 2:
				//playerTwoにパーを出された場合
				if (playerTwo == 3) {
					//勝ったことを伝える
					System.out.println("あなたの勝ちです。");
					//switch文から抜ける
					break;
				//playerTwoにチョキを出された場合
				} else if (playerTwo == 2) {
					//playerThreeにパーを出された場合
					if (playerThree == 3) {
						//勝ったことを伝える
						System.out.println("あなたの勝ちです。");
						//switch文から抜ける
						break;
					//playerThreeにグーを出された場合
					} else {
						//負けたことを伝える
						System.out.println("あなたの負けです。");
						//switch文から抜ける
						break;
					}
				//playerTwoにグーを出された場合
				} else if (playerTwo == 1) {
					//負けたことを伝える
					System.out.println("あなたの負けです。");
					//switch文から抜ける
					break;
				}
			//パーを出した場合
			case 3:
				//playerTwoにグーを出された場合
				if (playerTwo == 1) {
					//勝ったことを伝える
					System.out.println("あなたの勝ちです。");
					//switch文から抜ける
					break;
				//playerTwoにパーを出された場合
				} else if (playerTwo == 3) {
					//playerThreeにグーを出された場合
					if (playerThree == 1) {
						//勝ったことを伝える
						System.out.println("あなたの勝ちです。");
						//switch文から抜ける
						break;
					//playerThreeにチョキを出された場合
					} else {
						//負けたことを伝える
						System.out.println("あなたの負けです。");
						//switch文から抜ける
						break;
					}
				//playerTwoにチョキを出された場合
				} else if (playerTwo == 2) {
					//負けたことを伝える
					System.out.println("あなたの負けです。");
					//switch文から抜ける
					break;
				}
		}
		
	}

}