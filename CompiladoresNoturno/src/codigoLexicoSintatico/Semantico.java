package codigoLexicoSintatico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Semantico implements Constants
{
	
	private Stack<String> pilhaTipos = new Stack<>();
	public String codigoObjeto = "";
	private String operadorRelacional = "";
	private Stack<String> pilhaRotulos = new Stack<>();
	private List<String> listaId = new ArrayList<String>();
	private HashMap<String, String[][]> tabelaSimbolos = new HashMap();
	
    public void executeAction(int action, Token token)	throws SemanticError {
    	
        System.out.println("Ação #" + action + ", Token: " + token );
        switch (action) {
		case 100: this.acao100();		break;
		case 101: this.acao101();		break;
		case 102: this.acao102();		break;
		case 103: this.acao103();		break;
		case 104: this.acao104();		break;
		case 105: this.acao105();		break;
		case 106: this.acao106();		break;
		case 107: this.acao107();		break;
		case 108: this.acao108(token);	break;
		case 109: this.acao109();		break;
		case 110: this.acao110();		break;
		case 111: this.acao111();		break;
		case 112: this.acao112();		break;
		case 113: this.acao113();		break;
		case 114: this.acao114(token);	break;
		case 115: this.acao115(token);	break;
		case 116: this.acao116(token);	break;
		case 117: this.acao117(token);	break;
		case 118: this.acao118(token);	break;
		case 119: this.acao119();		break;
		case 120: this.acao120();		break;
		case 121: this.acao121();		break;
		case 122: this.acao122(token);	break;
		case 123: this.acao123();		break;
		case 124: this.acao124(token);	break;
		case 125: this.acao125(token);	break;
		case 126: this.acao126(token);	break;
		case 127: this.acao127(token);	break;
		case 128: this.acao128(token);	break;
		case 129: this.acao129(token);	break;
		case 130: this.acao130(token);	break;
		case 131: this.acao131(token);	break;
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
    	this.codigoObjeto += "ldc.i4.1" + "\n";
    }
    
    private void acao106() {
    	this.pilhaTipos.push("bool");
    	this.codigoObjeto += "ldc.i4.0" + "\n";
    }
    
    private void acao107() {
    	this.codigoObjeto += "ldc.i4.0" + "\n"
				+ "ceq" + "\n";
    }
    
    private void acao108(Token token) {
    	this.operadorRelacional = token.getLexeme();
    }
    
    private void acao109(){
    	this.pilhaTipos.pop();
    	this.pilhaTipos.pop();
    	
    	if(operadorRelacional.equals("==")) {
    		this.codigoObjeto += "ceq" + "\n";
    	} else if(operadorRelacional.equals("!=")) {
    		this.codigoObjeto += "ceq" + "\n"
    				+ "ldc.i4.0" + "\n"
    				+ "ceq" + "\n";
    	} else if(operadorRelacional.equals(">")) {
    		this.codigoObjeto += "cgt" + "\n";
    	} else {
    		this.codigoObjeto += "clt" + "\n";
    	}
    	
    	this.pilhaTipos.push("bool");
    }
    
    private void acao110() {
    	String valor1 = this.pilhaTipos.pop();
    	String valor2 = this.pilhaTipos.pop();
    	
    	if(valor1.equals("float64") || valor2.equals("float64")) {
    		this.pilhaTipos.push("float64");
    	} else {
    		this.pilhaTipos.push("int64");
    	}
    	
    	this.codigoObjeto += "add" + "\n";
    }
    
    private void acao111() {
    	String valor1 = this.pilhaTipos.pop();
    	String valor2 = this.pilhaTipos.pop();
    	
    	if(valor1.equals("float64") || valor2.equals("float64")) {
    		this.pilhaTipos.push("float64");
    	} else {
    		this.pilhaTipos.push("int64");
    	}
    	
    	this.codigoObjeto += "sub" + "\n";
    }
    
    private void acao112() {
    	String valor1 = this.pilhaTipos.pop();
    	String valor2 = this.pilhaTipos.pop();
    	
    	if(valor1.equals("float64") || valor2.equals("float64")) {
    		this.pilhaTipos.push("float64");
    	} else {
    		this.pilhaTipos.push("int64");
    	}
    	
    	this.codigoObjeto += "mul" + "\n";
    }
    
    private void acao113() throws SemanticError{
    	String tipo1 = this.pilhaTipos.pop();
    	String tipo2 = this.pilhaTipos.pop();
    	
    	this.codigoObjeto += "div" + "\n";
    	
    	this.pilhaTipos.push("float64");
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
    
    private void acao116(Token token) {
    	this.pilhaTipos.push("string");
    	this.codigoObjeto += "ldstr " + token.getLexeme() + "\n";
    }
    
    private void acao117(Token token) {
    	
		this.codigoObjeto += "ldc.i8 -1"  + "\n"
    			+ "conv.r8" + "\n"
				+ "mul" + "\n";
   }
   
   private void acao118(Token token) throws SemanticError {
	   String tipoExpressao = this.pilhaTipos.pop();
	   if (!tipoExpressao.equals("bool")) {
		   throw new SemanticError("expressão incompatível em comando de seleção;", token.getPosition());
	   }
	   String novoRotulo1 = "novo_rotulo1";
	   this.codigoObjeto += "brfalse" + novoRotulo1 + "\n";
	   this.pilhaRotulos.add(novoRotulo1);
   }
   
   private void acao119() {
	   String novoRotulo = this.pilhaRotulos.pop();
	   this.codigoObjeto += novoRotulo + ":" + "\n";
   }
   
   private void acao120() {
	   String novoRotulo2 = "novo_rotulo2";
	   this.codigoObjeto += "br " + novoRotulo2 + "\n";
	   String novoRotulo1 = this.pilhaRotulos.pop();
	   this.codigoObjeto += novoRotulo1 + ":" + "\n";
	   this.pilhaRotulos.add(novoRotulo2);
   }
   
   private void acao121() {
	   String novoRotulo1 = "novo_rotulo1";
	   this.codigoObjeto += novoRotulo1 + ":" + "\n";
	   this.pilhaRotulos.add(novoRotulo1);
   }
   
   private void acao122(Token token) throws SemanticError {
	   String tipoExpressao = this.pilhaTipos.pop();
	   if (!tipoExpressao.equals("bool")) {
		   throw new SemanticError("expressão incompatível em comando de repetição;", token.getPosition());
	   }
	   String novoRotulo2 = "novo_rotulo2";
	   this.codigoObjeto += "brfalse" + novoRotulo2 + "\n";
	   this.pilhaRotulos.add(novoRotulo2);
   }
   
   private void acao123() {
	   String novoRotulo2 = this.pilhaRotulos.pop();
	   String novoRotulo1 = this.pilhaRotulos.pop();
	   this.codigoObjeto += novoRotulo1 + "\n"
			   + novoRotulo2 + ":" + "\n";
   }
   
   private void acao124(Token token) throws SemanticError {
	   String tipoExpressao = this.pilhaTipos.pop();
	   if (!tipoExpressao.equals("bool")) {
		   throw new SemanticError("expressão incompatível em comando de repetição;", token.getPosition());
	   }
	   String novoRotulo1 = "novo_rotulo1";
	   this.codigoObjeto += "brtrue" + novoRotulo1 + "\n";
   }
   
   private void acao125(Token token) {
	   this.listaId.add(token.getLexeme());
   }
   
   private void acao126(Token token) throws SemanticError {
	   for (int i = 0; i < listaId.size(); i++) {
		   String identificador = listaId.get(i);
		   if (tabelaSimbolos.get(identificador) != null) {
			   throw new SemanticError(token.getLexeme() + " já declarado;", token.getPosition());
		   }
			
		   String[][] arrayString = new String[1][1];
		   arrayString[0][0] = retornaTipoIdentificador(identificador);
		   arrayString[0][1] = token.getLexeme();
		   tabelaSimbolos.put(identificador, arrayString);
	   }
	   listaId.removeAll(listaId);
   }
   
   private void acao127(Token token) throws SemanticError {
	   for (int i = 0; i < listaId.size(); i++) {
		   String identificador = listaId.get(i);
		   if (tabelaSimbolos.get(identificador) != null) {
			   throw new SemanticError(token.getLexeme() + " já declarado;", token.getPosition());
		   }
			
		   String[][] arrayString = new String[1][2];
		   arrayString[0][0] = retornaTipoIdentificador(identificador);
		   arrayString[0][1] = identificador;
		   tabelaSimbolos.put(identificador, arrayString);
		   this.codigoObjeto += ".locals init (" + tabelaSimbolos.get(identificador)[0][0] + " " + identificador + ")" + "\n";
	   }
	   listaId.removeAll(listaId);
   }
   
   private void acao128(Token token) throws SemanticError {
	   String tipoExpressao = this.pilhaTipos.pop();
	   for (int i = 0; i < listaId.size()-1; i++) {
		   this.codigoObjeto += "dup" + "\n";
	   }
	   for (int i = 0; i < listaId.size(); i++) {
		   String identificador = listaId.get(i);
		   if (tabelaSimbolos.get(identificador) == null) {
			   throw new SemanticError(identificador  + " não declarado;", token.getPosition());
		   }
		   
		   if (tipoExpressao.equals("int64")) {
			   this.codigoObjeto += "conv.i8" + "\n";
		   }
		   this.codigoObjeto += "stloc " + identificador + "\n";
	   }
	   listaId.removeAll(listaId);
   }
   
   private void acao129(Token token) throws SemanticError {
	   for (int i = 0; i < this.listaId.size(); i++) {
			String identificador = this.listaId.get(i);
			var tabela_simbolos = this.tabelaSimbolos.get(identificador);
			if (tabela_simbolos == null) {
				throw new SemanticError(identificador  + " não declarado;", token.getPosition());
			}
			
			if (tabela_simbolos[0][0] == "int64") {
				this.codigoObjeto += "call string [mscorlib]System.Console::ReadLine()" + "\n" 
						+ "call " + tabela_simbolos[0][0] + " [mscorlib]System.Int64::Parse(string)" + "\n";
			}else if(tabela_simbolos[0][0] == "float64"){
				this.codigoObjeto += "call string [mscorlib]System.Console::ReadLine()" + "\n" 
						+ "call " + tabela_simbolos[0][0] + " [mscorlib]System.Double::Parse(string)" + "\n";
			}else if(tabela_simbolos[0][0] == "bool") {
				this.codigoObjeto += "call string [mscorlib]System.Console::ReadLine()" + "\n" 
						+ "call " + tabela_simbolos[0][0] + " [mscorlib]System.Boolean::Parse(string)" + "\n";
			}else {
				this.codigoObjeto += "call string [mscorlib]System.Console::ReadLine()" + "\n";
			}
			this.codigoObjeto += "stloc " + identificador + "\n";
	   }
	   this.listaId.removeAll(listaId);
   }
   
   private void acao130(Token token) {
	   this.codigoObjeto += "ldstr " + token.getLexeme() + "\n"
	   		+ "call void [mscorlib]System.Console::Write(string)" + "\n";
   }
   
   private void acao131(Token token) throws SemanticError {
	   String identificador = token.getLexeme();
	   String tipo = "";
	   String valor = "";
	   boolean existe = false;
	   for(int i = 0; i < tabelaSimbolos.size(); i++) {
		   if(tabelaSimbolos.get(identificador) != null) {
			   String[][] arrayString = new String[1][2];
			   arrayString = tabelaSimbolos.get(identificador);
			   tipo = arrayString[0][0];
			   valor = arrayString[0][1];
			   existe = true;
			   break;
		   }
	   }
	   if(!existe) {
		   throw new SemanticError(token.getLexeme() + " não declarado", token.getPosition());
	   }
	   if(tabelaSimbolos.get(identificador) != null) {
		   this.codigoObjeto += "ldloc " + identificador + "\n";
		   if(retornaTipoIdentificador(identificador).equals("int64")) {
			   this.codigoObjeto += "conv.r8" + "\n";
		   }
		   this.pilhaTipos.add(retornaTipoIdentificador(identificador));
	   }else {
		   if(tipo.equals("int64")) {
			   this.codigoObjeto += "ldc.i8 " + valor + "\n"
					   + "conv.r8" + "\n";
		   }else if(tipo.equals("float64")) {
			   this.codigoObjeto += "ldc.r8 " + valor + "\n";
		   }else if(tipo.equals("string")) {
			   this.codigoObjeto += "ldstr " + valor + "\n";
		   }else if(tipo.equals("bool")) {
			   if(valor.equals("true") || valor == "1") {
				   this.codigoObjeto += "ldc.i4 1 " + "\n";
			   }else {
				   this.codigoObjeto += "ldc.i4 0 " + "\n";
			   }
		   }
		   this.pilhaTipos.add(tipo);
	   }
   }
   
   private String retornaTipoIdentificador(String str) {
	   char tipo = str.charAt(1);
	   if (tipo == 'i') {
		return "int64";
	   }else if (tipo == 'f') {
		   return "float64";
	   }else if (tipo == 's') {
		   return "string";
	   }
	   return "bool";
   }
}
