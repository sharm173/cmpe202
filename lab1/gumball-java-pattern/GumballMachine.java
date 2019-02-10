public class GumballMachine {

    State soldOutState;
    State doesNotHaveCoinsState;
    State hasCoinsState;
    State soldState;

    State state = soldOutState;
    int count = 0;
    int coinsRequired = 0;
    int machine = 0;
    public GumballMachine(int numberGumballs, int machine) {
        soldOutState = new SoldOutState(this);
        doesNotHaveCoinsState = new DoesNotHaveCoinsState(this);
        hasCoinsState = new HasCoinsState(this);
        soldState = new SoldState(this);
        this.machine = machine;

        if(machine == 1) {
            this.coinsRequired = 25;
            System.out.println("Machine 1 selected. Please put in 1 quarter");
        }

        else if(machine == 2) {
            this.coinsRequired = 50;
            System.out.println("Machine 2 selected. Please put in 2 quarters");
        }
        else if(machine == 3) {
            this.coinsRequired = 50;
            System.out.println("Machine 3 selected. Please put in quarters, dimes or nickels worth 50c");
        }
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = doesNotHaveCoinsState;
        }


    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void insertDime() {
        state.insertDime();
    }

    public void insertNickel() {
        state.insertNickel();
    }

    public void ejectCoins() {
        state.ejectCoins();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    void refill(int count) {
        this.count = count;
        state = doesNotHaveCoinsState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getDoesNotHaveCoinsState() {
        return doesNotHaveCoinsState;
    }

    public State getHasCoinsState() {
        return hasCoinsState;
    }

    public State getSoldState() {
        return soldState;
    }

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
