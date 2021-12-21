package com.leverx.freeman.steps;

import java.util.ResourceBundle;

public class Output {

    private static final ResourceBundle bundle = ResourceBundle.getBundle("com.leverx.freeman.resources.messages");
    protected static final String youWin = bundle.getString("Win");
    protected static final String pcWin = bundle.getString("pcWin");
    protected static final String step = bundle.getString("step");
    private static final String line = bundle.getString("line");
    protected static final String draw = bundle.getString("draw");
    protected static final String error1 = bundle.getString("error1");
    protected static final String error2 = bundle.getString("error2");
    protected static final String choice = bundle.getString("choice");
    protected static final String HvsC = bundle.getString("HvsC");
    protected static final String CvsC = bundle.getString("CvsC");
    protected static final String HvsH = bundle.getString("HvsH");
    protected static final String name1 = bundle.getString("name1");
    protected static final String name2 = bundle.getString("name2");

    public static String getLine() {
        return line;
    }
}
