package Lesson32_exceptionPart2;

public class Test1 {
    public static void createPwd(String pwd){
        if (pwd.length()<6){
            throw new IllegalArgumentException("Dlina parolya slishkom malenkaya");
        } if (pwd.length()>12){
            throw new IllegalArgumentException("Dlina parolya slishkom bolshaya");
        }
        System.out.println("Пароль принят");
    }

    public static void main(String[] args) {
        createPwd("qweqwww");
    }
}

