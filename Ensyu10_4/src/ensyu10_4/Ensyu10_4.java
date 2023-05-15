//パッケージ名の宣言
package ensyu10_4;
//importする
import java.util.Scanner;

/*
 * クラス名:Ensyu10_4
 * 概要  :演習10-4クラス
 * 作成者:R.Sugihara
 * 作成日:2023.05.15
 */
public class Ensyu10_4 {
	//キーボードからの入力を読み込む
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：oneNumber
	 * 概要：int型で1以上の数を入力させるためのメソッド
	 * 引数：なし
	 * 戻り値：inputNumber
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.08
	 */
	static int oneNumber() {
		//変数inputNumberを生成し、0で初期化する
		int inputNumber = 0;
		/*
		 * 「数の入力を行う」
		 * while (inputNumber <= 0)の文までを実行する
		 */
		do {
			//変数inputNumberに、キーボードから入力した値を代入する
			inputNumber = standardInput.nextInt();
			//0以下の値が入力された場合
			if (inputNumber <= 0) {
				//画面に1以上の値を入力してください。と表示する
				System.out.println("1以上の値を入力してください。");
				//再入力を促す
				System.out.print("再入力：");
			}
		//変数inputNumberの値が0以下のあいだdoからwhileまでを繰り返す
		} while (inputNumber <= 0);
		//inputNumberを返す
		return inputNumber;
	}
	/*
	 * 関数名：main
	 * 概要：改良した日付クラスを試すためのメインメソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：R.Sugihara
	 * 作成日：2023.05.12
	 */
	public static void main(String[] args) {
		//Day型のクラス型変数dayoneを生成し、インスタンス化する
		Day dayone = new Day();
		//Day型のクラス型変数daytwoを生成し、インスタンス化する
		Day daytwo = new Day(2000, 44, 33);
		//Day型のクラス型変数daythreeを生成し、インスタンス化する
		Day daythree = new Day(2000, 1, 0);
		
		//クラス型変数dayoneの内容を画面に表示する
		System.out.println("day1：" + dayone);
		//クラス型変数daytwoの内容を画面に表示する
		System.out.println("day2：" + daytwo);
		//クラス型変数daythreeの内容を画面に表示する
		System.out.println("day3：" + daythree);
		
		//day2とday3の前後関係を判定する
		Day.compareDay(daytwo, daythree);
		//day2とday3の前後関係を判定する
		daytwo.compareDay(daythree);
		
		//day2の年内の経過日数を表示する
		System.out.println("day2の年内の経過日数：" + Day.passDay(daytwo));
		//day3の年内の経過日数を表示する
		System.out.println("day3の年内の経過日数：" + Day.passDay(daythree));
		//day2の年内の残り日数を表示する
		System.out.println("day2の年内の残り日数：" + Day.remainingDays(daytwo));
		//day3の年内の残り日数を表示する
		System.out.println("day3の年内の残り日数：" + Day.remainingDays(daythree));
		
		//改行する
		System.out.println();
		//day2を1日進める
		daytwo.dayForward();
		//day2の次の日の日付を表示する
		System.out.println("day2の次の日：" + daytwo);
		//day2にday2の次の日の日付が返却された日付を代入する
		daytwo = Day.dayForward(daytwo);
		//day2の次の日の日付を表示する
		System.out.println("返却されたDay2の次の日：" +daytwo);
		
		//day2を何日進めるか入力を促す
		System.out.print("day2を何日進めますか：");
		//変数forwardNumberを生成し、何日進めるかをキーボードから読み込む
		int forwardNumber = oneNumber();
		//day2をn日進める
		daytwo.dayForward(forwardNumber);
		//day2をn日進めた日付を表示する
		System.out.println("day2をn日進めた日：" + daytwo);
		//day2にday2のn日後の日付が返却された日付を代入する
		daytwo = Day.dayForward(daytwo, forwardNumber);
		//day2をn日進めた日付を表示する
		System.out.println("返却されたday2のn日後の日：" + daytwo);
		
		//改行する
		System.out.println();
		//day3を1日戻す
		daythree.dayBack();
		//day3の前の日の日付を表示する
		System.out.println("day3の前の日：" + daythree);
		//day3にday3の前の日の日付が返却された日付を代入する
		daythree = Day.dayBack(daythree);
		//day3の前の日の日付を表示する
		System.out.println("返却されたDay2の前の日：" +daythree);
		
		//day3を何日戻すか入力を促す
		System.out.print("day3を何日戻しますか：");
		//変数backValueを生成し、何日戻すかをキーボードから読み込む
		int backValue = oneNumber();
		//day3をn日戻す
		daythree.dayBack(backValue);
		//day3をn日戻した日付を表示する
		System.out.println("day3をn日戻した日：" + daythree);
		//day3にday3のn日前の日付が返却された日付を代入する
		daythree = Day.dayBack(daythree, backValue);
		//day3をn日戻した日付を表示する
		System.out.println("返却されたday3のn日前の日：" + daythree);
	}

}
