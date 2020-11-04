class dowhileloopDemo { 
    public static void main(String args[]) 
    { 
  
        int x = 21, sum = 0; 
  
        do { 
  
            // The line will be printed even 
            // if the condition is false 
            sum += x; 
            x--; 
  
        } while (x > 10); 
        System.out.println("Summation: " + sum); 
    } 
} 