//パッケージ名の宣言
package ensyu10_2;
//importする
import java.util.Scanner;

/*
 * クラス名:ExId
 * 概要  :連番クラス
 * テキストにより、クラス名や変数名は指定
 * 作成者:R.Sugihara
 * 作成日:2023.05.11
 */
class ExId {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	//識別番号のカウンター
	private static int counter = 0;
	//識別番号
	private int id;
	//識別番号を増やす量
	static private int n = 1;
	/*
	 * 引数を受け取らないコンストラクタ
	 */
	public ExId() {
		//識別番号
		id = counter += n;
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
	
	/*
	 * 関数名：getN
	 * 概要：識別番号を増やす量を調べる
	 * 引数：なし
	 * 戻り値：id
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.11
	 */
	public int getN() {
		//識別番号を増やす量を返却する
		return n;
	}
	
	/*
	 * 関数名：inputNumber
	 * 概要：識別番号を増やす量を入力させる
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.11
	 */
	public static void inputNumber() {
		//while (n <= 0)までを実行する
		do {
			//識別番号を増やす量の入力を促す
			System.out.print("識別番号をいくつずつ増やしますか：");
			//クラス変数のnにキーボードから入力された値を代入する
			n = standardInput.nextInt();
			//正の値ではない数が入力された場合
			if (n <= 0) {
				//画面で正の値を入力することを伝える
				System.out.println("正の値を入力してください。");
			}
		//正の値ではない数が入力されているあいだdoからwhileまでを繰り返す
		} while (n <= 0);
	}
}
/*
 * クラス名:Ensyu10_2
 * 概要  :演習10-2クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.11
 */
public class Ensyu10_2 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
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
		ExId firstNumber = new ExId();
		//Id型のクラス型変数secondNumberを生成し、インスタンス化する
		ExId secondNumber = new ExId();
		//Id型のクラス型変数thirdNumberを生成し、インスタンス化する
		ExId thirdNumber = new ExId();
		
		//firstNumberの識別番号を表示する
		System.out.println("aの識別番号：" + firstNumber.getId());
		//secondNumberの識別番号を表示する
		System.out.println("bの識別番号：" + secondNumber.getId());
		//thirdNumberの識別番号を表示する
		System.out.println("cの識別番号：" + thirdNumber.getId());
		
		//クラスメソッドを呼び出す
		ExId.inputNumber();
		
		//Id型のクラス型変数fourthNumberを生成し、インスタンス化する
		ExId fourthNumber = new ExId();
		//fourthNumberの識別番号を表示する
		System.out.println("dの識別番号：" + fourthNumber.getId());
		//Id型のクラス型変数fifthNumberを生成し、インスタンス化する
		ExId fifthNumber = new ExId();
		//fourNumberの識別番号を表示する
		System.out.println("eの識別番号：" + fifthNumber.getId());
		
	}

}
