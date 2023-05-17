//パッケージ名の宣言
package id;
//importする
import static java.util.Calendar.*;

//importする
import java.util.GregorianCalendar;
/*
 * クラス名:DateId
 * 概要  :識別番号クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.16
 */
public class DateId {
	//何番までの識別番号を与えたかカウントする
	private static int counterNumber;
	//識別番号
	private int idNumber;
	
	//静的初期化子
	static {
		//カレンダーを読み込む
		GregorianCalendar todayNumber = new GregorianCalendar();
		//年
		int yearNumber = todayNumber.get(YEAR);
		//月
		int monthNumber = todayNumber.get(MONTH) + 1;
		//日
		int dateNumber = todayNumber.get(DATE);
		
		//今日の日付を表示する
		System.out.printf("今日は%4d年%02d月%2d日です。\n", yearNumber, monthNumber, dateNumber);
		//識別番号に値を代入する
		counterNumber = yearNumber * 1000000 + monthNumber * 10000 + dateNumber * 100;
	}
	
	/*
	 * コンストラクタ
	 * 概要：識別番号をカウントする
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.16
	 */
	public DateId() {
		//識別番号をカウントする
		idNumber = ++counterNumber;
	}
	
	/*
	 * 関数名：getId
	 * 概要：識別番号を取得する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.16
	 */
	public int getId() {
		//識別番号を返却する
		return idNumber;
	}
	
	
}
