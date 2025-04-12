package linkedList2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args)
        throws IOException
    {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

        // Reading data using readLine
        LinkedList list = new LinkedList();
        String input= reader.readLine();
        while(!input.equals("exit"))
        {
          if(input.length()>3 && input.substring(0, 3).equals("add"))
          {
            System.out.println(list.addAValue(input.substring(4)).getValue());
          }
          else if(input.equals("show"))
          {
            System.out.println(list.showValues());
          }
          else if(input.length() > 7 && input.substring(0, 6).equals("remove")){
        	  list.deleteAValue(input.substring(7));
              System.out.println("removing "+input.substring(7));

          }
          else if(input.length() > 9 && input.substring(0, 8).equals("nReverse")){
        	  list.nReverse(Integer.parseInt(input.substring(9)));
              System.out.println("Reversing list " + input.substring(9));

          }
          else if(input.equals("reverse"))
          {
            list.reverse();
          }
          else if(input.equals("clear"))
          {
            list.clear();
          }
          else if(!input.equals("exit")){
              System.out.println("I don't know how to "+input);
          }
          input= reader.readLine();                                             
        }                                                                       
                                                                                
                                                                                
        System.out.println(list.addAValue("8").getValue());
        System.out.println(list.showValues());
        System.out.println(list.addAValue("4").getValue());
        System.out.println(list.showValues());
        System.out.println(list.addAValue("2").getValue());
        System.out.println(list.showValues());
        System.out.println(list.addAValue("1").getValue());
        System.out.println(list.showValues());
        System.out.println(list.addAValue("3").getValue());
        System.out.println(list.showValues());
        System.out.println(list.addAValue("5").getValue());
        System.out.println(list.showValues());
        System.out.println(list.addAValue("6").getValue());
        System.out.println(list.showValues());
        System.out.println(list.addAValue("7").getValue());
        System.out.println(list.getHead().getValue());
        list.nReverse(3);
        System.out.print(list.showValues());
        // Printing the read line
        System.out.println("thanks for playing!");
    }
}
