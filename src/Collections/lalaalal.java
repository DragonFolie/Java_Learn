package Collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class lalaalal {
    public static void main(String[] args) {

        int numbers ;
        Integer randomNumber;
        ArrayList<String> arrayListmain = new ArrayList<>();
        ArrayList<String> arrayListmain2 = new ArrayList<>();

        Map<Integer,String> linkedHashMapArray= new LinkedHashMap<>();

        for (int i = 0; i < 100; i++) {
            // randomNumber =20+ (int) ( Math.random() * 80 );
            randomNumber =1+ (int) ( Math.random() * 10 );

            arrayListmain.add(randomNumber.toString());

        }
        int countNumberFalse =0;
        int countNumberTrue = 0;

        System.out.println("Welcome to Create second array and Compare with first");


        for (int i = 0; i < arrayListmain.size(); i++) {

            randomNumber =1+ (int) ( Math.random() * 10 );
            arrayListmain2.add(randomNumber.toString());

        }

        System.out.println(arrayListmain + "First Array\n");

        System.out.println(arrayListmain2 + "Second Array\n");

        //int a = arrayListmain.size();


        for (int  i =0  ; i < arrayListmain.size(); i++) {

            // Вставити зрівняння equals

            if (arrayListmain.get(i).equals(arrayListmain2.get(i))){
                linkedHashMapArray.put(i,"True");
            }
            if (!arrayListmain.get(i).equals(arrayListmain2.get(i))){
                linkedHashMapArray.put(i,"False");
            }

        }

        System.out.println("linkedHashMapArray: "+linkedHashMapArray);
        System.out.println("Size:"+linkedHashMapArray.size());

        // Собственно то самое получения значения ( value ), сначала я добавляю значения в linkedHashMapArray (
        // циклом выше ) позже при linkedHashMapArray.get достаю значения по номеру ( который
        // я циклом выше добавляю ) ключа и сравниваю его с значения String

        for (int i = 0; i < arrayListmain.size(); i++) {
//                                System.out.println("I="+i);

            if (linkedHashMapArray.get(i)== "True"){


                countNumberTrue +=1;

            }
            else if(linkedHashMapArray.get(i)== "False") {

                countNumberFalse +=1;

            }


        }
//
        System.out.println("True:"+countNumberTrue +"False:"+countNumberFalse);

    }
}
