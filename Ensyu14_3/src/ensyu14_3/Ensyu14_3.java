//パッケージ名の宣言
package ensyu14_3;
/*
 * クラス名:Ensyu14_3
 * 概要  :演習14-3クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.22
 */
public class Ensyu14_3 {
	/*
	 * 関数名：main
	 * 概要：DVDPlayerクラスをテストするメインのメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public static void main(String[] args) {
		//DVDPlayer型のクラス型変数plyerOneを生成し、インスタンス化する
		DVDPlayer plyerOne = new DVDPlayer();
		//DVDを再生する
		plyerOne.playDVD();
		//DVDの再生を終了する
		plyerOne.stopDVD();
		//DVDをスロー再生する
		plyerOne.slowDVD();
	}

}
