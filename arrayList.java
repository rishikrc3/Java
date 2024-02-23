import java.util.ArrayList;

public class arrayList
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(30);
        nums.add(18);

        System.out.println("Original nums:"+nums);

        nums.remove(Integer.valueOf(30));

        System.out.println("After removing 30 from nums:"+nums);
    }
}