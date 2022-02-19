
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class verificaAnagramaTest {

    @Test
    public void Substring() {
        String palavra = "ifailuhkqq";
        int result = verificaAnagrama.subString(palavra);
        Assertions Assert;
        Assert.assertEquals(3, result);
    }
}
