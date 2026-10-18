import java.util.*;
import java.util.ArrayList;
class Stud implements Comparable<Stud>{
    int rollno,marks;
    String name;

    public Stud(int rollno, int marks, String name) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stud{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Stud o) {
        return marks>o.marks?1:-1;
    }
}
public class CollectionDemo {
    public static void main(String[] args){
        List<Stud> studs = new ArrayList<>();
        studs.add(new Stud(23,23,"idli1"));
        studs.add(new Stud(24,56,"idli2"));
        studs.add(new Stud(64,78,"idli3"));
        studs.add(new Stud(34,54,"idli4"));

        Collections.sort(studs,(o1,o2)->o1.rollno>o2.rollno?1:-1);

        for(Stud stud:studs){
            System.out.println(stud);
        }
    }
}
