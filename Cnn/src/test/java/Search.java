import baseApi.Base;
import org.testng.annotations.Test;
import utiliy.DataReader;

import java.io.IOException;

/**
 * Created by rrt on 4/25/2015.
 */
public class Search extends Base {
    public DataReader dr = new DataReader();
    String path = "Cnn\\data\\file1.xls";
    @Test
    public void searchNews()throws IOException{
        String [][] value = dr.fileReader(path);
        typeAndEnterByCss(value[1][0], value[1][1]);
        typeAndEnterByCss(value[2][0], value[2][1]);

    }
}
