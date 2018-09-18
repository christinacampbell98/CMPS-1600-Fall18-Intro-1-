//Sam Eigen and Christina Campbell
//Lab2 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class myLong {
   Scanner scnr = new Scanner(System.in);
   ArrayList<Integer> numArray = new ArrayList<>();
   String  cutValue;
   int v;


   public myLong(String eV) {
       String enteredValue = eV;
       this.numArray = numArray;
   }

   public   ArrayList<Integer> makeArray(String enteredValue) {

       int i = 0;


       for (i=enteredValue.length(); i>0; i--) {
           if (enteredValue.length() > 1) {
               cutValue = enteredValue.substring(0,1);
               v = Integer.valueOf(cutValue);
               this.numArray.add(v);
               enteredValue = enteredValue.substring(1,(enteredValue.length()));
           }

           else if(enteredValue.length()==1) {
               v = Integer.valueOf(enteredValue);
               this.numArray.add(v);
               enteredValue=enteredValue.substring(0,0);
           }
       }
       return this.numArray;
   }

   public void setLong (ArrayList<Integer> numArray) {
       this.numArray= numArray;
   }


   public String getLong() {
       int l = numArray.size();
       String x;
       String y = "";
       int i;


       for (i = 0; i < l; i++) {
           x = String.valueOf(numArray.get(i));
           y = y + x;

       }
       return y;

   }

   public   ArrayList<Integer> add(ArrayList<Integer> long1, ArrayList<Integer> long2) {
       int l1 = long1.size();
       int l2 = long2.size();
       ArrayList<Integer> addArray = new ArrayList<>();
       int add;
       int size1 = l1 - 1;
       int size2 = l2 - 1;
       int a2 = 0;
       int a1;
       if (size1 == size2) {
           for (int i = size1; i >= 0; i--) {
               int x = long1.get(i) + a2;
               int y = long2.get(i);
               add = (x + y);
               if (add >= 10) {
                   a2 = add / 10;
                   a1 = add - (a2 * 10);
                   addArray.add(a1);


               } else {
                   addArray.add(add);
                   a2 = 0;
               }

           }
           Collections.reverse(addArray);
       }
       else if (size1 > size2) {
           int dif = (size1 - size2);
           if (size2 == 0) {
               add = (long1.get(size1) + long2.get(size2));
               if (add >= 10) {
                   a2 = add / 10;
                   a1 = add - (10 * a2);
                   addArray.add(((long1.get(size1 - 1) + a2)));
                   addArray.add(a1);
                   for (int i = 0; i <= (dif - 2); i++) {
                       addArray.add(i, long1.get(i));
                   }
               } else {
                   addArray.add(add);
                   for (int i = 0; i <= (dif - 1); i++) {
                       addArray.add(i, long1.get(i));
                   }
               }

           } else {
               int j = 0;
               a2 = 0;
               a1 = 0;
               for (int i = size2; i >= 0; i--) {
                   add = (long1.get(size1 - j) + long2.get(i) + a2);
                   if (add >= 10) {
                       a2 = add / 10;
                       a1 = add - (a2 * 10);
                       addArray.add(a1);
                   } else {
                       addArray.add(add);
                       a2 = 0;

                   }

                   j += 1;
               }
               Collections.reverse(addArray);
               for (int i = 0; i < (dif); i++) {
                   int x= (long1.get(i)+a2);
                   addArray.add((i), x);
                   if ((long1.get(i)+a2)>=10) {
                       a2=x/10;
                       a1= x- (a2*10);
                       addArray.add(a1);
                   }
                   else {
                       a2=0;
                   }
               }


           }
       } else if (size2 > size1) {
           int dif = (size2 - size1);
           if (size1 == 0) {
               add = (long1.get(size1) + long2.get(size2));
               if (add >= 10) {
                   a2 = add / 10;
                   a1 = add - (10 * a2);
                   addArray.add(((long2.get(size2 - 1) + a2)));
                   addArray.add(a1);
                   for (int i = 0; i <= (dif - 2); i++) {
                       addArray.add(i, long2.get(i));
                   }
               }
               else {
                   addArray.add(add);
                   for (int i = 0; i <= (dif - 1); i++) {
                       addArray.add(i, long2.get(i));
                   }
               }

           } else {
               int j = 0;
               a2 = 0;
               a1 = 0;
               for (int i = size1; i >= 0; i--) {
                   add = (long2.get(size2 - j) + long1.get(i) + a2);
                   if (add >= 10) {
                       a2 = add / 10;
                       a1 = add - (a2 * 10);
                       addArray.add(a1);
                   } else {
                       addArray.add(add);
                       a2 = 0;

                   }

                   j += 1;
               }
               Collections.reverse(addArray);
               for (int i = 0; i < (dif); i++) {
                   int x= (long2.get(i)+a2);
                   addArray.add((i), x);
                   if ((long2.get(i)+a2)>=10) {
                       a2=x/10;
                       a1= x- (a2*10);
                       addArray.add(a1);
                   }
                   else {
                       a2=0;
                   }
               }


           }
       }
       return addArray;
   }


   public ArrayList <Integer>  multiply(ArrayList<Integer> long1, ArrayList<Integer> long2) {
       int l1 = long1.size();
       int l2 = long2.size();
       int size1= l1-1;
       int size2=l2-1;
       String multiplyString;
       ArrayList<ArrayList<Integer>> A= new ArrayList<>();
       Collections.reverse(long1);
       Collections.reverse(long2);
       //myLong fL= new myLong();
       ArrayList<Integer> finalArray= new ArrayList<>();


       for (int i=0; i <= size2; i++) {
           for (int j = 0; j <= size1; j++) {
               int x = long1.get(j);
               int y = long2.get(i);
               //System.out.println(x);
               //System.out.println(y);
               multiplyString = String.valueOf((int)((x * y) * (Math.pow(10, (i + j)))));
               myLong fL= new myLong(multiplyString);
               //System.out.println(multiplyString);
               // System.out.println();
               finalArray = fL.makeArray(multiplyString);
               //System.out.println(finalArray);
               A.add(finalArray);
           }
       }
       ArrayList <Integer> totalSum= new ArrayList<>();
       ArrayList <Integer> currSum= new ArrayList<>();
       for (int i=1; i<= A.size(); i+=2) {
           currSum= this.add(A.get(i-1), A.get(i));
           totalSum= this.add(currSum,totalSum);

       }
       return totalSum;

   }




   public static ArrayList<Integer> subtract(ArrayList<Integer> long1, ArrayList<Integer> long2) {
       int l1 = long1.size();
       int l2 = long2.size();
       ArrayList<Integer> subtractArray = new ArrayList<>();
       int subtract;
       int size1 = l1 - 1;
       int size2 = l2 - 1;
       int carry = 0;
       if (size1 == size2) {
           for (int i = size1; i >= 0; i--) {
               int x = long1.get(i);
               int y = long2.get(i);
               if (x < y) {
                   x = x + 10;
               } else {
                   subtract = (x - y);
                   subtractArray.add(subtract);
               }
           }
           Collections.reverse(subtractArray);
       } else {
           if (size1 > size2) {
               int diff = size1 - size2;
               for (int j = diff; j >= 0; j--) {
                   long2.add(0);
               }
               for (int i = size1; i >= 0; i--) {
                   int x = long1.get(i);
                   int y = long2.get(i);
                   if (x < y) {
                       x = x + 10;
                   } else {
                       subtract = (x - y);
                       subtractArray.add(subtract);
                   }
               }
               // Collections.reverse(subtractArray);
           } else if (size2 > size1) {
               int diff = size2 - size1;
               for (int j = diff; j >= 0; j--) {
                   long1.add(0);
               }
               for (int i = size1; i >= 0; i--) {
                   int x = long1.get(i);
                   int y = long2.get(i);
                   if (x < y) {
                       x = x + 10;
                   } else {
                       subtract = (x - y);
                       subtractArray.add(subtract);
                   }
               }
           }
       }
       return subtractArray;
   }






   public static void main(String[]args){
       Scanner scnr = new Scanner(System.in);

       System.out.println("Please enter an integer up to 100 digits long: ");
       String enteredValue = scnr.nextLine();

       System.out.println("Please enter an integer up to 100 digits long: ");
       String enteredValue2 = scnr.nextLine();

       myLong longNum = new myLong(enteredValue);
       myLong longNum2 = new myLong(enteredValue2);

       ArrayList<Integer> long1= new ArrayList<>();

       ArrayList<Integer> long2= new ArrayList<>();

       long1= longNum.makeArray(enteredValue);
       long2= longNum2.makeArray(enteredValue2);

       String  a= longNum.getLong();
       String  b= longNum2.getLong();
       System.out.println(longNum.add(long1,long2));
       System.out.println(longNum.multiply(long1,long2)) ;
       System.out.println(subtract(long1,long2));





   }
}








