package NewTest;

import java.util.Scanner;

public class UserInput {
    private int age;
    private String sex;
    private String name;


    public UserInput(int age, String sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name= name;
    }

    public String getName() {
        System.out.println("Name ="+name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println("Age is="+age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        System.out.println("Sex is="+sex);
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static void main(String[] args){
        System.out.println("Enter the inputs for Age,sex,name");
        Scanner S = new Scanner(System.in);
        UserInput U = new UserInput(S.nextInt(),S.nextLine(),S.nextLine());
        U.getAge();
        U.getSex();
        U.getName();

    }
}
