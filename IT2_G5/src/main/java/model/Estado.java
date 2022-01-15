package model;

import java.util.ArrayList;

/**
 *
 * @author grupo5
 */

public class Estado {
    private int value;
    private String state;
    
    private static final ArrayList<String> stateValues = new ArrayList<String>();

    private static final int INT_DEFAULT = 0;
    private static final String STR_DEFAULT = "";

    public Estado() {
        this.value = INT_DEFAULT;
        valores();
    }

    public Estado(int value) {
        this.value = INT_DEFAULT;
        valores();
        this.state = stateValues.get(value);
    }

    private void valores() {
        stateValues.add("sem resposta");
        stateValues.add("aceite");
        stateValues.add("rejeitado");
        stateValues.add("anulado");
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(value + "=" + state);
        return sb.toString();
    }
}