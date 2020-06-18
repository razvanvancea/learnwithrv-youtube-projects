public class Main {
    public static void main(String[] args) {
        Person p = new Person("Maria",30,"m@gmail.com");

        Person p2 = Person.builder().age(40).build();

        Person p3 = Person.builder().name("John").age(55).email("john@gmail.com").build();

        System.out.println(p2.getAge());

        p3.setName("Mario");
        System.out.println(p3.getName());

        System.out.println(p.toString());
    }
}
