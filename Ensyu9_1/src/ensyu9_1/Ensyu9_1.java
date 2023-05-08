//パッケージ名の宣言
package ensyu9_1;
/*
 * クラス名:Ensyu9_1
 * 概要  :演習9-1クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.08
 */
public class Ensyu9_1 {
	/*
	 * 関数名：main
	 * 概要：人間クラスの配列を生成するメインメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.08
	 */
	public static void main(String[] args) {
		//クラス型インスタンスの配列firstArrayを生成し、要素を初期化する
		HumanClass[] firstArray = {new HumanClass("山田太郎", 182.5, 75.5), 
				new HumanClass("鈴木太郎", 155.3, 45.7) };
		/*
		 * 「画面に配列firstArrayの内容を表示する」
		 */
		for (int i = 0; i < firstArray.length; i++) {
			//firstArray[i]の内容を表示する
			firstArray[i].outputClass();
		}
		//改行する
		System.out.println();
		//クラス型インスタンスの配列secondArrayを生成する
		HumanClass[] secondArray;
		//生成した配列secondArrayに代入する
		secondArray = new HumanClass[] {new HumanClass("田中太郎", 193.0, 92.0), 
				new HumanClass("佐藤太郎", 170.1, 62.2) };
		/*
		 * 「画面に配列secondArrayの内容を表示する」
		 */
		for (int i = 0; i < firstArray.length; i++) {
			//secondArray[i]の内容を表示する
			secondArray[i].outputClass();
		}
	}

}
