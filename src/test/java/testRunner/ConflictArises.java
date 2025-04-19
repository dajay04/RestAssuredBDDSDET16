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
            System.out.println("Element is clicking");
            takeScreenshot("Albereta");
        }

    }

    private static void takeScreenshot(String test) {
    }
}
