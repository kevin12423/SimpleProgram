import org.w3c.dom.NameList;

import java.util.ArrayList;

/**
 * Created by kevin_000 on 3/4/2016.
 */
public class SimpleDriver
{
    public static void main(String[] args)
    {
        ArrayList<String> NameList = new ArrayList<>();
        NameList.add("Kevin");
        NameList.add("Jeff");
        NameList.add("Betty");


    }

    public static void selectionSort()
    {
        int[] numbers = {4, 6, 7, 86, 5, 4, 3, 5, 6};
        int minIndex, startScan, index, minValue;
        for (startScan = 0; startScan < (numbers.length - 1); startScan++)
        {
            minIndex = startScan;
            minValue = numbers[startScan];
            for (index = startScan + 1; index < numbers.length; index++)
            {
                if (numbers[index] < minValue)
                {
                    minValue = numbers[index];
                    minIndex = index;

                }
            }
            numbers[minIndex] = numbers[startScan];
            numbers[startScan] = minValue;
        }
    }
    public interface DisplayArrayNames
    {
        void Display();
    }
}
