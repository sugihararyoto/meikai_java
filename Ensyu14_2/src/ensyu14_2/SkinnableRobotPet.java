//パッケージ名の宣言
package ensyu14_2;
/*
 * クラス名:SkinnableRobotPet
 * 概要  :着せ替え可能なロボットペットクラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.22
 */
public class SkinnableRobotPet extends RobotPet implements Skinnable {
	//スキンの色
	private int skinNumber = blackSkin;
	/*
	 * コンストラクタ
	 * 概要：初期化をするためのコンストラクタ
	 * 引数：String petName, String masterName
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public SkinnableRobotPet(String petName, String masterName) {
		//ロボットペットクラスRobotPetのコンストラクタの呼出し
		super(petName, masterName);
	}
	/*
	 * 関数名：changeSkin
	 * 概要：着せ替えを行うメソッド
	 * 引数：int skinNumber
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public void changeSkin(int skinNumber) {
		//スキンを変更することを伝える
		System.out.print("スキンを");
		//skinNumber
		switch(skinNumber) {
			//blackSkinが選ばれた場合
			case blackSkin:
				//漆黒に着せ替える
				System.out.print("漆黒");
				//switch文から抜ける
				break;
			//redSkinが選ばれた場合
			case redSkin:
				//深紅に着せ替える
				System.out.print("深紅");
				//switch文から抜ける
				break;
			//greenSkinが選ばれた場合
			case greenSkin:
				//柳葉に着せ替える
				System.out.print("柳葉");
				//switch文から抜ける
				break;
			//blueSkinが選ばれた場合
			case blueSkin:
				//露草に着せ替える
				System.out.print("露草");
				//switch文から抜ける
				break;
			//leopardSkinが選ばれた場合
			case leopardSkin:
				//豹柄に着せ替える
				System.out.print("豹柄");
				//switch文から抜ける
				break;
			//それ以外が選ばれた場合
			default:
				//無地に着せ替える
				System.out.print("無地");
				//switch文から抜ける
				break;
		}
		//スキンを変更することを伝える
		System.out.println("に変更しました。");
	}
	

}
