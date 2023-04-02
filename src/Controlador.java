import java.util.*;
public class Controlador {
    ArrayList<String> copia = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    boolean loop = true;

    String RespS = "";
    Integer RespI = 0;
    String Dir = "C:\\Users\\Usuario\\Desktop\\Universidad\\Tercer Semestre\\Datos Compu\\HDT-7\\HDT8\\src\\Procesos.txt";
    PriorityQueue<Proceso> pq = new PriorityQueue<>();



    public void iniciar() {
        Reader read = new Reader();
        read.Leer(Dir);
        copia = read.lineas;
        for(int i = 0;i <= copia.size()-1;i++){
            String[] result = read.lineas.get(i).split(",");
            pq.add(new Proceso(result[0],result[1],Integer.parseInt(result[2])+100));
        }

        while (loop) {
            System.out.println("Elija la opcion que desea ejecutar: ");
            System.out.println("1. Insertar otro proceso");
            System.out.println("2. Atender el proceso con mayor prioridad");
            System.out.println("3. Ver todos los procesos en lista");
            System.out.println("4. Salir");
            RespI = sc.nextInt();
            if (RespI == 1) {

            }
            if (RespI == 2) {

            }
            if (RespI == 3) {

            }
            if (RespI == 4) {

            }
        }
    }
    
}

