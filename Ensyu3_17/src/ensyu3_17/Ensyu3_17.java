//パッケージ名の宣言
package ensyu3_17;
//importする
import java.util.Random;
/*
 * クラス名:Ensyu3_17
 * 概要  :演習3-17クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.10
 */
public class Ensyu3_17 {
	/* 関数名：main
	 * 概要：0,1,2のいずれかの値の乱数を生成し、0であればグーを、
	 * 1であればチョキを、2であればパーを表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.10
	 */
	public static void main(String[] args) {
		//乱数を生成する準備
		Random randomNumber = new Random();
		//変数handNumberを生成し、0~2までの値をランダムに代入する。
		int handNumber = randomNumber.nextInt(3);
		//変数handNumberの値から3つのパターンに分岐させる
		switch (handNumber) {
		case 0: System.out.println("グー"); break; //画面にグーと表示する
		case 1: System.out.println("チョキ"); break; //画面にチョキと表示する
		case 2: System.out.println("パー"); break; //画面にパーと表示する
		}
	}

}
