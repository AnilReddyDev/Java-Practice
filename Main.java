import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //Primitive DataTypes
//        byte age = 20; //1
//        int num = 1234567890; //4
//        long lnum = 12345678900L; //8
//        float pi = 3.14F; //4
//        double price = 100.00;
//        char a = 'a';  //2
//        boolean isadult = true; //1
//        System.out.println(isadult);


        //Non-Primitive DataTypes
        //String and Array
        //1st way to create a string which is least used one
//        String str = new String("anil");
//        System.out.println(str);
        //2nd way and most used one.Let's see String
//        String name1 = "Anil";
//        System.out.println(name1.length());
//        System.out.println(name1.charAt(0));
//        String name2= name1.replace('A','a');
//        System.out.println(name2);
//        System.out.println(name1 +" and " + name2);
//        String name3 = name1.substring(0,2);
//        System.out.println(name3);



        // Array
        //we can initialize array in 2 ways
        //1st way is used when u don't know the value of array so 1st u can create and later u can assign values to it
//        int[] marks = new int[3];
//        marks[0] = 97;
//        marks[1] = 99;
//        marks[2] = 95;
//        System.out.println(marks[0]);
//        Arrays.sort(marks);//this method is used to sort the array
//        System.out.println(marks[0]);

        //2nd way to create array
//        int[] Marks = {98,94,92,99};//1D array
//        System.out.println(Marks[0]);
//        int[][] finalmarks = {{94,98,92},{90,98,96}};//2d array
//        //{94,98,92} index = 0 and to access elements in it we have index 0,1,2
//        //{90,98,96} index = 1 and to access elements in it we have index 0,1,2
//        System.out.println(finalmarks[0][0]);//1st array 1st element
//        System.out.println(finalmarks[1][0]);//2nd array 1st element




        //implicit ,explicit and casting
//        double price = 100.00;
//        double fp = price + 18;
//        System.out.println(fp);

//        int price = 100;
//        int fp = price + (int)18.00;//we are casting the datatype double to int though there may be a lossy conversion
//        System.out.println(fp);
//        int i = 10;
//        int x = Integer.parseInt("200");
//         String num = String.valueOf(i); // casting can be done
//        // for possible conversions only like string of letters can not be converted to the int
//        System.out.println(num);


        //constants in java .The values can not be changed
//        int age = 19;
//        age = 20; //here age can be change when ever we want
//
//        final int AGE = 19; //but if we dont want it to change means use 'final' keyword like const in js
//        AGE = 20;//it can not be changed as it is constant



    }
}