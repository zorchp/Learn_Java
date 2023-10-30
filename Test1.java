public class Test1 {
  public static void main(String[] args) {
    System.out.println(Student.age);
  }
}

public class Student {
  static {
    age = 23;
  }
  public static int age;
  age = 30; // 错误: 需要<标识符>
}
