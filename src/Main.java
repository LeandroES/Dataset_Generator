import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static ArrayList<Integer> Resultado() {
        Random rd = new Random();
        ArrayList<Integer> resultado = new ArrayList<Integer>();
        for (int i = 0; i < rd.nextInt(10000, 50000); i++) {
            resultado.add(rd.nextInt(1, 50000));
        }
        return resultado;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Integer> arraySIU = new ArrayList<Integer>(Resultado());
        //employees.add(new Employee(0, "Jose", "Departamento A"));
        //employees.add(new Employee(1, "Alex", "Departamento B"));
        //employees.add(new Employee(2, "Ignacio", "Departamento C"));

        FileOutputStream fout=new FileOutputStream("D:\\WorkSpaces\\Java\\Dataset_Generator\\Data\\output.txt");
        ObjectOutputStream out= new ObjectOutputStream(fout);
        out.writeObject(arraySIU);
        out.close();


        FileInputStream fin = new FileInputStream("D:\\WorkSpaces\\Java\\Dataset_Generator\\Data\\output.txt");
        ObjectInputStream ois = new ObjectInputStream(fin);
        ArrayList<Integer> arrayInput = (ArrayList<Integer>)ois.readObject();
        for(Integer i : arrayInput) System.out.println(i);
    }

}
