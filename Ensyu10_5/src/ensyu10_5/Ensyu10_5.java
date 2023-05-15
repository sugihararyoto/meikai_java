//パッケージ名の宣言
package ensyu10_5;
/*
 * クラス名:Ensyu10_5
 * 概要  :演習10-5クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.15
 */
public class Ensyu10_5 {
	/*
	 * 関数名：main
	 * 概要：変更した銀行口座クラスを試すためのメインメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.12
	 */
	public static void main(String[] args) {
		//Account型のクラス型変数myAccountを生成し、インスタンス化する
		Account myAccount = new Account("太郎", "1", -10, new Day(-1000, -9, -3));
		//myAccountの内容を表示する
		System.out.println(myAccount);
		
		//Account型のクラス型変数accountTwoを生成し、インスタンス化する
		Account accountTwo = new Account("太郎", "2", 30000, new Day(2000, 2, 3));
		
	}

}
