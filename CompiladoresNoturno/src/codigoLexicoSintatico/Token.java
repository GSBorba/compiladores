package codigoLexicoSintatico;

public class Token
{
    private int id;
    private String lexeme;
    private int position;

    public Token(int id, String lexeme, int position)
    {
        this.id = id;
        this.lexeme = lexeme;
        this.position = position;
    }

    public final int getId()
    {
        return id;
    }

    public final String getLexeme()
    {
        return lexeme;
    }

    public final int getPosition()
    {
        return position;
    }

    public String toString()
    {
        return id+" ( "+lexeme+" ) @ "+position;
    };
    
    public String getClasse() {
    	if (this.getId() == 3) {
			return "Identificador";
		}else if (this.getId() == 4) {
			return "Constante _Int";
		}else if (this.getId() == 5) {
			return "Constante _Float";
		}else if (this.getId() == 6) {
			return "Constante _String";
		}else if (this.getId() >= 7 && this.getId() <= 17) {
			return "Palavra Reservada";
		}else if (this.getId() >= 18 && this.getId() <= 36) {
			return "Símbolo Especial";
		}else {
			return "Inválido";
		}
    }
}
