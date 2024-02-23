import java.util.HashMap;

public class hashMap
{
    public static void main(String args[])
    {
        HashMap<Integer,Character>m = new HashMap<>();
        m.put(1,'a');
        m.put(2,'b');


          for(int it:m.keySet())
        {
            System.out.println(m.get(it));
        }
    }
}