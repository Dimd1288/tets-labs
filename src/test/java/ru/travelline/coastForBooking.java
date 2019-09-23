package ru.travelline;

public class coastForBooking {
    private static final int RoomStay = 1200;
    private static final int meal = 300;
    private static final int transfer = 20;

    public static void main (String args[]) {
        getSum();

    }
        public static int getSum() {
            int sum = RoomStay + meal + transfer;
            return sum;

        }

    }



