import br.com.unoseg.service.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnit4.class)
public class DisplayNameTest {

    @Test
    public void inputDisplay_ERR(){
        String numeroError = " _  _  _        _  _  _    " +
                "|_||_| _||_||_|  ||_   ||_|" +
                " _| _| _|  |  |  ||_|  |  |" +
                "                           ";
        final DisplayName dn = new DisplayName(numeroError);
        final String obtido = dn.getconverter();
        final String espearado = "993447674 ERR";
        assertEquals(espearado,obtido);
    }

    @Test
    public void inputDisplay_Test1(){
        String numeroObj2 = " _ " + " _ " + " _ " + " _ " + " _ " + " _ " + " _ " + " _ " + " _ " +
                "| |" + "| |" + "| |" + "| |" + "| |" + "| |" + "| |" + "| |" + "| |" +
                "|_|" + "|_|" + "|_|" + "|_|" + "|_|" + "|_|" + "|_|" + "|_|" + "|_|" +
                "   " + "   " + "   " + "   " + "   " + "   " + "   " + "   " + "   ";

        final DisplayName dn = new DisplayName(numeroObj2);
        final String obtido = dn.getconverter();
        final String espearado = "000000000";
        assertEquals(espearado,obtido);
    }

    @Test
    public void inputDisplay2(){

        String numeroObj2 = "   " + " _ " + " _ " + "   " + " _ " + " _ " + " _ " + " _ " + " _ " +
                "  |" + " _|" + " _|" + "|_|" + "|_ " + "|_ " + "  |" + "|_|" + "|_|" +
                "  |" + "|_ " + " _|" + "  |" + " _|" + "|_|" + "  |" + "|_|" + " _|" +
                "   " + "   " + "   " + "   " + "   " + "   " + "   " + "   " + "   ";

        final DisplayName dn = new DisplayName(numeroObj2);
        final String obtido = dn.getconverter();
        final String esperado = "123456789";
        assertEquals(esperado,obtido);
    }

    @Test
    public void inputDisplay_Test3(){
        String numeroObj3 = " _ " + " _ " + " _ " + " _ " + " _ " + " _ " + " _ " + " _ " + "   " +
                "| |" + "| |" + "| |" + "| |" + "| |" + "| |" + "| |" + "|_ " + "  |" +
                "|_|" + "|_|" + "|_|" + "|_|" + "|_|" + "|_|" + "|_|" + " _|" + "  |" +
                "   " + "   " + "   " + "   " + "   " + "   " + "   " + "   " + "   ";

        final DisplayName dn = new DisplayName(numeroObj3);
        final String obtido = dn.getconverter();
        final String espearado = "000000051";
        assertEquals(espearado,obtido);
    }


    @Test
    public void inputDisplay_Test4(){
        String numeroObj4 = "   " + " _ " + " _ " + "   " + " _ " + " _ " + " _ " + " _ " + " _ " +
                "  |" + " _|" + " _|" + "|_|" + " _ " + "|_ " + "  |" + "|_|" + "|_|" +
                "  |" + "|_ " + " _|" + "  |" + " _|" + "|_|" + "  |" + "|_|" + " _ " +
                "   " + "   " + "   " + "   " + "   " + "   " + "   " + "   " + "   ";

        final DisplayName dn = new DisplayName(numeroObj4);
        final String obtido = dn.getconverter();
        final String espearado = "1234?678? ILL";
        assertEquals(espearado,obtido);
    }

    @Test
    public void inputDisplay_Test5(){
        String numeroObj5 = "   " + "   " + "   " + "   " + "   " + "   " + "   " + "   " + "   " +
                "|_|" + "|_|" + "|_|" + "|_|" + "|_|" + "|_|" + "|_|" + "|_|" + "|_|" +
                "  |" + "  |" + "  |" + "  |" + "  |" + "  |" + "  |" + "  |" + "  |" +
                "   " + "   " + "   " + "   " + "   " + "   " + "   " + "   " + "   ";

        final DisplayName dn = new DisplayName(numeroObj5);
        final String obtido = dn.getconverter();
        final String espearado = "444444444 ERR";
        assertEquals(espearado,obtido);
    }

}
