package exercise.java_again_test;

public class ObjectTest {
    /**
     * 构造方法
     * @param name
     */
    public ObjectTest(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
       //初始化对象
        ObjectTest ot=new  ObjectTest("郝文全");
    }
}
