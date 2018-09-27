/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderTransactions;

/**
 *
 * @author NI389899
 */
public class Transactions {
    private String trans_no;
    private String trans_mode;
    private String trans_comp;
    private String trans_amt;

    /**
     * @return the trans_no
     */
    public String getTrans_no() {
        return trans_no;
    }

    /**
     * @param trans_no the trans_no to set
     */
    public void setTrans_no(String trans_no) {
        this.trans_no = trans_no;
    }

    /**
     * @return the trans_mode
     */
    public String getTrans_mode() {
        return trans_mode;
    }

    /**
     * @param trans_mode the trans_mode to set
     */
    public void setTrans_mode(String trans_mode) {
        this.trans_mode = trans_mode;
    }

    /**
     * @return the trans_comp
     */
    public String getTrans_comp() {
        return trans_comp;
    }

    /**
     * @param trans_comp the trans_comp to set
     */
    public void setTrans_comp(String trans_comp) {
        this.trans_comp = trans_comp;
    }

    /**
     * @return the trans_amt
     */
    public String getTrans_amt() {
        return trans_amt;
    }

    /**
     * @param trans_amt the trans_amt to set
     */
    public void setTrans_amt(String trans_amt) {
        this.trans_amt = trans_amt;
    }
}
