/*import java.util.Scanner;
 
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
/*  while(response!=""){
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
                }
            }
            else if(!YN(response)){
                System.out.println("Thats okay! Were you thinking about a little or big reptile for your next companion?");
                response = in.nextLine();
                Random(response);
            }
                /*if(lowerCase(response).contains("small")||lowerCase(response).contains("little")){
                  System.out.println("There are many great small reptiles that you can keep as pets. Some beginner reptiles are...");
                }
            }
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
      
        System.out.println("Do your like mammals, reptiles, or fish?");
        response = in.nextLine();
      }
      //break;
      
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
*/ 
/*import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
       
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
   
    System.out.println(Owners[0].getName() + ": Hello and welcome to our pet shop. What is your name?");
    String response = in.nextLine();
    Owners[0].changeName(response);
    System.out.println(assistant[0].getName() +": Hello " + Owners[0].getName() + ", I can help you find a pet you'll love.");
     
     
   
    while(!lowerCase(response).contains("goodbye")){
      System.out.println(assistant[1].getName() + ": Do you like mammals, reptiles, or fish better?");
      response = in.nextLine();
      boolean stop = true;
      while(stop){
        if(lowerCase(response).contains("reptile")){
          reptile(response);
          stop = false;
        }
        else if(lowerCase(response).contains("fish")){
          fish(response);
          stop = false;
        }
        else if(lowerCase(response).contains("mammal")){
          mammal(response);
          stop = false;
        }
        else{
          System.out.println("I'm sorry I don't understand");
          response = in.nextLine();
        }
      }
      System.out.println("");
      System.out.println("Do you want to leave or talk about a different pet now? Say anything to continue and goodbye to quit");
      response = in.nextLine();
    }
    System.out.println("I hope I helped you find the pet of your dreams, have a nice day");
  }
 
  public static void reptile(String resp){
    Scanner inReptile = new Scanner(System.in);
    boolean reptilez = true;
    boolean reptiley = true;
    String response = resp;
    System.out.println("Reptiles make great pets! They are a little harder than some other pets though, have you ever had a reptile before?");
    response = inReptile.nextLine();
   
    while(reptilez){
      if(lowerCase(response).contains("ye")){
        System.out.println("That's great! Were you thinking about a little or big reptile for your next companion?");
        response = inReptile.nextLine();
        Size(response);
        reptilez = false;
      }
     
      else if(lowerCase(response).contains("no")){
        System.out.println("Thats okay! Were you thinking about a little or big reptile for your next companion?");
        response = inReptile.nextLine();
        Random(response);
        reptilez = false;
        }
               
      else{
        while(reptiley){
          System.out.println("I'm sorry I don't understand.");
          response = inReptile.nextLine();
          if(lowerCase(response).contains("no")||lowerCase(response).contains("ye")){
            reptiley = false;
          }
        }
      }
    }
  }
 
 
  public static void fish(String resp){
    Scanner inFish = new Scanner(System.in);
    boolean fishz = true;
    boolean fishy = true;
    String response = resp;
    System.out.println("Many fish make great pets! Are you thinking of a multicolored, monocolored, or tricolored fish?");
    response = inFish.nextLine();
    while(fishz){
      if(lowerCase(response).contains("multi")){
        System.out.println("There are many great multicolred fish that you can keep as pets. Would your prefer a larger or small fish");
        response = inFish.nextLine();
        multicolored(response);
        fishz = false;
      }
      else if(lowerCase(response).contains("tri")){
        System.out.println("There are many great tricolored fish that you can keep as pets. Would your prefer a larger or a smaller fish");
        response = inFish.nextLine();
        tricolored(response);
        fishz = false;
      }
      else if(lowerCase(response).contains("mono")){
        System.out.println("There are many great monocolored fish that you can keep as pets. Would you prefer a larger or smaller fish");
        response = inFish.nextLine();
        monocolored(response);
        fishz = false;
      }
      else{
        while(fishy){
          System.out.println("I'm sorry. Could your please repeat. Are you thinking of getting a monocolored, tricolored, or multicolored fish?");
          response = inFish.nextLine();
          if(lowerCase(response).contains("mono")|| lowerCase(response).contains("multi")|| lowerCase(response).contains("tri")){
            fishy = false;
          }
        }
      }
    }
  }
 
 
  public static void mammal(String resp){
    Scanner inMammal = new Scanner(System.in);
    boolean mammalz = true;
    boolean mammaly = true;
    String response = resp;
    System.out.println("Many mammals make great pets! Are you thinking of a small, large, or medium mammal?");
    response = inMammal.nextLine();
    while(mammalz){
       if(lowerCase(response).contains("small")){
        System.out.println("There are many great small mammals that you can keep as pets. There are small dogs, rodents, and cats");
        response = inMammal.nextLine();
        small(response);
        mammalz = false;
      }
      else if(lowerCase(response).contains("medium")){
        System.out.println("There are many great medium mammals that you can keep as pets. There are medium dogs, medium rodents, and medium livestock. What would you like to learn more about?");
        response = inMammal.nextLine();
        medium(response);
        mammalz = false;
      }
      else if(lowerCase(response).contains("large")){
        System.out.println("There are many great large mammals that you can keep as pets. These are livestock, large dogs, and large cats");
        response = inMammal.nextLine();
        large(response);
        mammalz = false;
      }
      else{
        while(mammaly){
          System.out.println("I'm sorry. Could your please repeat. Are you thinking of getting a small, large, or medium mammal?");
          response = inMammal.nextLine();
          if(!lowerCase(response).contains("large")|| !lowerCase(response).contains("small")|| !lowerCase(response).contains("medium")){
            mammaly = false;
          }
        }
      }
    }
  }
 
 
  public static void monocolored(String resp){
    Scanner inMonocolored = new Scanner(System.in);
    boolean monoz = true;
    boolean monoy = true;
    while(monoz){
      if(lowerCase(resp).contains("small")){
        System.out.println("Small fish make great pets! Some good small monocolored are neon tetra, guppy's, betta fish, and goldfish.");
        monoz = false;
      }
      else if(lowerCase(resp).contains("large")){
        System.out.println("Large fish are great pets! There are many different kinds of monocolored large fish, such as yellowtail's, black marlin, bluegill, and red drum." );
        monoz = false;
      }
      else{
        while(monoy){
          System.out.println(" I'm sorry I dont understand");
          resp = inMonocolored.nextLine();
          if(lowerCase(resp).contains("large")|| lowerCase(resp).contains("small")){
            monoy = false;
          }
        }
      }
    }
  }
 
 
  public static void tricolored(String resp){
    Scanner inTricolored = new Scanner(System.in);
    boolean triz = true;
    boolean triy = true;
    while(triz){
      if(lowerCase(resp).contains("small")){
        System.out.println("Small fish make great pets! Some good small tricolored are zebra fish, endler's liverbearer, harlequin rasbora, and cherry barb's.");
        triz = false;
      }
      else if(lowerCase(resp).contains("large")){
        System.out.println("Large fish are great pets! There are many different kinds of tricolored large fish, such as swordtail, koi fish, clown triggerfish, and blue tang. " );
        triz = false;
      }
      else{
        while(triy){
          System.out.println("I'm sorry I dont understand");
          resp = inTricolored.nextLine();
          if(lowerCase(resp).contains("large")|| lowerCase(resp).contains("small")){
            triy = false;
          }
        }
      }
    }
  }
 
 
  public static void multicolored(String resp){
    Scanner inMulticolored = new Scanner(System.in);
    boolean multiz = true;
    boolean multiy = true;
    while(multiz){
      if(lowerCase(resp).contains("small")){
       System.out.println("Small fish make great pets! Some good small multicolored are betta fish, guppies, neon tetra's, and boesmans rainbowfish. ");
       multiz = false;
      }
      else if(lowerCase(resp).contains("large")){
        System.out.println("Large fish are great pets! There are many different kinds of multicolored large fish, such as clownfish, mandarinefish, anglefish, and lionfish." );
        multiz = false;
      }
      else{
        while(multiy){
          System.out.println("I'm sorry I dont understand");
          resp = inMulticolored.nextLine();
          if(lowerCase(resp).contains("large")|| lowerCase(resp).contains("small")){
            multiy = false;
          }
        }
      }
    }
  }
 
 
  public static void medium(String resp){
    Scanner inMedium = new Scanner(System.in);
    boolean mediumz = true;
    boolean mediumy = true;
    while(mediumz){
      if(lowerCase(resp).contains("dog")){
      System.out.println("Dogs make great pets! Some good medium dogs are basset hounds, bulldogs, australian cattle dogs, and beagles.");
      mediumz = false;
      }
      else if(lowerCase(resp).contains("rodent")){
        System.out.println("Rodents are great medium pets! There are many different kinds of rodents such as beavers, groundhogs, capybaras, porcupines, dasyproctidaes, and more." );
        mediumz = false;
      }
      else if(lowerCase(resp).contains("livestock")){
        System.out.println("Livestock are great pets! Some good medium livestock include lamas, mules, pigs,  lambs, alpacas, goats, and minuature horse.");
        mediumz = false;
      }
      else{
        while(mediumy){
          System.out.println("I'm sorry I dont understand");
          resp = inMedium.nextLine();
          if(lowerCase(resp).contains("livestock")|| lowerCase(resp).contains("dog")|| lowerCase(resp).contains("rodent")){
            mediumy = false;
          }
        }
      }
    }
  }
 
 
  public static void Random(String resp){
    Scanner inRandom = new Scanner(System.in);
    boolean randomz = true;
    boolean randomy = true;
    String response = resp;
    while(randomz){
      if(lowerCase(response).contains("small")||lowerCase(resp).contains("little")){
      System.out.println("There are many great small reptiles that you can keep as pets. Some beginner reptiles are corn snake, anole, and gecko");
      randomz = false;
      }
      else if(lowerCase(response).contains("big")||lowerCase(resp).contains("large")){
        System.out.println("There are many great large reptiles that you can keep as pets. Some beginner reptiles are bearded dragon, lepard gecko, and russian tortoise");
        randomz = false;
      }
      else{
        while(randomy){
          System.out.println("I'm sorry, I don't understand.");
          response = inRandom.nextLine();
          if(lowerCase(response).contains("big")||lowerCase(response).contains("small")){
            randomy = false;
          }
        }
      }
    }
   
  }
 
 
  public static void Size(String resp){
    Scanner inSize = new Scanner(System.in);
    boolean sizez = true;
    boolean sizey = true;
    String response = resp;
    while(sizez){
      if(lowerCase(response).contains("small")||lowerCase(response).contains("tiny")||lowerCase(response).contains("little")){
      System.out.println("There are many great small reptiles that you can keep as pets. Some more advanced small reptiles are Chameleons, Chahoua Geckos, Tokay Geckos, and more.");
      sizez = false;
      }
      else if(lowerCase(response).contains("big")){
        System.out.println("There are many great large reptiles that you can keep as pets. Some more advanced large reptiles are Ball Pythons, Iguanas, Nile Monitors, Burmese Pythons, and many more.");
        sizez = false;
      }
      else{
        System.out.println("I'm sorry, I don't understand.");
        response = inSize.nextLine();
      }
    }
  }
 
 
  public static void large(String resp){  
    Scanner inLarge = new Scanner(System.in);
    boolean largez = true;
    boolean largey = true;
    while(largez){
      if(lowerCase(resp).contains("dog")){
        System.out.println("Large dogs make great pets! Some great breeds to choose from include great dane, english mastiff, st. Bernard, irish wolfhounds, and leonbergers.");
        largez = false;
      }
      else if(lowerCase(resp).contains("cat")){
        System.out.println("Cats are great pets! Some good options might be maine coons, lynx, savannah cat, himalayan cat, bengal cat, and siberian cat.");
        largez = false;
      }
      else if(lowerCase(resp).contains("livestock")){
        System.out.println("Livestock make great large pets! Some great options include horses, cows, camels, ox, and donkeys. ");
        largez = false;
      }
      else{
        while(largey){
          System.out.println("I'm sorry I dont understand");
          resp = inLarge.nextLine();
          if(!lowerCase(resp).contains("livestock")|| !lowerCase(resp).contains("cat")|| !lowerCase(resp).contains("dog")){
            largey= false;
          }
        }
      }
    }
  }
 
 
  public static void small(String resp){  
    Scanner inSmall = new Scanner(System.in);
    boolean smallz = true;
    boolean smally = true;
    while(smallz){
      if(lowerCase(resp).contains("dog")){
        System.out.println("Dogs make great pets! Some good small dogs are chiwawas, pomaranians, mini poodles, and pugs.");
        smallz = false;
      }
      else if(lowerCase(resp).contains("rodent")){
        System.out.println("Rodents are great small pets! There are many different kinds of rodents such as hamsters, rats, mice, chinchillas, guinea pigs, and more." );
        smallz = false;
      }
      else if(lowerCase(resp).contains("cat")){
        System.out.println("Cats make a great pets! There are many different breeds of cat such as saimese, somail, munchkin, korat, and more.");
        smallz = false;
      }
      else{
        while(smally){
          System.out.println("I'm sorry I don't understand.");
          resp = inSmall.nextLine();
          if(!lowerCase(resp).contains("cat")|| !lowerCase(resp).contains("rodent")|| !lowerCase(resp).contains("dog")){
            smally = false;
          }
        }
      }
    }
  }
 
 
  public static String lowerCase(String u){
      String lower = u.toLowerCase();
      return lower;
  }
} */
/* 
String r = "reptile";
        String f = "fish";
        String m = "mammal";
        Bbolean duck = true;

        if(lowerCase(response).contains(r) && lowerCase(response).contains(f)||lowerCase(response).contains(r) && lowerCase(response).contains(m)||lowerCase(response).contains(f) && lowerCase(response).contains(m)){
            System.out.println("I'm sorry, please choose just one answer.");
            response = in.nextLine();
        }
        else if(lowerCase(response).contains(r)){
          reptile(response);
          stop = false;
        }
        else if(lowerCase(response).contains(f)){
          fish(response);
          stop = false;
        }
        else if(lowerCase(response).contains(m)){
          mammal(response);
          stop = false;
        }
        else{
          System.out.println("I'm sorry I don't understand");
          response = in.nextLine();
        }
      }
      System.out.println("");
      System.out.println("Do you want to leave or talk about a different pet now? Say anything to continue and goodbye to quit");
      response = in.nextLine();
    }
      System.out.println("Would you like to rate our employees?");
      response = in.nextLine();
      double rate=0;
      boolean rateuntil = true;
      String yeet = "ye";
      String noot = "no";
      if(lowerCase(response).contains(yeet) && lowerCase(response).contains(noot)){
        System.out.println("I'm sorry, please choose just one answer.");
        response = in.nextLine();
      }
      else if(lowerCase(response).contains("yes")){
        System.out.println("Out of 5 stars how would you rate our services?");
        response = in.nextLine();
        boolean ratewhile = true;
        while(ratewhile){
          boolean idk = true;
          if(lowerCase(response).contains("0")){
            rate = 0.0;
            System.out.println("I'm sorry I was not helpful.");
            ratewhile = false;
          }
          else if(lowerCase(response).contains("1")){
            rate = 1.0;
            System.out.println("I'm sorry I couldn't be of more help.");
            ratewhile = false;
          }
          else if(lowerCase(response).contains("2")){
            rate = 2.0;
            System.out.println("I'm sorry I could not be of more help.");
            ratewhile = false;
          }
          else if(lowerCase(response).contains("3")){
            rate = 3.0;
            System.out.println("I hope I was helpful.");
            ratewhile = false;
          }
          else if(lowerCase(response).contains("4")){
            rate = 4;
            System.out.println("I'm glad I was helpful.");
            ratewhile = false;
          }
          else if(lowerCase(response).contains("5")){
            rate = 5;
            System.out.print("I am glad that I was helpful to your search for the perfect pet!");
            ratewhile = false;
          }
          else{
            while(idk){
              System.out.println("I'm sorry I don't understand. Please choose a number from 0 to 5");
              response = in.nextLine();
              if(lowerCase(response).contains("0")||lowerCase(response).contains("1")||lowerCase(response).contains("2")||lowerCase(response).contains("3")||lowerCase(response).contains("4")||lowerCase(response).contains("5")){
                idk = false;
              }
            }
          }
        }
        for(int x=0; x < assistant.length; x++){
          assistant[x].changeRating(rate);
        }
        System.out.println("Have a nice day!");
      }
      else if(lowerCase(response).contains("no")){
        System.out.println("I hope I helped you find the pet of your dreams, have a nice day.");
      }
      else{
        while(rateuntil){
          System.out.println("I'm sorry I don't understand. Did you want to rate our services? yes/no");
          response = in.nextLine();
          if(lowerCase(response).contains("ye")||lowerCase(response).contains("no")){
            rateuntil = false;
          }
        }
      }
    }
 

 
  public static void reptile(String resp){
    Scanner inReptile = new Scanner(System.in);
    boolean reptilez = true;
    boolean reptiley = true;
    String response = resp;
    String yeet = "ye";
    String noot = "no";
    System.out.println("Reptiles make great pets! They are a little harder than some other pets though, have you ever had a reptile before?");
    response = inReptile.nextLine();
   
    while(reptilez){
      if(lowerCase(response).contains(yeet) && lowerCase(response).contains(noot)){
        System.out.println("I'm sorry, please choose just one answer.");
        response = inReptile.nextLine();
      }
      else if(lowerCase(response).contains("ye")){
        System.out.println("That's great! Were you thinking about a little or big reptile for your next companion?");
        response = inReptile.nextLine();
        Size(response);
        reptilez = false;
      }
     
      else if(lowerCase(response).contains("no")){
        System.out.println("Thats okay! Were you thinking about a little or big reptile for your next companion?");
        response = inReptile.nextLine();
        Random(response);
        reptilez = false;
        }
               
      else{
        while(reptiley){
          System.out.println("I'm sorry I don't understand.");
          response = inReptile.nextLine();
          if(lowerCase(response).contains("no")||lowerCase(response).contains("ye")){
            reptiley = false;
          }
        }
      }
    }
  }
 
 
  public static void fish(String resp){
    Scanner inFish = new Scanner(System.in);
    boolean fishz = true;
    boolean fishy = true;
    String response = resp;
    String mu = "multi";
    String t = "tri";
    String mo = "mono";
    System.out.println("Many fish make great pets! Are you thinking of a multicolored, monocolored, or tricolored fish?");
    response = inFish.nextLine();
    while(fishz){
      String check = lowerCase(response);
      if(check.contains(mu) && check.contains(t)||check.contains(mu) && check.contains(mo)||check.contains(t) && check.contains(mo)){
        System.out.println("I'm sorry, please choose just one answer.");
        response = inFish.nextLine();
      }
      else if(lowerCase(response).contains("multi")){
    String s = "small";
    String m = "medium";
    String l = "large";
    System.out.println("Many mammals make great pets! Are you thinking of a small, large, or medium mammal?");
    response = inMammal.nextLine();
    while(mammalz){
      String check = lowerCase(response);
      if(check.contains(s) && check.contains(m)||check.contains(s) && check.contains(l)||check.contains(m) && check.contains(l)){
        System.out.println("I'm sorry, please choose just one answer.");
        response = inMammal.nextLine();
      }
       else if(lowerCase(response).contains("small")){
        System.out.println("There are many great small mammals that you can keep as pets. There are small dogs, rodents, and cats");
        response = inMammal.nextLine();
        small(response);
        mammalz = false;
      }
      else if(lowerCase(response).contains("medium")){
        System.out.println("There are many great medium mammals that you can keep as pets. There are medium dogs, medium rodents, and medium livestock. What would you like to learn more about?");
        response = inMammal.nextLine();
        medium(response);
        mammalz = false;
      }
      else if(lowerCase(response).contains("large")){
        System.out.println("There are many great large mammals that you can keep as pets. These are livestock, large dogs, and large cats");
        response = inMammal.nextLine();
        large(response);
        mammalz = false;
      }
      else{
        while(mammaly){
          System.out.println("I'm sorry. Could your please repeat. Are you thinking of getting a small, large, or medium mammal?");
          response = inMammal.nextLine();
          if(lowerCase(response).contains("large")|| lowerCase(response).contains("small")|| lowerCase(response).contains("medium")){
            mammaly = false;
          }
        }
      }
    }
  }
 
 String response = resp;
  public static void monocolored(String resp){
    Scanner inMonocolored = new Scanner(System.in);
    boolean monoz = true;
    boolean monoy = true;
    String s = "small";
    String l = "large";
    while(monoz){
      String check = lowerCase(resp);
      if(check.contains(s) && check.contains(l)){
        System.out.println("I'm sorry, please choose just one answer.");
      }
      else if(lowerCase(resp).contains("small")){
        System.out.println("Small fish make great pets! Some good small monocolored are neon tetra, guppy's, betta fish, and goldfish.");
        monoz = false;
      }
      else if(lowerCase(resp).contains("large")){
        System.out.println("Large fish are great pets! There are many different kinds of monocolored large fish, such as yellowtail's, black marlin, bluegill, and red drum." );
        monoz = false;
      }
      else{
        while(monoy){
          System.out.println(" I'm sorry I dont understand");
          resp = inMonocolored.nextLine();
          if(lowerCase(resp).contains("large")|| lowerCase(resp).contains("small")){
            monoy = false;
          }
        }
      }
    }
  }
 
 
  public static void tricolored(String resp){
    Scanner inTricolored = new Scanner(System.in);
    boolean triz = true;
    boolean triy = true;
    String s = "small";
    String l = "large";
    while(triz){
      String check = lowerCase(resp);
      if(check.contains(s) && check.contains(l)){
        System.out.println("I'm sorry, please choose just one answer.");
        resp = inTricolored.nextLine();
      }
      else if(lowerCase(resp).contains("small")){
        System.out.println("Small fish make great pets! Some good small tricolored are zebra fish, endler's liverbearer, harlequin rasbora, and cherry barb's.");
        triz = false;
      }
      else if(lowerCase(resp).contains("large")){
        System.out.println("Large fish are great pets! There are many different kinds of tricolored large fish, such as swordtail, koi fish, clown triggerfish, and blue tang. " );
        triz = false;
      }
      else{
        while(triy){
          System.out.println("I'm sorry I dont understand");
          resp = inTricolored.nextLine();
          if(lowerCase(resp).contains("large")|| lowerCase(resp).contains("small")){
            triy = false;
          }
        }
      }
    }
  }
 
 
  public static void multicolored(String resp){
    Scanner inMulticolored = new Scanner(System.in);
    boolean multiz = true;
    boolean multiy = true;
    String s = "small";
    String l = "large";
    while(multiz){
      String check = lowerCase(resp);
      if(check.contains(l) && check.contains(s)){
        System.out.println("I'm sorry, please choose just one answer.");
        resp = inMulticolored.nextLine();
      }
      else if(lowerCase(resp).contains("small")){
       System.out.println("Small fish make great pets! Some good small multicolored are betta fish, guppies, neon tetra's, and boesmans rainbowfish. ");
       multiz = false;
      }
      else if(lowerCase(resp).contains("large")){
        System.out.println("Large fish are great pets! There are many different kinds of multicolored large fish, such as clownfish, mandarinefish, anglefish, and lionfish." );
        multiz = false;
      }
      else{
        while(multiy){
          System.out.println("I'm sorry I dont understand");
          resp = inMulticolored.nextLine();
          if(lowerCase(resp).contains("large")|| lowerCase(resp).contains("small")){
            multiy = false;
          }
        }
      }
    }
  }
 
 
  public static void medium(String resp){
    Scanner inMedium = new Scanner(System.in);
    boolean mediumz = true;
    boolean mediumy = true;
    String d = "dog";
    String r = "rodent";
    String l = "livestock";
    while(mediumz){
      String check = lowerCase(resp);
      if(check.contains(d) && check.contains(r)||check.contains(d) && check.contains(l)||check.contains(r) && check.contains(l)){
        System.out.println("I'm sorry, please choose just one answer.");
        resp = inMedium.nextLine();
      }
      else if(lowerCase(resp).contains("dog")){
      System.out.println("Dogs make great pets! Some good medium dogs are basset hounds, bulldogs, australian cattle dogs, and beagles.");
      mediumz = false;
      }
      else if(lowerCase(resp).contains("rodent")){
        System.out.println("Rodents are great medium pets! There are many different kinds of rodents such as beavers, groundhogs, capybaras, porcupines, dasyproctidaes, and more." );
        mediumz = false;
      }
      else if(lowerCase(resp).contains("livestock")){
        System.out.println("Livestock are great pets! Some good medium livestock include lamas, mules, pigs,  lambs, alpacas, goats, and minuature horse.");
        mediumz = false;
      }
      else{
        while(mediumy){
          System.out.println("I'm sorry I dont understand");
          resp = inMedium.nextLine();
          if(lowerCase(resp).contains("livestock")|| lowerCase(resp).contains("dog")|| lowerCase(resp).contains("rodent")){
            mediumy = false;
          }
        }
      }
    }
  }
 
 
  public static void Random(String resp){
    Scanner inRandom = new Scanner(System.in);
    boolean randomz = true;
    boolean randomy = true;
    String response = resp;
    String l = "little";
    String b = "big";
    while(randomz){
      String check = lowerCase(resp);
      if(check.contains(l) && check.contains(b)){
        System.out.println("I'm sorry, please choose just one answer.");
        resp = inRandom.nextLine();
      }
      else if(lowerCase(response).contains("small")||lowerCase(resp).contains("little")){
      System.out.println("There are many great small reptiles that you can keep as pets. Some beginner reptiles are corn snake, anole, and gecko");
      randomz = false;
      }
      else if(lowerCase(response).contains("big")||lowerCase(resp).contains("large")){
        System.out.println("There are many great large reptiles that you can keep as pets. Some beginner reptiles are bearded dragon, lepard gecko, and russian tortoise");
        randomz = false;
      }
      else{
        while(randomy){
          System.out.println("I'm sorry, I don't understand.");
          response = inRandom.nextLine();
          if(lowerCase(response).contains("big")||lowerCase(response).contains("small")){
            randomy = false;
          }
        }
      }
    }
   
  }
 
 
  public static void Size(String resp){
    Scanner inSize = new Scanner(System.in);
    boolean sizez = true;
    boolean sizey = true;
    String response = resp;
    String s = "small";
    String b = "big";
    while(sizez){
      String check = lowerCase(resp);
      if(check.contains(s) && check.contains(b)){
        System.out.println("I'm sorry, please choose just one answer.");
        response = inSize.nextLine();
      }
      else if(lowerCase(response).contains("small")||lowerCase(response).contains("tiny")||lowerCase(response).contains("little")){
      System.out.println("There are many great small reptiles that you can keep as pets. Some more advanced small reptiles are Chameleons, Chahoua Geckos, Tokay Geckos, and more.");
      sizez = false;
      }
      else if(lowerCase(response).contains("big")){
        System.out.println("There are many great large reptiles that you can keep as pets. Some more advanced large reptiles are Ball Pythons, Iguanas, Nile Monitors, Burmese Pythons, and many more.");
        sizez = false;
      }
      else{
        System.out.println("I'm sorry, I don't understand.");
        response = inSize.nextLine();
      }
    }
  }
 
 
  public static void large(String resp){  
    Scanner inLarge = new Scanner(System.in);
    boolean largez = true;
    boolean largey = true;
    String d = "dog";
    String c = "cat";
    String l = "livestock";
    while(largez){
      String check = lowerCase(resp);
      if(check.contains(d) && check.contains(c)||check.contains(d) && check.contains(l)|| check.contains(d) && check.contains(l)){
        System.out.println("I'm sorry, please choose just one answer.");
        resp = inLarge.nextLine();
      }
      else if(lowerCase(resp).contains("dog")){
        System.out.println("Large dogs make great pets! Some great breeds to choose from include great dane, english mastiff, st. Bernard, irish wolfhounds, and leonbergers.");
        largez = false;
      }
      else if(lowerCase(resp).contains("cat")){
        System.out.println("Cats are great pets! Some good options might be maine coons, lynx, savannah cat, himalayan cat, bengal cat, and siberian cat.");
        largez = false;
      }
      else if(lowerCase(resp).contains("livestock")){
        System.out.println("Livestock make great large pets! Some great options include horses, cows, camels, ox, and donkeys. ");
        largez = false;
      }
      else{
        while(largey){
          System.out.println("I'm sorry I dont understand");
          resp = inLarge.nextLine();
          if(lowerCase(resp).contains("livestock")|| lowerCase(resp).contains("cat")|| lowerCase(resp).contains("dog")){
            largey= false;
          }
        }
      }
    }
  }
 
 
  public static void small(String resp){  
    Scanner inSmall = new Scanner(System.in);
    boolean smallz = true;
    boolean smally = true;
    String d = "dog";
    String r = "rodent";
    String c = "cat";
    while(smallz){
      String check = lowerCase(resp);
      if(check.contains(d) && check.contains(r)||check.contains(d) && check.contains(c)|| check.contains(r) && check.contains(c)){
        System.out.println("I'm sorry, please choose just one answer.");
        resp = inSmall.nextLine();
      }
      else if(lowerCase(resp).contains("dog")){
        System.out.println("Dogs make great pets! Some good small dogs are chiwawas, pomaranians, mini poodles, and pugs.");
        smallz = false;
      }
      else if(lowerCase(resp).contains("rodent")){
        System.out.println("Rodents are great small pets! There are many different kinds of rodents such as hamsters, rats, mice, chinchillas, guinea pigs, and more." );
        smallz = false;
      }
      else if(lowerCase(resp).contains("cat")){
        System.out.println("Cats make a great pets! There are many different breeds of cat such as saimese, somail, munchkin, korat, and more.");
        smallz = false;
      }
      else{
        while(smally){
          System.out.println("I'm sorry I don't understand.");
          resp = inSmall.nextLine();
          if(lowerCase(resp).contains("cat")|| lowerCase(resp).contains("rodent")|| lowerCase(resp).contains("dog")){
          }
        }
      }
    }
  }
}
  }

*/
