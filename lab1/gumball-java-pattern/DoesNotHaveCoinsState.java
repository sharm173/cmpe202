

public class DoesNotHaveCoinsState implements State {
    GumballMachine gumballMachine;
    int coinsVal;
    public DoesNotHaveCoinsState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        this.coinsVal = 0;
    }
/*
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	*/

	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		this.coinsVal+=25;
		if(coinsVal>=gumballMachine.coinsRequired) {
			coinsVal = 0;
			gumballMachine.setState(gumballMachine.getHasCoinsState());
		}

	}

	public void insertDime() {
		System.out.println("You inserted a dime");
		coinsVal+=10;
		if(coinsVal>=gumballMachine.coinsRequired) {
			coinsVal = 0;
			gumballMachine.setState(gumballMachine.getHasCoinsState());
		}
	}

	public void insertNickel() {
		System.out.println("You inserted a nickel");
		coinsVal+=5;
		if(coinsVal>=gumballMachine.coinsRequired) {
			coinsVal = 0;
			gumballMachine.setState(gumballMachine.getHasCoinsState());
		}
	}
	/*
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
*/
	public void ejectCoins() {
		System.out.println("You haven't inserted a quarter, dime or nickel");
	}
	public void turnCrank() {
		System.out.println("You turned, but there's not enough coins");
	 }

	public void dispense() {
		System.out.println("You need to pay first");
	}

	public String toString() {
		return "waiting for quarter";
	}
}
