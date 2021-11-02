import br.com.unoseg.service.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnit4.class)
public class DisplayNameTest {

    @Test
    public void inputDisplay(){
        final String instance = "   _  _     _  _  _  _  _ " +
                                " | _| _||_||_ |_   ||_||_|" +
                                " ||_  _|  | _||_|  ||_| _|" +
                                "                           ";
        final DisplayName dn = new DisplayName(instance);
        final String obtido = dn.getNameDisplay();
        final int espearado = 123456789;
        assertEquals(espearado,obtido);
    }
}
