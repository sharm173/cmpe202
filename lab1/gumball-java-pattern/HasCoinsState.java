

import java.util.Random;

public class HasCoinsState implements State {
	GumballMachine gumballMachine;

	public HasCoinsState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	public void insertDime() {
		System.out.println("You can't insert another Dime");
	}

	public void insertNickel() {
		System.out.println("You can't insert another Nickel");
	}

	public void ejectCoins() {
		System.out.println("Coins returned");
		gumballMachine.setState(gumballMachine.getDoesNotHaveCoinsState());
	}

	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

	public String toString() {
		return "waiting for turn of crank";
	}
}
