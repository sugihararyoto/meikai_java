//パッケージ名の宣言
package ensyu10_5;
/*
 * クラス名:Account
 * 概要  :銀行口座クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.15
 */
public class Account {
	//口座名義
	private String name;
	//口座番号
	private String no;
	//預金残高
	private long balance;
	//口座開設日
	private Day openingDay;
	
	
	{
		//画面に明解銀行での口座開設ありがとうございます。と表示する
		System.out.println("明解銀行での口座開設ありがとうございます。");
	}
	
	/*
	 * 講座名義、番号、預金残高、開設日を引数として受け取るコンストラクタ
	 */
	Account(String n, String num, long z, Day openingDay) {
		//フィールドのnameに仮引数の値を代入する
		name = n;
		//フィールドのnoに仮引数の値を代入する
		no = num;
		//フィールドのbalanceに仮引数の値を代入する
		balance = z;
		//balanceの値が0より小さい場合
		if (balance < 0) {
			//balanceに0を代入する
			balance = 0;
		}
		//フィールドのopeningDayに仮引数の値を代入する
		this.openingDay = new Day(openingDay);
	}
	
	/*
	 * 関数名：getName
	 * 概要：口座名義を調べる
	 * 引数：なし
	 * 戻り値：name
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.10
	 */
	String getName() {
		//口座名義を返却する
		return name;
	}
	/*
	 * 関数名：getNo
	 * 概要：口座番号を調べる
	 * 引数：なし
	 * 戻り値：no
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.10
	 */
	String getNo() {
		//口座番号を返却する
		return no;
	}
	/*
	 * 関数名：getBalance
	 * 概要：預金残高を調べる
	 * 引数：なし
	 * 戻り値：balance
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.10
	 */
	long getBalance() {
		//預金残高を返却する
		return balance;
	}
	
	/*
	 * 関数名：getOpeningDay
	 * 概要：開設日を調べる
	 * 引数：なし
	 * 戻り値：new Day(openingDay)
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.10
	 */
	Day getOpeningDay() {
		//開設日を返却する
		return new Day(openingDay);
	}
	/*
	 * 関数名：deposit
	 * 概要：k円預ける
	 * 引数：long k
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.10
	 */
	void deposit(long k) {
		//k円預ける
		balance += k;
	}
	/*
	 * 関数名：withdraw
	 * 概要：k円おろす
	 * 引数：long k
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.10
	 */
	void withdraw(long k) {
		//k円おろす
		balance -= k;
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
		String[] accountString = {"口座名義：", "口座番号：", "預金残高：", "開設日："};
		//文字列表現を返す
		return String.format(accountString[0] + "%s\n" + accountString[1] + "%s\n" + accountString[2] + "%s\n" + accountString[3] + "(%s)", 
				name, no, balance, new Day(openingDay));
	}
}