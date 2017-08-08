package Exercise;

public class Buyer {
	Mediator mediator;
	String currency;

	public Buyer(Mediator mediator, String currency) {
		super();
		this.mediator = mediator;
		this.currency = currency;
		mediator.____________(__________); // <<1 <<2 
	}

	public boolean attemptToPurchase(float bid) {
		System.out.println("Buyer attempting a bid of " + currency +" " bid + " .");
		return mediator.__________(__________, currency); // <<3 <<4
	}
	
}