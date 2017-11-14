package test02;
 
public class MyAspect {
    public void myBefore() {
        System.out.println("배가 고프다.");
    }
     
    public void myAfterReturning() {
        System.out.println("음식을 먹는다.");
    }
     
    public void myAfterThrowing() {
        System.out.println("엄마를 부른다~!!!");
    }
     
    public void myAfter() {
        System.out.println("설거지를 한다.");
    }
}