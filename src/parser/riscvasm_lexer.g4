lexer grammar riscvasm_lexer;

fragment A:[aA];
fragment B:[bB];
fragment C:[cC];
fragment D:[dD];
fragment E:[eE];
fragment F:[fF];
fragment G:[gG];
fragment H:[hH];
fragment I:[iI];
fragment J:[jJ];
fragment K:[kK];
fragment L:[lL];
fragment M:[mM];
fragment N:[nN];
fragment O:[oO];
fragment P:[pP];
fragment Q:[qQ];
fragment R:[rR];
fragment S:[sS];
fragment T:[tT];
fragment U:[uU];
fragment V:[vV];
fragment W:[wW];
fragment X:[xX];
fragment Y:[yY];
fragment Z:[zZ];

ADD : A D D ;
ADDI : A D D I ;
ATTRIBUTE : A T T R I B U T E ;

BEQ : B E Q ;
BNE : B N E ;

CALL : C A L L ;

DEC : D E C ;

EICALL : E I C A L L ;

FMUL : F M U L ;

ICALL : I C A L L ;

JMP : J M P ;

LBU : L B U ;
LI : L I ;

MV : M V ;

NOP : N O P ;

OPTION : O P T I O N ;

POP : P O P ;
PUSH : P U S H ;

RET : R E T ;

SB : S B ;

TST : T S T ;

WDR : W D R ;

XCH : X C H ;



ASTERISK : '*' ;
AT : '@' ;

BYTE : B Y T E ;
BACKSLASH: '\\' ;

CLOSEING_BRACKET : ')' ;
COLON : ':' ;
COMMA : ',' ;
CSEG : 'cseg' ;

DB : 'db' ;
DEF : 'def' ;
DEVICE : 'device' ;
DOT : '.' ;
DSEG : 'dseg' ;

ELSE : 'else' ;
END_MACRO : 'endmacro' ;
ENDIF : 'endif' ;
EQUALS : '=' ;
EQU : E Q U ;
ERROR : 'error' ;

GT : '>' ;

HASH_TAG : '#' ;

IF : 'if' ;
INCLUDE : 'include' ;

LEFT_SHIFT : '<<' ;
LT : '<' ;

MACRO : 'macro' ;
MINUS : '-' ;

OPENING_BRACKET : '(' ;
ORG : 'org' ;

PLUS : '+' ;

RIGHT_SHIFT : '>>' ;

SLASH : '/' ;

NEWLINE : '\r'? '\n' ;

//WS : [ \t\n\r\f]+ -> channel(HIDDEN) ;
WS : [ \t\n\r\f]+ -> skip  ;
//WS : [ \t\f]+ -> skip  ;

//LINE_COMMENT : '#' ~[\r\n]* -> channel(HIDDEN) ;
LINE_COMMENT 
    : 
    //( '#' | HASH_TAG ) ~[\r\n]* -> skip // hashtag is reserved for the preprocessor
    ( '#' ) ~[\r\n]* -> skip 
    ;

//BLOCK_COMMENT 
//    : 
    // non-greedy
//    '/*' .*? '*/' -> skip 
    // greedy
    //'/*' .* '*/' -> skip 
//    ;

BLOCK_COMMENT : '/*' (BLOCK_COMMENT|.)*? '*/' -> channel(HIDDEN) ;

DOUBLE_SLASH_LINE_COMMENT : '//' .*? '\n' -> channel(HIDDEN) ;

STRING : '"' ( '""' | ~'"' )* '"' ; // quote-quote is an escaped quote
CHAR : '\'' (.) '\'' ;
ESCAPED_CHAR : '\'' '\\' (.) '\'' ;

NUMBER : ( PLUS | MINUS )?[0-9]+ ;
HEX_NUMBER : ('0' 'x' | '$') [a-fA-F0-9]+ ;
BINARY_NUMBER : '0' 'b' [0,1]+ ;

IDENTIFIER : [a-zA-Z_]([a-zA-Z0-9_])* ;