import java.util.Arrays;
import java.util.HashMap;

public class verificaAnagrama {
    public static void main(String[] args) {

        //Definimos a palavra a checar entre " "
        subString("ifailuhkqq");
    }

    static void subString(String palavra) {
        //
        HashMap< String, Integer> map = new HashMap<>();

        for (int i = 0; i < palavra.length(); i++) {
            for(int j = i; j < palavra.length(); j++) {
                char[] valC = palavra.substring(i, j+1).toCharArray();
                Arrays.sort(valC);
                String val = new String(valC);

                if (map.containsKey(val))
                    map.put(val, map.get(val)+1);
                else
                    map.put(val, 1);
            }
        }
        int contaPares = 0;
        for (String key: map.keySet()) {
            int n = map.get(key);
            contaPares += (n * (n-1)) /2;
        }
        System.out.println(contaPares);
    }
}
