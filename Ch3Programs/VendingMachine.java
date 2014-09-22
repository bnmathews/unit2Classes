

/**
 * Vending machine class creates a vending machine that contains cans and can take tokens to remove cans.
 * 
 * @author bnmathews
 * @version xx
 */
public class VendingMachine
{
    /** The amount of tokens in the machine */
    private int tokens;
    /** The amount of cans in the machine */
    private int cans;

    /**
     * Construct a machine. Specifies tokens and cans in the machine at the time
     */
    public VendingMachine(int tokens, int cans)
    {
        this.tokens = 0;
        this.cans = 0;
    }

    /**
     * Gets the token count.
     * 
     * @return  Returns the number of tokens
     */
    public int getTokenCount()
    {
        return this.tokens;
    }
    
    /**
     * Gets the can count.
     *          
     * @return  Returns the number of cans
     */
    public int getCanCount()
    {
        return this.cans;
    }
    
    /**
     * Fills up the machine with new soda cans, apparently, the machine can hold an infinite amount.
     * Cool, yeah?
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @param   numcans   The number of cans to insert
     */
    public void fillUp(int numcans)
    {
        this.cans += numcans;
    }
    
    /**
     * Increases tokens by one, but decreases cans by one.
     *
     * @pre        Machine must have some cans in it
     */
    public void insertToken()
    {
        this.tokens += 1;
        this.cans -= 1;
    }
    

}
