//パッケージ名の宣言
package ensyu9_5;

/*
 * クラス名:Period
 * 概要  :期間クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.10
 */
public class Period {
	//開始日
	private Day from;
	//終了日
	private Day to;
	
	/*
	 * 開始日、終了日を引数として受け取るコンストラクタ
	 */
	Period(Day from, Day to) {
		//フィールドのfromに仮引数の値を代入する
		this.from = from;
		//フィールドのtoに仮引数の値を代入する
		this.to = to;
	}
	
	/*
	 * 関数名：getFrom
	 * 概要：開始日を調べる
	 * 引数：なし
	 * 戻り値：new Day(from)
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.10
	 */
	Day getFrom() {
		//開始日を返却する
		return new Day(from);
	}
	
	/*
	 * 関数名：getTo
	 * 概要：終了日を調べる
	 * 引数：なし
	 * 戻り値：new Day(to)
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.10
	 */
	Day getTo() {
		//終了日を返却する
		return new Day(to);
	}
	
	/*
	 * 関数名：compareDay
	 * 概要：開始日と終了日を比較する
	 * 引数：int oneYear, int oneMonth, int oneDay, int twoYear, int twoMonth, int twoDay
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.10
	 */
	void compareDay(int oneYear, int oneMonth, int oneDay, int twoYear, int twoMonth, int twoDay) {
		//開始年が終了日より後の場合
		if(oneYear > twoYear) {
			//開始日が後になっていることを伝える
			System.out.println("開始日が後になっています。");
		}
		//開始月が終了日より後の場合
		if(oneYear == twoYear && oneMonth > twoMonth) {
			//開始日が後になっていることを伝える
			System.out.println("開始日が後になっています。");
		}
		//開始日が終了日より後の場合
		if(oneYear == twoYear && oneMonth == twoMonth && oneDay > twoDay) {
			//開始日が後になっていることを伝える
			System.out.println("開始日が後になっています。");
		}
		//開始日と終了日が同じ日の場合
		if(oneYear == twoYear && oneMonth == twoMonth && oneDay == twoDay) {
			//開始日と終了日が同じ日になっていることを伝える
			System.out.println("開始日と終了日が同じ日になっています。");
		}
		
	}
	/*
	 * 関数名：toString
	 * 概要：文字列表現を返却
	 * 引数：なし
	 * 戻り値：文字列とフィールドの値
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.09
	 */
	public String toString() {
		//文字列の配列を生成する
		String[] accountString = {"開始日：", "終了日："};
		//文字列表現を返す
		return String.format(accountString[0] + "%s\n"  + accountString[1] + "%s\n", 
				from, to);
	}
}
