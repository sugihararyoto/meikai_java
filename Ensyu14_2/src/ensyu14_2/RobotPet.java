//パッケージ名の宣言
package ensyu14_2;
/*
 * クラス名:RobotPet
 * 概要  :ロボットペットクラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.22
 */
public class RobotPet extends PetClass {
	
	/*
	 * コンストラクタ
	 * 概要：ロボットペットクラスのコンストラクタ
	 * 引数：String petName, String masterName
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public RobotPet(String petName, String masterName) {
		//ペットクラスPetClassのコンストラクタの呼出し
		super(petName, masterName);
	}
	
	/*
	 * 関数名：introduceMyself
	 * 概要：自己紹介をするメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public void introduceMyself() {
		//ペットの名前を伝える
		System.out.println("◇私はロボット。名前は" + getPetName() + "。");
		//飼い主の名前を伝える
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}
	
	
	/*
	 * 関数名：doHousework
	 * 概要：自己紹介をするメソッド
	 * 引数：int workNumber
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public void doHousework(int workNumber) {
		//workNumberの値によって分岐する
		switch (workNumber) {
			//workNumberの値が0の場合
			case 0:
				//掃除することを伝える
				System.out.println("掃除します。");
				//switch文を抜ける
				break;
			//workNumberの値が1の場合
			case 1:
				//洗濯することを伝える
				System.out.println("洗濯します。");
				//switch文を抜ける
				break;
			//workNumberの値が2の場合
			case 2:
				//炊事することを伝える
				System.out.println("炊事します。");
				//switch文を抜ける
				break;
		}
	}

}
