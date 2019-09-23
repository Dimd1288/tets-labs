package ru.travelline;


public class checkDiscount {
   private static final double discount = 55.55;
   private static final int RoomStay = 1000;
   private static final int meal = 500;
   private static final int transfer = 80;

    public static void main (String args[]) {
        getSumWithDisc();

    }

    public static int getTotal(){
        int withoutDisc = RoomStay + meal + transfer;
        return (withoutDisc);
    }

    public static double getSumWithDisc() {
         int withoutDisc = getTotal();
         System.out.println(withoutDisc);
         double withDisc = withoutDisc;
         if (withoutDisc > 1500){
            withDisc = (double)withoutDisc - discount;
                     }
         System.out.println(withDisc);
        return (withDisc);
    }


}

