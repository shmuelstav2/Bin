import javax.swing.*;

public class Test {

    public static void main(String[] args) {
        BinarySearchTree<Student> tree = new BinarySearchTree<Student>();
        Student s1  = new Student(56 , "wfretere");
        Student s2  = new Student(51 , "wfretere");
        Student s3  = new Student(67 , "wfretere");
        Student s4  = new Student(40 , "wfretere");
        Student s5  = new Student(90 , "wfretere");
        tree.add(s1);
        tree.add(s2);
        tree.add(s3);
        tree.add(s4);
        tree.add(s5);
    }
}
