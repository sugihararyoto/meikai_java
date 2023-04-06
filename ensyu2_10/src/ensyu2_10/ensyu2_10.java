//パッケージ名の宣言
package ensyu2_10;
//キーボードからの入力を行う決まり文句をクラスの前に設置する
import java.util.Scanner;
/*
 * クラス名:ensyu2_10
 * 概要  :演習2-10クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.06
 */
public class ensyu2_10 {
	/* 関数名：main
	 * 概要：キーボードから名前の姓と名を個別に読み込んで挨拶を行う
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args) {
		//キーボードからの読み込みを行う
		Scanner stdIn = new Scanner(System.in);
		//画面に姓：と表示する
		System.out.print("姓：");
		//変数lastNameにキーボードから読み込んだ文字列を代入する
		String lastName = stdIn.next();
		//画面に名：と表示する
		System.out.print("名：");
		//変数firstNameにキーボードから読み込んだ文字列を代入する
		String firstName = stdIn.next();
		//画面に姓と名を表示し、挨拶文も表示する
		System.out.println("こんにちは" + lastName + firstName + "さん。");
	}

}
