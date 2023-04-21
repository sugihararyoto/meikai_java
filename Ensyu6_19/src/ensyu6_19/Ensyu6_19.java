//パッケージ名の宣言
package ensyu6_19;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu6_19
 * 概要  :演習6-19クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.21
 */
public class Ensyu6_19 {
	/*
	 * 関数名：main
	 * 概要：クラス数・各クラスの人数・全員の点数を読み込んで、
	 * 点数の合計点と平均点を求める
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.21
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//クラスの数を表す変数classNumberを生成し、0で初期化する
		int classNumber = 0;
		//学生の数を表す変数studentNumberを生成し、0で初期化する
		int studentNumber = 0;
		//合計を表す変数sumNumberを生成し、0で初期化する
		int sumNumber = 0;
		//全合計を表す変数totalNumberを生成し、0で初期化する
		int totalNumber = 0;
		//クラスの総数を表す変数classTotalを生成し、0で初期化する
		int classTotal = 0;
		//平均を表す変数averageNumberを生成し、0で初期化する
		double averageNumber = 0;
		
		//while (classNumber <= 0 || 9 < classNumber)の文までを実行する
		do {
			//画面にクラスの数の入力を促す
			System.out.print("クラス数：");
			//変数classNumberに、キーボードから入力した値を代入する
			classNumber = standardInput.nextInt();
			//0以下か9より大きい値が入力された場合
			if (classNumber <= 0 || 9 < classNumber) {
				//画面に1～9までの値を入力してください。と表示する
				System.out.println("1～9までの値を入力してください。");
			}
			
		//変数classNumberの値が0以下か9より大きいあいだdoからwhileまでを繰り返す
		} while (classNumber <= 0 || 9 < classNumber);
		
		//行数が変数classNumberの値の配列を生成する
		int [][] arrayNumber = new int[classNumber][];
		
		/*
		 * 「クラスごとの人数を入力させる」
		 * 変数iを生成し、0で初期化する
		 * 変数iをインクリメントしながら
		 * 変数iの値がclassNumberになるまで繰り返す
		 */
		for (int i = 0; i < classNumber; i++) {
			
			//while (studentNumber <= 0)の文までを実行する
			do {
				//画面に人数の入力を促す
				System.out.print((i + 1) + "組の人数：");
				//変数studentNumberに、キーボードから入力した値を代入する
				studentNumber = standardInput.nextInt();
				
				//正ではない値が入力された場合
				if (studentNumber <= 0) {
					//画面に正ではない値が入力されました。と表示する
					System.out.println("正ではない値が入力されました。");
				//正の整数が入力された場合
				} else {
					//列数を変数studentNumberの値にする
					arrayNumber[i] = new int [studentNumber];
					//変数classTotalに変数studentNumberの値を足す
					classTotal += studentNumber;
				}
				
			//変数studentNumberの値が0以下のあいだdoからwhileまでを繰り返す
			} while (studentNumber <= 0);
			
			
			/*
			 * 「点数を入力させる」
			 * 変数jを生成し、0で初期化する
			 * 変数jをインクリメントしながら
			 * 変数jの値がarrayNumber[i].lengthになるまで繰り返す
			 */
			for (int j = 0; j < arrayNumber[i].length; j++) {
				/*
				 * while (arrayNumber[i][j] < 0 || 100 < arrayNumber[i][j])
				 * の文までを実行する
				 */
				do {
					//配列の各要素の値（点数）の入力を促す
					System.out.print((i + 1) +"組の" + (j + 1) +"番の点数：");
					//arrayNumber[i][j]にキーボードから入力した値を代入する
					arrayNumber[i][j] = standardInput.nextInt();
					//0未満か100より大きい値が入力された場合
					if (arrayNumber[i][j] < 0 || 100 < arrayNumber[i][j]) {
						//画面に0～100までの値を入力してください。と表示する
						System.out.println("0～100までの値を入力してください。");
					} 
					
				/*
				 * arrayNumber[i][j]の値が
				 * 0未満か100より大きいあいだdoからwhileまでを繰り返す
				 */
				} while (arrayNumber[i][j] < 0 || 100 < arrayNumber[i][j]);
				
			}
			
		}
		//画面に組、合計、平均と表示する
		System.out.println("\t組\t|\t合計\t平均");
		//画面を整える
		System.out.println("--------+--------------------");
		
		/*
		 * 「合計値と平均値を表示する」
		 * 変数iを生成し、0で初期化する
		 * 変数iをインクリメントしながら
		 * 変数iの値がclassNumberになるまで繰り返す
		 */
		for (int i = 0; i < classNumber; i++) {
			//画面に組を表示する
			System.out.print("\t" + (i + 1) +"組\t|");
			/*
			 * 「クラスの合計値を計算する」
			 * 変数jを生成し、0で初期化する
			 * 変数jをインクリメントしながら
			 * 変数jの値がarrayNumber[i].lengthになるまで繰り返す
			 */
			for (int j = 0; j < arrayNumber[i].length; j++) {
				//変数sumNumberにarrayNumber[i][j]の値を足す
				sumNumber += arrayNumber[i][j];
			}
			
			//変数averageNumberにクラスの平均値を代入する
			averageNumber = (double)sumNumber / arrayNumber[i].length;
			//画面にクラスの合計値と平均値を表示する
			System.out.printf("\t%-8d%3.1f",sumNumber,averageNumber);
			//クラスの点数の合計を全体の合計に足す
			totalNumber += sumNumber;
			//合計値をリセットする
			sumNumber = 0;
			//改行する
			System.out.println();
		}
		
		//画面を整える
		System.out.println("--------+--------------------");
		//画面に計と表示する
		System.out.print("\t計\t|");
		//変数averageNumberに全体の平均値を代入する
		averageNumber = (double)totalNumber / classTotal;
		//画面に全体の点数の合計値と平均値を表示する
		//-8dで左揃えで合計が8桁まで位置が揃う
		System.out.printf("\t%-8d%3.1f",totalNumber ,  averageNumber);
	}

}
