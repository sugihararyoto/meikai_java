//パッケージ名の宣言
package ensyu9_3;
/*
 * クラス名:Day
 * 概要  :日付クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.09
 */
public class Day {
	//年
	private int year = 1;
	//月
	private int month = 1;
	//日
	private int date = 1;
	
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
		//フィールドのmonthに仮引数の値を代入する
		this.month = month;
	}
	/*
	 * 年、月、日を引数として受け取るコンストラクタ
	 */
	public Day(int year, int month, int date) { 
		//コンストラクタDay(int year, int month)を呼び出す
		this(year, month);
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