import jdk.internal.dynalink.beans.StaticClass;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MapperExample {

    public static void main(String[] ags) {
        List<String> names = Arrays.asList("Peter", "sam", "Greg", "Ryan");
        System.out.println("Imperative style");

        for(String name:names){
            if(!name.equals("sam")){
                User user =  new User(name);
                System.out.println(user);
            }
        }

        System.out.println("Functional Style");

        names.stream().filter(MapperExample::isNotsam)
                .map(User::new)
                .forEach(System.out::println);

        System.out.println("list of users");
        names.stream().map(User::new).forEach(System.out::println);
    }
    private static boolean isNotsam(String name){
        return  !name.equals("sam");
    }
    static class User {
        private String name;
        private Integer age=30;

        public User(String name){
            this.name =name;
        }
        public void setAge(Integer age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return this.age;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

    }
}


