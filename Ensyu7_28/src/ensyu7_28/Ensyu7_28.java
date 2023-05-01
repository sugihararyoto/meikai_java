//パッケージ名の宣言
package ensyu7_28;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_28
 * 概要  :演習7-28クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.01
 */
public class Ensyu7_28 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：addMatrix
	 * 概要：行列xとyの和を格納した2次元配列を返すメソッド
	 * （行数と列数が同一の配列をxとyに受け取ることを前提とする）
	 * テキストによって、int[][] addMatrix(int[][] x, int[][] y)は指定
	 * 引数：int[][] x, int[][] y
	 * 戻り値：arrayNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static int[][] addMatrix(int[][] x, int[][] y) {
		//行数がx.lengthの配列arrayNumberを生成する
		int [][] arrayNumber = new int[x.length][];
		/*
		 * 「それぞれの配列の要素数の取得のためのfor文」
		 */
		for (int i = 0; i < x.length; i++) {
			//列数をx[i].lengthの値にする
			arrayNumber[i] = new int [x[i].length];
		}
		
		/*
		 * 「行列xと行列yを加算した値を行列zに代入する」
		 */
		for (int i = 0; i < x.length; i++) {
			//行列の列を加算するためのfor文
			for (int j = 0; j < x[i].length; j++) {
				//行列xと行列yを加算した値を行列arrayNumberに代入する
				arrayNumber[i][j] = x[i][j] + y[i][j];
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
		//行数が変数rowNumberの値の配列を生成する
		int [][] secondArray = new int[rowNumber][];
		
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
				System.out.print("x,y[" + i + "] = ");
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
			//列数を変数columnNumberの値にする
			secondArray[i] = new int [columnNumber];
		}
		
		//画面に行列xの各要素の値の入力を促す
		System.out.println("x[][]の値を入力してください。");
		//行列の値を入力するメソッドinputArrayを呼び出す
		inputArray(firstArray);
		//画面に行列yの各要素の値の入力を促す
		System.out.println("y[][]の値を入力してください。");
		//行列の値を入力するメソッドinputArrayを呼び出す
		inputArray(secondArray);
		//2つの行列の和を格納した配列を受け取る
		int [][] thirdArray = addMatrix(firstArray, secondArray);
		//画面に返却された配列を表示することを伝える
		System.out.println("返却された配列");
		//画面に行列の内容を表示するメソッドを呼び出す
		printMatrix(thirdArray);
	}

}
