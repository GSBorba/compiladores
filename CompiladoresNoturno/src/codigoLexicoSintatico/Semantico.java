package codigoLexicoSintatico;

import java.util.Stack;

public class Semantico implements Constants
{
	
	private Stack<String> pilhaTipos = new Stack<>();
	public String codigoObjeto = "";
	private String operadorRelacional = "";
	
    public void executeAction(int action, Token token)	throws SemanticError {
    	
        System.out.println("Ação #"+action+", Token: "+token);
        switch (action) {
		case 100: this.acao100();	break;
		case 101: this.acao101();	break;
		case 102: this.acao102();	break;
		case 103:	break;
		case 104:	break;
		case 105:	break;
		case 106:	break;
		case 107:	break;
		case 108:	break;
		case 109:	break;
		case 110:	break;
		case 111:	break;
		case 112:	break;
		case 113:	break;
		case 114: this.acao114(token);	break;
		case 115: this.acao115(token);	break;
		case 116:	break;
		case 117:	break;
		default:
			System.out.println("Não implementado!");
			break;
		}
    }	
    
    private void acao100() {
    	this.codigoObjeto += ".assembly extern mscorlib {}\r\n"
    			+ ".assembly _exemplo{}\r\n"
    			+ ".module _exemplo.exe\r\n"
    			+ "\r\n"
    			+ ".class public _exemplo{\r\n"
    			+ "  .method static public void _principal(){\r\n"
    			+ "   .entrypoint\r\n"
    			+ "      \n";
    }
    
    private void acao101() {
    	this.codigoObjeto += "\r\n"
    			+ "   ret\r\n"
    			+ " }\r\n"
    			+ "}";
    }
    
    private void acao102() {
    	String valor = this.pilhaTipos.pop();
    	
    	if (valor == "int64") {
    		this.codigoObjeto += "conv.i8\n";
		}
    	
    	this.codigoObjeto += "call void [mscorlib]System.Console::WriteLine(" + valor + ")\n";
    }
    
    private void acao114(Token token) {
    	this.pilhaTipos.push("int64");
    	this.codigoObjeto += "ldc.i8 " + token.getLexeme() + "\n"
    			+ "conv.r8" + "\n";
    }
    
    private void acao115(Token token) {
    	this.pilhaTipos.push("float64");
    	this.codigoObjeto += "ldc.r8 " + token.getLexeme() + "\n";
    }
}
