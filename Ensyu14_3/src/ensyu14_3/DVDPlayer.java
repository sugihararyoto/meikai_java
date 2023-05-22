//パッケージ名の宣言
package ensyu14_3;
/*
 * クラス名:DVDPlayer
 * 概要  :DVDプレーヤークラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.22
 */
public class DVDPlayer implements ExPlayer{
	
	/*
	 * 関数名：playDVD
	 * 概要：DVDを再生する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public void playDVD() {
		//DVDの再生を開始する
		System.out.println("■DVD再生開始！");
	}
	/*
	 * 関数名：stopDVD
	 * 概要：DVDの再生を終了する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public void stopDVD() {
		//DVDの再生を終了する
		System.out.println("■DVD再生終了！");
	}
	/*
	 * 関数名：slowDVD
	 * 概要：DVDをスロー再生する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public void slowDVD() {
		//DVDのスロー再生する
		System.out.println("■DVDスロー再生開始！");
	}

}
