import com.skwaweru254.GenericsClass;
import ke.co.skwaweru254.GenericsMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        GenericsClass<Integer> intObj = new GenericsClass<>(8);
        System.out.println("Generic class return integer:"+intObj.getData());


        // initialize generic class with string
        GenericsClass<String> stringObj = new GenericsClass<>("Simon is here now");
        System.out.println("Generic class return string:"+ stringObj.getData());

        //initialize generic class with integer
        GenericsMethod test = new GenericsMethod();
        test.genericsMethod(8);

        //initialize generic class with String
        test.genericsMethod("Simon is here");


    }
}