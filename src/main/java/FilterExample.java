import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FilterExample {

    public static  void main(String [] ags){
        List<String> names = Arrays.asList("Peter","sam","Greg","Ryan");
        names.stream().filter(name->!name.equals("sam")).forEach(System.out::println);

    }
}
