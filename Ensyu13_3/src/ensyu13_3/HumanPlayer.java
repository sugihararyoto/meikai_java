//パッケージ名の宣言
package ensyu13_3;
//importする
import java.util.Scanner;

/*
 * クラス名:HumanPlayer
 * 概要  :人間プレーヤクラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.19
 */
public class HumanPlayer extends PlayerClass {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	//ジャンケンの値
	private int playNumber;
	
	/*
	 * 関数名：playRockPaperScissors
	 * 概要：ジャンケンで出す手を決めるメソッド
	 * 引数：なし
	 * 戻り値：playNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.19
	 */
	public int playRockPaperScissors() {
		//while (playNumber < 1 || playNumber > 3)までの文を実行する
		do {
			//ジャンケンで出す手の入力を促す
			System.out.print("(1…グー/2…チョキ/3…パー)：");
			//ジャンケンで出す手をキーボードから読み込む
			playNumber = standardInput.nextInt();
		//playNumberの値が1~3でないあいだdoからwhileまでを繰り返す
		} while (playNumber < 1 || playNumber > 3);
		//ジャンケンの値を返却する
		return playNumber;
	}
	/*
	 * 関数名：getPlayNumber
	 * 概要：ジャンケンの値を調べる
	 * 引数：なし
	 * 戻り値：playNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.19
	 */
	public int getPlayNumber() {
		//ジャンケンの値を返却する
		return playNumber;
	}
	/*
	 * 関数名：toString
	 * 概要：入力したジャンケンの手を文字列で返却するメソッド
	 * 引数：なし
	 * 戻り値：returnString
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.19
	 */
	public String toString() {
		//変数returnStringを生成し、nullで初期化する
		String returnString = null;
		
		//ジャンケンで出した手によって分岐する
		switch (playRockPaperScissors()) {
			//グーを出した場合
			case 1:
				//returnStringに出した手の文字列を代入する
				returnString = "あなた：グー";
				//switch文から抜ける
				break;
			//チョキを出した場合
			case 2:
				//returnStringに出した手の文字列を代入する
				returnString = "あなた：チョキ";
				//switch文から抜ける
				break;
			//パーを出した場合
			case 3:
				//returnStringに出した手の文字列を代入する
				returnString = "あなた：パー";
				//switch文から抜ける
				break;
		}
		//文字列を返却する
		return returnString;
	}
	
	

}
