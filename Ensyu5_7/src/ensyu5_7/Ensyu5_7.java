//パッケージ名の宣言
package ensyu5_7;
/*
 * クラス名:Ensyu5_7
 * 概要  :演習5-7クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.17
 */
public class Ensyu5_7 {
	/*
	 * 関数名：main
	 * 概要：0.0から1.0まで0.001おきに、その値と、その値の2乗を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.17
	 */
	public static void main(String[] args) {
		//変数conversionNumberを生成し、0で初期化する
		float conversionNumber = 0;
		//変数incrementNumberを生成し、0で初期化する
		int incrementNumber = 0;
		/*
		 * 変数additionNumberを生成し、0で初期化する
		 * 変数additionNumberに0.001Fずつ加算していき、
		 * 変数additionNumberの値が1.0Fより大きくなるまで繰り返す
		 */
		for (float additionNumber= 0.0F;additionNumber <= 1.0F;additionNumber += 0.001F) {
			/*
			 * 変数conversionNumberを生成し、変数incrementNumberの値をfloat型に変換し、
			 * 1000で割った値を代入する
			 */
			conversionNumber = (float)incrementNumber / 1000;
			//変数conversionNumberの値を表示する
			System.out.printf("%8.7f",conversionNumber);
			//半角スペースを3つ表示する
			System.out.print("   ");
			//画面に変数additionNumberの値を表示する
			System.out.printf("%8.7f",conversionNumber * conversionNumber);
			//改行する
			System.out.println();
			//変数incrementNumberの値をインクリメント
			incrementNumber++;
			}
		
	}

}