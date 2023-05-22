//パッケージ名の宣言
package ensyu14_2;

/*
 * クラス名:Ensyu14_2
 * 概要  :演習14-2クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.22
 */
public class Ensyu14_2 {
	/*
	 * 関数名：main
	 * 概要：着せ替え可能なロボットペットクラスをテストするメインのメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public static void main(String[] args) {
		//SkinnableRobotPet型のクラス型変数petSkinを生成し、インスタンス化する
		SkinnableRobotPet petSkin = new SkinnableRobotPet("ロボ", "山田");
		//自己紹介をする
		petSkin.introduceMyself();
		//着せ替えを行う
		petSkin.changeSkin(Skinnable.redSkin);
	}
	

}
