//パッケージ名の宣言
package ensyu6_16;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu6_16
 * 概要  :演習6-16クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.20
 */
public class Ensyu6_16 {
	/*
	 * 関数名：main
	 * 概要：4行3列の行列と3行4列の行列の積を求める
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.20
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//4行3列の行列を生成する(行列x)
		int [][] firstNumber = new int [4][3];
		//3行4列の行列を生成する(行列y)
		int [][] secondNumber = new int [3][4];
		//4行4列の行列を生成する
		int [][] thirdNumber = new int [4][4];
		
		//画面に値の入力を促す
		System.out.println("行列xの各要素の値を入力してください。");
		
		/*
		 * 変数iを生成し、0で初期化する。iをインクリメントし、
		 * iの値が4になるまで繰り返す
		 */
		for (int i = 0; i < 4; i++) {
			/*
			 * 変数jを生成し、0で初期化する。jをインクリメントし、
			 * jの値が3になるまで繰り返す
			 */
			for (int j = 0; j < 3; j++) {
				//画面に要素の値の入力を促す
				System.out.print("x[" + i + "][" + j + "] = ");
				//行列xの要素の値をキーボードから読み込む
				firstNumber[i][j] = standardInput.nextInt();
			}
		}
		//画面に値の入力を促す
		System.out.println("行列yの各要素の値を入力してください。");
		
		/*
		 * 変数iを生成し、0で初期化する。iをインクリメントし、
		 * iの値が3になるまで繰り返す
		 */
		for (int i = 0; i < 3; i++) {
			/*
			 * 変数jを生成し、0で初期化する。jをインクリメントし、
			 * jの値が4になるまで繰り返す
			 */
			for (int j = 0; j < 4; j++) {
				//画面に要素の値の入力を促す
				System.out.print("y[" + i + "][" + j + "] = ");
				//行列yの要素の値をキーボードから読み込む
				secondNumber[i][j] = standardInput.nextInt();
			}
		}
		
		/*
		 * 変数iを生成し、0で初期化する。iをインクリメントし、
		 * iの値が4になるまで繰り返す
		 */
		for (int i = 0; i < 4; i++) {
			/*
			 * 変数jを生成し、0で初期化する。jをインクリメントし、
			 * jの値が4になるまで繰り返す
			 */
			for (int j = 0; j < 4; j++) {
				//行列thirdNumberに行列の積を代入する
				thirdNumber[j][i] = (firstNumber[j][0] * secondNumber[0][i]) + 
						(firstNumber[j][1] * secondNumber[1][i]) + 
						(firstNumber[j][2] * secondNumber[2][i]);
			}
		}
		//画面に4行3列の行列と3行4列の行列の積を表示します。と表示する
		System.out.println("4行3列の行列と3行4列の行列の積を表示します。");
		
		/*
		 * 変数iを生成し、0で初期化する。iをインクリメントし、
		 * iの値が4になるまで繰り返す
		 */
		for (int i = 0; i < 4; i++) {
			/*
			 * 変数jを生成し、0で初期化する。jをインクリメントし、
			 * jの値が4になるまで繰り返す
			 */
			for (int j = 0; j < 4; j++) {
				//画面に要素の値の入力を促す
				System.out.print(thirdNumber[i][j] +"\t");
			}
			//改行する
			System.out.println();
		}
		
	}

}
