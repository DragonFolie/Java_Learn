package Collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ArrayTestTest {


    //       From ArrayTest          //



    //   ArrayList   //


    private ArrayTest arrayTest;
    private MethodEquelsHashmap methodEquelsHashmap = new MethodEquelsHashmap();
    private Scanner cin = new Scanner(System.in);

    private String inputArrayData ;
    private String arrayDataFind ;
    private int numbers ;
    private Integer randomNumber;



    private ArrayList<String> arrayListmain = new ArrayList<>();
    private ArrayList<String> arrayListmain2 = new ArrayList<>();


    private Map<Integer,String> linkedHashMapArray= new LinkedHashMap<>();




    // HashMap //


    int keyInarray = methodEquelsHashmap.getKeyInArray();
    int valueInarray = methodEquelsHashmap.valueInArray;

    int keyInarraySet ;
    int valueInarraySet ;
    int findValueKey;

    Map<Integer,Integer> map = new HashMap<>();



    //       For Testing methods         //

    private final double EPS = 1e-9;

    private int expectedInt;
    private double expectedDouble;
    private  boolean expectedBoleand;

    private int resultInt;
    private double resultDouble;
    private boolean resultBoolean;



    @Before
    public void Preparation(){
        arrayTest = new ArrayTest();





    }




    // ArrayList Testing //// ArrayList Testing //// ArrayList Testing //
    // ArrayList Testing //// ArrayList Testing //// ArrayList Testing //
    // ArrayList Testing //// ArrayList Testing //// ArrayList Testing //
    // ArrayList Testing //// ArrayList Testing //// ArrayList Testing //





    @Test
    public void fillarrayListmainByRandomNumberNotNull() {
        expectedInt = 10;
        for (int i = 0; i < 10; i++) {
            // randomNumber =20+ (int) ( Math.random() * 80 );
            randomNumber =1+ (int) ( Math.random() * 10 );

            arrayListmain.add(randomNumber.toString());

        }
        resultInt = arrayListmain.size();

        assertEquals(expectedInt,resultInt,EPS);


    }


    @Test
    public  void SizeOfArrayListmainMustBePlusOne(){

        expectedInt = 1;

        arrayListmain.add("inputArrayData");

        resultInt = arrayListmain.size();

        assertEquals(expectedInt,resultInt,EPS);


    }

    @Test
    public void SizeOfArrayListmainMustBePlusCountTime(){

        int countTimeInputDate = 10;
        for (int i = 0; i < countTimeInputDate; i++) {

            arrayListmain.add("inputArrayData");

        }
        //System.out.println(arrayListmain.size());

        expectedInt = countTimeInputDate;
        resultInt = arrayListmain.size();
        assertEquals(expectedInt,resultInt,EPS);

    }

    @Test
    public void SizeOfArrayListmainMustBeZero(){
        expectedInt = 0;
        int countTimeInputDate = 10;
        for (int i = 0; i < countTimeInputDate; i++) {

            arrayListmain.add("inputArrayData");

        }
        arrayListmain.clear();
        resultInt = arrayListmain.size();
        assertEquals(expectedInt,resultInt,EPS);


    }

    @Test
    public void SizeOfArrayListmainMustBeMinusOne_byIndex(){
        expectedInt = 8;


        for (int i = 0; i < 9; i++) {
            // randomNumber =20+ (int) ( Math.random() * 80 );
            randomNumber =1+ (int) ( Math.random() * 10 );

            arrayListmain.add(randomNumber.toString());


        }



        arrayListmain.remove(5);
        resultInt = arrayListmain.size();

        assertEquals(expectedInt,resultInt,EPS);




    }

    @Test
    public void SizeOfArrayListmainMustBeMinusOne_byName (){

        expectedInt = 9;
        for (int i = 0; i < 9; i++) {
            // randomNumber =20+ (int) ( Math.random() * 80 );
            randomNumber =1+ (int) ( Math.random() * 10 );

            arrayListmain.add(randomNumber.toString());

        }
        resultInt = arrayListmain.size();
        assertEquals(expectedInt,resultInt,EPS);
        arrayListmain.add("inputArrayData");
        arrayListmain.remove("inputArrayData");


        assertEquals(expectedInt,resultInt,EPS);


    }

    @Test
    public void CopyOfarrayListmainCase1MustBeSameArrayListmain_bySize(){

        for (int i = 0; i < 9; i++) {
            // randomNumber =20+ (int) ( Math.random() * 80 );
            randomNumber =1+ (int) ( Math.random() * 10 );

            arrayListmain.add(randomNumber.toString());

        }
        List<String> CopyOfarrayListmain_case1 = new ArrayList<>(arrayListmain); //A new arrayList.



        if (arrayListmain.size() == CopyOfarrayListmain_case1.size()){
            resultBoolean = true;
        }
        assertTrue(resultBoolean);


    }
    @Test
    public void CopyOfarrayListmainCase1MustBeSameArrayListmain_byValue(){

        for (int i = 0; i < 10; i++) {
            // randomNumber =20+ (int) ( Math.random() * 80 );
            randomNumber =1+ (int) ( Math.random() * 10 );

            arrayListmain.add(randomNumber.toString());

        }
        List<String> CopyOfarrayListmain_case1 = new ArrayList<>(arrayListmain); //A new arrayList.

        int sizeOfarrayListmain = arrayListmain.size();

        int countNumberFalse =0;
        int countNumberTrue = 0;
//                            int countError = 0;
//        ;






        int a = arrayListmain.size();


        for (int  i =0  ; i < a; i++) {

            // Вставити зрівняння equals

            if (arrayListmain.get(i).equals(CopyOfarrayListmain_case1.get(i))){
                linkedHashMapArray.put(i,"True");
            }


        }



        // Собственно то самое получения значения ( value ), сначала я добавляю значения в linkedHashMapArray (
        // циклом выше ) позже при linkedHashMapArray.get достаю значения по номеру ( который
        // я циклом выше добавляю ) ключа и сравниваю его с значения String

        for (int i = 0; i < a; i++) {
//

            if (linkedHashMapArray.get(i).equals("True")){


                resultInt +=1;

            }


        }
        expectedInt = 10;

        assertEquals(expectedInt,resultInt,EPS);

    }


    // HashMap Testing //// HashMap Testing //// HashMap Testing //
    // HashMap Testing //// HashMap Testing //// HashMap Testing //
    // HashMap Testing //// HashMap Testing //// HashMap Testing //
    // HashMap Testing //// HashMap Testing //// HashMap Testing //


    @Test
    public void mapMustBeNotZeroSize(){
        expectedInt = 5;

        for (int i = 0; i < expectedInt; i++) {
            // randomNumber =20+ (int) ( Math.random() * 80 );

            keyInarraySet =1+ (int) ( Math.random() * 500 );
            valueInarraySet =1+ (int) ( Math.random() * 500 );

            map.put(keyInarraySet,valueInarraySet);


        }

        resultInt = map.size();

        assertEquals(expectedInt,resultInt,EPS);


    }

    @Test
    public void mapMustFillByCountTime(){
        int FillByCountTime = 5;

        for (int i = 0; i < FillByCountTime; i++) {




            keyInarraySet =1+ (int) ( Math.random() * 500 );
            valueInarraySet =1+ (int) ( Math.random() * 500 );

            map.put(keyInarraySet,valueInarraySet);




        }
        expectedInt = FillByCountTime;

        resultInt = map.size();

        assertEquals(expectedInt,resultInt,EPS);



    }

    @Test
    public void mapMinusKeyThenSizeMinusOne(){

        for (int i = 0; i < 4; i++) {
            // randomNumber =20+ (int) ( Math.random() * 80 );

            keyInarraySet =1+ (int) ( Math.random() * 500 );
            valueInarraySet =1+ (int) ( Math.random() * 500 );

            map.put(keyInarraySet,valueInarraySet);


        }
        keyInarraySet =1+ (int) ( Math.random() * 500 );
        valueInarraySet =1+ (int) ( Math.random() * 500 );
        map.put(keyInarraySet,valueInarraySet);

        expectedInt = 4;
        map.remove(keyInarraySet);
        resultInt= map.size();
        assertEquals(expectedInt,resultInt,EPS);

    }

    @Test
    public void mapSizeMustBeZero(){
        for (int i = 0; i < 4; i++) {
            // randomNumber =20+ (int) ( Math.random() * 80 );

            keyInarraySet =1+ (int) ( Math.random() * 500 );
            valueInarraySet =1+ (int) ( Math.random() * 500 );

            map.put(keyInarraySet,valueInarraySet);


        }
        map.clear();
        expectedInt = 0;
        resultInt = map.size();
        assertEquals(expectedInt,resultInt,EPS);

    }
    @After
    public void After(){

        arrayListmain.clear();
        map.clear();

    }
}