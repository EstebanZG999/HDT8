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
                Insertar();
            }
            if (RespI == 2) {
                if(!pq.isEmpty()){
                    Proceso proceso = pq.poll();
                    System.out.println("Nombre del Proceso: " + proceso.getNombreProceso()
                            + ", Nombre del Usuario: " + proceso.getNombreUsuario()
                            + ", Valor de Prioridad: " + proceso.getValorPrioridad());
                }
                if()



            }
            if (RespI == 3) {
                while (!pq.isEmpty()) {
                    Proceso proceso = pq.poll();
                    System.out.println("Nombre del Proceso: " + proceso.getNombreProceso()
                            + ", Nombre del Usuario: " + proceso.getNombreUsuario()
                            + ", Valor de Prioridad: " + proceso.getValorPrioridad());
                }

            }
            if (RespI == 4) {
                System.out.println("Saliendo...");
                break;
            }
        }
    }
    public void Insertar(){
        String NombrePro = "";
        String NombreUsu = "";
        int Prioridad = 0;
        System.out.println("Ingrese el nombre del proceso: ");
        sc.nextLine();
        NombrePro = sc.nextLine();
        System.out.println("Ingrese el nombre del usuario del proceso ");
        NombreUsu = sc.nextLine();
        System.out.println("Ingrese el numero de prioridad (0 - 39) :");
        Prioridad = sc.nextInt();
        pq.add(new Proceso(NombrePro,NombreUsu,Prioridad+100));
        System.out.println("Se ha agregado correctamente el proceso");
    }

}

