import java.util.*;
public class Controlador {
    ArrayList<String> copia = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    boolean loop = true;

    String RespS = "";
    Integer RespI = 0;
    String Dir = "src/Procesos.txt";
    PriorityQueue<Proceso> pq = new PriorityQueue<>();


    /**
     * Reads the list of processes from a file, and adds them to the priority queue.
     */
    public void iniciar() {
        Reader read = new Reader();
        read.Leer(Dir);
        copia = read.lineas;
        for(int i = 0;i <= copia.size()-1;i++){
            String[] result = read.lineas.get(i).split(",");
            pq.add(new Proceso(result[0],result[1],Integer.parseInt(result[2])+120));
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

                    System.out.println("");
                    System.out.println("Se ha solucionado el proceso de manera exitosa");
                    System.out.println("");

                }
                else {
                    System.out.println("ERROR: Ya no hay procesos que atender");
                }

            }
            if (RespI == 3) {
                Mostrar();


            }
            if (RespI == 4) {
                System.out.println("Saliendo...");
                break;
            }
        }
    }
    /**
     * Adds a new process to the priority queue based on user input.
     */
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
        pq.add(new Proceso(NombrePro,NombreUsu,Prioridad+120));
        System.out.println("Se ha agregado correctamente el proceso");
    }

    /**
     * Prints the process, user and priority of each line of the .txt
     */
    public void Mostrar(){
        PriorityQueue<Proceso> lol = new PriorityQueue<Proceso>(pq);

        while (!lol.isEmpty()) {
            Proceso proceso = lol.poll();
            System.out.println("Nombre del Proceso: " + proceso.getNombreProceso()
                    + ", Nombre del Usuario: " + proceso.getNombreUsuario()
                    + ", Valor de Prioridad: " + proceso.getValorPrioridad());
        }
        if(pq.isEmpty()){
            System.out.println("ERORR: No hay procesos que mostrar");
        }



    }

}

