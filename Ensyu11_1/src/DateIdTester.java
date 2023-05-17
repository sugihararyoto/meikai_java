//id.DateIdをimportする
import id.DateId;
/*
 * クラス名:DateIdTester
 * 概要  :識別番号テストクラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.16
 */
public class DateIdTester {
	/*
	 * 関数名：main
	 * 概要：識別番号クラスをテストするためのメインのメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.16
	 */
	public static void main(String[] args) {
		//DateId型のクラス型変数numberOneを生成し、インスタンス化する
		DateId numberOne = new DateId();
		//DateId型のクラス型変数numberTwoを生成し、インスタンス化する
		DateId numberTwo = new DateId();
		//DateId型のクラス型変数numberThreeを生成し、インスタンス化する
		DateId numberThree = new DateId();
		
		//1つ目の識別番号を表示する
		System.out.println("1つ目の識別番号：" + numberOne.getId());
		//2つ目の識別番号を表示する
		System.out.println("2つ目の識別番号：" + numberTwo.getId());
		//3つ目の識別番号を表示する
		System.out.println("3つ目の識別番号：" + numberThree.getId());
		
	}
}
