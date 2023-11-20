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
		case 103: this.acao103();	break;
		case 104: this.acao104();	break;
		case 105: this.acao105();	break;
		case 106: this.acao106();	break;
		case 107: this.acao107();	break;
		case 108: this.acao108(token);	break;
		case 109: this.acao109();	break;
		case 110: this.acao110();	break;
		case 111: this.acao111();	break;
		case 112: this.acao112();	break;
		case 113: this.acao113();	break;
		case 114: this.acao114(token);	break;
		case 115: this.acao115(token);	break;
		case 116: this.acao116(token);	break;
		case 117: this.acao117();	break;
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
    		this.codigoObjeto += "conv.i8" + "\n";
		}
    	
    	this.codigoObjeto += "call void [mscorlib]System.Console::WriteLine(" + valor + ")" + "\n";
    }
    
    private void acao103() {
    	this.pilhaTipos.pop();
    	this.pilhaTipos.pop();
    	
    	this.codigoObjeto += "and" + "\n";
    	
    	this.pilhaTipos.push("bool");
    }
    
    private void acao104(){
    	String valor1 = this.pilhaTipos.pop();
    	String valor2 = this.pilhaTipos.pop();
    	
    	this.codigoObjeto += "or" + "\n";
    	
    	this.pilhaTipos.push("bool");
    }
    
    private void acao105() {
    	this.pilhaTipos.push("bool");
    	this.codigoObjeto += "ldc.r4.1" + "\n";
    }
    
    private void acao106() {
    	this.pilhaTipos.push("bool");
    	this.codigoObjeto += "ldc.r4.0" + "\n";
    }
    
    private void acao107() {
    	
    }
    
    private void acao108(Token token) {
    	this.operadorRelacional = token.getLexeme();
    }
    
    private void acao109(){ //Verificar se precisa de verificação de Tipos iguais
    	this.pilhaTipos.pop();
    	this.pilhaTipos.pop();
    	
    	if(operadorRelacional.equals("==")) {
    		this.codigoObjeto += "ceq" + "\n";
    	} else if(operadorRelacional.equals("!=")) {
    		this.codigoObjeto += "ceq" + "\n"
    				+ "xor" + "\n";
    	} else if(operadorRelacional.equals(">")) {
    		this.codigoObjeto += "cgt" + "\n";
    	} else {
    		this.codigoObjeto += "clt" + "\n";
    	}
    	
    	this.pilhaTipos.push("bool");
    }
    
    private void acao110() {//Verificar se precisa de verificação de Tipos iguais
    	String valor1 = this.pilhaTipos.pop();
    	String valor2 = this.pilhaTipos.pop();
    	
    	if(valor1 == "float64" || valor2 == "float64") {
    		this.pilhaTipos.push("float64");
    	} else {
    		this.pilhaTipos.push("int64");
    	}
    	
    	this.codigoObjeto += "add" + "\n";
    }
    
    private void acao111() {//Verificar se precisa de verificação de Tipos iguais
    	String valor1 = this.pilhaTipos.pop();
    	String valor2 = this.pilhaTipos.pop();
    	
    	if(valor1 == "float64" || valor2 == "float64") {
    		this.pilhaTipos.push("float64");
    	} else {
    		this.pilhaTipos.push("int64");
    	}
    	
    	this.codigoObjeto += "sub" + "\n";
    }
    
    private void acao112() {//Verificar se precisa de verificação de Tipos iguais
    	String valor1 = this.pilhaTipos.pop();
    	String valor2 = this.pilhaTipos.pop();
    	
    	if(valor1 == "float64" || valor2 == "float64") {
    		this.pilhaTipos.push("float64");
    	} else {
    		this.pilhaTipos.push("int64");
    	}
    	
    	this.codigoObjeto += "mul" + "\n";
    }
    
    private void acao113() throws SemanticError{
    	String valor1 = this.pilhaTipos.pop();
    	String valor2 = this.pilhaTipos.pop();
    	
    	if(valor1 != valor2) {
    		throw new SemanticError("F");
    	}
    	
    	this.codigoObjeto += "div" + "\n";
    	
    	if(valor1 == "float64" || valor2 == "float64") {
    		this.pilhaTipos.push("float64");
    	} else {
    		this.pilhaTipos.push("int64");
    	}
    }
    
    private void acao114(Token token) {
    	this.pilhaTipos.push("int64");
    	this.codigoObjeto += "ldc.i8 " + token.getLexeme() + "\n"
    			+ "conv.r8" + "\n";
    }
    
    private void acao115(Token token) {//Verificar se precisa trocar 
    	this.pilhaTipos.push("float64");
    	this.codigoObjeto += "ldc.r8 " + token.getLexeme() + "\n";
    }
    
    private void acao116(Token token) {
    	this.pilhaTipos.push("string");
    	this.codigoObjeto += "ldstr " + token.getLexeme() + "\n";
    }
    
    private void acao117() {
    	
    }
}
