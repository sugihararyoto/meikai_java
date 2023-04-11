//パッケージ名の宣言
package ensyu4_5;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu4_5
 * 概要  :演習4-5クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.11
 */
public class Ensyu4_5 {
	/*
	 * 関数名：main
	 * 概要：List4-5のinputNumber--が--inputNumberとなっていたら
	 * どのような出力が得られるかを検討する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//画面にカウントダウンします。と表示する
		System.out.println("カウントダウンします。");
		//キーボードから入力した値を代入するための変数inputNumberを生成する
		int inputNumber;
		
		//whileまでの文を実行する
		do {
			//画面に正の整数値の入力を促す
			System.out.print("正の整数値：");
			//変数にキーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
			
			//正の整数値ではない数が入力された場合
			if(inputNumber < 1) {
				//画面に正ではない値が入力されました。と表示する
				System.out.println("正ではない値が入力されました。");
			}	
		/*
		 * 変数inputNumberの値が0以下のあいだ
		 * doからwhileまでを繰り返す
		 */
		} while (inputNumber <= 0);
		
		//変数inputNumberの値が0以上のあいだ繰り返す
		while (inputNumber >= 0) {
			/*
			 * inputNumber--が--inputNumberとなっていたら
			 * どのような出力が得られるか
			 * 結果→画面に(入力した値-1)~-1まで表示される
			 */
			System.out.println(--inputNumber);
		}
		
		
	}

}
