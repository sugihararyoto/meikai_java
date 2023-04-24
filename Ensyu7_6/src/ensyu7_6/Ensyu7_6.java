//パッケージ名の宣言
package ensyu7_6;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_6
 * 概要  :演習7-6クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.24
 */
public class Ensyu7_6 {
	/*
	 * 関数名：printSeason
	 * 概要：テキストによって、void printSeason(int m)は指定
	 * 引数mで指定された月の季節を表示する、1~12以外の値では何も表示しない
	 * 引数：m
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.24
	 */
	static void printSeason(int m) {
		//入力された数値から分岐する
		switch (m) {
		//画面に春と表示する
		case 3,4,5 : System.out.println("春");
		//switch文から抜ける
		break;
		//画面に夏と表示する
		case 6,7,8 : System.out.println("夏");
		//switch文から抜ける
		break;
		//画面に秋と表示する
		case 9,10,11 : System.out.println("秋");
		//switch文から抜ける
		break;
		//画面に冬と表示する
		case 12,1,2 : System.out.println("冬"); 
		//switch文から抜ける
		break;
		//画面に何も表示しない
		default:
		//switch文から抜ける
		break;
		
		}
	}
	/*
	 * 関数名：main
	 * 概要：テスト用のメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.24
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//画面に整数の入力を促す
		System.out.print("整数を入力せよ：");
		//変数inputNumberを生成し、キーボードから入力した値で初期化する
		int inputNumber = standardInput.nextInt();
		//メソッドprintSeasonを呼び出す
		printSeason(inputNumber);
	}

}
