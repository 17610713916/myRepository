package exercise.java_again_test;

public class MembersMethod {

    private static int ages=0;

    public MembersMethod(String name) {
        System.out.println("----"+name);
    }

    private void setAge(int age){
         ages=age;
    }

    private  int getAges(){
        return ages;
    }

    public static void main(String[] args) {
        MembersMethod aa=new MembersMethod("郝文全");
        aa.setAge(25);
        System.out.println(aa.getAges());
    }

}
