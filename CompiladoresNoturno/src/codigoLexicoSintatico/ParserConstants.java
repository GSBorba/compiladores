package codigoLexicoSintatico;

public interface ParserConstants
{
    int START_SYMBOL = 37;

    int FIRST_NON_TERMINAL    = 37;
    int FIRST_SEMANTIC_ACTION = 70;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1, -1, -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1,  1, -1, -1, -1, -1, -1, -1, -1,  1,  1, -1,  1,  1, -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1,  4, -1, -1, -1, -1, -1, -1, -1,  7,  5, -1,  6,  8, -1,  8, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, 16, 17, 18, -1, -1, 20, -1, -1, -1, -1, -1, -1, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, 24, 22, -1, 23, 25, -1, 25, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 26, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 27, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 29, -1, -1, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 39, -1, -1, -1, -1, -1, -1, -1, 39, 39, -1, 39, 39, -1, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 44, 44, 44, 44, -1, -1, 44, -1, -1, -1, -1, -1, -1, 44, -1, -1, -1, 44, -1, -1, -1, -1, 44, -1, -1, -1, -1, -1, -1, -1, 44, 44, -1, -1 },
        { -1, -1, 33, 33, 33, 33, -1, -1, 33, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, 33, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, 33, 33, -1, -1 },
        { -1, -1,  2, -1, -1, -1, -1, -1, -1, -1,  2,  2, -1,  2,  2, -1,  2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  3, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 14, 15, 15, 15, -1, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 30, -1, -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, 40, 40, -1, 40, 40, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 48, 48, 48, 48, -1, -1, 50, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, 51, -1, -1, -1, -1, 48, -1, -1, -1, -1, -1, -1, -1, 48, 48, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 46, 47, -1, 45, 45, -1, -1, -1, 45, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 52, 52, 52, 52, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 52, -1, -1, -1, -1, -1, -1, -1, 52, 52, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 53, 53, -1, 53, 53, -1, -1, -1, 53, -1, -1, 54, 54, 54, 54, -1, -1, -1, -1 },
        { -1, -1, 59, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, 59, 59, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 60, 60, -1, 60, 60, -1, -1, -1, 60, -1, -1, 60, 60, 60, 60, 61, 62, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 55, 56, 57, 58, -1, -1, -1, -1 },
        { -1, -1, 63, 63, 63, 63, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 63, -1, -1, -1, -1, -1, -1, -1, 63, 63, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 64, 64, -1, 64, 64, -1, -1, -1, 64, -1, -1, 64, 64, 64, 64, 64, 64, 65, 66 },
        { -1, -1, 67, 68, 69, 70, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 71, -1, -1, -1, -1, -1, -1, -1, 72, 73, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11,  9, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        { 170,  10,  13,  27,  38,  28, 171 },
        {  39,  22,  53 },
        {  38 },
        {   0 },
        {  41,  69 },
        {  45 },
        {  46 },
        {  47 },
        {  48 },
        {  40, 196 },
        { 197 },
        {  23,  51, 198 },
        {  24,  42 },
        {   3, 195,  54 },
        {  21,  41 },
        {   0 },
        {   4 },
        {   5 },
        {   6 },
        {  16 },
        {   9 },
        {  44 },
        {  45 },
        {  46 },
        {  47 },
        {  48 },
        {  41,  23,  51, 198 },
        {  12,  25,  49,  26 },
        {   6, 200,  21,  41, 199,  55 },
        {  41, 199,  55 },
        {  22,  49 },
        {   0 },
        {  14,  25,  52,  26 },
        {  51, 172,  56 },
        {  21,  52 },
        {   0 },
        {  11,  25,  51,  26, 188,  27,  50,  28,  57, 189 },
        { 190,   8,  27,  50,  28 },
        {   0 },
        {  43,  22,  58 },
        {  50 },
        {   0 },
        { 191,  17,  25,  51,  26, 192,   7,  27,  50,  28, 193 },
        { 191,  15,  27,  50,  28,  17,  25,  51,  26, 194 },
        {  59,  60 },
        {   0 },
        {  18,  59, 173,  60 },
        {  19,  59, 174,  60 },
        {  61 },
        {  16, 175 },
        {   9, 176 },
        {  20,  59, 177 },
        {  63,  62 },
        {   0 },
        {  65, 178,  63, 179 },
        {  29 },
        {  30 },
        {  31 },
        {  32 },
        {  66,  64 },
        {   0 },
        {  33,  66, 180,  64 },
        {  34,  66, 181,  64 },
        {  68,  67 },
        {   0 },
        {  35,  68, 182,  67 },
        {  36,  68, 183,  67 },
        {   3, 201 },
        {   4, 184 },
        {   5, 185 },
        {   6, 186 },
        {  25,  51,  26 },
        {  33,  68 },
        {  34,  68, 187 }
    };

    String[] PARSER_ERROR =
    {
    	"",
        "esperado EOF",
        "esperado reservada",
        "esperado identificador",
        "esperado int",
        "esperado float",
        "esperado string",
        "esperado do",
        "esperado else",
        "esperado false",
        "esperado fun",
        "esperado if",
        "esperado in",
        "esperado main",
        "esperado out",
        "esperado repeat",
        "esperado true",
        "esperado while",
        "esperado &",
        "esperado |",
        "esperado !",
        "esperado ,",
        "esperado ;",
        "esperado =",
        "esperado :",
        "esperado (",
        "esperado )",
        "esperado {",
        "esperado }",
        "esperado ==",
        "esperado !=",
        "esperado <",
        "esperado >",
        "esperado +",
        "esperado -",
        "esperado *",
        "esperado /",
        "esperado fun", //<formaGeral> inválido",
        "esperado identificador if in out repeat while",//<listaInstrucoes> inválido",
        "esperado identificador if in out repeat while", //<instrucao> inválido",
        "esperado :", //<declaracaoConstate> inválido",
        "esperado identificador", //<listaIdentificadores> inválido",
        "esperado int float string false true", //"<valor> inválido",
        "esperado identificador if in out repeat while", //"<comando> inválido",
        "esperado identificador", //"<atribuicao> inválido",
        "esperado in", //"<entradaDados> inválido",
        "esperado out", //"<saidaDados> inválido",
        "esperado if", //"<selecao> inválido",
        "esperado repeat while", //"<repeticao> inválido",
        "esperado identificador string", //"<listaEntrada> inválido",
        "esperado identificador if in out repeat while", //"<listaComandos> inválido",
        "esperado identificador int float string false true ! ( + -",//"<expressao> inválido",
        "esperado identificador int float string false true ! ( + -", //"<listaExpressoes> inválido",
        "esperado identificador if in out repeat while }", //"<listaInstrucoes1> inválido",
        "esperado , ; = : )", //"<listaIdentificadores1> inválido",
        "esperado ; )", //"<listaEntrada1> inválido",
        "esperado , )", //"<listaExpressoes1> inválido",
        "esperado else ;", //"<selecao1> inválido",
        "esperado identificador if in out repeat while }", //"<listaComandos1> inválido",
        "esperado identificador int float string false true ! ( + -", //"<elemento> inválido",
        "esperado & | , ; )", //"<expressao_> inválido",
        "esperado identificador int float string ( + -", //"<relacional> inválido",
        "esperado & | , ; ) == != < >", //"<relacional_> inválido",
        "esperado identificador int float string ( + -", //"<aritmetica> inválido",
        "esperado & | , ; ) == != < > + -", //"<aritmetica_> inválido",
        "esperado == != < >", //"<operador_relacional> inválido",
        "esperado identificador int float string ( + -", //"<termo> inválido",
        "esperado & | , ; ) == != < > + - * /", //"<termo_> inválido",
        "esperado identificador int float string ( + -", //"<fator> inválido",
        "esperado ; = :", //"<instrucao1> inválido"
    };
}
