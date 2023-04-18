/**
 * 自定义类比较大小必须要让这个类有比较大小的功能(compare())
 */

import java.util.Arrays;
import java.util.Comparator;

public class InterfaceSummary {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student(22,"Van様");
        students[1] = new Student(20,"吉木");
        students[2] = new Student(38,"熏肉");
        students[3] = new Student(48,"Billy");
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}

class Student implements Comparable<Student>{
    public Student(int age,String name){
        this.age = age;
        this.name = name;
    }
    public int age;
    public String name;

    @Override
    public String toString(){
        return ("-学生的年龄为:"+age+" 姓名为:"+name+"-");
    }

    @Override
    public int compareTo(Student student) {
        if(this.age > student.age){
            return -1;
        }
        else if(this.age < student.age){
            return 1;
        }
        else return 0;
    }
}

class Student2 implements Comparator<Student> {
    public Student2(int age,String name){
        this.age = age;
        this.name = name;
    }
    public int age;
    public String name;

    @Override
    public String toString(){
        return ("-学生的年龄为:"+age+" 姓名为:"+name+"-");
    }

    @Override
    public int compare(Student student,Student student2) {
        if(this.age > student.age){
            return -1;
        }
        else if(this.age < student.age){
            return 1;
        }
        else return 0;
    }
}