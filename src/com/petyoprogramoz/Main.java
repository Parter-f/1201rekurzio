package com.petyoprogramoz;

public class Main {

    public static void main(String[] args) {
	    binarisfa<Integer> bifa = new binarisfa<>();
        int elemekSzama = 69;
        int legkisebb = 1;
        int legnagyobb = 420;

        for (int i = 0; i < elemekSzama ; i++) {
            int ertek = (int)(Math.random() * (legnagyobb-legkisebb + 1));
            bifa.beszur(ertek);
        }
        System.out.println(bifa);
    }
}
