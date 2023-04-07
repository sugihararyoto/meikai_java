//パッケージ名の宣言
package ensyu3_8;
//importする
import java.util.Scanner;
/*
 * クラス名:ensyu3_8
 * 概要  :演習3-8クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.07
 */
public class ensyu3_8 {
	/* 関数名：main
	 * 概要：キーボードから読み込んだ点数に応じて、
	 * 優/良/可/不可を判定して表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//画面に点数の入力を促す
		System.out.print("点数：");
		//変数inputScoreにキーボードから入力した値を代入する
		int inputScore = standardInput.nextInt();
		//入力した値が0~59の場合に実行する
		if (inputScore >= 0 && inputScore <= 59)
			//画面に判定：不可と表示する
			System.out.println("判定：不可");
		//入力した値が60~69の場合に実行する
		else if (inputScore >= 60 && inputScore <=69)
			//画面に判定：可と表示する
			System.out.println("判定：可");
		//入力した値が70~79の場合に実行する
		else if (inputScore >= 70 && inputScore <=79)
			//画面に判定：良と表示する
			System.out.println("判定：良");
		//美優力した値が80~100の場合に実行する
		else if (inputScore >= 80 && inputScore <=100)
			//画面に判定：優と表示する
			System.out.println("判定：優");
		
	}

}
