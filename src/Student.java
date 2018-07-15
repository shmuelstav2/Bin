import java.util.Comparator;



public class Student  implements Comparable <Student>{
    int key ;
    String name;

    public Student(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int compare(Student x, Student y){
        if(x.key<y.key){
            return -1;
        }
        if(x.key>y.key){
            return 1;
        }
        return 0;
    }

    public int compareTo( Student y ){
        return compare(this , y);
    }
}

