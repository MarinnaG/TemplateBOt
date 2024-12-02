public class Helper {
     private String name;
     private double rating;
     
     public Helper(String name, double rating){
        this.name = name;
        this.rating = rating;
     }

     public String getName(){
        return name;
     }

     public double getRating(){
        return rating;
     }

     public void changeName(String n){
        this.name = n;
     }

     public void changeRating(double r){
        this.rating = r;
     }




}
