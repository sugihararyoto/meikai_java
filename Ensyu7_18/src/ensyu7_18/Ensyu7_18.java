//パッケージ名の宣言
package ensyu7_18;
//importする
import java.util.Scanner;
/*
 * クラス名:Ensyu7_18
 * 概要  :演習7-18クラス
 * 作成者:R.Sugihara
 * 作成日:2023.04.27
 */
public class Ensyu7_18 {
	/*
	 * 関数名：aryRmv
	 * 概要：配列aから要素a[idx]を削除する
	 * テキストによって、void aryRmv(int [] a, int idx)は指定
	 * 引数：int [] a, idx
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.04.27
	 */
	static void aryRmv(int [] a, int idx) {
		/*
		 * 「a[idx]より後ろの全要素を1つ前方にずらす」
		 * 変数iを生成し、idxを代入する、iの値をインクリメントし、
		 * a.lengthからインデックスと合わせるために1を引いた値
		 * になるまで繰り返す
		 */
		for (int i = idx; i < a.length - 1; i++) {
			//a[i]にa[i + 1]の値を代入する
			a[i] = a[i + 1];
		}
	}
	/*
	 * 関数名：main
	 * 概要：要素a[idx]を削除した配列aを表示する
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
			//1以下の値が入力された場合
			if (inputNumber <= 1) {
				//画面に2以上の値を入力してください。と表示する
				System.out.println("2以上の値を入力してください。");
			}
		//変数inputNumberの値が1以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 1);
		
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
		
		//変数deleteElementを生成し、0で初期化する
		int deleteElement = 0;
		/*
		 * 「削除する要素の入力を行う」
		 * while(deleteElement == arrayNumber.length - 1 || deleteElement < 0 ||
		 * deleteElement >= arrayNumber.length)までの文を実行する
		 */
		do {
			//画面に削除する要素の入力を促す
			System.out.print("削除する要素 a[?] = ");
			//変数deleteElementを生成し、キーボードから入力した値で初期化する
			deleteElement = standardInput.nextInt();
			//削除する要素を最後の要素にした場合
			if (deleteElement == arrayNumber.length - 1) {
				//画面に一番最後の要素は削除できません。と表示する
				System.out.println("一番最後の要素は削除できません。");
			//削除する要素が存在しない場合
			} else if (deleteElement < 0 || deleteElement >= arrayNumber.length) {
				//画面に存在する要素を入力してください。と表示する
				System.out.println("存在する要素を入力してください。");
			}
		/*
		 * 入力した値が一番最後の要素か、存在しない要素のあいだ
		 * doからwhileまでを繰り返す
		 */
		} while(deleteElement == arrayNumber.length - 1 || deleteElement < 0 ||
				deleteElement >= arrayNumber.length);
		
		//メソッドaryRmvを呼び出す
		aryRmv(arrayNumber, deleteElement);
		
		//画面にa = {と表示する
		System.out.print("a = {");
		
		/*
		 * 変数iを生成し、0で初期化する
		 * 変数iの値をインクリメントしながら
		 * 変数iの値が変数inputNumberの値になるまで繰り返す
		 */
		for (int i = 0; i < inputNumber;i++) {
			//画面にarrayNumber[incrementNumber]の値を表示する
			System.out.print(arrayNumber[i]);
			/*
			 * 変数incrementNumberの値が
			 * 変数inputNumberの値から1を引いた値より小さい場合
			 */
			if (i < inputNumber - 1) {
				//画面に,を表示する
				System.out.print(", ");
			}
		}
		
		//画面に}と表示する
		System.out.print("}");
	}

}
