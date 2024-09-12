 ///////////////1st Program/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//public class Main{
//    public static void main(String[] args){
//        System.out.println("Namastay Java");
//        System.out.println(4+3);
//        System.out.println(6*3);
//    }
//}

/////////////2nd Program(Variables)//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//public class Main{
//    public static void main(String[] args){
//       int age = 24;
//       int marks = 98;
//       int secondMarksOfStudent = 23;  //camelcase notation
//        int $Marks =28;
//
//    }
//}

////////////3rd Programme(Data type)////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////[premitive Data Type]////////////////////////

//public class Main{
//    public static void main(String[] args){
//        int age = 24;
//        byte marks = 13;           ///-127 to 127////
//        short secondMarksOfStudent = 23;
//        boolean isPassed = true;
//        float pi= 3.14f;   ///use f for float///
//        double secondPi = 3.1434354634;
//        long jcc = 5344353588676876789L;  //use L for long digits//
//        char myLetter = 'M';
//
//        System.out.println(age);
//        System.out.println(marks);
//        System.out.println(secondMarksOfStudent);
//        System.out.println(isPassed);
//        System.out.println(pi);
//        System.out.println(secondPi);
//        System.out.println(jcc);
//        System.out.println(myLetter);


/////////////////Data Type Implicit Conversion/////////////


//      long count = 12;
//        int countInt =(int)count;
//
//        int age = 150;
//        byte newAge =(byte)age;
//
//        System.out.println(newAge);

/////////////////Data Type Explicit Conversion/////////////


//        int age = 1500;
//        byte newAge =(byte)age;
//
//        System.out.println(newAge);
//    }
//}

//////////////////////4th Program [Operators]///////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////1-[Arithmetic Operators]///////////////////////////

/* public class Main{
    public static void main(String[] args) {
        int a = 12;
        int b = 7;
        int c = a+b;
        int d = a-b;
        int e = a*b;
        double f = (double) a/b;   ////TypeCasting///
        int g = a%b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);


    }
}*/

//////////////////////2-[Assignment Operators]///////////////////////////


//public class Main{
//    public static void main(String[] args) {
//
//        int a = 12;
//        int b = 7;
//        int c = 22;
//        int d = 14;
//        double e = (double) 27;
//        int f = 28;
//
//        a +=b;  //a=a+b;
//        c -=b;  //c=c-b;
//        d *=b;  //d=d*b
//        e /=b;  //e=e/b
//        f %=b;  //f=f%b
//
//        System.out.println(a);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//
//    }
//}


//////////////////////3-[Relational Operators]///////////////////////////

/*
public class Main{
    public static void main(String[] args) {

        int firstNumber = 12;
        int secondNumber = 16;


        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber != secondNumber);
        System.out.println(firstNumber > secondNumber);
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber <= secondNumber);



    }
}
*/

//////////////////////4-[logical Operators]///////////////////////////


/*public class Main{
    public static void main(String[] args) {

        boolean firstExpression = true;
        boolean secondExpression = false;


        System.out.println(firstExpression && secondExpression);
        System.out.println(firstExpression || secondExpression);
        System.out.println(!firstExpression);
        System.out.println(!secondExpression);

    }
}*/


//////////////////////5-[Bitwise Operators]///////////////////////////

//public class Main{
//    public static void main(String[] args) {
//
//    }
//}


//////////////////////6-[Increment & Decrement Operators]///////////////////////////

//public class Main{
//    public static void main(String[] args) {
//
//        int a = 12;
//        a++;  //a=12+1(++ is equal to 1)
//
//        int b = 21;
//        b--;
//
//        System.out.println(a);
//        System.out.println(b);
//    }
//}

//////////////////////7-[Ternary Operators]///////////////////////////

//public class Main{
//    public static void main(String[] args) {
//        int a = 22;
//        int b = 12;
//        int c = 118;
//        int max = 0;

