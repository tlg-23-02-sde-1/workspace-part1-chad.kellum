package com.duckrace;

import static com.duckrace.Reward.*; // OK to use * for static imports
class DuckRacerTest {

    public static void main(String[] args) {
        DuckRacer racer5 = new DuckRacer(5, "Chris");
        System.out.println(racer5);  // toString() automatically called

        racer5.win(DEBIT_CARD);
        racer5.win(DEBIT_CARD);
        racer5.win(PRIZES);
        racer5.win(DEBIT_CARD);

        System.out.println(racer5);
    }
}