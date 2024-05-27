import java.util.ArrayList;
public class Visita {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {

            numeros.add(Integer.parseInt(args[i]));

        }
       int prom = promedio(numeros);
        System.out.println("Promedio "+prom);

    }

    public static int promedio(ArrayList<Integer> visitasDiarias)
    {
        int suma = 0;//neutro aditivo
        int promedio;
        for(int elemento:visitasDiarias)
        {
            suma= suma+elemento;


        }
        promedio = suma/visitasDiarias.size();
        return  promedio;
    }
}
