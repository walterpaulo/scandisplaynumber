import br.com.unoseg.service.DisplayName;
import org.junit.Test;

public class DisplayNameTest {

    @Test
    void inputDisplay(){
        final String instance = "   _  _     _  _  _  _  _\n" +
                                 "| _| _||_||_ |_   ||_||_|\n" +
                "                 ||_  _|  | _||_|  ||_| _|";
        final DisplayName dn = new DisplayName(instance);
        final int espearado = 123456789;

    }
}
