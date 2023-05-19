//パッケージ名の宣言
package ensyu13_2;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu13_2
 * 概要  :演習13-2クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.18
 */
public class Ensyu13_2 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：inputOneNumber
	 * 概要：int型で1以上の数を入力させるためのメソッド
	 * 引数：なし
	 * 戻り値：inputNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	static int inputOneNumber() {
		//変数inputNumberを生成し、0で初期化する
		int inputNumber = 0;
		/*
		 * 「数の入力を行う」
		 * while (inputNumber <= 0)の文までを実行する
		 */
		do {
			//変数inputNumberに、キーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
			//0以下の値が入力された場合
			if (inputNumber <= 0) {
				//画面に1以上の値を入力してください。と表示する
				System.out.println("1以上の値を入力してください。");
				//再入力を促す
				System.out.print("再入力：");
			}
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0);
		//inputNumberを返す
		return inputNumber;
	}
	/*
	 * 関数名：inputFigure
	 * 概要：どんな図形を表示するか入力するためのメソッド
	 * 引数：int selectNumber, int indexNumber, Shape[] ArrayNumber
	 * 戻り値：arrayNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public static Shape[] inputFigure(int selectNumber, int indexNumber, Shape[] arrayNumber) {
		//selectNumberの値によって分岐する
		switch (selectNumber) {
			//左上直角の場合
			case 1:
				//段数の入力を促す
				System.out.print("段数：");
				//段数をキーボードから読み込む
				int stepNumberOne = inputOneNumber();
				//arrayNumber[indexNumber]にインスタンス化する
				arrayNumber[indexNumber] = new LowerLeft(stepNumberOne);
				//switch文から抜ける
				break;
			//水平直線の場合
			case 2:
				//段数の入力を促す
				System.out.print("段数：");
				//段数をキーボードから読み込む
				int stepNumberTwo = inputOneNumber();
				//arrayNumber[indexNumber]にインスタンス化する
				arrayNumber[indexNumber] = new UpperLeft(stepNumberTwo);
				//switch文から抜ける
				break;
			//垂直直線の場合
			case 3:
				//段数の入力を促す
				System.out.print("段数：");
				//段数をキーボードから読み込む
				int stepNumberThree = inputOneNumber();
				//arrayNumber[indexNumber]にインスタンス化する
				arrayNumber[indexNumber] = new UpperRight(stepNumberThree);
				//switch文から抜ける
				break;
			//長方形の場合
			case 4:
				//段数の入力を促す
				System.out.print("段数：");
				//段数をキーボードから読み込む
				int stepNumberFour = inputOneNumber();
				//arrayNumber[indexNumber]にインスタンス化する
				arrayNumber[indexNumber] = new LowerRight(stepNumberFour);
				//switch文から抜ける
				break;
			
		}
		//Shape型の配列ArrayNumberを返却する
		return arrayNumber;
	}
	/*
	 * 関数名：main
	 * 概要：直角二等辺三角形を表すクラス群をテストするメインのメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	public static void main(String[] args) {
		//図形の種類数を表す変数FIGURE_KIND_NUMBERを生成し、4で初期化する
		final int FIGURE_KIND_NUMBER = 4;
		
		//図形の個数の入力を促す
		System.out.print("図形は何個：");
		//図形の個数をキーボードから読み込む
		int figureNumber = inputOneNumber();
		//要素数がfigureNumberの値のShape型の配列を生成する
		Shape[] shapeArray = new Shape[figureNumber];
		
		//図形の種類を選択するための変数selectFigureを生成し、0で初期化する
		int selectFigure = 0;
		
		/*
		 * 「図形の個数分繰り返すためのfor文」
		 */
		for (int i = 0; i < figureNumber; i++) {
			//while (selectFigure < 1 || selectFigure > FIGURE_KIND_NUMBER)の文まで実行する
			do {
				//i+1番の直角二等辺三角形の種類の入力を促す
				System.out.println(i + 1 + "番の直角二等辺三角形の種類");
				//選べる図形の種類を表示する
				System.out.print("(1…左下直角/2…左上直角/3…右上直角/4…右下直角)：");
				//図形の種類をキーボードから読み込む
				selectFigure = standardInput.nextInt();
				
			//selectFigureの値が1~FIGURE_KIND_NUMBERでないあいだdoからwhileまで繰り返す
			} while (selectFigure < 1 || selectFigure > FIGURE_KIND_NUMBER);
			
			//各図形の性質を入力するメソッドを呼び出す
			shapeArray = inputFigure(selectFigure, i, shapeArray);
		}
		/*
		 * 「図形の表示を行う」
		 */
		for (int i = 0; i < figureNumber; i++) {
			//Shape型の配列の図形を表示する
			shapeArray[i].printFigure();
			//改行する
			System.out.println();
		}
		
	}

}