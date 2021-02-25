import java.util.*; 

public class IFCSManager{
    
    private Equipment[] equipments;
    private int length;

    public IFCSManager(){
        equipments = new Equipment[10];
        length = 0;
    }

    void addEquipment(Equipment eqp){
        
        if(eqp.id == null)
            System.out.println("Error - id cannot be null");
        if(eqp.description == null){
            System.out.println("Error - description cannot be null");
        }
        if(length + 1 < 11){
            equipments[length] = eqp;
            length++;
            System.out.println("Equipment added to Lab");
        }
    }

    void removeEquipment(String id){
        for(int i=0 ; i<length ; i++){
            if(equipments[i].id == id){
                // Remove It

            }
        }
    }

    void report(String id){
        if(id == null){
            System.out.println("Error - id cannot be null");
            return;
        }
        int i;
        for(i=0 ; i<length ; i++){
            if(equipments[i].id == id){
                System.out.println("Equipment available in Lab");
                return;
            }
        }
        if(i==length){
            System.out.println("Equipment not in Lab");
            return;
        }
    }

    void display(){
        for(int i=0 ; i<length ; i++){
            System.out.println("id=" + equipments[i].id + ", desc=" + equipments[i].description);
        }
    }

    public static void main(String args[]){

        int x = 0;
        Scanner sc = new Scanner(System.in);
        
        IFCSManager myManager = new IFCSManager();

        while(x==0){
            System.out.println("++++++++++MENU++++++++++");
            System.out.println("1. Add Equipment");
            System.out.println("2. Delete Equipment");
            System.out.println("3. Find Equipment");
            System.out.println("4. Display Equipments");
            System.out.println("5. Exit");
    
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
    
            switch(choice){
                case 1 : System.out.println("Enter Id : ");
                String id = sc.next();
                System.out.println("Enter Description : ");
                String description = sc.next();
                myManager.addEquipment(new Equipment(id, description));
                break;
    
                case 2 : System.out.println("Delete Under Process"); break;
    
                case 3 : System.out.println("Enter Id : ");
                String id2 = sc.next();
                myManager.report(id2);
                break;
    
                case 4 : System.out.println("Displaying");
                myManager.display();
                break;

                case 5 : System.out.println("Exit");
                x = 1;
                break;
    
                default : System.out.println("Invalid Choice");
            }
            
        }

        
    }

}

class Equipment{
    String id;
    String description;

    Equipment(String i, String d){
        id = i;
        description = d;
    }

    String getId(){
        return id;
    }

    String getDescription(){
        return description;
    }
}