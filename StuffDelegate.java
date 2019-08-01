
public class StuffDelegate {
	
	private SearchStuff searchStuff;
	private DoStuff doStuff;
	private StuffType stuffType;

	public StuffDelegate() {
		// TODO Auto-generated constructor stub
	}

	void setStuffType(StuffType stuffType) {
		this.stuffType=stuffType;
	}
	
	public void setSearchStuff(SearchStuff searchStuff) {
		this.searchStuff=searchStuff;
	}

	void doWork() {
		doStuff = searchStuff.geStuffType(stuffType);
		doStuff.doStuff();
	}
}
