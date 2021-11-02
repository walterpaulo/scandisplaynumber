import br.com.unoseg.service.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnit4.class)
public class DisplayNameTest {

    @Test
    public void inputDisplay(){
        String numeroObj = " _  _  _        _  _  _    " +
                           "|_||_| _||_||_|  ||_   ||_|" +
                           " _| _| _|  |  |  ||_|  |  |" +
                           "                           ";
        final DisplayName dn = new DisplayName(numeroObj);
        final String obtido = dn.getconverter();
        final String espearado = "993447674";
        assertEquals(espearado,obtido);
    }
}
