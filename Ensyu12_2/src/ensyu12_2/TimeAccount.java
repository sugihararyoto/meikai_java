//パッケージ名の宣言
package ensyu12_2;
/*
 * クラス名:TimeAccount
 * 概要  :定期預金付き銀行口座クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.18
 */
public class TimeAccount extends Account{
	//定期預金の預金段高
	private long timeBalance;
	
	/*
	 * コンストラクタ
	 * 概要：初期化を行うためのコンストラクタ
	 * 引数：String accountName, String accountNumber, long accountBalance
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.17
	 */
	public TimeAccount(String accountName, String accountNumber, long accountBalance, long timeBalance) {
		//クラスAccountのコンストラクタを呼び出す
		super(accountName, accountNumber, accountBalance);
		//フィールドの値に仮引数の値を代入する
		this.timeBalance = timeBalance;
	}
	/*
	 * 関数名：getTimeBalance
	 * 概要：定期預金を調べる
	 * 引数：なし
	 * 戻り値：timeBalance
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.17
	 */
	public long getTimeBalance() {
		//定期預金を返却する
		return timeBalance;
	}
	
	/*
	 * 関数名：getTotalBalance
	 * 概要：預金の合計額を調べる
	 * 引数：なし
	 * 戻り値：totalNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.17
	 */
	public long getTotalBalance() {
		//変数totalNumberに普通預金と定期預金の合計額を代入する
		long totalNumber = timeBalance + getBalance();
		//預金の合計額を返却する
		return totalNumber;
	}
	
	
	/*
	 * 関数名：cancelBalance
	 * 概要：定期預金を解約して、全額を普通預金に移す
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.17
	 */
	public void cancelBalance() {
		//残高を普通預金に移す
		depositBalance(timeBalance);
		//定期預金を0にする
		timeBalance = 0;
	}
	
	/*
	 * 関数名：compBalance
	 * 概要：普通預金と定期預金の合計額を比較する
	 * 引数：Account a, Account b
	 * 戻り値：returnNumber(-1,0,1)
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.17
	 */
	public static int compBalance(Account a, Account b) {
		//変数returnNumberを生成し、0で初期化する
		int returnNumber = 0;
		//一つ目の口座の預金が二つ目の口座より多い場合
		if (a.getTotalBalance() > b.getTotalBalance()) {
			//変数returnNumberに1を代入する
			returnNumber = 1;
		//一つ目の口座の預金が二つ目の口座より少ない場合
		} else if (a.getTotalBalance() < b.getTotalBalance()) {
			//変数returnNumberに-1を代入する
			returnNumber = -1;
		//一つ目の口座の預金と二つ目の口座の預金が同じ場合
		} else {
			//変数returnNumberに0を代入する
			returnNumber = 0;
		}
		//変数returnNumberを返却する
		return returnNumber;
	}
}
