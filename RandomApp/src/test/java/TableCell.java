import baseApi.Base;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by rrt on 4/19/2015.
 */
public class TableCell extends Base {

    @Test
    public void getCellValue()throws InterruptedException{
        String customerName = getTextByCss("tbody tr:nth-child(2) td:nth-child(2)");
        String country = getTextByCss("tbody tr:nth-child(2) td:nth-child(7)");
        System.out.println(customerName +" : " + country);
        sleepFor(2);
        List<String> list = getListOfTextByCss("tbody");
        displayText(list);
    }
}
