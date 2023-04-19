//パッケージ名の宣言
package ensyu6_7;
//importする
import java.util.Random;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu6_7
 * 概要  :演習6-7クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.19
 */
public class Ensyu6_7 {
	/*
	 * 関数名：main
	 * 概要：探索を行うキー値と同じ値が複数個存在する場合、
	 * 最も末尾側に位置する要素を見つける
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.19
	 */
	public static void main(String[] args) {
		//乱数を生成する準備
		Random randomNumber = new Random();
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//要素数を表す変数elementNumberを生成し、12で初期化する
		final int elementNumber = 12;
		//int型で要素数が変数elementNumberの値の配列を生成する
		int [] arrayNumber = new int [elementNumber];
		
		/*
		 * 変数generateNumberを生成し、0で初期化する
		 * 変数generateNumberの値をインクリメントしながら
		 * 変数generateNumberの値が変数elementNumberの値になるまで繰り返す
		 */
		for (int generateNumber = 0; generateNumber < elementNumber; generateNumber++) {
			//arrayNumber[generateNumber]に0~9の値をランダムに生成し、代入する
			arrayNumber[generateNumber] = randomNumber.nextInt(10);
		}
		
		//画面に配列の全要素の値と表示し、改行した後に{と表示する
		System.out.print("配列の全要素の値\n{ ");
		
		/*
		 * 変数generateNumberを生成し、0で初期化する
		 * 変数generateNumberの値をインクリメントしながら
		 * 変数generateNumberの値が変数elementNumberの値になるまで繰り返す
		 */
		for (int generateNumber = 0; generateNumber < elementNumber; generateNumber++) {
			//画面にarrayNumber[generateNumber]の値を表示する
			System.out.print(arrayNumber[generateNumber] + " ");
		}
		
		//画面に}と表示する
		System.out.println("}");
		//画面に探す数値の入力を促す
		System.out.print("探す数値：");
		//変数keyNumberを生成し、キーボードから入力した値で初期化する
		int keyNumber = standardInput.nextInt();
		
		//変数decrementNumberを生成し、0で初期化する
		int decrementNumber = 0;
		
		/*
		 * 変数decrementNumberを生成し、変数elementNumberの値から1を引いた値で初期化する
		 * 変数decrementNumberの値をデクリメントしながら
		 * 変数decrementNumberの値が0より小さくなるまで繰り返す
		 */
		for (decrementNumber = elementNumber - 1; 0 <= decrementNumber;decrementNumber--) {
			//arrayNumber[decrementNumber]の値が変数keyNumberの値と等しい場合
			if (arrayNumber[decrementNumber] == keyNumber) {
				//繰り返しから抜ける
				break;
			}
			
		}
		//変数decrementNumberの値が-1ではない場合
		if (decrementNumber != -1) {
			//画面に入力した値と同じ値を持つ要素を表示する
			System.out.println("それはarrayNumber[" + decrementNumber + "]にあります。");
		//変数decrementNumberの値が-1の場合
		} else {
			//画面にそれはありません。と表示する
			System.out.println("それはありません。");
		}
		
		
	}

}
