//パッケージ名の宣言
package ensyu6_18;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu6_18
 * 概要  :演習6-18クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.21
 */
public class Ensyu6_18 {
	/*
	 * 関数名：main
	 * 概要：行数・各行の列数・各要素の値をキーボードから読み込むように
	 * List6-18を書きかえる
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.21
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//行数を表す変数rowNumberを生成し、0で初期化する
		int rowNumber = 0; 
		//列数を表す変数columnNumberを生成し、0で初期化する
		int columnNumber = 0;
		
		//while (rowNumber <= 0)の文までを実行する
		do {
			//画面に行数の入力を促す
			System.out.print("行数を入力してください：");
			//変数rowNumberに、キーボードから入力した値を代入する
			rowNumber = standardInput.nextInt();
			//正ではない値が入力された場合
			if (rowNumber <= 0) {
				//画面に正ではない値が入力されました。と表示する
				System.out.println("正ではない値が入力されました。");
			}
			
		//変数rowNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (rowNumber <= 0);
		
		//行数が変数rowNumberの値の配列を生成する
		int [][] arrayNumber = new int[rowNumber][];
		
		//画面に列数を入力してくださいと表示する
		System.out.println("列数を入力してください");
		
		/*
		 * 「列数を入力する」
		 * 変数iを生成し、0で初期化する
		 * 変数iをインクリメントしながら
		 * 変数iの値がrowNumberになるまで繰り返す
		 */
		for (int i = 0; i < rowNumber; i++) {
			//while (columnNumber < 0)の文までを実行する
			do {
				//画面に列数の入力を促す
				System.out.print("arrayNumber[" + i + "] = ");
				//変数columnNumberにキーボードから入力した値を代入する
				columnNumber =  standardInput.nextInt();
				//変数columnNumberの値が0より小さい場合
				if (columnNumber < 0) {
					//画面に0以上の数を入力してください。と表示する
					System.out.println("0以上の数を入力してください。");
				}
			//変数columnNumberの値が0より小さいあいだdoからwhileまでを繰り返す
			} while (columnNumber < 0);
			//列数を変数columnNumberの値にする
			arrayNumber[i] = new int [columnNumber];
		}
		
		//画面に各要素の値を入力してください。と表示する
		System.out.println("各要素の値を入力してください。");
		
		/*
		 * 「各要素への値の入力」
		 * 変数iを生成し、0で初期化する
		 * 変数iをインクリメントしながら
		 * 変数iの値がarrayNumber.lengthになるまで繰り返す
		 */
		for (int i = 0; i < arrayNumber.length; i++) {
			/*
			 * 変数jを生成し、0で初期化する
			 * 変数jをインクリメントしながら
			 * 変数jの値がarrayNumber[i].lengthになるまで繰り返す
			 */
			for (int j = 0; j < arrayNumber[i].length; j++) {
				//配列の各要素の値の入力を促す
				System.out.print("arrayNumber[" + i + "][" + j + "] = ");
				//arrayNumber[i][j]にキーボードから入力した値を代入する
				arrayNumber[i][j] = standardInput.nextInt();
				
			}
		}
		
		/*
		 * 「配列を表示」
		 * 変数iを生成し、0で初期化する
		 * 変数iをインクリメントしながら
		 * 変数iの値がarrayNumber.lengthになるまで繰り返す
		 */
		for (int i = 0; i < arrayNumber.length; i++) {
			/*
			 * 変数jを生成し、0で初期化する
			 * 変数jをインクリメントしながら
			 * 変数jの値がarrayNumber[i].lengthになるまで繰り返す
			 */
			for (int j = 0; j < arrayNumber[i].length; j++) {
				//配列の各要素の値を表示する
				System.out.print((arrayNumber[i][j] +"\t"));
			}
			//改行する
			System.out.println();
		}
		
		
	}

}
