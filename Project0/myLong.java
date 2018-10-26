/**
 * Sam Eigen and Christina Campbell
 * 10/25/2018
 * Project 0
 * Description: myLong is a class that creates a new Object that allows users to add, subtract, and multiply
 * Integers of "infinite" length. This is to be used with the CalculatorGUI.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class myLong {


    Scanner scnr = new Scanner(System.in);
    public ArrayList<Integer> numArray = new ArrayList<>();
    String  cutValue;
    int v;
    String Long= "";
    String enteredValue;


    /**
     * Constructor myLong allows the user to instantiate the object. numArray can be accessed
     * through the constructor as well as the main array for the calculations.
     *
     * @param  enteredValue  String that sets the object as well as setLong
     */


    public myLong(String enteredValue) {
        this.enteredValue= enteredValue;
        this.numArray = numArray;
    }

    public myLong() {
        this.enteredValue= enteredValue;
        this.numArray = numArray;
    }

    /**
     * Method makeArray is of type ArrayList<Integer> and accepts the parameter of enteredValue.
     * This cuts the entered String into a usable ArrayList as part of a myLong object.
     * @param  enteredValue  String input to be returned as an array
     * @return numArray      Returns the String into a spliced Array
     */


    public   ArrayList<Integer> makeArray(String enteredValue) {
        String  cutValue;
        int v;

        int i = 0;
        int negV = -1;


        if (enteredValue.charAt(0) == '-') {
            if (enteredValue.length() > 2) {
                for (i = enteredValue.length() - 1; i > 0; i--) {
                    cutValue = enteredValue.substring(1, 2);
                    v = Integer.valueOf(cutValue);
                    negV = negV * v;
                    this.numArray.add(negV);
                    enteredValue = enteredValue.substring(1, enteredValue.length());
                }
            } else if (enteredValue.length() == 2) {
                cutValue = enteredValue.substring(1);
                v = Integer.valueOf(cutValue);
                negV = negV * v;
                this.numArray.add(negV);

            }
        } else {
            for (i = enteredValue.length(); i > 0; i--) {
                if (enteredValue.length() > 1) {
                    cutValue = enteredValue.substring(0, 1);
                    v = Integer.valueOf(cutValue);
                    this.numArray.add(v);
                    enteredValue = enteredValue.substring(1, (enteredValue.length()));
                } else if (enteredValue.length() == 1) {
                    v = Integer.valueOf(enteredValue);
                    this.numArray.add(v);
                    enteredValue = enteredValue.substring(0, 0);
                }
            }
        }
        return numArray;
    }

    /**
     * Method setLong accepts a String and calls on makeArray to splice the String
     * into an ArrayList. The ArrayList is cleared before each use.
     * This cuts the entered String into a usable ArrayList as part of a myLong object.
     * @param  enteredValue  String input to be returned as an array
     * @return void          null
     */


    public void setLong (String enteredValue) {
        numArray.clear();
        numArray= this.makeArray(enteredValue);
    }

    /**
     * Method toString is of type String and accepts the parameter of an integer
     * ArrayList. toString uses a for-loop to turn a finished array post-calculation
     * back into a String for readability and efficiency.
     //* @param  numArray      ArrayList input to be turned back into a String
     * @return Long          Returns the String version of the ArrayList
     */
    @Override
    public String toString() {
        ArrayList<Integer> longArray = this.numArray;
        String Long = "";
        for (int i=0; i < longArray.size(); i++) {
            Long= Long + Integer.toString(numArray.get(i));
        }
        return Long;
    }

    /**
     * Method getLong is of type String.
     * getLong is a getter whose function is to return the String of numArray
     * using method toString.
     * @return Long          Returns the String version of the ArrayList
     */

    public String getLong() {
        this.numArray=numArray;
        Long= this.toString();
        return Long;
    }

    /**
     * Method add is of type ArrayList<Integer> and accepts the parameter of a myLong object
     * Method add takes two myLong objects and adds them using for-loops matching the respective
     * size of each ArrayList.
     * @param  other         myLong object
     * @return numArray      Returns finished, added Array of long1 and long2.
     */

    public   ArrayList<Integer> add(myLong other) {
        ArrayList<Integer> long2 = other.numArray;
        ArrayList<Integer> long1= this.numArray;

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
                    if (i==0) {
                        addArray.add(a1);
                        addArray.add(a2);
                    }
                    else {
                        addArray.add(a1);

                    }

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
                for (int i = (dif-1); i >=0; i--) {
                    int x= (long1.get(i)+a2);
                    addArray.add(x);

                    if ((long1.get(i)+a2)>=10) {
                        a2=x/10;
                        a1= x- (a2*10);
                        addArray.add(a1);
                    }
                    else {
                        a2=0;
                    }
                }
                Collections.reverse(addArray);


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

            }
            else {
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
                for (int i =(dif-1); i >=0; i--) {

                    int x= (long2.get(i)+a2);
                    if ((long2.get(i)+a2)>=10) {
                        a2=x/10;
                        a1= x- (a2*10);
                        addArray.add(a1);
                    }
                    else {
                        addArray.add(x);
                        a2=0;

                    }
                }


                Collections.reverse(addArray);



            }

        }

        return addArray;
    }


    /**
     * Method multAdd is of type ArrayList<Integer> and accepts the parameter of two ArrayLists.
     * Method multAdd takes two ArrayLists and adds them using for-loops matching the respective
     * size of each ArrayList. The purpose of multAdd is a carefully designed alternative to add to solely
     * be used in the multiply function. It is essentially an overloaded add function with a different name.
    // * @param  ArrayList<Integer>       Integer ArrayList
     //* @param  ArrayList<Integer>       Integer ArrayList
     * @return addArray      Returns finished, added Array of long1 and long2 to be used in multiply.
     */

    public   ArrayList<Integer> multAdd(ArrayList<Integer> long1, ArrayList<Integer> long2) {
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
                    if (i==0) {
                        addArray.add(a1);
                        addArray.add(a2);
                    }
                    else {
                        addArray.add(a1);

                    }

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
                for (int i = (dif-1); i >=0; i--) {
                    int x= (long1.get(i)+a2);
                    addArray.add(x);

                    if ((long1.get(i)+a2)>=10) {
                        a2=x/10;
                        a1= x- (a2*10);
                        addArray.add(a1);
                    }
                    else {
                        a2=0;
                    }
                }
                Collections.reverse(addArray);


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

            }
            else {
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
                for (int i =(dif-1); i >=0; i--) {

                    int x= (long2.get(i)+a2);
                    if ((long2.get(i)+a2)>=10) {
                        a2=x/10;
                        a1= x- (a2*10);
                        addArray.add(a1);
                    }
                    else {
                        addArray.add(x);
                        a2=0;

                    }
                }


                Collections.reverse(addArray);


            }
        }
        return addArray;
    }

    /**
     * Method multiply is of type ArrayList<Integer> and accepts the parameter of a myLong object.
     * Method multiply takes two ArrayLists and multiplies them using for-loops matching the respective
     * size of each ArrayList. This function calls on the previous multAdd function to add each multiplied
     * ArrayList after their execution.
     * @param other       myLong object
     * @return totalSum   Returns finished, multiplied Array of each added ArrayList.
     */

    public ArrayList <Integer>  multiply(myLong other) {
        ArrayList<Integer> long2= other.numArray;
        ArrayList<Integer> long1= this.numArray;
        int l1 = long1.size();
        int l2 = long2.size();
        int size1 = l1 - 1;
        int size2 = l2 - 1;
        int multiplyNum;


        String multiplyString;
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        Collections.reverse(long1);
        Collections.reverse(long2);
        //myLong fL= new myLong();
        ArrayList<Integer> finalArray = new ArrayList<>();



        if (size1 <size2) {
            for (int i = 0; i <= size2; i++) {
                for (int j = 0; j <= size1; j++) {
                    //get value at positions
                    int x = long1.get(j);
                    int y = long2.get(i);
                    int num = (x * y);
                    int numZeros = i + j;
                    String zeros = "";
                    for (int l = 0; l < numZeros; l++) {
                        zeros += "0";
                    }

                    multiplyString = Integer.toString(num) + zeros;

                    myLong fL = new myLong(multiplyString);
                    finalArray = fL.makeArray(multiplyString);
                    A.add(finalArray);
                }
            }
        }

        if (size2 <size1) {
            for (int i = 0; i <= size1; i++) {
                for (int j = 0; j <= size2; j++) {
                    //get value at positions
                    int x = long1.get(i);
                    int y = long2.get(j);
                    int num = (x * y);
                    int numZeros= i +j;
                    String zeros = "";
                    for (int l = 0; l < numZeros ; l++) {
                        zeros += "0";
                    }

                    multiplyString = Integer.toString(num) + zeros;


                    myLong fL = new myLong(multiplyString);
                    finalArray = fL.makeArray(multiplyString);
                    A.add(finalArray);
                }
            }
        }
        if (size1==size2) {
            for (int i = 0; i <= size1; i++) {
                for (int j = 0; j <= size2; j++) {
                    //get value at positions
                    int x = long1.get(i);
                    int y = long2.get(j);
                    int num = (x * y);
                    int numZeros= i +j;
                    String zeros = "";
                    for (int l = 0; l < numZeros ; l++) {
                        zeros += "0";
                    }

                    multiplyString = Integer.toString(num) + zeros;


                    myLong fL = new myLong(multiplyString);
                    finalArray = fL.makeArray(multiplyString);
                    A.add(finalArray);
                }
            }
        }
        ArrayList <Integer> totalSum= new ArrayList<>();
        ArrayList <Integer> currSum= new ArrayList<>();

        for (int i=1; i<= (A.size()-1); i+=2) {
            currSum = this.multAdd((A.get(i-1)), A.get(i));
            totalSum = this.multAdd(currSum, totalSum);

        }
        if(((A.size()-1)%2==0)) {
            currSum = A.get(A.size() - 1);
            totalSum = this.multAdd(currSum, totalSum);
        }

        Collections.reverse(long1);
        Collections.reverse(long2);


        return totalSum;

    }



    /**
     * Method subtract is of type ArrayList<Integer> and accepts the parameter of a myLong object.
     * Method subtract takes two ArrayLists, reverses them using the Collections interface,
     * and subtracts them using for-loops indexing through each Array.
     * @param  other              myLong object
     * @return subtractArray      Returns finished, subtracted Array of long1 and long2.
     */
    public  ArrayList<Integer> subtract(myLong other) {
        ArrayList<Integer> long2 = other.numArray;
        ArrayList<Integer> long1= this.numArray;
        ArrayList<Integer> subtractArray = new ArrayList<>();
        ArrayList<Integer> temp= new ArrayList<>();
        int initLength = long1.size()-long2.size();
        if (long2.size()-long1.size() <0) {
            temp=long1;
            long1=long2;
            long2=temp;
        }

        if(long2.size() > long1.size()){
            int diff = long2.size() - long1.size();
            for(int i=0; i < diff; i++){
                long1.add(0,0);
            }
        }
        else {
            int diff = long1.size() - long2.size();
            for(int i=0; i < diff; i++){
                long2.add(0,0);
            }
        }

        Collections.reverse(long1);
        Collections.reverse(long2);

        for (int k=0; k <long2.size(); k++) {
            int i=k;
            int j=k;
            if ((long2.get(i)-long1.get(j)) <0) {
                i++;
                while (i > j) {
                    if (long2.get(i) > 0) {
                        long2.set(i,(long2.get(i)-1));
                        long2.set(i-1,(long2.get(i-1)+10));
                        i--;
                    }
                    else {
                        i++;
                    }
                }
            }
            if(long2.get(i)>0) {
                int x= (long2.get(i) - long1.get(j));
                // System.out.println(x);
                subtractArray.add(x);

            }
        }
        Collections.reverse(subtractArray);
        if (initLength < 0) {
            subtractArray.set(0,(subtractArray.get(0)*(-1)));
        }

        Collections.reverse(long1);
        Collections.reverse(long2);

        return subtractArray;
    }



    /**
     * A previewed example of our main method delineates the programs intended execution. The user inputs two
     * different Integers which are stored as Strings. Two myLong objects are created using the Strings as a parameter.
     * The objects then call the setLong method to input the String, and three different examples of each of add, subtract,
     * and multiply are called which are then output into the console.
     * @param  args          String Array
     * @return void          null
     */
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter an integer up to 100 digits long: ");
        String enteredValue = scnr.nextLine();

        System.out.println("Please enter an integer up to 100 digits long: ");
        String enteredValue2 = scnr.nextLine();

        myLong longNum = new myLong(enteredValue);
        myLong longNum2 = new myLong(enteredValue2);

        ArrayList<Integer> long1= new ArrayList<>();
        ArrayList<Integer> long2= new ArrayList<>();



        longNum.setLong(enteredValue);
        longNum2.setLong(enteredValue2);

        System.out.println(longNum.add(longNum2));
        System.out.println(longNum.multiply(longNum2)) ;
        System.out.println(longNum.subtract(longNum2));
        System.out.println(longNum);
        System.out.println(longNum2);


    }
}







