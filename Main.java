import java.util.Scanner;

public class Main {
  //Scanner in = new Scanner(System.in);
  //String response = in.nextLine();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Scanner in2 = new Scanner(System.in);
        //System.out.println("Hello and welcome to our pet shop. I can help you find a pet you'll love.");

        Owner[] Owners = new Owner[1];
        Owners[0] = new Owner("Unnamed", "none");
        Owners[0].changeName("Lilly");


        Helper Zoe = new Helper("Zoe", 0);
        Helper Marinna = new Helper("Marinna", 0);
        Helper Sam = new Helper("Sam", 0);

        Helper[] assistant = {Zoe, Marinna, Sam};
        double[] rating = {Zoe.getRating(), Marinna.getRating(), Sam.getRating()};

        double stars = Math.random();
        assistant[0].changeRating(stars);
        assistant[1].changeRating(stars);
        assistant[2].changeRating(stars);

        //assistant[1].tRating(stars);


        System.out.println(Owners[0].getName() + ": Hello and welcome to our pet shop. What is your name?");
        String response = in.nextLine();
        Owners[0].changeName(response);
        System.out.println(assistant[0].getName() +": Hello " + Owners[0].getName() + ", I can help you find a pet you'll love.");

        System.out.println(assistant[1].getName() + ": Do you like mammals, reptiles, or fish better?");
        response = in.nextLine();
// while(response!=""){
      while(!response.toLowerCase().contains("goodbye")){
        if(lowerCase(response).contains("mammal")){
          System.out.println("Many mammals make great pets! Are you thinking of a small, large, or medium mammal?");
          response = in.nextLine();
          if(lowerCase(response).contains("small")){
            System.out.println("There are many great small mammals that you can keep as pets. There are small dogs, rodents, and cats");
            response = in.nextLine();
            small(response);
          }
          else if(lowerCase(response).contains("medium")){
            System.out.println("There are many great medium mammals that you can keep as pets. There are medium dogs, medium rodents, and medium livestock ");
            response = in.nextLine();
            medium(response);
          }
          else if(lowerCase(response).contains("large")){
            System.out.println("There are many great large mammals that you can keep as pets. These are livestock, large dogs, and large cats");
            response = in.nextLine();
            large(response);
          }
          else{
            while(!lowerCase(response).contains("large")|| !lowerCase(response).contains("small")|| !lowerCase(response).contains("medium")){ 
            System.out.println("I'm sorry. Could your please repeat. Are you thinking of getting a small, large, or medium mammal?");
            response = in.nextLine();
          }
        }
          break; // i don't know about this
        
        }
        else if(lowerCase(response).contains("reptile")){
            System.out.println("Reptiles make great pets! They are a little harder than some other pets though, have you ever had a reptile before?");
            response = in.nextLine();
            if(YN(response)){
                System.out.println("That's great! Were you thinking about a little or big reptile for your next companion?");
                response = in.nextLine();
                Size(response);
                /*if(lowerCase(response).contains("little")|| lowerCase(response).contains("small")){
                  System.out.println("There are many great small reptiles that you can keep as pets. Some more advanced small reptiles are Chameleons, Chahoua Geckos, Tokay Geckos, and more.");
                  //response = in.nextLine();
                }
                else if(lowerCase(response).contains("big")){
                  System.out.println("There are many great large reptiles that you can keep as pets. Some more advanced large reptiles are Ball Pythons, Iguanas, Nile Monitors, Burmese Pythons, and many more.");
                  ///response = in.nextLine();
                }
                else{
                  while(!lowerCase(response).contains("big")||!lowerCase(response).contains("small")){
                    System.out.println("That's ok, did you want a large or small reptile?");
                    response = in.nextLine();
                  }
                }*/
            }
            else if(!YN(response)){
                System.out.println("Thats okay! Were you thinking about a little or big reptile for your next companion?");
                response = in.nextLine();
                Random(response);
            }
                /*if(lowerCase(response).contains("small")||lowerCase(response).contains("little")){
                  System.out.println("There are many great small reptiles that you can keep as pets. Some beginner reptiles are...");
                }
            }*/
            else{
                System.out.println("");
            }

            break;
          }
        
        else if(lowerCase(response).contains("fish")){
            System.out.println("Many fish make great pets! Are you thinking of a multicolored, monocolored, or tricolored fish?");
            response = in.nextLine();
            if(lowerCase(response).contains("multicolored")){
              System.out.println("There are many great multicolred fish that you can keep as pets. Would your prefer a larger or small fish");
              response = in.nextLine();
              multicolored(response);
            }
            else if(lowerCase(response).contains("tricolored")){
              System.out.println("There are many great tricolored fish that you can keep as pets. Would your prefer a larger or a smaller fish");
              response = in.nextLine();
              tricolored(response);
            }
            else if(lowerCase(response).contains("monocolored")){
              System.out.println("There are many great monocolored fish that you can keep as pets. Would you prefer a larger or smaller fish");
              response = in.nextLine();
              monocolored(response);
            }
            else{
            while(!lowerCase(response).contains("monocolored")|| !lowerCase(response).contains("multicolored")|| !lowerCase(response).contains("tricolored")){ 
              { 
              System.out.println("I'm sorry. Could your please repeat. Are you thinking of getting a monocolored, tricolored, or multicolored fish?");
              response = in.nextLine();
            }
            response = in.nextLine();
          }
           break;
          }
        }
        else{
       while(!lowerCase(response).contains("reptile")|| !lowerCase(response).contains("mammal")|| !lowerCase(response).contains("fish")){ 
      {
      
        System.out.println("Do your prefer mammals, reptiles, or fish?");
      }
      
    }
     break;
      }
    
      System.out.println("");
      System.out.println("Great Job! Would you like to continue or end session. To end session type goodbye.");
      response = in.nextLine();
      if(response.equals("goodbye")){
        System.out.println("goodbye! Hope I helped you. Have a great day!");
        break;
      }
      else{
        System.out.println("welcome back!");
          //System.out.println("");
      }
      //in.close();
    }
  }
  
  
    
   // while (response.toLowerCase().contains("goodbye"));
    //  response = in.nextLine();
     // System.out.println("Goodbye");
  
  
    
       
    
    
  //while (!response.toLowerCase().contains("goodbye")){
   // }
     public static void large(String resp){ //finished 
      if(lowerCase(resp).contains("dog")){
        System.out.println("Large dogs make great pets! Some great breeds to choose from include great dane, english mastiff, st. Bernard, irish wolfhounds, and leonbergers.");
      }
      else if(lowerCase(resp).contains("cat")){
        System.out.println("Cats are great pets! Some good options might be maine coons, lynx, savannah cat, himalayan cat, bengal cat, and siberian cat.");
      }
      else if(lowerCase(resp).contains("livestock")){
       System.out.println("Livestock make great large pets! Some great options include horses, cows, camels, ox, and donkeys. ");
       
      }
      else{
        while(!lowerCase(resp).contains("livestock")|| !lowerCase(resp).contains("cat")|| !lowerCase(resp).contains("dog")){ 
        {
        System.out.println("I'm sorry I dont understand");
        }
      }
    }
    }
