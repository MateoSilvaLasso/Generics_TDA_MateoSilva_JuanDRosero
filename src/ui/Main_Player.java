package ui;
import model.*;
import java.util.Scanner;
public class Main_Player {

    /*
    * cabe aclarar que como bien hemos visto las clases genericas nos ayuda para implementaciones que se puede repetir
    * pero para ejecutarlo necesitamos un metodo main, asi que creamos este el cual llamamos Main_Player porque
    * en este caso lo haremos de players, pero como bien sabemos debido a que la clase es generica lo podemos modelar
    * hasta con clases primitivas, claro esta utilizando sus debidos wrappers
    *
    * para que sea mas comodo a la hora de calificar cree la clase initModel la cual ya tiene 9 jugadores
    * y con esta puedes probar las cosas sin necesidad de añadir
    * */

    private  Scanner read;
    private  InitModel prueba;
    private  board<Player> b;

    public Main_Player(){
        read= new Scanner(System.in);
        prueba= new InitModel();
        b= new board<model.Player>(prueba.players());
    }

    public static void main(String[] args) {

        Main_Player op= new Main_Player();
        int option;
        do{
            option= op.menu();
            op.executeOption(option);
        }while(option!=0);
    }

    public int menu(){
        System.out.println("1: add_element\n"+
                           "2: show cardinality\n"+
                           "3: Delete Element\n"+
                           "4: search Element\n");

        int option= read.nextInt();

        return option;
    }

    public void executeOption(int option){
        switch (option){
            case 1:
                registerPlayer();
                break;
            case 2:
                System.out.println(b.Cardinality());
                break;
            case 3:
                deletePlayer();
                break;
            case 4:
                break;
        }
    }

    public void registerPlayer(){
        System.out.println("Type your Nickname");
        String name= read.nextLine();
        System.out.println("Type your Score");
        double score= read.nextDouble();
        System.out.println("Type your id");
        String id= read.nextLine();
        b.addElement(new Player(name,score,id));
    }

    public void deletePlayer(){
        System.out.println("Type the Nickname");
        String name= read.nextLine();
        System.out.println("Type the Score");
        double score= read.nextDouble();
        System.out.println("Type the id");
        String id= read.nextLine();
        b.deleteElement(new Player(name,score,id));
    }

    public void search(){
        System.out.println("Type the Nickname");
        String name= read.nextLine();
        System.out.println("Type the Score");
        double score= read.nextDouble();
        System.out.println("Type the id");
        String id= read.nextLine();
        System.out.println(b.search(new Player(name,score,id))==null? b.search(new Player(name,score,id)).getNickName(): "No existe");
    }


}
