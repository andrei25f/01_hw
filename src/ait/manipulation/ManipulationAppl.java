package ait.manipulation;

import ait.manipulation.infra.Utils;

public class ManipulationAppl {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Wrong number of arguments");
            return;
        }
        Utils.caller(args[0], args[1], args[2]);
    }
}
