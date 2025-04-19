package testRunner;

public class ConflictArises
{
    public static void main(String[] args)
    {
        try
        {
         int a =10/0;
        }
        catch (Exception e)
        {
            System.out.println("Element is Liking");
            takeScreenshot("Given");
        }

    }

    private static void takeScreenshot(String test) {
    }
}
