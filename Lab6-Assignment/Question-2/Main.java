import java.util.*;

public class Main {
    public static void main(String[] args){
        boolean quit = false;
        CSEStudent arif = new CSEStudent("Arif");
        while(!quit){
            System.out.println("1. Student Get together\n2. Closed-door Hacker Society\n3. Birthday party.");
            System.out.println("Enter choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice){
                case 1:{
                    Student st = new Student(arif.getName());
                    st.introduce();                    
                }break;
                case 2:{
                    arif.introduce();                    
                }break;
                case 3:{
                    Person p = new Person(arif.getName());
                    p.introduce();                    
                }break;
                default:
                    quit = true;             
                break;
            }            
        }
    }    
}