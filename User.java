
public class User {

	private StuffDelegate deleg;

	public User(StuffDelegate deleg) {
		this.deleg = deleg;
	}

	void doFinalWork() {
		deleg.doWork();
	}
}
