//パッケージ名の宣言
package ensyu7_20;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_20
 * 概要  :演習7-20クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.27
 */
public class Ensyu7_20 {
	/*
	 * 関数名：aryIns
	 * 概要：配列aの要素a[idx]にxを挿入する
	 * テキストによって、void aryIns(int [] a, int idx, int x)は指定
	 * 引数：int [] a, idx, n
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.27
	 */
	static void aryIns(int [] a, int idx, int x) {
		//一番最後の要素が入力されていた場合
		if (idx == a.length - 1) {
			//一番最後の要素にxの値を代入する
			a[idx] = x;
		//一番最後の要素以外の要素が入力されていた場合
		} else {
			/*
			 *「配列aの要素a[idx]にxを挿入する、
			 * 挿入に伴ってa[idx]～a[a.length - 2]を1つ後方へずらす」
			 */
			for (int i = a.length - 1; i > idx; i--) {
				//a[i]にa[i - 1]の値を代入する
				a[i] = a[i - 1];
			}
			//a[idx]にxの値を代入する
			a[idx] = x;
		}
	}
	/*
	 * 関数名：main
	 * 概要：要素a[idx]にxを挿入した配列aを表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.27
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		
		//変数inputNumberを生成し、0で初期化する
		int inputNumber = 0;
		/*
		 * 「要素数の入力を行う」
		 * while (inputNumber <= 0)の文までを実行する
		 */
		do {
			//画面に要素数の入力を促す
			System.out.print("要素数：");
			//変数inputNumberに、キーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
			//0以下の値が入力された場合
			if (inputNumber <= 0) {
				//画面に1以上の値を入力してください。と表示する
				System.out.println("1以上の値を入力してください。");
			}
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0);
		
		//int型で要素数が変数inputNumberの値の配列を生成する
		int [] arrayNumber = new int [inputNumber];
		/*
		 * 「全要素の値を入力する」
		 * 変数iを生成し、0で初期化する、iの値をインクリメントし、
		 * iの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int i = 0; i < inputNumber; i++) {
			//配列の要素の値の入力を促す
			System.out.print("a[" + i + "]：");
			//arrayNumber[i]にキーボードから入力した値を代入する
			arrayNumber[i] = standardInput.nextInt();
		}
		
		//変数insertElementを生成し、0で初期化する
		int insertElement = 0;
		/*
		 * 「挿入する要素の入力を行う」
		 * while(insertElement < 0 || insertElement >= arrayNumber.length)
		 * までの文を実行する
		 */
		do {
			//画面に挿入する要素の入力を促す
			System.out.print("挿入する要素 a[?] = ");
			//変数insertElementを生成し、キーボードから入力した値で初期化する
			insertElement = standardInput.nextInt();
			//挿入する要素が存在しない場合
			if (insertElement < 0 || insertElement >= arrayNumber.length) {
				//画面に存在する要素を入力してください。と表示する
				System.out.println("存在する要素を入力してください。");
			}
		//入力した値が存在しない要素のあいだdoからwhileまでを繰り返す
		} while (insertElement < 0 || insertElement >= arrayNumber.length);
		
		//挿入する値を入力するための変数insertNumberを生成し、0で初期化する
		int insertNumber = 0;
		
		//画面に挿入する値の入力を促す
		System.out.print("挿入する値：");
		//変数insertNumberにキーボードから入力した値を代入する
		insertNumber = standardInput.nextInt();
		
		//メソッドaryInsを呼び出す
		aryIns(arrayNumber, insertElement, insertNumber);
		
		//画面にa = {と表示する
		System.out.print("a = {");
		/*
		 * 「配列arrayNumberの要素の値を表示する」
		 * 変数iを生成し、0で初期化する
		 * 変数iの値をインクリメントしながら
		 * 変数iの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int i = 0; i < inputNumber;i++) {
			//画面にarrayNumber[i]の値を表示する
			System.out.print(arrayNumber[i]);
			//変数iの値が変数inputNumberの値から1を引いた値より小さい場合
			if (i < inputNumber - 1) {
				//画面に,を表示する
				System.out.print(", ");
			}
		}
		//画面に}と表示する
		System.out.print("}");
	}

}