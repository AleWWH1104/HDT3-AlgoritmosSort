
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;


public class ArchivoRW <T> {
    
    public void generarNums(String archivo, int cant){
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (int i = 0; i < cant; i++) {
                int numero = random.nextInt(101); //Para generar solo entre 0 y 100
                writer.write(Integer.toString(numero));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public T[] leer(String archivo, Function<String, T> mapper, int size){
        List<T> elementos = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                T elemento = mapper.apply(line);
                elementos.add(elemento);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        @SuppressWarnings("unchecked")
        T[] array = (T[]) Array.newInstance(elementos.get(0).getClass(), elementos.size());
        for (int i = 0; i < elementos.size(); i++) {
            array[i] = elementos.get(i);
        }
        return array;
    }


    
   
}
