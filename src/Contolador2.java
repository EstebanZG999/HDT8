import java.util.*;

public class Contolador2 {
    ArrayList<String> copia = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    boolean loop = true;

    String RespS = "";
    Integer RespI = 0;
    String Dir = "src/Procesos.txt";
    VectorHeap<Proceso2> pq = new VectorHeap<>();

    /**
     * Reads the list of processes from a file, and adds them to the priority queue.
     */
    public void Iniciar2(){
        Reader read = new Reader();
        read.Leer(Dir);
        copia = read.lineas;
        for(int i = 0;i <= copia.size()-1;i++){
            String[] result = read.lineas.get(i).split(",");
            pq.add(new Proceso2(result[0],result[1],Integer.parseInt(result[2])+120));
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
                    Proceso2 proceso = pq.remove();
                    System.out.println("Nombre del Proceso: " + proceso.getNombreDeProceso()
                            + ", Nombre del Usuario: " + proceso.getNombreDeUsuario()
                            + ", Valor de Prioridad: " + proceso.getNumeroDePrioridad());

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
        pq.add(new Proceso2(NombrePro,NombreUsu,Prioridad+120));
        System.out.println("Se ha agregado correctamente el proceso");
    }

    /**
     * Prints the process, user and priority of each line of the .txt
     */
    public void Mostrar(){
        VectorHeap<Proceso2> lol = new VectorHeap<Proceso2>(pq.data);
        while (!lol.isEmpty()) {
            Proceso2 proceso = lol.remove();
            System.out.println("Nombre del Proceso: " + proceso.getNombreDeProceso()
                    + ", Nombre del Usuario: " + proceso.getNombreDeUsuario()
                    + ", Valor de Prioridad: " + proceso.getNumeroDePrioridad());
        }
        if(pq.isEmpty()){
            System.out.println("ERORR: No hay procesos que mostrar");
        }
    }

}
