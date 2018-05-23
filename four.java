package SorteOpgaver.ch11.aske1208_a_11_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class four
{
    public void partition(List<Integer> list, Integer E)
    {
        List<Integer> lowestFirstHighestLastList = new ArrayList<>();

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext())
        {
            Integer number = itr.next();
            if (number < E)
            {
                lowestFirstHighestLastList.add(number);
                itr.remove();
            }
        }

        lowestFirstHighestLastList.addAll(list);

        for (Integer integer : lowestFirstHighestLastList)
        {
            System.out.println(integer);
        }
    }
}
