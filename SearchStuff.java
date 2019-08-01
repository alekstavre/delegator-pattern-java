
public class SearchStuff {

	private OneStuff oneStuff;

	private TwoStuff twoStuff;

	public SearchStuff() {
		// TODO Auto-generated constructor stub
	}

	DoStuff geStuffType(StuffType stuffType) {
		if (stuffType.equals(StuffType.ONE)) {
			return oneStuff;
		} else {
			return twoStuff;
		}
	}

	public void setOneStuff(OneStuff oneStuff) {
		this.oneStuff = oneStuff;
	}

	public void setTwoStuff(TwoStuff twoStuff) {
		this.twoStuff = twoStuff;
	}
}
