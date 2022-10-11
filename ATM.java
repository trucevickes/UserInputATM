package atm;

import java.io.IOException;

public class ATM extends ATMOptions{
	public static void main(String[] args) throws IOException {
		ATMOptions optionMenu = new ATMOptions();
		
		optionMenu.getLogin();
	}

}
