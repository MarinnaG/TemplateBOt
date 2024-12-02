public class Owner{
    private String name;
    private String recPet;

    public Owner(String name, String recPet){
        this.name = name;
        this.recPet = recPet;
    }

    public String getName(){
        return name;
    }

    public String getrecPet(){
        return recPet;
    }

    public void changeName(String n){
        this.name = n;
    }
}