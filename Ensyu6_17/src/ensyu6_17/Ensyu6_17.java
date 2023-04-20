//パッケージ名の宣言
package ensyu6_17;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu6_17
 * 概要  :演習6-17クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.20
 */
public class Ensyu6_17 {
	/*
	 * 関数名：main
	 * 概要：6人の2科目（国語・数学）の点数を読み込んで
	 * 科目ごとの平均点と学生ごとの平均点を求める
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.20
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//科目の数を表す変数SUBJECT_NUMBERを生成し、2で初期化する
		final int SUBJECT_NUMBER = 2;
		//学生の数を表す変数STUDENT_NUMBERを生成し、6で初期化する
		final int STUDENT_NUMBER = 6;
		
		//6行2列の行列を生成する
		int [][] pointNumber = new int [STUDENT_NUMBER][SUBJECT_NUMBER];
		
		//国語の平均を表す変数averageJapaneseを生成し、0で初期化する
		int averageJapanese = 0;
		//数学の平均を表す変数averageMathematicsを生成し、0で初期化する
		int averageMathematics = 0;
		
		//画面に国語の点数の入力を促す
		System.out.println("国語の点数を入力してください。");
		
		/*
		 * 変数iを生成し、0で初期化する
		 * 変数iをインクリメントしながら
		 * 変数iの値がpointNumber.lengthになるまで繰り返す
		 */
		for (int i = 0; i < pointNumber.length; i++) {
			/*
			 * while (pointNumber[i][0] < 0 || 100 < pointNumber[i][0])
			 * の文までを実行する
			 */
			do {
				//画面に点数の入力を促す
				System.out.print((i + 1) + "番の点数：");
				//pointNumber[i][0]にキーボードから入力した値を代入する
				pointNumber[i][0] = standardInput.nextInt();
				//0未満か100より大きい値が入力された場合
				if (pointNumber[i][0] < 0 || 100 < pointNumber[i][0]) {
					//画面に0～100までの値を入力してください。と表示する
					System.out.println("0～100までの値を入力してください。");
				} 
				
			/*
			 * pointNumber[i][0]の値が
			 * 0未満か100より大きいあいだdoからwhileまでを繰り返す
			 */
			} while (pointNumber[i][0] < 0 || 100 < pointNumber[i][0]);
			
		}
		
		//画面に数学の点数の入力を促す
		System.out.println("数学の点数を入力してください。");
		
		/*
		 * 変数iを生成し、0で初期化する
		 * 変数iをインクリメントしながら
		 * 変数iの値がpointNumber.lengthになるまで繰り返す
		 */
		for (int i = 0; i < pointNumber.length; i++) {
			/*
			 * while (pointNumber[i][1] < 0 || 100 < pointNumber[i][1])
			 * の文までを実行する
			 */
			do {
				//画面に点数の入力を促す
				System.out.print((i + 1) + "番の点数：");
				//pointNumber[i][1]にキーボードから入力した値を代入する
				pointNumber[i][1] = standardInput.nextInt();
				//0未満か100より大きい値が入力された場合
				if (pointNumber[i][1] < 0 || 100 < pointNumber[i][1]) {
					//画面に0～100までの値を入力してください。と表示する
					System.out.println("0～100までの値を入力してください。");
				} 
				
			/*
			 * pointNumber[i][1]の値が
			 * 0未満か100より大きいあいだdoからwhileまでを繰り返す
			 */
			} while (pointNumber[i][1] < 0 || 100 < pointNumber[i][1]);
			
		}
		/*
		 * 変数iを生成し、0で初期化する
		 * 変数iをインクリメントしながら
		 * 変数iの値がpointNumber.lengthになるまで繰り返す
		 */
		for (int i = 0; i < pointNumber.length; i++) {
			//変数averageJapaneseにpointNumber[i][0]の値を足す
			averageJapanese += pointNumber[i][0];
			//変数averageMathematicsにpointNumber[i][1]の値を足す
			averageMathematics += pointNumber[i][1];
		}
		
		//画面に国語の平均点を表示する
		System.out.println("国語の平均点は"+ (double)averageJapanese / STUDENT_NUMBER + "です。");
		
		//画面に数学の平均点を表示する
		System.out.println("数学の平均点は"+ (double)averageMathematics / STUDENT_NUMBER + "です。");
		
		/*
		 * 変数iを生成し、0で初期化する
		 * 変数iをインクリメントしながら
		 * 変数iの値がpointNumber.lengthになるまで繰り返す
		 */
		for (int i = 0; i < pointNumber.length; i++) {
			//画面に学生ごとの平均点を表示する
			System.out.println((i + 1) + "番の平均点は" + 
					(double)(pointNumber[i][0] + pointNumber[i][1]) / SUBJECT_NUMBER + "点です。");
		}
		
		
		
	}

}
