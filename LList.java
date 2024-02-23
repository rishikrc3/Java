import java.util.LinkedList;

public class LList
{
    public static void main(String args[])
    {
        LinkedList<Integer> nums = new LinkedList<>();

        nums.add(30);
        nums.add(40);
        nums.add(50);

        System.out.println(nums);

        nums.removeLast();

        for(int it : nums)
        {
            System.out.println(it);
        }
    }
}
