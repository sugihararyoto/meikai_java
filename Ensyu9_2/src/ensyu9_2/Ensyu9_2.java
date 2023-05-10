//パッケージ名の宣言
package ensyu9_2;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu9_2
 * 概要  :演習9-2クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.09
 */
public class Ensyu9_2 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：inputMonth
	 * 概要：月を入力するためのメソッド
	 * 引数：なし
	 * 戻り値：returnNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.09
	 */
	static int inputMonth() {
		//変数returnNumberを生成し、0で初期化する
		int returnNumber = 0;
		//月の数を表す変数MONTH_NUMBERを生成し、12で初期化する
		final int MONTH_NUMBER = 12;
		//while (returnNumber < 1 || returnNumber > MONTH_NUMBER)まで実行する
		do {
			//月の入力を促す
			System.out.print("月：");
			//変数returnNumberに入力された値を代入する
			returnNumber = standardInput.nextInt();
			//変数returnNumberの値が1~12でない場合
			if (returnNumber < 1 || returnNumber > 12) {
				//画面に1~12の値を入力するように伝える
				System.out.println("1~12の値を入力してください。");
			}
		//変数returnNumberの値が1~12でないあいだdoからwhileを繰り返す
		} while (returnNumber < 1 || returnNumber > MONTH_NUMBER);
		//月が入力された変数returnNumberを返却する
		return returnNumber;
	}
	/*
	 * 関数名：inputDay
	 * 概要：日を入力するためのメソッド
	 * 引数：int yearNumber, int monthNumber
	 * 戻り値：returnNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.09
	 */
	static int inputDay(int yearNumber, int monthNumber) {
		//変数returnNumberを生成し、0で初期化する
		int returnNumber = 0;
		//うるう年であるかどうかの判断をするための変数leapYearを生成し、falseで初期化する
		boolean leapYear = false;
		
		//月の日数を判断するための変数MONTH_THIRTY_ONEを生成し、31で初期化する
		final int MONTH_THIRTY_ONE = 31;
		//月の日数を判断するための変数MONTH_THIRTYを生成し、30で初期化する
		final int MONTH_THIRTY = 30;
		//月の日数を判断するための変数MONTH_TWENTY_NINEを生成し、29で初期化する
		final int MONTH_TWENTY_NINE = 29;
		//月の日数を判断するための変数MONTH_TWENTY_EIGHTを生成し、28で初期化する
		final int MONTH_TWENTY_EIGHT = 28;
		
		//うるう年を判定するための変数LEAP_YEAR_FOURを生成し、4で初期化する
		final int LEAP_YEAR_FOUR = 4;
		//うるう年を判定するための変数NOT_LEAP_YEAR_NUMBERを生成し、100で初期化する
		final int NOT_LEAP_YEAR_NUMBER = 100;
		//うるう年を判定するための変数LEAP_YEAR_FOUR_HUNDREDを生成し、400で初期化する
		final int LEAP_YEAR_FOUR_HUNDRED = 400;
		
		//年がLEAP_YEAR_FOURの値で割り切れる場合
		if (yearNumber % LEAP_YEAR_FOUR == 0) {
			//変数leapYearにtrueを代入する
			leapYear = true;
		}
		//年がLEAP_YEAR_FOURの値でもNOT_LEAP_YEAR_NUMBERの値でも割り切れる場合
		if (yearNumber % LEAP_YEAR_FOUR == 0 && yearNumber % NOT_LEAP_YEAR_NUMBER == 0) {
			//変数leapYearにfalseを代入する
			leapYear = false;
		}
		/*
		 * 年がLEAP_YEAR_FOURの値でもNOT_LEAP_YEAR_NUMBERの値でも
		 * LEAP_YEAR_FOUR_HUNDREDの値でも割り切れる場合
		 */
		if (yearNumber % LEAP_YEAR_FOUR == 0 && yearNumber % NOT_LEAP_YEAR_NUMBER == 0 &&
				yearNumber % LEAP_YEAR_FOUR_HUNDRED == 0) {
			//変数leapYearにtrueを代入する
			leapYear = true;
		}
		//変数monthNumberの値によって分岐する
		switch (monthNumber) {
			//変数monthNumberの値が1,3,5,7,8,10,12の場合
			case 1, 3, 5, 7 ,8, 10, 12:
				//while(returnNumber < 1 || returnNumber > MONTH_THIRTY_ONE)までを実行する
				do {
					//日の入力を促す
					System.out.print("日：");
					//変数returnNumberにキーボードから入力された値を代入する
					returnNumber = standardInput.nextInt();
					//変数returnNumberの値が1~MONTH_THIRTY_ONEの値でない場合
					if (returnNumber < 1 || returnNumber > MONTH_THIRTY_ONE) {
						//画面で1~MONTH_THIRTY_ONEの値を入力するように伝える
						System.out.println("1~" + MONTH_THIRTY_ONE + "の値を入力してください。");
					}
				//変数returnNumberの値が1~MONTH_THIRTY_ONEの値でないあいだ繰り返す
				} while (returnNumber < 1 || returnNumber > MONTH_THIRTY_ONE);
				//switch文から抜ける
				break;
			//変数monthNumberの値が4,6,9,11の場合
			case 4, 6, 9, 11:
				//while(returnNumber < 1 || returnNumber > MONTH_THIRTY)までを実行する
				do {
					//日の入力を促す
					System.out.print("日：");
					//変数returnNumberにキーボードから入力された値を代入する
					returnNumber = standardInput.nextInt();
					//変数returnNumberの値が1~MONTH_THIRTYの値でない場合
					if (returnNumber < 1 || returnNumber > MONTH_THIRTY) {
						//画面で1~MONTH_THIRTYの値を入力するように伝える
						System.out.println("1~" + MONTH_THIRTY + "の値を入力してください。");
					}
				//変数returnNumberの値が1~MONTH_THIRTYの値でないあいだ繰り返す
				} while (returnNumber < 1 || returnNumber > MONTH_THIRTY);
				//switch文から抜ける
				break;
			//変数monthNumberの値が2の場合
			case 2:
				//うるう年である場合
				if (leapYear == true) {
					//while(returnNumber < 1 || returnNumber > MONTH_TWENTY_NINE)までを実行する
					do {
						//日の入力を促す
						System.out.print("日：");
						//変数returnNumberにキーボードから入力された値を代入する
						returnNumber = standardInput.nextInt();
						//変数returnNumberの値が1~MONTH_TWENTY_NINEの値でない場合
						if (returnNumber < 1 || returnNumber > MONTH_TWENTY_NINE) {
							//画面で1~MONTH_TWENTY_NINEの値を入力するように伝える
							System.out.println("1~" + MONTH_TWENTY_NINE + "の値を入力してください。");
						}
					//変数returnNumberの値が1~MONTH_TWENTY_NINEの値でないあいだ繰り返す
					} while (returnNumber < 1 || returnNumber > MONTH_TWENTY_NINE);
					//switch文から抜ける
					break;
				//うるう年でない場合
				} else {
					//while(returnNumber < 1 || returnNumber > MONTH_TWENTY_EIGHT)までを実行する
					do {
						//日の入力を促す
						System.out.print("日：");
						//変数returnNumberにキーボードから入力された値を代入する
						returnNumber = standardInput.nextInt();
						//変数returnNumberの値が1~MONTH_TWENTY_EIGHTの値でない場合
						if (returnNumber < 1 || returnNumber > MONTH_TWENTY_EIGHT) {
							//画面で1~MONTH_TWENTY_EIGHTの値を入力するように伝える
							System.out.println("1~" + MONTH_TWENTY_EIGHT + "の値を入力してください。");
						}
					//変数returnNumberの値が1~MONTH_TWENTY_EIGHTの値でないあいだ繰り返す
					} while (returnNumber < 1 || returnNumber > MONTH_TWENTY_EIGHT);
					//switch文から抜ける
					break;
				}
		}
		//日が入力された変数returnNumberを返却する
		return returnNumber;
	}
	/*
	 * 関数名：main
	 * 概要：日付クラス第3版の全てのコンストラクタの働きを確認する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.09
	 */
	public static void main(String[] args) {
		//日付の入力を促す
		System.out.println("day1を入力せよ。");
		//年の入力を促す
		System.out.print("年：");
		//変数inputYearを生成し、入力された年で初期化する
		int inputYear = standardInput.nextInt();
		//月の入力を行うメソッドinputMonthを呼び出す
		int inputMonth = inputMonth();
		//日の入力を行うメソッドinputDayを呼び出す
		int inputDay = inputDay(inputYear, inputMonth);
		//日付クラスから読み込む
		Day dayOne = new Day(inputYear, inputMonth, inputDay);
		//画面にday1の日付を表示する
		System.out.println("day1 = " + dayOne);
		//day2をday1と同じ日付として作ったことを伝える
		System.out.println("day2をday1と同じ日付として作りました。");
		//日付クラスを参照し、
		Day dayTwo = new Day(dayOne);
		//画面にday2の日付を表示する
		System.out.println("day2 = " + dayTwo);
		//Day型のクラス型変数firstDayを生成し、インスタンス化する
		Day firstDay = new Day();
		//Day型のクラス型変数secondDayを生成し、インスタンス化する
		Day secondDay = new Day(2010);
		//Day型のクラス型変数thirdDayを生成し、インスタンス化する
		Day thirdDay = new Day(2010, 10);
		//Day型のクラス型変数fourthDayを生成し、インスタンス化する
		Day fourthDay = new Day(2010, 10, 15);
		
		//画面にfirstDayの内容を表示する
		System.out.println("d1 = " + firstDay);
		//画面にsecondDayの内容を表示する
		System.out.println("d2 = " + secondDay);
		//画面にthirdDayの内容を表示する
		System.out.println("d3 = " + thirdDay);
		//画面にfourthDayの内容を表示する
		System.out.println("d4 = " + fourthDay);
		
	}

}
