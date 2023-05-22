//パッケージ名の宣言
package ensyu15_5;
//importする
import java.util.Random;
/*
 * クラス名:ComputerPlayer
 * 概要  :コンピュータプレーヤクラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.19
 */
public class ComputerPlayer extends PlayerClass {
	//乱数を生成する準備
	static Random randomNumber = new Random();
	//ジャンケンの値
	private int playNumber;
	/*
	 * 関数名：playRockPaperScissors
	 * 概要：ジャンケンで出す手がランダムで決まるメソッド
	 * 引数：なし
	 * 戻り値：playNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.19
	 */
	public int playRockPaperScissors() {
		//ジャンケンで出す手をランダムで代入する
		playNumber = randomNumber.nextInt(3) + 1;
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
	 * 概要：乱数で生成したジャンケンの手を文字列で返却するメソッド
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
				returnString = "コンピュータ：グー";
				//switch文から抜ける
				break;
			//チョキを出した場合
			case 2:
				//returnStringに出した手の文字列を代入する
				returnString = "コンピュータ：チョキ";
				//switch文から抜ける
				break;
			//パーを出した場合
			case 3:
				//returnStringに出した手の文字列を代入する
				returnString = "コンピュータ：パー";
				//switch文から抜ける
				break;
		}
		//文字列を返却する
		return returnString;
	}
}