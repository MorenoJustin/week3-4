package arrays;


public class Week4 {



   

    public static void main(String[] args) {
      
    /*task 1: Create an array of int called ages that
       contains the following values: 3, 9, 23, 64, 2, 8, 
      28, 93.   */
      // task 1 a put a new variable
      
      System.out.println("task 1: Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93." );
     int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 18,};
      
      ages[ages.length-1] = ages[ages.length-1] - ages[0];// JUSTIN HERE and what this code means is  18 - 3 because the last number is 18 minus the first number of the array is 3

System.out.println("Task 1 completed at line 18");
System.out.println();

                                      //               task one completed      line 18           //


// Task  2 ^ add a new array int and test if it still prints well (last one and first one subtracted) without using ages[7] or ages[8]
System.out.println("task 2 add a new array int and test if it still prints well (last one and first one subtracted) without using ages[7] or ages[8]");
      System.out.println("Completed in line 20: answer:  " + ages[ages.length-1]);

      
                                   //           task two completed    -    line 20 :)          //
System.out.println();

  
                                       
      
  /* task 3 Use a loop to iterate through the array and calculate 
      the average age. Print the result to the console  */

System.out.println("Task 3: use a loop to iterate through the array and calculate the average age ");
      double average = 0;
     

    for(int counter = 0; counter< ages.length ; counter++) {
   average += ages[counter];

  }
       average = average/ages.length;
       
      System.out.println("task 3 completed in lines 46-51 answer: " + average);
      System.out.println();
      
      
                                        //            task 3 completed      lines-46-51         //
      
                                    // numbers question section above ----------------------------------------------------------------------------------------------------
      
      

      /* Task 4: Create an array of String called names that contains
      the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.  */
      
            System.out.println("task 4: Create an array of String called names that contains the following values: Sam, Tommy, Tim, Sally, Buck, Bob");
     
      // array names below 
                   
               String[] names = { "Sam" , "Tommy" , "Tim" , "Sally" , "Buck" , "Bob"};
                // the array i created  Strings have an " for every variable inputed
                               System.out.println("task 4 completed in line 69");
                               
             System.out.println();                  
             
             
             
                                      //                task 4 completed    Line 69          //
             
             
             
                /*  task 5 : Use a loop to iterate through the array and calculate the average
                number of letters per name. Print the result to the console. */
             System.out.println("task 5: Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.");
             
             
              double avg = 0;
                for(int counter = 0; counter < names.length; counter++) {
                  // counter is repetitions, names.length is the whole array  while .length-1 is the last array integer 
                  avg += names[counter].length();  }
                
            
                    System.out.println("Task 5 completed in lines 86- 90, the average letter length for the names is: " );
                    System.out.println(avg/names.length);
                    System.out.println();
                
                                                      
                                     //       task  5 completed        in lines 86-90     //
                                  
                    
                    
            
                    System.out.println(" Task 6: Use a loop to iterate through the array again  and concatenate all the names together,separated by spaces, and print the result to the console.");
                String sumOfNames = "";
                  for(String str:names) {
                    sumOfNames += str + " ";
                }
                  
              
                
                     
             System.out.println("task 6 completed in lines 104- 109 , answer:  " + sumOfNames);
                    System.out.println();                             
                    

                                                // task 6 completed in liens 104- 109      //
                      
                     
                      
// Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
System.out.println("task 7 Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name "
    + "to the nameLengths array.");

 // look at how many letters each name has (line 69) 
            int[] nameLength = new int[names.length];
           
              for(int counter = 0; counter < names.length; counter++)  {
                nameLength[counter] = names[counter].length();
              }
              for(int num : nameLength) {
                System.out.println(num);
              }
                   
                    
                    
            
         
                                      // task 7 completed   125-130        //
                    
                    
              //Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
              
              System.out.println("task 8: Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.");
            double  avgNameLength = 0;
              for (int x = 0; x < nameLength.length; x++) {
                avgNameLength += nameLength[x];
                System.out.println(avgNameLength);
              }
              
              
              
