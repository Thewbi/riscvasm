parser grammar riscvasm;
options { tokenVocab=riscvasm_lexer; }

program :
	NEWLINE* 
    source_line ( NEWLINE* source_line )* NEWLINE* 
    EOF 
	;
	
source_line :
    label_definition
	|
	instruction
	|
	pseudo_op
	;
	
label_definition : label COLON ;

label : ( DOT )? IDENTIFIER ;
	
instruction : mnemonic ( param ( COMMA param )+ )? ;

pseudo_op :
	DOT (
		ATTRIBUTE expression COMMA expression
		|
        //INCLUDE STRING
        //|
        //DEVICE IDENTIFIER
        //|
        //DEF IDENTIFIER EQUALS expression
        //|
        EQU IDENTIFIER COMMA expression
        //| 
        //CSEG
        //|
        //DSEG
        //|
        //DB byte_csv
        //|
        //BYTE expression
        //|
        //ORG ( HEX_NUMBER | IDENTIFIER )
		|
		OPTION ( PUSH | POP | IDENTIFIER ) ( COMMA expression )?
        //| 
        //MACRO IDENTIFIER
        //| 
        //END_MACRO
        //| 
        //IF expression
        //| 
        //ELSE
        //| 
        //ENDIF
        //| 
        //ERROR STRING
    )
    ;

//param : ( ( MINUS )? IDENTIFIER ( PLUS )? ) | expression | asm_intrinsic_usage | macro_placeholder | register_pair ;

param : 
	expression
	|
	param_offset
	|
	label
	;
	
param_offset :
	expression OPENING_BRACKET expression CLOSEING_BRACKET
	;
	
expression : 
    OPENING_BRACKET expression CLOSEING_BRACKET
    |
//    expression LEFT_SHIFT expression
//    |
//    expression RIGHT_SHIFT expression
//    |
//    expression ASTERISK expression // multiplication
//    |
//    expression SLASH expression  // division
//    |
//    expression GT expression // I think boolean results go into a predicate and not into an expression
//    |
//    expression LT expression // I think boolean results go into a predicate and not into an expression
//    |
//    expression EQUALS expression // no equals since an expression has to return a value
//    |
//    expression PLUS expression
//    |
//    expression MINUS expression
//    |
//    DOT ( PLUS | MINUS ) numeric
//    |
	( PLUS | MINUS ) expression
	|
    BINARY_NUMBER
    |
    HEX_NUMBER
    | 
    NUMBER 
    |
    IDENTIFIER
    |
    STRING
    |
    CHAR
    |
    ESCAPED_CHAR
//    |
//    macro_placeholder
    ;
	
mnemonic :
    mnemonic_a
    |
    mnemonic_b
//    |
//    mnemonic_c
//    |
//    mnemonic_d
//    |
//    mnemonic_e
//    |
//    mnemonic_f
//    |
//    mnemonic_i
//    |
//    mnemonic_j
    |
    mnemonic_l
    |
    mnemonic_m
    |
    mnemonic_n
//    |
//    mnemonic_o
    |
    mnemonic_p
    |
    mnemonic_r
    |
    mnemonic_s
//    |
//    mnemonic_t
//    |
//    mnemonic_w
//    |
//    mnemonic_x
    ;

mnemonic_a :
    ADD | ADDI
    ;

mnemonic_b :
    BEQ | BNE
    ;

//mnemonic_c :
//    CALL | CBI | CBR | CLC | CLH | CLI | CLN | CLR | CLS | CLT | CLV | CLZ | COM | CP | CPC | CPI | CPSE 
//    ;

//mnemonic_d :
//    DEC | DES
//    ;

//mnemonic_e :
//    EICALL | EIJMP | ELPM | EOR
//    ;

//mnemonic_f :
//    FMUL | FMULS | FMULSU
//    ;

//mnemonic_i :
//    ICALL | IJMP | IN | INC
//    ;

//mnemonic_j :
//    JMP
//    ;

mnemonic_l :
    LI | LBU
    ; 

mnemonic_m :
    MV
    ;

mnemonic_n :
    NOP
    ;

//mnemonic_o :
//    OR | ORI | OUT
//    ;

mnemonic_p :
    POP | PUSH
    ;

mnemonic_r :
    RET
    ;

mnemonic_s :
    SB
    ;

//mnemonic_t :
//    TST
//    ;

//mnemonic_w :
//    WDR
//    ;

//mnemonic_x :
//    XCH
//    ;


