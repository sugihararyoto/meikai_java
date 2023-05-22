//パッケージ名の宣言
package ensyu14_3;
/*
 * クラス名:ExPlayer
 * 概要  :拡張プレーヤーインタフェース（スロー再生付き）
 * 作成者:R.Sugihara
 * 作成日:2023.05.22
 */
public interface ExPlayer extends PlayerInterface{
	/*
	 * 関数名：slowDVD
	 * 概要：スロー再生する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	void slowDVD();

}
