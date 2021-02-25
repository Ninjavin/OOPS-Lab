public class Equipment{
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