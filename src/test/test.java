package test;

public class test {

    private String [] array = new String[10];
    private  int   size = 0;

    public void add(String ad){
        array[size] = ad;
        size++;
        if (size == array.length){
            String [] newarray = new String[array.length*2];
            for (int i =0;i< array.length;i++){
                newarray[i]= array[i];
            }
            array = newarray;
        }

    }



    public int getSize() {
        return size;
    }

}
