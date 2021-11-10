package com.leverx.freeman.steps;

import java.util.ResourceBundle;

public class Output {

    private static ResourceBundle bundle = ResourceBundle.getBundle("com.leverx.freeman.resources.messages");
    protected static String youWin = bundle.getString("Win");
    protected static String pcWin = bundle.getString("pcWin");
    protected static String step = bundle.getString("step");
    private static String line = bundle.getString("line");
    protected static String draw = bundle.getString("draw");
    protected static String error1 = bundle.getString("error1");
    protected static String choice = bundle.getString("choice");
    protected static String HvsC = bundle.getString("HvsC");
    protected static String CvsC = bundle.getString("CvsC");
    protected static String HvsH = bundle.getString("HvsH");

    public static String getLine() {
        return line;
    }
}
