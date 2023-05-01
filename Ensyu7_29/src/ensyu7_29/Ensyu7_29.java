//パッケージ名の宣言
package ensyu7_29;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_29
 * 概要  :演習7-29クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.01
 */
public class Ensyu7_29 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：aryClone2
	 * 概要：2次元配列aと同じ配列を生成して返却するメソッド
	 * テキストによって、int[][] aryClone2(int[][] a)は指定
	 * 引数：int[][] a
	 * 戻り値：arrayNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static int[][] aryClone2(int[][] a) {
		//行数がa.lengthの配列arrayNumberを生成する
		int [][] arrayNumber = new int[a.length][];
		/*
		 * 「それぞれの配列の要素数の取得のためのfor文」
		 */
		for (int i = 0; i < a.length; i++) {
			//列数をa[i].lengthの値にする
			arrayNumber[i] = new int [a[i].length];
		}
		/*
		 * 「行列aの値を行列arrayNumberに代入する」
		 */
		for (int i = 0; i < a.length; i++) {
			//行列の列を加算するためのfor文
			for (int j = 0; j < a[i].length; j++) {
				//行列aの値を行列arrayNumberに代入する
				arrayNumber[i][j] = a[i][j];
			}
		}
		//行列xとyの和を格納した配列を返す
		return arrayNumber;
	}
	/*
	 * 関数名：inputArray
	 * 概要：行列の各要素の値を入力するためのメソッド
	 * 引数：int[][] oneAllay
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static void inputArray(int[][] oneAllay) {
		/*
		 * 「各要素への値の入力」
		 * 変数iを生成し、0で初期化する
		 * 変数iをインクリメントしながら
		 * 変数iの値がoneAllay.lengthになるまで繰り返す
		 */
		for (int i = 0; i < oneAllay.length; i++) {
			/*
			 * 変数jを生成し、0で初期化する
			 * 変数jをインクリメントしながら
			 * 変数jの値がoneAllay[i].lengthになるまで繰り返す
			 */
			for (int j = 0; j < oneAllay[i].length; j++) {
				//配列の各要素の値の入力を促す
				System.out.print("[" + i + "][" + j + "] = ");
				//oneAllay[i][j]にキーボードから入力した値を代入する
				oneAllay[i][j] = standardInput.nextInt();	
			}
		}
	}
	/*
	 * 関数名：printMatrix
	 * 概要：行列mの各要素の値を画面に表示するためのメソッド
	 * テキストによって、void printMatrix(int[][] m)は指定
	 * 引数：int[][] m
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static void printMatrix(int[][] m) {
		/*
		 * 「行列mの表示のためのfor文」
		 */
		for (int i = 0; i < m.length; i++) {
			/*
			 * 「行列mの表示のためのfor文」
			 */
			for (int j = 0; j < m[i].length; j++) {
				//画面に行列mを表示する
				System.out.print(m[i][j] + " ");
			}
			//改行する
			System.out.println();
		}
	}
	/*
	 * 関数名：main
	 * 概要：2つの行列の和を格納した2次元配列を受け取り表示するためのメインメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	public static void main(String[] args) {
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
		int [][] firstArray = new int[rowNumber][];
		
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
				System.out.print("a[" + i + "] = ");
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
			firstArray[i] = new int [columnNumber];
		}
		//画面に2次元配列aの各要素の値の入力を促す
		System.out.println("a[][]の値を入力してください。");
		//行列の値を入力するメソッドinputArrayを呼び出す
		inputArray(firstArray);
		//配列aの内容を表示することを伝える
		System.out.println("配列a");
		//画面に行列の内容を表示するメソッドを呼び出す
		printMatrix(firstArray);
		//配列secondArrayに配列firstArrayと同じ配列を受け取る
		int [][] secondArray = aryClone2(firstArray);
		//返却された配列の内容を表示することを伝える
		System.out.println("返却された配列");
		//画面に行列の内容を表示するメソッドを呼び出す
		printMatrix(secondArray);
	}

}
