package MidTermQues2;

public class Main {
    public static void main(String[] args)
    {
        demNamNhuan();
    }

    public static int countNegative(int[] arr)
    {
        if(arr == null || arr.length == 0)
            throw new InvalidArrayException("Array can not be null or empty.");
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < 0) count++;
        }
        return count;
    }

    public static void demNamNhuan()
    {
        for(int i = 100; i < 2100;  i++)
        {
            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
            {
                System.out.println(i);
            }
        }
    }
}

class InvalidArrayException extends RuntimeException
{
    public InvalidArrayException(String message)
    {
        super(message);
    }
}