//        if (a>b){
//            max = a;
//        }else{
//            max = b;
//        }
//        System.out.println("Value Of Max :>" + max);
////////////////////////////////////////////////////////////////
//        max = b < a ? a:b;
//        System.out.println("Value Of Max = " + max);

/////////////////////////////////////////////////////////////////
//        max = a>b ? a>c ? a : c : b > c ? b : c;
//        System.out.println("Value Of Max = " + max);
//
//
//
//    }
//}

//////////5th Program[Taking User Input Using Scanner]//////////////////////////////////////////////////////////////////////////////////////////////////


//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {

         /*Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Age:");
        int age = sc.nextInt();
        System.out.println("Your Age is=>"+age);*/

//////////////////////////////////////////////////////////////////////////////////////////

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Hey Buddy Enter Your Detail here:");
        String name = sc.next();
        int age = sc.nextInt();
        float height = sc.nextFloat();
        String trade = sc.next();
        long sal = sc.nextLong();
        boolean isJavaEasy = sc.nextBoolean();

        System.out.println("Hello "+ name + " This is Your All details: " + ", Age " + age + ", Height " +
        height + " ,Trade " + trade + " ,Sallery " + sal + " ,Is Java Easy? "+ isJavaEasy);

        sc.close();*/

        /*Scanner sc = new Scanner(System.in);
        // Prompt the user for details
        System.out.println("Hey Buddy, Enter Your Details here:");

        // Reading user input
        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height: ");
        float height = sc.nextFloat();

        System.out.print("Enter your trade: ");
        String trade = sc.next();

        System.out.print("Enter your salary: ");
        long sal = sc.nextLong();

        System.out.print("Is Java easy (true/false)?: ");
        boolean isJavaEasy = sc.nextBoolean();

        // Display the user details
        System.out.println("\nHello " + name + ", here are your details:");
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Trade: " + trade);
        System.out.println("Salary: " + sal);
        System.out.println("Is Java Easy?: " + isJavaEasy);

        sc.close();

    }
}*/

//////////6th Program[Java Conditional Statements]////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////[IF - Else Statements]//////////////////////////

//public class Main{
//    public static void main(String[] args) {
//         int age = 4;
//         if(age >=18) {
//             System.out.println("You are able to Vote");
//         }else {
//             System.out.println("You can't Vote");
//         }
//    }
//}

////////////////////////////////////////////////////////////////////////////////////

//public class Main{
//    public static void main(String[] args) {
//        int time = 1;
//
//        if (time>=10){
//            if(time<= 20) {
//                System.out.println("office is Opened");
//            } else {
//                System.out.println("Office is Closed");
//            }
//        }else{
//            System.out.println("Office is Closed");
//
//        }
//    }
//}

///////////////////////////////////////////////////////////////////////////////////////

//public class Main{
//    public static void main(String[] args) {
//        int day = 6;
//        if(day == 1){
//            System.out.println("Go to home and Enjoy");
//        }else {
//            System.out.println("it is working day,Go to Office");
//        }
//    }
//}

/////////////////////////////[IF - Else-if Else Statements]//////////////////////////

//public class Main{
//    public static void main(String[] args) {
//
//        int day = 6;
//        if(day == 1){
//            System.out.println("Go to home and Enjoy");
//        } else if (day==2) {
//            System.out.println("Go to the village");
//        } else if (day==6) {
//            System.out.println("Its weekend buddy,went to Club");
//        }
//        else {
//            System.out.println("it is working day,Go to Office");
//        }
//    }
//}

/////////////////////////////[Nasted if-Else Statements]//////////////////////////

