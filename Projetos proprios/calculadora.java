import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.Scanner;
public class calculadora{
    public static void main(String[] args) throws ScriptException{

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        Scanner tecla = new Scanner(System.in);
        String total = tecla.nextLine();

        Object resultado = engine.eval(total);
        System.out.println(resultado);
            
    }
    
}