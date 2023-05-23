//パッケージ名の宣言
package ensyu15_6;
//importする
import static java.lang.Math.*;
/*
 * クラス名:Ensyu15_6
 * 概要  :演習15-6クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.22
 */
public class Ensyu15_6 {
	/*
	 * 関数名：main
	 * 概要：コマンドライン引数で与えられた半径をもつ
	 * 円の円周の長さと面積を求めて表示する
	 * 引数：String[] args
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.22
	 */
	public static void main(String[] args) {
		//円周の長さを表示する
		System.out.println("円周の長さは" + 2 * PI * Double.parseDouble(args[0]) + "です。");
		//面積を表示する
		System.out.println("面積は" + PI * Double.parseDouble(args[0]) * Double.parseDouble(args[0]) +"です。");
		
	}

}
