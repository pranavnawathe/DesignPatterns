package absfactory;

public class Client {
	/*
	 * There should not be any exeception or compilations issues once all
	 * blanks are filled.
	 */
	public static void main(String[] args) {
		AbstractFactory phoneNumberFactory = PostPhoneFactory.getFactory(______); //>1
		phoneNumberFactory._______(Country.UK, "+44 7836 191 191"); //>2

		AbstractFactory postCodeFactory = PostPhoneFactory.getFactory(_____); //>3
		postCodeFactory.________(Country.UK, "SW15 5PU"); //>4
		postCodeFactory.________(Country.US, "27606"); //>5
	}
}
