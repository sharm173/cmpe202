/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

package starbucks ;

/**
 * Main App Controller Class
 */
public class AppController implements IApp {

    private IScreen mycards ;
    private IScreen store ;
    private IScreen rewards ;
    private IScreen payments ;
    private IMenuCommand displayMyCards ;
    private IMenuCommand displayPayments ;
    private IMenuCommand displayRewards ;
    private IMenuCommand doStore ;
    private IFrame frame ;

    public AppController() {
        // setup command pattern
      setDisplayMyCardsCommandPattern();
      setDisplayPaymentsCommandPattern();
      setDisplayRewardsCommandPattern();
      setDoStoreCommandPattern();
    }
// setup command pattern
    //display myCards
    public void setDisplayMyCardsCommandPattern() {
      mycards = new MyCards() ;
      frame = new Frame( mycards ) ;
      displayMyCards  = new MenuCommand() ;
      displayMyCards.setReceiver(
          new IMenuReceiver() {
              /** Command Action */
              public void doAction() {
                  frame.setCurrentScreen( mycards ) ;
              }
        }
        ) ;
      frame.setMenuItem ( "A", displayMyCards ) ;
    }

    //display payments
    public void setDisplayPaymentsCommandPattern() {
      payments = new Payments() ;
      displayPayments = new MenuCommand() ;
      displayPayments.setReceiver(
          new IMenuReceiver() {
              /** Command Action */
              public void doAction() {
                  frame.setCurrentScreen( payments ) ;
              }
        }
        ) ;
      frame.setMenuItem ( "B", displayPayments ) ;
    }

    //display rewards
    public void setDisplayRewardsCommandPattern() {
      rewards = new Rewards() ;
      displayRewards  = new MenuCommand() ;
      displayRewards.setReceiver(
          new IMenuReceiver() {
              /** Command Action */
              public void doAction() {
                  frame.setCurrentScreen( rewards ) ;
              }
        }
        ) ;
      frame.setMenuItem ( "C", displayRewards ) ;
    }

    //doStore
    public void setDoStoreCommandPattern() {
      store = new Store() ;
      doStore = new MenuCommand() ;
      doStore.setReceiver(
          new IMenuReceiver() {
              /** Command Action */
              public void doAction() {
                  frame.setCurrentScreen( store ) ;
              }
        }
        ) ;
      frame.setMenuItem ( "D", doStore ) ;
    }





    /**
      * Switch to Landscape Mode
      */
    public void landscape() {
        frame.landscape() ;
    }

    /**
     * Switch to Portait Mode
     */
    public void portrait() {
        frame.portrait() ;
    }

    /**
     * Send In Touch Events
     * @param x X Coord
     * @param y Y Coord
     */
    public void touch(int x, int y) {
        frame.touch(x, y) ;
    }

    /**
     * Display Current Screen
     */
    public void display() {
        frame.display() ;
    }

    /**
     * Execute Menu Bar Command
     * @param c Menu Bar Option (A, B, C, D or E)
     */
    public void execute( String c ) {
        frame.cmd( c ) ;
    }

    /**
     * Navigate to Previous Screen
     */
    public void prev() {
        frame.previousScreen() ;
    }

    /**
     * Navigate to Next Screen
     */
    public void next() {
        frame.nextScreen() ;
    }

    /**
     * Get Current Screen Name
     * @return Screen Name
     */
    public String screen() {
        return frame.screen() ;
    }

    /**
     * Get Current Screen Contents
     * @return Current Screen Contents
     */
    public String screenContents() {
        return frame.contents() ;
    }

}