public static void Size(String resp){
  if(lowerCase(resp).contains("small")||lowerCase(resp).contains("tiny")||lowerCase(resp).contains("little")){
    System.out.println("There are many great small reptiles that you can keep as pets. Some more advanced small reptiles are Chameleons, Chahoua Geckos, Tokay Geckos, and more.");
  }
  else if(lowerCase(resp).contains("big")){
    System.out.println("There are many great large reptiles that you can keep as pets. Some more advanced large reptiles are Ball Pythons, Iguanas, Nile Monitors, Burmese Pythons, and many more.");
  }
  else{
    while(!lowerCase(resp).contains("small")){ 
      System.out.println("I'm sorry, I don't understand.");
    
  }}
}
public static void Random(String resp){
  if(lowerCase(resp).contains("small")||lowerCase(resp).contains("little")){
    System.out.println("There are many great small reptiles that you can keep as pets. Some beginner reptiles are corn snake, anole, and gecko");
  }
  else if(lowerCase(resp).contains("big")||lowerCase(resp).contains("large")){
    System.out.println("There are many great large reptiles that you can keep as pets. Some beginner reptiles are bearded dragon, lepard gecko, and russian tortoise");
  }
  else{
    while(!lowerCase(resp).contains("small")){ 
      System.out.println("I'm sorry, I don't understand.");
    
  }
}
}



    
    public static void medium(String resp){ // Finished
      if(lowerCase(resp).contains("dog")){
        System.out.println("Dogs make great pets! Some good medium dogs are basset hounds, bulldogs, australian cattle dogs, and beagles.");
      }
      else if(lowerCase(resp).contains("rodents")){
        System.out.println("Rodents are great medium pets! There are many different kinds of rodents such as beavers, groundhogs, capybaras, porcupines, dasyproctidaes, and more." );
      }
      else if(lowerCase(resp).contains("livestock")){
        System.out.println("Livestock are great pets! Some good medium livestock include lamas, mules, pigs,  lambs, alpacas, goats, and minuature horse.");
      }
      else{
      while(!lowerCase(resp).contains("livestock")|| !lowerCase(resp).contains("dog")|| !lowerCase(resp).contains("rodent")){ 
        {
        System.out.println("I'm sorry I dont understand");
      }
    }
    }
    }
    public static void small(String resp){ //finshed 
      if(lowerCase(resp).contains("dog")){
        System.out.println("Dogs make great pets! Some good small dogs are chiwawas, pomaranians, mini poodles, and pugs.");
      }
      else if(lowerCase(resp).contains("rodent")){
        System.out.println("Rodents are great small pets! There are many different kinds of rodents such as hamsters, rats, mice, chinchillas, guinea pigs, and more." );
      }
      else if(lowerCase(resp).contains("cat")){
        System.out.println("Cats make a great pets! There are many different breeds of cat such as saimese, somail, munchkin, korat, and more.");
      }
      else{
      while(!lowerCase(resp).contains("cat")|| !lowerCase(resp).contains("rodent")|| !lowerCase(resp).contains("dog")){ 
        {
        System.out.println("I'm sorry I don't understand.");
      }
    }
    }
    }
    
    public static void multicolored(String resp){ // Finished
      if(lowerCase(resp).contains("small")){
        System.out.println("Small fish make great pets! Some good small multicolored are betta fish, guppies, neon tetra's, and boesmans rainbowfish. ");
      }
      else if(lowerCase(resp).contains("large")){
        System.out.println("Large fish are great pets! There are many different kinds of multicolored large fish, such as clownfish, mandarinefish, anglefish, and lionfish." );
      }
      else{
      while(!lowerCase(resp).contains("large")|| !lowerCase(resp).contains("small")){ 
        {
        System.out.println("I'm sorry I dont understand");
      }
    }
  }
    }
    public static void tricolored(String resp){ // Finished
    Scanner inTri = new Scanner(System.in);
      if(lowerCase(resp).contains("small")){
        System.out.println("Small fish make great pets! Some good small tricolored are zebra fish, endler's liverbearer, harlequin rasbora, and cherry barb's.");
      }
      else if(lowerCase(resp).contains("large")){
        System.out.println("Large fish are great pets! There are many different kinds of tricolored large fish, such as swordtail, koi fish, clown triggerfish, and blue tang. " );
      }
      else{
      while(!lowerCase(resp).contains("large")|| !lowerCase(resp).contains("small")){ 
        System.out.println("I'm sorry I dont understand");
        resp = inTri.nextLine();
        System.out.println(resp);
      }
    }
    }
    
    public static void monocolored(String resp){ // Finished
      if(lowerCase(resp).contains("small")){
        System.out.println("Small fish make great pets! Some good small monocolored are neon tetra, guppy's, betta fish, and goldfish.");
      }
      else if(lowerCase(resp).contains("large")){
        System.out.println("Large fish are great pets! There are many different kinds of monocolored large fish, such as yellowtail's, black marlin, bluegill, and red drum." );
      }
      else{
      while(!lowerCase(resp).contains("large")|| !lowerCase(resp).contains("small")){ 
        {
        System.out.println(" I'm sorry I dont understand");
      }
    }
  }
}
    //public static void monocolored(String response){
  
    //}
  
    public static String lowerCase(String u){
      String lower = u.toLowerCase();
      return lower;
    }
   
   
    public static boolean YN(String resp){
      String resp1 = resp.toLowerCase();
      if(resp1.contains("yes")){
        return true;
      }
      else if(resp1.contains("no")){
        return false;
      }
      else{
        return false;
      }
    }
 

  }


