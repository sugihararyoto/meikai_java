//パッケージ名の宣言
package ensyu12_1;
//importする
import static java.util.Calendar.*;

//importする
import java.util.GregorianCalendar;

/*
 * クラス名:Day
 * 概要  :日付クラス
 * 変数名、引数名、メソッド名はテキストの基準のものがあります。
 * 作成者:R.Sugihara
 * 作成日:2023.05.09
 */
public class Day {
	//月ごとの日数を表す配列
	public static final int[] monthArray = {29, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	//カレンダーを読み込む
	public GregorianCalendar todayNumber = new GregorianCalendar();
	//年
	private int year = todayNumber.get(YEAR);
	//月
	private int month = todayNumber.get(MONTH) + 1;
	//日
	private int date = todayNumber.get(DATE);
	
	/*
	 * 関数名：isLeap
	 * 概要：閏年を判定
	 * 引数：y
	 * 戻り値：true false
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.12
	 */
	public static boolean isLeap(int y) {
		//y年が閏年ならtrue,閏年でないならfalseを返却する
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}
	
	/*
	 * 引数を受け取らないコンストラクタ
	 */
	public Day() {
		
	}
	/*
	 * 年を引数として受け取るコンストラクタ
	 */
	public Day(int year) {
		//yearに0以下が指定された場合
		if (year <= 0) {
			//yearに1を代入する
			year = 1;
		}
		//フィールドのyearに仮引数の値を代入する
		this.year = year;
	}
	/*
	 * 年、月を引数として受け取るコンストラクタ
	 */
	public Day(int year, int month) {
		
		
		//コンストラクタDay(int year)を呼び出す
		this(year);
		//yearに0以下が指定された場合
		if (year <= 0) {
			//yearに1を代入する
			year = 1;
		}
		//monthに12より大きい値が指定された場合
		if (month > 12) {
			//monthに12を代入する
			month = 12;
		//monthに0以下の値が指定された場合
		} else if (month <= 0) {
			//monthに1を代入する
			month = 1;
		}
		
		//フィールドのmonthに仮引数の値を代入する
		this.month = month;
	}
	/*
	 * 年、月、日を引数として受け取るコンストラクタ
	 */
	public Day(int year, int month, int date) { 
		//コンストラクタDay(int year, int month)を呼び出す
		this(year, month);
		
		//閏年かどうかを表す変数leapNumberを生成し、返却された判定を受け取る
		boolean leapNumber = isLeap(year);
		
		//yearに0以下が指定された場合
		if (year <= 0) {
			//yearに1を代入する
			year = 1;
		}
		//monthに12より大きい値が指定された場合
		if (month > 12) {
			//monthに12を代入する
			month = 12;
		//monthに0以下の値が指定された場合
		} else if (month <= 0) {
			//monthに1を代入する
			month = 1;
		}
		//monthの値(何月か)によって分岐する
		switch (month) {
			//1,3,5,7,8,10,12月の場合
			case 1, 3, 5, 7, 8, 10, 12:
				//31日より大きい場合
				if (date > 31) {
					//31日にする
					date = 31;
				//1日より小さい場合
				} else if (date < 1) {
					//1日にする
					date = 1;
				}
				//switch文から抜ける
				break;
			//4,6,9,11月の場合
			case 4, 6, 9, 11:
				//30日より大きい場合
				if (date > 30) {
					//30日にする
					date = 30;
				//1日より小さい場合
				} else if (date < 1) {
					//1日にする
					date = 1;
				}
				//switch文から抜ける
				break;
			//2月の場合
			case 2:
				//閏年の場合
				if (leapNumber == true) {
					//29日より大きい場合
					if (date > 29) {
						//29日にする
						date = 29;
					//1日より小さい場合
					} else if (date < 1) {
						//1日にする
						date = 1;
					}
				//閏年でない場合
				} else {
					//28日より大きい場合
					if (date > 28) {
						//28日にする
						date = 28;
					//1日より小さい場合
					} else if (date < 1) {
						//1日にする
						date = 1;
					}
				}
				//switch文から抜ける
				break;
		}
		
		//フィールドのdateに仮引数の値を代入する
		this.date = date;
	}
	/*
	 * 日付dを引数として受け取るコンストラクタ
	 */
	public Day(Day d) {
		//日付dのコンストラクタDay(int year, int month, int date)を呼び出す
		this(d.year, d.month, d.date);
	}
	
	/*
	 * 関数名：getYear
	 * 概要：年を取得
	 * 引数：なし
	 * 戻り値：year
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.09
	 */
	public int getYear() {
		//年を返却する
		return year;
	}
	/*
	 * 関数名：getMonth
	 * 概要：月を取得
	 * 引数：なし
	 * 戻り値：month
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.09
	 */
	public int getMonth() {
		//月を返却する
		return month;
	}
	/*
	 * 関数名：getDate
	 * 概要：日を取得
	 * 引数：なし
	 * 戻り値：date
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.09
	 */
	public int getDate() {
		//日を返却する
		return date;
	}

	/*
	 * 関数名：setYear
	 * 概要：年を設定
	 * 引数：year
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.09
	 */
	public void setYear(int year){
		//年を設定する
		this.year = year;
	}
	/*
	 * 関数名：setMonth
	 * 概要：月を設定
	 * 引数：month
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.09
	 */
	public void setMonth(int month) {
		//月を設定する
		this.month = month;
	}
	/*
	 * 関数名：setDate
	 * 概要：日を設定
	 * 引数：date
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.09
	 */
	public void setDate(int date) {
		//日を設定する
		this.date = date;
	}

	/*
	 * 関数名：set
	 * 概要：年月日を設定する
	 * 引数：year, month, date
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.09
	 */
	public void set(int year, int month, int date) {
		//年を設定する
		this.year  = year;
		//月を設定する
		this.month = month;
		//日を設定する
		this.date  = date;
	}
	
	/*
	 * 関数名：isLeap
	 * 概要：閏年かどうかの判定を取得
	 * 引数：なし
	 * 戻り値：isLeap(year)
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.12
	 */
	public boolean isLeap() {
		//閏年かどうかの判定を返却する
		return isLeap(year);
	}
	
	/*
	 * 関数名：passDay
	 * 概要：年内の経過日数を調べる
	 * 引数：Day d
	 * 戻り値：passNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.12
	 */
	public static int passDay(Day d) {
		// 経過日数を表す変数passNumberを生成し、0で初期化する
		int passNumber = 0;
		//閏年かどうかを表す変数leapNumberを生成し、返却された判定を受け取る
		boolean leapNumber = isLeap(d.year);
		//閏年の場合
		if (leapNumber == true) {
			//Day.dの値(何月か)によって分岐する
			switch(d.month) {
				//1月の場合
				case 1:
					//Day.dの月の中の経過日数を足す
					passNumber += d.date;
					//switch文から抜ける
					break;
				//2月の場合
				case 2:
					//1月の日数とDay.dの月の中の経過日数を足す
					passNumber += monthArray[1] + d.date;
					//switch文から抜ける
					break;
				//3月以降の場合
				default:
					//1月の日数と2月の日数を足す
					passNumber += monthArray[1] + monthArray[0];
					/*
					 * 「3月以降の経過日数を計算する」
					 * 3月からDay.dの月までの経過日数を足す
					 */
					for (int i = 3; i < d.month ;i++) {
						//変数passNumberにmonthArray[i]の値を足す
						passNumber += monthArray[i];
					}
					//Day.dの月の中の経過日数を足す
					passNumber += d.date;
					//switch文から抜ける
					break;
			}
		//閏年でない場合
		} else {
			/*
			 * 「1月からの経過日数を計算する」
			 * 1月からDay.dの月までの経過日数を足す
			 */
			for (int i = 1; i < d.month ;i++) {
				//変数passNumberにmonthArray[i]の値を足す
				passNumber += monthArray[i];
			}
			//Day.dの月の中の経過日数を足す
			passNumber += d.date;
		}
		//経過日数が代入された変数passNumberを返却する
		return passNumber;
	}
	
	/*
	 * 関数名：remainingDays
	 * 概要：年内の残り日数を調べる
	 * 引数：Day d
	 * 戻り値：remainingNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.12
	 */
	public static int remainingDays(Day d) {
		//1年の日数を表す変数YEAR_NUMBERを生成し、365で初期化する
		final int YEAR_NUMBER = 365;
		//閏年の場合の1年の日数を表す変数LEAP_YEAR_NUMBERを生成し、366で初期化する
		final int LEAP_YEAR_NUMBER = 366;
		//残り日数を表す変数remainingNumberを生成し、0で初期化する
		int remainingNumber = 0;
		//閏年かどうかを表す変数leapNumberを生成し、返却された判定を受け取る
		boolean leapNumber = isLeap(d.year);
		
		//閏年の場合
		if (leapNumber == true) {
			//変数remainingNumberに年内の残り日数を代入する
			remainingNumber = LEAP_YEAR_NUMBER - passDay(d);
		//閏年ではない場合
		} else {
			//変数remainingNumberに年内の残り日数を代入する
			remainingNumber = YEAR_NUMBER - passDay(d);
		}
		//残り日数が代入された変数remainingNumberを返却する
		return remainingNumber;
	}
	
	/*
	 * 関数名：compareDay
	 * 概要：二つの日付の前後関係を判定するクラスメソッド
	 * 引数：Day dayOne, Day dayTwo
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.15
	 */
	public static void compareDay(Day dayOne, Day dayTwo) {
		//dayOneの年がdayTwoの年より後の場合
		if(dayOne.year > dayTwo.year) {
			//dayOneがdayTwoより後の日付であることを伝える
			System.out.println(dayOne + "は" + dayTwo + "より後の日付です。");
		//dayOneの年がdayTwoの年より前の場合
		} else if(dayOne.year < dayTwo.year) {
			//dayOneがdayTwoより前の日付であることを伝える
			System.out.println(dayOne + "は" + dayTwo + "より前の日付です。");
		//dayOneの年とdayTwoの年が同じ場合
		} else {
			//dayOneの月がdayTwoの月より後の場合
			if(dayOne.month > dayTwo.month) {
				//dayOneがdayTwoより後の日付であることを伝える
				System.out.println(dayOne + "は" + dayTwo + "より後の日付です。");
			//dayOneの月がdayTwoの月より前の場合
			} else if (dayOne.month < dayTwo.month) {
				//dayOneがdayTwoより前の日付であることを伝える
				System.out.println(dayOne + "は" + dayTwo + "より前の日付です。");
			//dayOneの月とdayTwoの月が同じ場合
			} else {
				//dayOneの日がdayTwoの日より後の場合
				if (dayOne.date > dayTwo.date) {
					//dayOneがdayTwoより後の日付であることを伝える
					System.out.println(dayOne + "は" + dayTwo + "より後の日付です。");
				//dayOneの日がdayTwoの日より前の場合
				} else if (dayOne.date < dayTwo.date) {
					//dayOneがdayTwoより前の日付であることを伝える
					System.out.println(dayOne + "は" + dayTwo + "より前の日付です。");
				//dayOneの日付とdayTwoの日付が同じ場合
				} else {
					//dayOneの日付とdayTwoの日付が同じであることを伝える
					System.out.println(dayOne + "と" + dayTwo + "は同じ日付です。");
				}
			}
		}
	}
	/*
	 * 関数名：compareDay
	 * 概要：他の日付との前後関係を判定するインスタンスメソッド
	 * 引数：Day dayOne
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.15
	 */
	public void compareDay(Day dayOne) {
		//getYear()で取得した年がdayOneの年より後の場合
		if(getYear() > dayOne.year) {
			//インスタンスの日付がdayOneより後の日付であることを伝える
			System.out.println(toString() + "は" + dayOne + "より後の日付です。");
		//getYear()で取得した年がdayOneの年より前の場合
		} else if (getYear() < dayOne.year) {
			//インスタンスの日付がdayOneより前の日付であることを伝える
			System.out.println(toString() + "は" + dayOne + "より前の日付です。");
		//getYear()で取得した年とdayOneの年が同じ場合
		} else {
			//getMonth()で取得した月がdayOneの月より後の場合
			if(getMonth() > dayOne.month) {
				//インスタンスの日付がdayOneより後の日付であることを伝える
				System.out.println(toString() + "は" + dayOne + "より後の日付です。");
			//getMonth()で取得した月がdayOneの月より前の場合
			} else if (getMonth() < dayOne.month) {
				//インスタンスの日付がdayOneより前の日付であることを伝える
				System.out.println(toString() + "は" + dayOne + "より前の日付です。");
			//getMonth()で取得した月とdayOneの月が同じ場合
			} else {
				//getMonth()で取得した日がdayOneの日より後の場合
				if(getDate() > dayOne.date) {
					//インスタンスの日付がdayOneより後の日付であることを伝える
					System.out.println(toString() + "は" + dayOne + "より後の日付です。");
				//getMonth()で取得した日がdayOneの日より前の場合
				} else if (getDate() < dayOne.date) {
					//インスタンスの日付がdayOneより前の日付であることを伝える
					System.out.println(toString() + "は" + dayOne + "より前の日付です。");
				//インスタンスの日付とdayOneの日付が同じ場合
				} else {
					//インスタンスの日付とdayOneの日付が同じであることを伝える
					System.out.println(toString() + "と" + dayOne + "は同じ日付です。");
				}
			}
		}
	}
	
	/*
	 * 関数名：dayForward
	 * 概要：日付を1つ後ろに進めるメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.15
	 */
	public void dayForward() {
		//閏年かどうかを表す変数leapNumberを生成し、返却された判定を受け取る
		boolean leapNumber = isLeap(year);
		//日付が31日の場合
		if (date == 31) {
			//月が12月の場合
			if (month == 12) {
				//1月にする
				month = 1;
				//1日にする
				date = 1;
				//次の年にする
				year++;
			//月が12月以外の場合
			} else {
				//1日にする
				date = 1;
				//次の月にする
				month++;
			}
		//日付が30日の場合
		} else if (date == 30) {
			//monthの値(何月か)によって分岐する
			switch (month) {
				//4,6,9,11月の場合
				case 4, 6, 9, 11:
					//1日にする
					date = 1;
					//次の月にする
					month++;
					//switch文から抜ける
					break;
				//それ以外の月の場合
				default:
					//次の日にする
					date++;
					//switch文から抜ける
					break;
			}
		//日付が29日の場合
		} else if (date == 29) {
			//月が2月の場合
			if (month == 2) {
				//1日にする
				date = 1;
				//次の月にする
				month++;
			//月が2月以外の場合
			} else {
				//次の日にする
				date++;
			}
		//日付が28日の場合
		} else if (date == 28) {
			//月が2月の場合
			if (month == 2) {
				//閏年である場合
				if (leapNumber == true) {
					//次の日にする
					date++;
				//閏年でない場合
				} else {
					//1日にする
					date = 1;
					//次の月にする
					month++;
				}
			//月が2月以外の場合
			} else {
				//次の日にする
				date++;
			}
		//それ以外の日付の場合
		} else {
			//次の日にする
			date++;
		}
	}
	
	/*
	 * 関数名：dayForward
	 * 概要：次の日の日付を返却するメソッド
	 * 引数：Day dayOne
	 * 戻り値：dayOne
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.15
	 */
	public static Day dayForward(Day dayOne) {
		//日付を1日進めるメソッドdayForwardでdayOneを次の日の日付にする
		dayOne.dayForward();
		//次の日の日付を返却する
		return dayOne;
	}
	
	/*
	 * 関数名：dayForward
	 * 概要：日付をn日後ろに進めるメソッド
	 * 引数：int n
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.15
	 */
	public void dayForward(int n) {
		//閏年かどうかを表す変数leapNumberを生成し、返却された判定を受け取る
		boolean leapNumber = isLeap(year);
		
		/*
		 * 「n回繰り返すためのfor文」
		 */
		for (int i = 0; i < n; i++) {
			//日付が31日の場合
			if (date == 31) {
				//月が12月の場合
				if (month == 12) {
					//1月にする
					month = 1;
					//1日にする
					date = 1;
					//次の年にする
					year++;
				//月が12月以外の場合
				} else {
					//1日にする
					date = 1;
					//次の月にする
					month++;
				}
			//日付が30日の場合
			} else if (date == 30) {
				//monthの値（何月か）によって分岐する
				switch (month) {
					//4,6,9,11月の場合
					case 4, 6, 9, 11:
						//1日にする
						date = 1;
						//次の月にする
						month++;
						//switch文から抜ける
						break;
					//それ以外の月の場合
					default:
						//次の日にする
						date++;
						//switch文から抜ける
						break;
			}
			//日付が29日の場合
			} else if (date == 29) {
				//月が2月の場合
				if (month == 2) {
					//1日にする
					date = 1;
					//次の月にする
					month++;
				//月が2月以外の場合
				} else {
					//次の日にする
					date++;
				}
			//日付が28日の場合
			} else if (date == 28) {
				//月が2月の場合
				if (month == 2) {
					//閏年である場合
					if (leapNumber == true) {
						//次の日にする
						date++;
					//閏年でない場合
					} else {
						//1日にする
						date = 1;
						//次の月にする
						month++;
					}
				//月が2月以外の場合
				} else {
					//次の日にする
					date++;
				}
			//それ以外の日付の場合
			} else {
				//次の日にする
				date++;
			}
		}
		
	}
	
	/*
	 * 関数名：dayForward
	 * 概要：n日後の日付を返却するメソッド
	 * 引数：Day dayOne, int n
	 * 戻り値：dayOne
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.15
	 */
	public static Day dayForward(Day dayOne, int n) {
		//日付をn日進めるメソッドdayForwardでdayOneをn日後の日付にする
		dayOne.dayForward(n);
		//n日後の日付を返却する
		return dayOne;
	}
	
	/*
	 * 関数名：dayBack
	 * 概要：日付を1つ前に戻すメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.15
	 */
	public void dayBack() {
		//閏年かどうかを表す変数leapNumberを生成し、返却された判定を受け取る
		boolean leapNumber = isLeap(year);
		
		//1年1月1日の場合
		if (year == 1 && month == 1 && date == 1) {
			
		//それ以外の日付の場合
		} else {
			//日が1日の場合
			if (date == 1) {
				//monthの値(何月か)によって分岐する
				switch (month) {
					//2,4,6,8,9,11月の場合
					case 2, 4, 6, 8, 9, 11:
						//31日にする
						date = 31;
						//前の月に戻る
						month--;
						//switch文から抜ける
						break;
					//5,7,10,12月の場合
					case 5, 7, 10, 12:
						//30日にする
						date = 30;
						//前の月に戻る
						month--;
						//switch文から抜ける
						break;
					//3月の場合
					case 3:
						//閏年の場合
						if (leapNumber == true) {
							//29日にする
							date = 29;
							//前の月に戻る
							month--;
						//閏年でない場合
						} else {
							//28日にする
							date = 28;
							//前の月に戻る
							month--;
						}
						//switch文から抜ける
						break;
					//1月の場合
					case 1:
						//31日にする
						date = 31;
						//12月に戻る
						month = 12;
						//前の年に戻る
						year--;
						//switch文から抜ける
						break;
				}
				
			//それ以外の日付の場合
			} else {
				//1日戻す
				date--;
			}
		}
		
		
	}
	/*
	 * 関数名：dayBack
	 * 概要：前の日の日付を返却するメソッド
	 * 引数：Day dayOne
	 * 戻り値：dayOne
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.15
	 */
	public static Day dayBack(Day dayOne) {
		//日付を1日戻すメソッドdayBackでdayOneを前の日の日付にする
		dayOne.dayBack();
		//前の日の日付を返却する
		return dayOne;
	}
	
	/*
	 * 関数名：dayBack
	 * 概要：日付をn日前に戻すメソッド
	 * 引数：int n
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.15
	 */
	public void dayBack(int n) {
		//閏年かどうかを表す変数leapNumberを生成し、返却された判定を受け取る
		boolean leapNumber = isLeap(year);
		
		/*
		 * 「n回繰り返すためのfor文」
		 */
		for (int i = 0; i < n; i++) {
			//1年1月1日の場合
			if (year == 1 && month == 1 && date == 1) {
				
			//それ以外の日付の場合
			} else {
				//日が1日の場合
				if (date == 1) {
					//monthの値(何月か)によって分岐する
					switch (month) {
						//2,4,6,8,9,11月の場合
						case 2, 4, 6, 8, 9, 11:
							//31日にする
							date = 31;
							//前の月に戻る
							month--;
							//switch文から抜ける
							break;
						//5,7,10,12月の場合
						case 5, 7, 10, 12:
							//30日にする
							date = 30;
							//前の月に戻る
							month--;
							//switch文から抜ける
							break;
						//3月の場合
						case 3:
							//閏年の場合
							if (leapNumber == true) {
								//29日にする
								date = 29;
								//前の月に戻る
								month--;
							//閏年でない場合
							} else {
								//28日にする
								date = 28;
								//前の月に戻る
								month--;
							}
							//switch文から抜ける
							break;
						//1月の場合
						case 1:
							//31日にする
							date = 31;
							//12月に戻る
							month = 12;
							//前の年に戻る
							year--;
							//switch文から抜ける
							break;
					}
					
				//それ以外の日付の場合
				} else {
					//1日戻す
					date--;
				}
			}
		}
	}
	/*
	 * 関数名：dayBack
	 * 概要：n日前の日付を返却するメソッド
	 * 引数：Day dayOne, int n
	 * 戻り値：dayOne
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.15
	 */
	public static Day dayBack(Day dayOne, int n) {
		//日付をn日戻すメソッドdayBackでdayOneをn日前の日付にする
		dayOne.dayBack(n);
		//n日前の日付を返却する
		return dayOne;
	}
	
	/*
	 * 関数名：dayOfWeek
	 * 概要：曜日を求める
	 * 引数：なし
	 * 戻り値：0~6
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.09
	 */
	public int dayOfWeek() {
		//変数yを生成し、yearの値で初期化する
		int y = year;
		//変数mを生成し、monthの値で初期化する
		int m = month;
		//mの値が1か2の場合
		if (m == 1 || m == 2) {
			//yの値をデクリメント
			y--;
			//mに12を足す
			m += 12;
		}
		//ツェラーの公式によって曜日を求めて返却する
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}
	
	/*
	 * 関数名：equalTo
	 * 概要：日付dと等しいか
	 * 引数：なし
	 * 戻り値：true false
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.09
	 */
	public boolean equalTo(Day d) {
		//日付dと等しければtrue、等しくなければfalseを返す
		return year == d.year && month == d.month && date == d.date;
	}
	
	/*
	 * 関数名：toString
	 * 概要：文字列表現を返却
	 * 引数：なし
	 * 戻り値：日付と曜日の文字列
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.09
	 */
	public String toString() {
		//曜日を表す文字列の配列を生成する
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		//文字列表現を返す
		return String.format("%04d年%02d月%02d日(%s)", 
				year, month, date, wd[dayOfWeek()]);
	}
}