//public class Main{
//    public static void main(String[] args) {
//
//        int a = 4;
//        int b = 8;
//        int c = 1;
//
//        if(a > b) {
//            System.out.println("A is Bigger than B");
//            if (a > c) {
//                System.out.println("A is Bigger than C");
//                System.out.println("A is Largest" + a);
//            } else {
//                System.out.println("C is Bigger than A");
//                System.out.println("C is Largest" + c);
//            }
//        }else{
//                System.out.println("B is bigger than A");
//                if (b > c) {
//                    System.out.println("B is bigger than c");
//                    System.out.println("B is Largest" + b);
//                } else {
//                    System.out.println("C is Bigger than B");
//                    System.out.println("C is Largest" + c);
//                }
//            }
//        }
//    }


//////////7th Program[Java Switch Statements]//////////////////////////////////////////////////////////////////////////////////////////////////////////

//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args) {
//
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the day");
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1: case 7:
//                System.out.println("Today is Sunday");
//                System.out.println("Today is Saturday");
//                System.out.println("Today is Holiday");
//                break;
//            case 2:
//                System.out.println("Today is Monday");
//                break;
//            case 3:
//                System.out.println("Today is Tuesday");
//                break;
//            case 4:
//                System.out.println("Today is Wednesday");
//                break;
//            case 5:
//                System.out.println("Today is Thursday");
//                break;
//            case 6:
//                System.out.println("Today is Friday");
//                break;
////            case 7:
////                System.out.println("Today is Saturday");
////                break;
//            default:
//                System.out.println("You enter Invalid Day");
//
//
//
//
//        }
//    }
//}

//public class Main{
//    public static void main(String[] args) {
//
//        int time = 17;
//        if( time >=10 && time <=20) {
//            System.out.println("Office is Opened");
//        }else{
//            System.out.println("Office is Closed");
//        }


//        if (time==12 || time==18){
//            System.out.println("its time for Snacks");
//        }else{
//            System.out.println("its time for Work");
//        }
//    }
//}


//////////8th Program[Loops in Java ]//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////  [For - Loop]  //////////////////////////////
//public class Main{
//        public static void main(String[] args) {
//
//                for (int i = 0; i <= 5 ; i++){
//                        System.out.println(i);
//                }
//        }
//}


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter A Number");
//        int n = sc.nextInt();
//        for (int i = 1; i <= 10 ; i++ ){
//            System.out.println(n + " * " + i +  " = " + i * n);
//        }

    ////////////////////    numbers sum[n(n+1)/2]     ///////////////////////////////////////////////////////
        //////1+2+3+4+5=15
//        int sum = 0;
//        for( int i = 0 ; i <= n ; i++ ){
//            sum = sum + i;
//        }
//        System.out.println("Sum is =" + sum);

 //////////////     Sum numbers sum[n(n+1)]      /////////////////////////////////////////////////

//        int sum = 0;
//        for( int i = 0 ; i <= n ; i++ ){
//            //sum = sum + 2*i;
//            sum += 2*i;
//        }
//        System.out.println("Sum is =" + sum);
//
//
//    }
//
//}



//////////////////////  [While - Loop]  //////////////////////////////////////


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        boolean hasLearnt = false;
//        while(!hasLearnt) {
//            System.out.println("Went to School , tried to learn");
//            System.out.println("Have you Understood");
//            hasLearnt = sc.nextBoolean();
//        }
//    }
//}

//////////////////////  [Do While - Loop]  //////////////////////////////////////


import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
////         Scanner sc = new Scanner(System.in);
////         boolean hasLearnt = false;
////         while(!hasLearnt) {
////             System.out.println("Went to School , tried to learn");
////             System.out.println("Have you Understood");
////             hasLearnt = sc.nextBoolean();
////         }
//         int i = 8;
////         while(i<=5) {
////             System.out.println(i);
////             i++;
////         }
//         do{
//             System.out.println(i);
//             i++;
//         } while(i <= 5);
//         System.out.println("You are out of the loop");
//     }
// }


 //////////////////////  [Break And Continue]  //////////////////////////////////////


public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i+=2) {
            System.out.println(i);
            if(i >= 10) break;
        }
    }
}
































































































































































































































































































































































