                                      //         task 8 completed  sun of all elements is 23            //
                
             System.out.println();
             System.out.println("Task 9, write hello 3 times using a String method with int = n ");
             System.out.println(result("Hello", 3));
              System.out.println();


                                // task 9 completed           //

                  String firstName = "Justin";
                    String lastName = " Moreno";
              
              System.out.println(" task 10, create a method that gives a first and last name :");
              System.out.println(fullName(firstName, lastName));
              System.out.println();
              // make a fullname method

                                                  // task 10 completed 

              System.out.println("Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100. ");
              
              int [] array = {23, 21, 12, 10};
              System.out.println("is the array greater than 100? : " + greaterThan100(array));
              System.out.println();
              //Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

              System.out.println("Write a method that takes an array of double and returns the average of all the elements in the array.");
              System.out.println(average1(array));
              
              System.out.println();
              
              
              
              
              
                                            // task 11 completed  //
              
              
              
              
             // Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
              System.out.println("Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.");
              
              double[] arrayDouble = {1,2,3}; 
              double[] arrayDouble2 = {4,5,6};
              
         System.out.println(averageDbl(arrayDouble, arrayDouble2));
         
         System.out.println();
         
         
                                                   // task 12 completed //
         
         
         
         //Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
System.out.println("Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.");
             boolean  isHotOutside = true;
             double moneyInPocket = 21.50;
         System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
     
        
         
         boolean HaveEnoughTime = false;
         double homework = 2;
         System.out.println("bonus question");
         System.out.println("can i go to the fair?");
         System.out.println(goToFair(HaveEnoughTime, homework) );
         
         //-------------------------------------------------------
         System.out.println("word questions...");
         
         System.out.println("How do you access the first element of any array?\r\n"
             + "");
        
         System.out.println("answer : you can use arrayName[0]  to use it");
         
         System.out.println();
         
         System.out.println("How do you access the last element of any array?");
         
         System.out.println("Answer: it is arrayName[arrayName.length - 1] for the last array number or  symbol or you can put arrayName[last number of your array]");
         
         
         
         
         
         
         
         
         
         
            } // Methods below 
     
    
   

    public static String result(String str, int num) {
      String result = "";
      for (int i = 1; i <= num; i++)  {
      result += str;
      
      
      
      }
      return result;
  }
    
    
public static String  fullName(String firstName, String lastName)  {
  String fullName= firstName + lastName;
  return fullName;
}
public static boolean greaterThan100(int[] array) {
  int result1 =0;
    for(int number : array) {
      result1 += number; 
    }
    if(result1>100) {
      return true;
    } else { 
        return false;
    }
}
    public static double average1(int[] array) {
      double i = 0;
      for (double number : array) { 
        i += number;
      }
      return i / array.length;
      }
    public static boolean averageDbl(double[] arrayDouble , double[] arrayDouble2) {
   double avg = 0;
   double avg2 = 0;
   for ( double average2 : arrayDouble2) {
     for (double average1 : arrayDouble) {
       avg2 += average2;
       avg+= average1;
     }
   }
         if (avg > avg2) { 
         
           return true; 
    
     } else { 
           return false;
     }
     
     
   

   }  
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
     
      for (double i = 0; i > moneyInPocket; i++) 
        moneyInPocket += i;
        if (moneyInPocket >= 10.50 && isHotOutside == true)
          return true;
       else {
        return false;
       }
      }
      
        
      public static String goToFair(boolean haveEnoughTime, double homework ) {
          
         
          
          if (homework <= 7 && haveEnoughTime == true) {
            return "yes i can go to the fair";
      } else { 
       return "no i cant go to the fair";
          
            // if i can or cannot go to the fair which i right now can't because i have assignments and stuff i need to master... i can go next year :)
            
          
          
        
        
      }
  
     
    }
    }
    
    



      
    
    
    
    


  

    


