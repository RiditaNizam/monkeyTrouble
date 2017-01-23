package com.company;

public class Monkey {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true && bSmile == true) {
            return true;
        } else if (aSmile == false && bSmile == false) {
            return true;
        } else if (aSmile == true && bSmile == false) {
            return false;
        } else {
            return false;
        }
    }
}
