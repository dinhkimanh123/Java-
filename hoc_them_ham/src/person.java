public class person {
    String name;
    String gender;
    int age;
    String clasName;

    public String getInf(){
        return "name - " + name + "\ngender - " + gender + "\nage - " + age + "\nclaname - " + clasName;


    }

    public static void main(String[] args) {
        person person1 = new person();

        person1.name = "Kim Anh";
        person1.gender = "Nữ";
        person1.age = 18;
        person1.clasName = "IBSK1D2";

        System.out.println(person1.getInf());
    }
}
