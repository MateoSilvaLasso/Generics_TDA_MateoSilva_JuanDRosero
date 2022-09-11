package ui;
import model.*;
import java.util.Scanner;
public class Main {

    /*
    *
    * para que sea mas comodo a la hora de calificar cree la clase initModel la cual ya tiene 9 jugadores
    * y con esta puedes probar las cosas sin necesidad de añadir
    * */

    private  Scanner read;
    private  InitModel prueba;
    private  board<Player> b;
    private  board<String> c;
    private  board<Integer> d;

    public Main(){
        read= new Scanner(System.in);
        prueba= new InitModel();
        b= new board<model.Player>(prueba.players());
        c= new board<String>();
        d= new board<Integer>();
    }

    public static void main(String[] args) {

        Main op= new Main();
        int rOption= op.InitialMenu();
        int option;
        do{
            if(rOption==1){
                option= op.menu();
                op.executeOption(option);
            }
            else if(rOption==2){
                option= op.menu1();
                op.executeOption1(option);
            }
            else{
                option= op.menu2();
                op.executeOption2(option);
            }

        }while(option!=0);
    }

    public int InitialMenu(){
        System.out.println("1: work with players\n"+
                           "2: Work with Strings\n"+
                           "3: work with ints");

        int option= read.nextInt();

        return option;
    }

    public int menu1(){
        System.out.println("1: add_element\n"+
                           "2: show cardinality\n"+
                           "3: show Elements\n"+
                           "4: know if have Elements\n");

        int option= read.nextInt();

        return option;
    }

    public void executeOption1(int option){
        switch (option){
            case 1:
                registerString();
                break;
            case 2:
                System.out.println(c.Cardinality());
                break;
            case 3:
                System.out.println(c.showElements());
                break;
            case 4:
                System.out.println(c.empty());
                break;
        }
    }

    public void registerString(){
        System.out.println("Type your String");
        read.nextLine();
        String s= read.nextLine();


        c.addElement(s);
    }



    public int menu(){
        System.out.println("1: add_element\n"+
                "2: show cardinality\n"+
                "3: show Elements\n"+
                "4: know if have Elements\n");

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
                System.out.println(b.showElements());
                break;
            case 4:
                System.out.println(b.empty());
                break;
        }
    }

    public void registerPlayer(){
        System.out.println("Type your Nickname");
        read.nextLine();
        String name= read.nextLine();
        System.out.println("Type your Score");
        double score= read.nextDouble();
        System.out.println("Type your id");
        read.nextLine();
        String id= read.nextLine();
        b.addElement(new Player(name,score,id));
    }



    public int menu2(){
        System.out.println("1: add_element\n"+
                "2: show cardinality\n"+
                "3: show Elements\n"+
                "4: know if have Elements\n");

        int option= read.nextInt();

        return option;
    }

    public void executeOption2(int option){
        switch (option){
            case 1:
                registerInt();
                break;
            case 2:
                System.out.println(d.Cardinality());
                break;
            case 3:
                System.out.println(d.showElements());
                break;
            case 4:
                System.out.println(d.empty());
                break;
        }
    }

    public void registerInt(){
        System.out.println("Type your int");
        int s= read.nextInt();


        d.addElement(s);
    }



}
