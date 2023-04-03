import java.util.Scanner;

public class MasterControler {
    int Eleccion = 0;

    Scanner sc = new Scanner(System.in);
    public void Inicio(){
        System.out.println("Elija el tipo de PriorityQueue que desea: 1. VectorHeap, 2. Java Collection");
        Eleccion = sc.nextInt();
        if(Eleccion == 1){
            Contolador2 control = new Contolador2();
            control.Iniciar2();

        }
        if (Eleccion ==2){
            Controlador control = new Controlador();
            control.iniciar();
        }


    }

}
