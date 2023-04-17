//パッケージ名の宣言
package ensyu6_1;
/*
 * クラス名:Ensyu6_1
 * 概要  :演習6-1クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.17
 */
public class Ensyu6_1 {
	/*
	 * 関数名：main
	 * 概要：要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.17
	 */
	public static void main(String[] args) {
		//double型で要素数が5の配列を生成する
		double [] realNumber = new double[5]; 
		//realNumber[0]に12.5を代入する
		realNumber[0] = 12.5;
		//realNumber[1]に22.5を代入する
		realNumber[1] = 22.5;
		//realNumber[2]に32.5を代入する
		realNumber[2] = 32.5;
		//realNumber[3]に42.5を代入する
		realNumber[3] = 42.5;
		//realNumber[4]に52.5を代入する
		realNumber[4] = 52.5;
		
		//画面にrealNumber[0]の値を表示する
		System.out.println("realNumber[" + 0 + "] = " + realNumber[0]);
		//画面にrealNumber[1]の値を表示する
		System.out.println("realNumber[" + 1 + "] = " + realNumber[1]);
		//画面にrealNumber[2]の値を表示する
		System.out.println("realNumber[" + 2 + "] = " + realNumber[2]);
		//画面にrealNumber[3]の値を表示する
		System.out.println("realNumber[" + 3 + "] = " + realNumber[3]);
		//画面にrealNumber[4]の値を表示する
		System.out.println("realNumber[" + 4 + "] = " + realNumber[4]);
		
	}

}
