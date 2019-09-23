package ru.travelline;

public class checkArray {

   private static int[] roomId = new int[]{1,2,3,4,5};
   private static final int reqId = 3;

   public static void main (String args[]){
       checkId();

   }
    public static boolean checkId(){
       boolean isIdExist = false;
       for(int i = 0; i<roomId.length; i++){
           if (roomId[i] == reqId){
               isIdExist = true;
           }
       }
       System.out.println(isIdExist);
        return (isIdExist);
    }

}
