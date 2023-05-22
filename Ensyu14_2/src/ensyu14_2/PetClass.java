//パッケージ名の宣言
package ensyu14_2;
/*
 * クラス名:PetClass
 * 概要  :ペットクラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.22
 */
public class PetClass {
	//ペットの名前
	private String petName;
	//飼い主の名前
	private String masterName;
	
	/*
	 * コンストラクタ
	 * 概要：直線を生成するコンストラクタ
	 * 引数：String petName, String masterName
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public PetClass(String petName, String masterName) {
		//ペットの名前
		this.petName = petName;
		//飼い主の名前
		this.masterName = masterName;
	}
	/*
	 * 関数名：getPetName
	 * 概要：ペットの名前を取得するメソッド
	 * 引数：なし
	 * 戻り値：petName
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public String getPetName() {
		//ペットの名前を返却する
		return petName;
	}
	/*
	 * 関数名：getMasterName
	 * 概要：飼い主の名前を取得するメソッド
	 * 引数：なし
	 * 戻り値：masterName
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public String getMasterName() {
		//飼い主の名前を返却するｓ
		return masterName;
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
		System.out.println("■僕の名前は" + petName + "です！");
		//飼い主の名前を伝える
		System.out.println("■ご主人様は" + masterName + "です！");
	}
	

}
