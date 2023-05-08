//パッケージ名の宣言
package ensyu7_33;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_33
 * 概要  :演習7-33クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.01
 */
public class Ensyu7_33 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	 * 関数名：inputElement
	 * 概要：要素数を入力するためのメソッド
	 * 引数：なし
	 * 戻り値：inputNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static int inputElement() {
		//変数inputNumberを生成し、0で初期化する
		int inputNumber = 0;
		/*
		 * 「要素数の入力を行う」
		 * while (inputNumber <= 0)の文までを実行する
		 */
		do {
			//画面に要素数の入力を促す
			System.out.print("要素数：");
			//変数inputNumberに、キーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
			//0以下の値が入力された場合
			if (inputNumber <= 0) {
				//画面に1以上の値を入力してください。と表示する
				System.out.println("1以上の値を入力してください。");
			}
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0);
		//inputNumberを返す
		return inputNumber;
	}
	/*
	 * 関数名：inputRow
	 * 概要：行列の行の値を入力するためのメソッド
	 * 引数：なし
	 * 戻り値：rowNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static int inputRow () {
		//行数を表す変数rowNumberを生成し、0で初期化する
		int rowNumber = 0;
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
		//行数を表す変数rowNumberを返す
		return rowNumber;
	}
	/*
	 * 関数名：inputColumn
	 * 概要：行列の列の値を入力するためのメソッド
	 * 引数：int[][] oneArray
	 * 戻り値：arrayNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static int[][] inputColumn (int[][] oneArray) {
		//列数を表す変数columnNumberを生成し、0で初期化する
		int columnNumber = 0;
		//行数がoneArray.lengthの行列arrayNumberを生成する
		int [][] arrayNumber = new int[oneArray.length][];
		//画面に列数を入力してくださいと表示する
		System.out.println("列数を入力してください");
		/*
		 * 「列数を入力する」
		 * 変数iを生成し、0で初期化する
		 * 変数iをインクリメントしながら
		 * 変数iの値がrowNumberになるまで繰り返す
		 */
		for (int i = 0; i < oneArray.length; i++) {
			//while (columnNumber < 0)の文までを実行する
			do {
				//画面に列数の入力を促す
				System.out.print("[" + i + "] = ");
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
		//列数を入力した行列arrayNumberを返す
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
	 * 関数名：printArray
	 * 概要：1次元配列の表示を行うメソッド
	 * テキストによって、void printArray(int[] a)は指定
	 * 引数：int[] a
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static void printArray(int[] a) {
		/*
		 * 「各要素の値を表示する」
		 */
		for (int i = 0; i < a.length; i++) {
			//画面に配列の要素の値を表示して半角スペースを入れる
			System.out.print(a[i] + " ");
		}
	}
	/*
	 * 関数名：printArray
	 * 概要：2次元配列の表示を行うメソッド
	 * テキストによって、void printArray(int[][] a)は指定
	 * 引数：int[][] a
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static void printArray(int[][] a) {
		
		//行数がa.lengthの値の配列arrayNumberを生成する
		long [][] arrayNumber = new long[a.length][];
		//要素数が一番多い行の値を表す変数maxElementを生成し、0で初期化する
		int maxElement = 0;
		//桁数を求めるための変数findDigitを生成し、10で初期化する
		final int findDigit = 10;
		//マイナスを桁数と数え、最大値の計算をするための変数minusDigitを生成し、-10で初期化する
		final int minusDigit = -10;
		
		/*
		 * 「一番要素数（列数）が多い行を見つける作業を行う」
		 */
		for (int i = 0; i < a.length; i++) {
			//変数maxElementの値がa[i].lengthの値よりも小さい場合
			if (maxElement < a[i].length) {
				//変数maxElementにa[i].lengthの値を代入する
				maxElement = a[i].length;
			}
		}
		
		/*
		 * 「配列arrayNumberの各列数を一番列数が多い行の列数にする」
		 */
		for (int i = 0; i < a.length; i++) {
			//arrayNumber[i]の列数を変数maxElementの値にする
			arrayNumber[i] = new long [maxElement];
		}
		
		/*
		 * 「配列arrayNumberに配列aの値を代入する」
		 */
		for (int i = 0; i < a.length; i++) {
			/*
			 * 「配列arrayNumberに配列aの値を代入するためのfor文」
			 */
			for (int j = 0; j < a[i].length; j++) {
				//arrayNumber[i][j]にa[i][j]の値を代入する
				arrayNumber[i][j] = a[i][j];
			}
		}
		
		/*
		 * 「マイナスを桁数に含め画面を整えるための作業を行う」
		 */
		for (int i = 0; i < arrayNumber.length; i++) {
			/*
			 * 「負の数を判断するためのfor文」
			 */
			for (int j = 0; j < arrayNumber[i].length; j++) {
				//arrayNumber[i][j]の値が負の数の場合
				if (arrayNumber[i][j] < 0) {
					//arrayNumber[i][j]にminusDigitの値を掛ける
					arrayNumber[i][j] *= minusDigit; 
				}
			}
		}
		
		/*
		 * 「2次元配列aの表示のためのfor文」
		 */
		for (int i = 0; i < a.length; i++) {
			//桁数を表す変数digitNumberを生成し、0で初期化する
			int digitNumber  = 0;
			//最大値を表す変数maxNumberを生成し、0で初期化する
			long maxNumber = 0;
			/*
			 * 「2次元配列aの表示のためのfor文」
			 */
			for (int j = 0; j < a[i].length; j++) {
				//最大値をリセットするために変数maxNumberに0を代入する
				maxNumber = 0;
				
				/*
				 * 「画面を整えるために最大値を求める」
				 */
				for (int k = 0; k < a.length; k++) {
					//変数maxNumberの値がarrayNumber[k][j]の値より小さい場合
					if (maxNumber < arrayNumber[k][j]) {
						//変数maxNumberにarrayNumber[k][j]の値を代入する
						maxNumber = arrayNumber[k][j];
					}
				}
				
				/*
				 * 「最大値が0だった場合に桁を合わせるため判断」
				 */
				if (maxNumber == 0) {
					//変数digitNumberの値をインクリメント
					digitNumber++;
				}
				
				/*
				 * 「桁数を求める」
				 */
				 while (maxNumber > 0) {
					//変数digitNumberの値をインクリメント
					digitNumber++;
					//変数maxNumberをfindDigitの値で割る
					maxNumber /= findDigit;
				 }
				
				//変数digitNumberの値をインクリメント
				digitNumber++;
				//画面に2次元配列aの値を表示する
				System.out.printf("%-"+ digitNumber +"d",a[i][j]);
				//変数digitNumberに0を代入してリセットする
				digitNumber = 0;
			}
			//改行する
			System.out.println();
		}
	}
	/*
	 * 関数名：main
	 * 概要：1次元配列と2次元配列を表示するためのメインのメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	public static void main(String[] args) {
		//配列aの要素数の入力を促す
		System.out.print("配列aの");
		//変数firstElementを生成し、メソッドinputElementから受け取った値で初期化する
		int firstElement = inputElement();
		//要素数がfirstElementの値の配列firstArrayを生成する
		int [] firstArray = new int [firstElement];
		
		/*
		 * 「全要素の値を入力する」
		 * 変数iを生成し、0で初期化する、iの値をインクリメントし、
		 * iの値が変数firstElementの値になるまで繰り返す
		 */
		for (int i = 0; i < firstElement; i++) {
			//配列の要素の値の入力を促す
			System.out.print("a[" + i + "]：");
			//firstArray[i]にキーボードから入力した値を代入する
			firstArray[i] = standardInput.nextInt();
		}
		
		//配列bの要素数の入力を促す
		System.out.print("二次元配列bの");
		//変数secondElementを生成し、メソッドinputRowから受け取った値で初期化する
		int secondElement = inputRow();
		//行数がsecondElementの値の配列を生成する
		int [][] secondArray = new int[secondElement][];
		//列数を入力するメソッドinputColumnから列数を受け取る
		secondArray = inputColumn(secondArray);
		//画面に2次元配列aの各要素の値の入力を促す
		System.out.println("b[][]の値を入力してください。");
		//行列の値を入力するメソッドinputArrayを呼び出す
		inputArray(secondArray);
		
		//返却された1次元配列を表示することを伝える
		System.out.println("返却された1次元配列");
		//メソッドprintArrayを呼び出し、1次元配列を表示する
		printArray(firstArray);
		//返却された2次元配列を表示することを伝える
		System.out.println("\n返却された2次元配列");
		//メソッドprintArrayを呼び出し、2次元配列を表示する
		printArray(secondArray);
	}
}
