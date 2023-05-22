//パッケージ名の宣言
package ensyu14_2;
/*
 * インターフェース名:Skinnable
 * 概要  :着せ替えインタフェース
 * 作成者:R.Sugihara
 * 作成日:2023.05.22
 */
public interface Skinnable {
	//漆黒
	int blackSkin = 0;
	//深紅
	int redSkin = 1;
	//柳葉
	int greenSkin = 2;
	//露草
	int blueSkin = 3;
	//豹柄
	int leopardSkin = 4;
	/*
	 * 関数名：changeSkin
	 * 概要：着せ替えを行うメソッド
	 * 引数：int skinNumber
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	void changeSkin(int skin);

}
