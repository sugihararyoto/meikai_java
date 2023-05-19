//パッケージ名の宣言
package ensyu13_4;

/**
 * クラスHumanClassは人間を表すクラスです。
 * @author R.Sugihara
 *
 */
public class HumanClass {
	/**
	 * 人間の名前を表すString型のフィールドです。
	 */
	private String humanName;
	/**
	 * 人間の身長を表すdouble型のフィールドです。
	 */
	private double humanHeight;
	/**
	 * 人間の体重を表すdouble型のフィールドです。
	 */
	private double humanWeight;
	/**
	 * 人間の誕生日を表すDay型のフィールドです。
	 */
	private Day humanBirthday;
	/**
	 * 人間クラスのコンストラクタです。
	 * 名前、身長、体重、誕生日を引数として受け取ります。
	 * @param humanName 名前
	 * @param humanHeight 身長
	 * @param humanWeight 体重
	 * @param humanBirthday 誕生日
	 */
	public HumanClass(String humanName, double humanHeight, double humanWeight, Day humanBirthday) {
		//フィールドに仮引数の値を代入する
		this.humanName = humanName;
		//フィールドに仮引数の値を代入する
		this.humanHeight = humanHeight;
		//フィールドに仮引数の値を代入する
		this.humanWeight = humanWeight;
		//フィールドのhumanBirthdayに仮引数の値を代入する
		this.humanBirthday = new Day(humanBirthday);
	}
	
	/**
	 * 身長を取得します。
	 * @return 身長の高さ
	 */
	public double getHumanHeight() {
		//身長を返却する
		return humanHeight; 
	}
	
	/**
	 * 体重を取得します。
	 * @return 体重の重さ
	 */
	public double getHumanWeight() {
		//体重を返却する
		return humanWeight;
	}
	/**
	 * 誕生日を取得します。
	 * @return 誕生日の日付
	 */
	public Day getHumanBirthday() {
		//誕生日を返却する
		return new Day(humanBirthday);
	}
	
	/**
	 * 身長を増減します。
	 * @param changeNumber 増減させる値
	 */
	public void changeHeight(double changeNumber) {
		//humanHeightにchangeNumberの値を足す
		humanHeight += changeNumber;
	}
	/**
	 * 体重を増減させる
	 * @param changeNumber 増減させる値
	 */
	public void changeWeight(double changeNumber) {
		//humanWeightにchangeNumberの値を足す
		humanWeight += changeNumber;
	}
	/**
	 * 名前、身長、体重を表示します。
	 */
	public void outputClass() {
		//画面に名前を表示する
		System.out.println("名前：" + humanName);
		//画面に身長を表示する
		System.out.printf("身長：%3.1f cm\n", humanHeight);
		//画面に体重を表示する
		System.out.printf("体重：%3.1f kg\n", humanWeight);
	}
	
	/**
	 * 名前、身長、体重、誕生日などの文字列表現と
	 * 各フィールドの値を表示します。
	 */
	public String toString() {
		//文字列の配列を生成する
		String[] humanString = {"名前：", "身長：", "体重：", "誕生日："};
		//文字列表現を返す
		return String.format(humanString[0] + "%s\n" + humanString[1] + "%3.1fcm\n" + humanString[2] + "%3.1fkg\n" + humanString[3] + "(%s)", 
				humanName, humanHeight, humanWeight, new Day(humanBirthday));
	}
}