//パッケージ名の宣言
package ensyu12_2;
/*
 * クラス名:Account
 * 概要  :銀行口座クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.17
 */
public class Account {
	//口座名義
	private String accountName;
	//口座番号
	private String accountNumber;
	//預金残高
	private long accountBalance;
	
	/*
	 * コンストラクタ
	 * 概要：初期化を行うためのコンストラクタ
	 * 引数：String accountName, String accountNumber, long accountBalance
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.17
	 */
	public Account(String accountName, String accountNumber, long accountBalance) {
		//フィールドの値に仮引数の値を代入する
		this.accountName = accountName;
		//フィールドの値に仮引数の値を代入する
		this.accountNumber = accountNumber;
		//フィールドの値に仮引数の値を代入する
		this.accountBalance = accountBalance;
	}
	/*
	 * 関数名：getName
	 * 概要：口座名義を調べる
	 * 引数：なし
	 * 戻り値：accountName
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.17
	 */
	public String getName() {
		//口座名義を返却する
		return accountName;
	}
	/*
	 * 関数名：getNumber
	 * 概要：口座番号を調べる
	 * 引数：なし
	 * 戻り値：accountNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.17
	 */
	 public String getNumber() {
		//口座番号を返却する
		return accountNumber;
	}
	/*
	 * 関数名：getBalance
	 * 概要：預金残高を調べる
	 * 引数：なし
	 * 戻り値：accountBalance
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.17
	 */
	public long getBalance() {
		//預金残高を返却する
		return accountBalance;
	}
	
	/*
	 * 関数名：getTotalBalance
	 * 概要：預金残高をを調べる
	 * 引数：なし
	 * 戻り値：accountBalance
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.17
	 */
	public long getTotalBalance() {
		//預金残高を返却する
		return accountBalance;
	}
	
	/*
	 * 関数名：depositBalance
	 * 概要：お金を預ける
	 * 引数：long balanceNumber
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.17
	 */
	public void depositBalance(long balanceNumber) {
		//預金残高に預ける
		accountBalance += balanceNumber;
	}
	/*
	 * 関数名：withdrawBalance
	 * 概要：お金を引き出す
	 * 引数：long balanceNumber
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.17
	 */
	public void withdrawBalance(long balanceNumber) {
		//預金残高から引き出す
		accountBalance -= balanceNumber;
	}
	
	
}
