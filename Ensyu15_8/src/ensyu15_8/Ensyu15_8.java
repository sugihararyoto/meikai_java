//パッケージ名の宣言
package ensyu15_8;
/*
 * クラス名:Ensyu15_8
 * 概要  :演習15-8クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.23
 */
public class Ensyu15_8 {
	/*
	 * 関数名：displayCalendar
	 * 概要：指定された月のカレンダーを表示するためのメソッド
	 * 引数：Day dayOne
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.23
	 */
	static void displayCalendar(Day dayOne) {
		//曜日を表す文字列の配列を生成する
		String[] weekArray = {"日", "月", "火", "水", "木", "金", "土"};
		//何年のカレンダーであるかを表示する
		System.out.print(dayOne.getYear() + "年 ");
		//何月のカレンダーであるか表示する
		System.out.println(dayOne.getMonth() + "月");
		/*
		 * 「各曜日を表示するためのfor文」
		 */
		for (int i = 0; i < weekArray.length; i++) {
			//曜日を表示する
			System.out.printf("%2s", weekArray[i]);
		}
		//改行する
		System.out.println();
		/*
		 * 「最初の週の日を表示するためのfor文」
		 */
		for (int i = 0; i < weekArray.length; i++) {
			//その月の1日の曜日まで来ていない場合
			if (dayOne.dayOfWeek() > i) {
				//半角スペースで画面を揃える
				System.out.printf("%3s", " ");
			//その月の1日か、1日以降の場合
			} else {
				//日を表示する
				System.out.printf("%3s", dayOne.getDate());
				//1日進める
				dayOne.dayForward();
			}
		}
		//改行する
		System.out.println();
		//変数monthNumberを生成し、dayoneの月で初期化する
		int monthNumber = dayOne.getMonth();
		//月が変わるまで繰り返す
		while (monthNumber == dayOne.getMonth()) {
			/*
			 * 「1週間分の日を表示するためのfor文」
			 */
			for (int i = 0; i < weekArray.length; i++) {
				//月が変わった場合
				if (monthNumber != dayOne.getMonth()) {
					//for文から抜ける
					break;
				//月が変わっていない場合
				} else {
					//日を表示する
					System.out.printf("%3s", dayOne.getDate());
					//1日進める
					dayOne.dayForward();
				}
			}
			//改行する
			System.out.println();
		}
	}
	/*
	 * 関数名：main
	 * 概要：コマンドライン引数で指定された月のカレンダーを表示する
	 * 引数：String[] args
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.23
	 */
	public static void main(String[] args) {
		//argsの要素数の長さを求める
		int argsNumber = args.length;
		//Day型のクラス型変数dayOneを生成し、インスタンス化する
		Day dayOne = new Day();
		
		//年と月が設定されている場合
		if (argsNumber == 2) {
			//Day型のクラス型変数dayOneをインスタンス化する
			dayOne = new Day(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
			//月のカレンダーを表示するメソッドdisplayCalendarを呼び出す
			displayCalendar(dayOne);
		//年のみ設定されている場合
		} else if (argsNumber == 1) {
			//月の数を表す変数MONTH_NUMBERを生成し、12で初期化する
			final int MONTH_NUMBER = 12;
			//Day型のクラス型変数dayOneをインスタンス化する
			dayOne = new Day(Integer.parseInt(args[0]), 1);
			//MONTH_NUMBERの月になるまで繰り返す
			while (dayOne.getMonth() < MONTH_NUMBER) {
				//月のカレンダーを表示するメソッドdisplayCalendarを呼び出す
				displayCalendar(dayOne);
				//改行する
				System.out.println();
			}
			//月のカレンダーを表示するメソッドdisplayCalendarを呼び出す
			displayCalendar(dayOne);
		//年も月も設定されていない場合
		} else if (argsNumber == 0) {
			//Day型のクラス型変数dayOneをインスタンス化する
			dayOne = new Day();
			//月のカレンダーを表示するメソッドdisplayCalendarを呼び出す
			displayCalendar(dayOne);
		//カレンダーを表示できないコマンドライン引数になっている場合
		} else {
			//カレンダーを表示できないことを伝える
			System.out.println("カレンダーを表示できません。");
		}
		
	}

}
