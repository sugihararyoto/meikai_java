//パッケージ名の宣言
package ensyu10_1;
/*
 * クラス名:Id
 * 概要  :連番クラス
 * テキストにより、クラス名や変数名は指定
 * 作成者:R.Sugihara
 * 作成日:2023.05.11
 */
class Id {
	//識別番号のカウンター
	private static int counter = 0;
	//識別番号
	private int id;
	
	/*
	 * 引数を受け取らないコンストラクタ
	 */
	public Id() {
		//識別番号
		id = ++counter;
	}
	
	/*
	 * 関数名：getId
	 * 概要：識別番号を調べる
	 * 引数：なし
	 * 戻り値：id
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.11
	 */
	public int getId() {
		//識別番号を返却する
		return id;
	}
	
	/*
	 * 関数名：getMaxId
	 * 概要：識別番号カウンターの値を調べる
	 * 引数：なし
	 * 戻り値：counter
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.11
	 */
	public static int getMaxId() {
		//識別番号カウンターの値を返却する
		return counter;
	}
	
}
/*
 * クラス名:Ensyu10_1
 * 概要  :演習10-1クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.11
 */
public class Ensyu10_1 {
	/*
	 * 関数名：main
	 * 概要：連番クラスをテストするメインのメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.11
	 */
	public static void main(String[] args) {
		//Id型のクラス型変数firstNumberを生成し、インスタンス化する
		Id firstNumber = new Id();
		//Id型のクラス型変数secondNumberを生成し、インスタンス化する
		Id secondNumber = new Id();
		
		//firstNumberの識別番号を表示する
		System.out.println("aの識別番号：" + firstNumber.getId());
		//secondNumberの識別番号を表示する
		System.out.println("bの識別番号：" + secondNumber.getId());
		
		//Id型のクラス型変数thirdNumberを生成し、インスタンス化する
		Id thirdNumber = new Id();
		
		//最後に与えた識別番号を表示する
		System.out.println("最後に与えた識別番号：" + Id.getMaxId());
		
		//Id型のクラス型変数fourNumberを生成し、インスタンス化する
		Id fourNumber = new Id();
		
	}

}
