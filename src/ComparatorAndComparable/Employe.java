package ComparatorAndComparable;

import java.util.Comparator;

public class Employe implements Comparable<Employe> {
     int id;
     String name;
     int salary;

    public Employe(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employe employe) {

//        if (this.id>employe.id ){
//
//            return 1;
//
//        }
//
//        else if(this.id<employe.id){
//
//            return -1;
//
//        }
//
//        else {
//
//            return 0;
//
//        }

//        return this.name.compareTo(employe.name);

       int result =  this.id-employe.id;
//       if (result == 0) {
//           result = this.salary-employe.salary;
//       }
        return result;
    }
}


class IdComparator implements Comparator<Employe> {

    @Override
    public int compare(Employe emp1, Employe emp2) {
        if (emp1.id>emp2.id ){

            return 1;

        }

        else if(emp1.id<emp2.id){

            return -1;

        }

        else {

            return 0;

        }
    }
}

class NameComparator implements Comparator<Employe> {

    @Override
    public int compare(Employe emp1, Employe emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

