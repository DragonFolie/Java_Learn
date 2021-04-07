package Collections;

import  java.lang.*;
import java.lang.Object;


import java.util.*;


public class ArrayTest {



    public static void main (String[] args)  {




        Scanner cin = new Scanner(System.in);

        String inputArrayData ;
        String arrayDataFind ;
        int numbers ;
        Integer randomNumber;







        ArrayList<String> arrayListmain = new ArrayList<>();
        ArrayList<String> arrayListmain2 = new ArrayList<>();








        while(true){
            System.out.print("\n\n0-Exit from programm\n1-ArrayList\n2-HashMap\nWrite:");
            numbers = cin.nextInt();
            switch (numbers){

                case 0:
                    System.exit(0);
                    break;


                case 1:{
                    System.out.println("Welcome to ArrayList, change command\n");
                    System.out.print("\n\n10-Create second array and Compare with first" +
                            "\n9-get new array ( copy or with new add )" +
                            "\n8-sorted" +
                            "\n7-Clone array\n2-Add new array into old with some new data" +
                            "\n6-clear/remove" +
                            "\n5-find by...\n" +
                            "\n4 input " +
                            "\n3- output array" +
                            "\n2 fill array by random number" +
                            "\n1-Go back" +
                            "\n0 exit from programm\nWrite:");


                    numbers = cin.nextInt();
                    if (numbers == 2){

                        for (int i = 0; i < 100; i++) {
                            // randomNumber =20+ (int) ( Math.random() * 80 );
                            randomNumber =20+ (int) ( Math.random() * 80 );

                            arrayListmain.add(randomNumber.toString());

                        }

                    }





                    if (numbers == 0){
                        System.exit(0);
                    }

                    else if(numbers== 3){
                        System.out.println(arrayListmain + "\n\n");
                    }
                    else if(numbers==4){

                        System.out.print("1-input one time\n2-input count time\nWrite:");
                        numbers = cin.nextInt();
                        switch (numbers){
                            case 1:
                                System.out.println("Input one date:");

                                inputArrayData = cin.next();
                                System.out.println("Process....");
                                arrayListmain.add(inputArrayData);
                                inputArrayData = null;
                                break;
                            case 2:
                                System.out.println("Input count u want to input");


                                int count = cin.nextInt();

                                for (int i = 0; i < count; i++) {

                                    System.out.println("Input:");
                                    inputArrayData = cin.next();
                                    arrayListmain.add(inputArrayData);

                                }
                                break;

                        }


                    }

                    else if(numbers == 5){
                        System.out.println("1-get result by index\n2-find  index by text(slow)\n3-find  index by text( fast, binirySearch )");
                        numbers = cin.nextInt();
                        switch (numbers) {
                            case 1:
                                System.out.println("Write index:");
                                numbers= cin.nextInt();
                                System.out.println("Result: "+arrayListmain.get(numbers));
                                break;
                            case 2:
                                System.out.println("Slow search\nWrite what u want to find by text:");
                                arrayDataFind = cin.next();
                                System.out.println(arrayListmain.indexOf(arrayDataFind));
                                break;
                            case 3:

                                System.out.println("Fast search\nWrite what u want to find by text:");
                                arrayDataFind = cin.next();
                                Collections.sort(arrayListmain);

                                int arrayBinarySearch = Collections.binarySearch(arrayListmain,arrayDataFind);
                                System.out.println(arrayBinarySearch);
                                break;



                        }


                    }
                    else if(numbers == 6){
                        System.out.print("1-Clear array\n2-remove by index\n3-remove by name\nWrite:");
                        numbers = cin.nextInt();
                        switch (numbers){
                            case 1:
                                arrayListmain.clear();
                                break;
                            case 2:

                                System.out.print("write index from 0 to "+arrayListmain.size()+"\nWrite:" );
                                numbers = cin.nextInt();
                                arrayListmain.remove(numbers);
                                break;
                            case 3 :
                                System.out.print("write name:" );
                                inputArrayData = cin.next();
                                arrayListmain.remove(inputArrayData);
                                break;



                        }

                    }
                    else if (numbers == 7){


                        System.out.println("1-Clone array\n2-Add new array into old with some new data");
                        numbers = cin.nextInt();
                        switch (numbers){


                            case 1:
//                        List<String> l1 = new ArrayList<String>();
//                        l1.add("Hello");
//                        l1.add("World");
//                        List<String> l2 = new ArrayList<String>(l1); //A new arrayList.
//                        l2.add("Everybody");

                                List<String> CopyOfarrayListmain_case1 = new ArrayList<>(arrayListmain); //A new arrayList.

                                System.out.println("Your new array:\n"+ CopyOfarrayListmain_case1);
                                break;






                            case 2:
                                ArrayList<String> CopyOfarrayListmain_case2 = new ArrayList(); //A new arrayList.
//

                                System.out.println("Input from some index? \n1-yes\n2-no");
                                numbers = cin.nextInt();

                                switch (numbers){


                                    case 1:


                                        for (int i = 0; i < 5; i++) {

                                            randomNumber =5+ (int) ( Math.random() * 5 );
                                            CopyOfarrayListmain_case2.add(randomNumber.toString());

                                        }
                                        System.out.println("From index:");
                                        numbers = cin.nextInt();

                                        arrayListmain.addAll(numbers,CopyOfarrayListmain_case2);
                                        System.out.println(arrayListmain);
                                        break;


                                    case 2:

                                        System.out.println("Hi");
                                        for (int i = 0; i < 5; i++) {

                                            randomNumber =5+ (int) ( Math.random() * 5 );
                                            CopyOfarrayListmain_case2.add(randomNumber.toString());

                                        }
                                        arrayListmain.addAll(CopyOfarrayListmain_case2);
                                        System.out.println(arrayListmain);
                                        break;

                                }


                        }






                    }else if (numbers ==8){

                        Collections.sort(arrayListmain);
                        System.out.println(arrayListmain);

                    }
                    if (numbers == 9){

                        for (int i = 0; i < 10; i++) {
                            randomNumber =20+ (int) ( Math.random() * 80 );
                            arrayListmain2.add(randomNumber.toString());

                        }
                        System.out.println(arrayListmain2 + "\n\n");
                        System.out.println(arrayListmain + "\n\n");
                        int a;
                        if(arrayListmain.size() > arrayListmain2.size())
                        {
                            a = arrayListmain2.size();

                        }
                        else  {
                            a = arrayListmain.size();
                        }
                        for (int  i =0  ; i < a; i++) {

                            // Вставити зрівняння equals

                        }


                    }
                    else{
                        System.out.println("pls write correct number");
                    }
                    break;
                }

                case 2:
                {


                    System.out.println("Welcome to HashMap\n");

                    MethodEquelsHashmap methodEquelsHashmap = new MethodEquelsHashmap();

                    int keyInarray = methodEquelsHashmap.getKeyInArray();
                    int valueInarray = methodEquelsHashmap.valueInArray;

                    int keyInarraySet ;
                    int valueInarraySet ;

                    Map<Integer,Integer> map = new HashMap<>();


                    while(true){
                        System.out.println("\n\n0-exit\n1-fill random key and value\n2-show Hashmap\n3-fill by yourself\n4-clear by key\n5-clear by value\n6-clear all");
                        numbers = cin.nextInt();
                        if(numbers == 0){
                            break;
                        }
                        switch (numbers){
                            case 1:
                                System.out.println("Generating.....");

                                for (int i = 0; i < 5; i++) {
                                    // randomNumber =20+ (int) ( Math.random() * 80 );

                                    keyInarraySet =20+ (int) ( Math.random() * 20 );
                                    valueInarraySet =1+ (int) ( Math.random() * 10 );

                                    map.put(keyInarraySet,valueInarraySet);

                                }
                                System.out.println("\nCompleted!");
                                break;
                            case 2:
                                if (map.isEmpty() == true){
                                    System.out.println("Hashmap is empty, please input data");
                                    break;
                                }
                                System.out.println(map);
                                break;
                            case 3:
                                System.out.println("How many times u want to input? Write number: ");
                                numbers = cin.nextInt();
                                for (int i = 0; i <numbers ; i++) {

                                    System.out.println("Write key and value");
                                    System.out.print("Key:");
                                    keyInarraySet = cin.nextInt();
                                    System.out.println("Value: ");
                                    valueInarraySet= cin.nextInt();

                                }
                                System.out.println(map);
                                break;
                            case 4:
                                System.out.println("You select to clear HashMap");
                                if (map.isEmpty() == true){
                                    System.out.println("Hashmap is empty, please input data");
                                    break;
                                }
                                map.clear();
                                break;
                            case 5:
                                System.out.println("Your Map");

                                System.out.println(map);
                                if (map.isEmpty() == true){
                                    System.out.println("Hashmap is empty, please input data");
                                    break;
                                }
                                System.out.println("Write key and value");
                                System.out.print("Key:");
                                keyInarraySet = cin.nextInt();
                                System.out.println("Value: ");
                                valueInarraySet= cin.nextInt();
                                map.remove(keyInarraySet,valueInarraySet);
                                System.out.println("Your Map");
                                System.out.println(map);
                                break;
                            case 6:
                                if (map.isEmpty() == true){
                                    System.out.println("Hashmap is empty, please input data");
                                    break;
                                }
                                System.out.println("Your Map is clear");
                                map.clear();
                                System.out.println("Your map now:");
                                System.out.println(map);
                                break;



                        }

                    }








                }



            }





        }









        }




    }

