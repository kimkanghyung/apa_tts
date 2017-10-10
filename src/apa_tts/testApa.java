package apa_tts;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.script.*;
import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

public class testApa {

	public static void main(String[] args) throws ScriptException, FileNotFoundException {

		//File js = new File("http://code.responsivevoice.org/responsivevoice.js");
		//File js = new File("C:/Users/kanghyun/workspace/apa_tts/src/responsivevoice.js");
		//FileReader JsfileReader = new FileReader(js);
		
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		
		
		invokeScriptFunctionFromEngine(engine);
		

	}
	
    private static void invokeScriptFunctionFromEngine(ScriptEngine engine) throws ScriptException 
    {
            engine.eval(
            " function aa() {                                                                   "+	
            " var fileref=document.createElement('script');                                     " +
            " fileref.setAttribute('type','text/javascript');                                   " +
            " fileref.setAttribute('src', 'http://code.responsivevoice.org/responsivevoice.js');" +		
            " responsiveVoice.speak('SC은행 계좌번호 6 6 3 3 2 2 로 시작하는 번호로 신청하셨습니다.', 'Korean Female', {rate: 0.7}); " +
            " print('테스트');} aa();");
    }	
    private static void defineScriptFunction(ScriptEngine engine) throws ScriptException 
    {
            // Define a function in the script engine
            engine.eval(
                            "function sayHello(name) {" +
                            "    println('Hello, ' + name)" +
                            "}"
            );
    }
    
    
    /**
     * Java에서 정의한 JavaScript함수를 호출한다.
     * @param engine
     * @throws ScriptException
     */
    private static void invokeScriptFunctionFromEngine1(ScriptEngine engine) throws ScriptException 
    {
            engine.eval("sayHello('world!')");
    }
}
