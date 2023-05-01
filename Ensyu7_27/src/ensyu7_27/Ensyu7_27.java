//パッケージ名の宣言
package ensyu7_27;
/*
 * クラス名:Ensyu7_27
 * 概要  :演習7-27クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.01
 */
public class Ensyu7_27 {
	/*
	 * 関数名：addMatrix
	 * 概要：3つの配列の要素数が等しければ加算を行ってtrueを返し、
	 * 等しくなければ加算を行わずにfalseを返すメソッド
	 * テキストによって、boolean addMatrix(int[][] x, int[][] y, int[][] z)は指定
	 * 引数：int[][] x, int[][] y, int[][] z
	 * 戻り値：returnNumber(true, false)
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		//返却するための変数returnNumberを生成し、trueで初期化する
		boolean returnNumber = true;
		
		//xの要素数とyの要素数が異なるか、xの要素数とzの要素数が異なる場合
		if (x.length != y.length || x.length != z.length) {
			//変数returnNumberにfalseを代入する
			returnNumber = false;
		//xの要素数とyの要素数とzの要素数が同じ場合
		} else {
			/*
			 * 「それぞれの配列の要素数の取得のためのfor文」
			 */
			for (int i = 0; i < x.length; i++) {
				/*
				 * xの各要素数とyの各要素数が異なるか、xの各要素数と
				 * zの各要素数が異なる場合
				 */
				if (x[i].length != y[i].length || x[i].length != z[i].length) {
					//変数returnNumberにfalseを代入する
					returnNumber = false;
					//for文から抜ける
					break;
				}
				/*
				 * 「行列xと行列yを加算した値を行列zに代入する」
				 */
				for (i = 0; i < x.length; i++) {
					//行列の列を加算するためのfor文
					for (int j = 0; j < x[i].length; j++) {
						//行列xと行列yを加算した値を行列zに代入する
						z[i][j] = x[i][j] + y[i][j];
					}
				}
			}
		}
		//変数returnNumberを返す
		return returnNumber;
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
	 * 概要：3つの配列の要素数が等しければtrue、等しくなければfalseを
	 * 受け取って表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.01
	 */
	public static void main(String[] args) {
		//行列firstArrayを生成し、指定した値で初期化する
		int[][] firstArray = { {1, 2, 3}, {4, 5, 6} };
		//行列secondArrayを生成し、指定した値で初期化する
		int[][] secondArray = { {6, 3, 4}, {5, 1, 2} };
		//2行3列の行列thirdArrayを生成する
		int[][] thirdArray = new int[2][3];
		
		//加算してtrueを返すか、加算せずにfalseを返すメソッドaddMatrixを呼び出す
		addMatrix(firstArray, secondArray, thirdArray);
		
		//行列aの各要素の値を表示することを伝える
		System.out.println("行列a");
		//行列の各要素の値を表示するメソッドprintMatrixを呼び出す
		printMatrix(firstArray);
		//行列bの各要素の値を表示することを伝える
		System.out.println("行列b");
		//行列の各要素の値を表示するメソッドprintMatrixを呼び出す
		printMatrix(secondArray);
		//行列cの各要素の値を表示することを伝える
		System.out.println("行列c");
		//行列の各要素の値を表示するメソッドprintMatrixを呼び出す
		printMatrix(thirdArray);
		
		//画面に返却された値を表示することを伝える
		System.out.print("返却された値：");
		//画面に返却された値を表示する
		System.out.println(addMatrix(firstArray, secondArray, thirdArray));
	}

}
