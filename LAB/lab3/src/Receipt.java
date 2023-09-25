/* CPSC 2151 - Lab 3
 *
 * DeMarco Blagburn
 * Joel Miller
 * Clayton Novak
 * Austin Wagner
 */

/**
 * This class is designed to track the cost for each item a client has bought and
 * provides a method to compute the total amount they must pay.
 * Note that there are two kinds of items:
 * taxable items and items that are exempt from tax.
 * This class must keep track of both subtotals and only add the
 * tax to the taxable items when computing the final total for all items.
 *
 * @invariant   0 <= taxRate <= 1.00 AND 0 <= taxSubTotol AND
 *              0 <= nonTaxSubTotal
 */
public class Receipt {
    private double taxRate;
    private double taxSubTotal;
    private double nonTaxSubTotal;


    /**
     * This constructor creates a new receipt.
     *
     * @param   tr taxRate applied to the receipt
     *
     * @pre     0 <= tr <= 1.00
     *
     * @post    taxRate = tr AND
     *          taxSubtotal = #taxSubTotal AND nonTaxSubtotal = # nonTaxSubtotal
     */
    public Receipt(double tr) {
    }


    /**
     * add an item(s) to the appropriate subtotal depending on whether the item is taxable or not.
     *
     * @param c     cost of the item
     * @param q     quantity of the item
     * @param isTax is the item taxable
     *
     * @pre     0 <= c AND 1 <= q
     *
     * @post    if isTax = TRUE, nonTaxSubTotal = q * c IF OR
     *          if isTax = FALSE, taxSubTotal = q * c * (1+ taxRate)
     */
    public void addToReceipt(double c, int q, boolean isTax) {
    }


    /**
     * Returns the current subtotal of the non-taxable items.
     *
     * @return  The double value stored in the nonTaxSubTotal
     *
     * @post    nonTaxSubTotal = #nonTaxSubTotal AND
     *          taxSubTotal = #taxSubTotal AND taxRate = #taxRate
     */
    public double getNonTaxableSubtotal() {
    }


    /**
     * Returns the current subtotal of the items that are subject to tax.
     *
     * @return  The double value stored in the TaxSubTotal
     *
     * @post    taxSubotal = #taxSubTotal AND
     *          nonTaxSubTotal = #nonTaxSubTotal AND taxRate = #taxRate
     */
    public double getTaxableSubtotal() {
    }


    /**
     * returns the tax rate that will be applied
     *
     * @return  taxRate
     *
     * @post    taxRate = #taxRate AND
     *          taxSubTotal = #taxSubTotal AND nonTaxSubTotal = #nonTaxSubTotal
     */
    public double getTaxRate() {
    }


    /**
     * returns  the  total  amount  charged  for  all  items,including any tax that needs to be applied.
     *
     * @return  taxSubTotal + nonTaxSubTotal
     *
     * @post    taxRate = #taxRate AND
     *          taxSubTotal = #taxSubTotal AND
     *          nonTaxSubTotal = #nonTaxSubTotal
     */
    public  double  computeTotal() {
    }







}