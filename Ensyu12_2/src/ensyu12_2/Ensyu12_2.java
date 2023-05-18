//パッケージ名の宣言
package ensyu12_2;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu12_2
 * 概要  :演習12-2クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.17
 */
public class Ensyu12_2 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：oneNumber
	 * 概要：long型で0以上の数を入力させるためのメソッド
	 * 引数：なし
	 * 戻り値：inputNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.18
	 */
	static long oneNumber() {
		//変数inputNumberを生成し、0で初期化する
		long inputNumber = 0;
		/*
		 * 「数の入力を行う」
		 * while (inputNumber < 0)の文までを実行する
		 */
		do {
			//変数inputNumberに、キーボードから入力した値を代入する
			inputNumber = standardInput.nextLong();
			//0より小さい値が入力された場合
			if (inputNumber < 0) {
				//画面に0以上の値を入力してください。と表示する
				System.out.println("0以上の値を入力してください。");
				//再入力を促す
				System.out.print("再入力：");
			}
		//変数inputNumberの値が0より小さいあいだdoからwhileまでを繰り返す
		} while (inputNumber < 0);
		//inputNumberを返す
		return inputNumber;
	}
	/*
	 * 関数名：main
	 * 概要：普通預金と定期預金の合計額を比較した結果を表示するメインのメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.16
	 */
	public static void main(String[] args) {
		//口座の情報を入力するように伝える
		System.out.println("口座の情報を入力してください");
		//口座名義の入力を促す
		System.out.print("口座名義：");
		//変数nameOneを生成し、キーボードから入力した文字列で初期化する
		String nameOne = standardInput.next();
		//口座番号の入力を促す
		System.out.print("口座番号：");
		//変数inputNumberを生成し、キーボードから入力した文字列で初期化する
		String numberOne = standardInput.next();
		//普通預金の入力を促す
		System.out.print("普通預金：");
		//変数balanceOneを生成し、キーボードから入力した値で初期化する
		long balanceOne = oneNumber();
		//定期預金の入力を促す
		System.out.print("定期預金：");
		//変数timeBalanceOneを生成し、キーボードから入力した値で初期化する
		long timeBalanceOne = oneNumber();
		//TimeAccount型のクラス型変数accountOneを生成し、インスタンス化する
		TimeAccount accountOne = new TimeAccount(nameOne, numberOne, balanceOne, timeBalanceOne);
		
		//口座の情報を入力するように伝える
		System.out.println("口座の情報を入力してください");
		//口座名義の入力を促す
		System.out.print("口座名義：");
		//変数nameTwoを生成し、キーボードから入力した文字列で初期化する
		String nameTwo = standardInput.next();
		//口座番号の入力を促す
		System.out.print("口座番号：");
		//変数numberTwoを生成し、キーボードから入力した文字列で初期化する
		String numberTwo = standardInput.next();
		//普通預金の入力を促す
		System.out.print("普通預金：");
		//変数balanceTwoを生成し、キーボードから入力した値で初期化する
		long balanceTwo = oneNumber();
		//Account型のクラス型変数accountTwoを生成し、インスタンス化する
		Account accountTwo = new Account(nameTwo, numberTwo, balanceTwo);
		
		//nameOneの口座の合計額を表示する
		System.out.println(nameOne + "さんの預金残高の合計：" + accountOne.getTotalBalance());
		//nameTwoの口座の合計額を表示する
		System.out.println(nameTwo + "さんの預金残高の合計：" + accountTwo.getTotalBalance());
		
		//普通預金と定期預金の合計額を比較した結果によって分岐
		switch (TimeAccount.compBalance(accountOne, accountTwo)) {
			//結果が0の場合
			case 0:
				//合計額が同じであることを伝える
				System.out.println(nameOne + "さんと" + nameTwo + "さんの預金の合計額は同じです。");
				//switch文から抜ける
				break;
			//結果が1の場合
			case 1:
				//nameOneの口座の合計額の方が多いことを伝える
				System.out.println(nameOne + "さんの預金の合計額の方が多いです。");
				//switch文から抜ける
				break;
			//結果が-1の場合
			case -1:
				//nameTwoの口座の合計額の方が多いことを伝える
				System.out.println(nameTwo + "さんの預金の合計額の方が多いです。");
				//switch文から抜ける
				break;
		}
		
		
	}

}
