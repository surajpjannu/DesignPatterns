package com.design.patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundedPeg roundedPeg = new RoundedPeg(5);

        if (roundHole.fits(roundedPeg)) {
            System.out.println("roundedPeg r5 fits roundHole r5.");
        }


        SquarePeg squarePeg = new SquarePeg(2);
        SquarePeg squarePeg20 = new SquarePeg(20);

//        if (roundHole.fits(squarePeg)) NOt possible

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        SquarePegAdapter squarePegAdapter20 = new SquarePegAdapter(squarePeg20);
        if (roundHole.fits(squarePegAdapter)){
            System.out.println("Square peg w2 fits round hole r5.");
        }

        if (roundHole.fits(squarePegAdapter20)){
            System.out.println("Square peg w20 fit into round hole r5.");
        }else {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }

    }
}
