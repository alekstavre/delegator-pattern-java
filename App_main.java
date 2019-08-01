
public class App_main {

	public static void main(String[] args) {

		StuffDelegate deleg = new StuffDelegate();
		SearchStuff search = new SearchStuff();

		search.setOneStuff(new OneStuff());
		search.setTwoStuff(new TwoStuff());

		deleg.setSearchStuff(search);
		deleg.setStuffType(StuffType.ONE);

		User user = new User(deleg);
		user.doFinalWork();

		deleg.setStuffType(StuffType.TWO);
		user.doFinalWork();

	}

}
