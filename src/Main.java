import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
//import com.google.common.base.Function;
//import com.google.common.collect.Lists;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Main {

    class GFG {

        // Generic function to convert List of
        // String to List of String
        public static <T, U> List<U>
        convertIntListToStringList(List<T> listOfInteger,
                                   Function<T, U> function)
        {
            return listOfInteger.stream()
                    .map(function)
                    .collect(Collectors.toList());
        }
    }
    public static List<String> Resultado() {
        Random rd = new Random();
        List<Integer> resultado = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            resultado.add(rd.nextInt(1, 50000));
        }
        List<String> listOfString = GFG.convertIntListToStringList(resultado, s -> String.valueOf(s));
        return listOfString;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Path output = Paths.get("D:\\WorkSpaces\\Java\\Dataset_Generator\\Data\\100.txt");
        try {
            Files.write(output, Resultado());
            System.out.println(output.toFile().getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
