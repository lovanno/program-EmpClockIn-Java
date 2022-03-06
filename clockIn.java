import java.io.*;
import java.util.Date;
import java.util.*;
import java.text.*;
import java.util.Map;
import java.util.HashMap;

public class test{
     public static void main(String[] args) throws IOException 
    { 

       ArrayList<String> list = new ArrayList<String>();
       Date date1 = new Date();
       Date time1 = new Date();
       
       SimpleDateFormat tm = 
       new SimpleDateFormat ("hh:mm:ss");  //tm=time

       System.out.printf("%s %tB %<te,%<tY","Date:", date1);
    
       Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       String s = formatter.format(date1);
       list.add(s);
    
       System.out.println(" ");
       System.out.println("Time: " + tm.format(time1));
       System.out.println(" ");
    
    
       Scanner x = new Scanner(System.in);
    
       System.out.print("Please enter your number to log in: ");
       double a = x.nextDouble();
       System.out.println("");
     
       Map<String, Integer> goodList=new HashMap<>(); 
           goodList.put("Bill", 341938);
           goodList.put("Elon", 337415);
           goodList.put("Steve", 358143);
           goodList.put("Robert", 374561);
        
      
      
       Iterator<Map.Entry<String, Integer> >  iterator = goodList.entrySet().iterator();
      
       while (iterator.hasNext()) {  //Allows me to go through Hashmap  
            Map.Entry<String, Integer> entry = iterator.next(); 
            
            if (a == entry.getValue()){
                System.out.println("Welcome Back, " + entry.getKey() + "!");
                   
                String recordPath = "Records.txt";
                BufferedWriter writer;
                FileWriter fw;
            try{
                fw = new FileWriter(recordPath, true);
                writer = new BufferedWriter(fw);

            for(String str : list){
                writer.newLine();
                writer.flush();
                
                writer.write(entry.getKey());
                writer.newLine();
                writer.flush();
                
                writer.write(str);
                //writer.newLine(); //will have to find a way to incorproate with prograam for beauty
                //writer.flush();
                
            }
            //System.out.println("Finished writing");
            writer.close();
            fw.close();
        }   catch (IOException e) {
            e.printStackTrace();
        } 
        }
        }
        
        String decision;
        Scanner y = new Scanner (System.in);
        System.out.println("Would you like to see your hours ? : yes or no");
        decision = y.nextLine();
        
        if(decision.equals("yes")){
          Scanner sf= new Scanner(new File("C:\\Users\\erick\\Documents\\Coding\\Quarter-4\\Records.txt"));
          
          int maxIndx= -1;
          String text[]=new String[1000];
        while(sf.hasNext()) 
         {
            maxIndx++;
            text[maxIndx]=sf.nextLine();
        }
        for(int j=0;j<=maxIndx;j++)
        {  
            Scanner token = new Scanner(text[j]);
            System.out.println(token.nextLine());
        }     
        }  
        else{
            System.out.println("Thank you");
   
        } 
    }
}
