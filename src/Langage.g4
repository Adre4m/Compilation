grammar Langage;

options
{
  // antlr will generate java lexer and parser
  language = Java;
  // generated parser should create abstract syntax tree
  output = AST;
}

//as the generated lexer will reside in org.meri.antlr_step_by_step.parsers
//package, we have to add package declaration on top of it
@lexer::header {
//package org.meri.antlr_step_by_step.parsers;
}

//as the generated parser will reside in org.meri.antlr_step_by_step.parsers
//package, we have to add package declaration on top of it
@parser::header {
//package org.meri.antlr_step_by_step.parsers;
}


// ***************** lexer rules:

INT : ('0' .. '9')+;
FLOAT : INT '.' INT;
NUM : ('0' .. '9')+('.')?('0'..'9')*;
VAR : ('a' .. 'z')+('a'..'z'|'A'..'Z'|'0'..'9')*; //VAR : [a-z][a-zA-Z0-9]*?;
WS : [ \t\n] -> skip;
CHAR : '\'' . '\'';
PARO : '(';
PARF : ')';
BRAO : '{';
BRAF : '}';
CROO : '[';
CROF : ']';
VIR : ',';
BOOL : ('true' | 'false');
EGAL : '=';
NEW : 'new';
// ***************** parser rules:

comp :
     '<'
   | '>'
   | '<='
   | '>='
   | '=='
   | '!=';

//integer : INT;
//variable: VAR;

types : 'int' |'float'|'char'|tab; //char or string
//todo tableau

tab : 'array' PARO types PARF; //todo
op :
     '+'
   | '*'
   | '-'
   | '/'
   | '%';

expr :
    INT                         #int
  | FLOAT                       #float
  | VAR                         #var
  | CHAR                        #char       // TODO? //only 3 types
  | '"' .* '"'                  #string     // TODO? //only 3 types
  | left = expr op right = expr #operation;

bexp :
    ('true' | 'false')              #boolean         // fixme
  | '!' bexp                        #not
  | PARO bexp  PARF                 #blockCondition  // todo
  | land = bexp '&&' rand = bexp    #and             // TODO
  | lor = bexp '||' ror = bexp      #or              // TODO
  | left = expr comp right = expr   #compare;

stmt :
    'skip'               #skip
  | VAR EGAL expr    #affectExpr
  //| VAR '=' bexp    #affectBool
  // | stmt ';' stmt        #doubleStmt   // TODO?
  // | BRAO lang BRAF       #block        // TODO?
  | VAR '--'        #decrementVar
  | VAR '++'        #incrementVar;

elseCond:
    'else' lang;

cond :
    'if' PARO ifE= bexp PARF 'then' ifB=lang elseCond? 'end';

loop :
    'for' PARO init=stmt ';' bexp ';' incr=stmt PARF 'do' lang 'end' #for
    | 'while' PARO bexp PARF 'do' lang 'end' #while;

lang :
    (stmt|cond|loop)*?;

bodymeth :
    VAR PARO ((declarations VIR)* declarations)? PARF;

method :
    'procedure' bodymeth 'is' lang #procedure
    | 'function' bodymeth types 'is' lang 'return' (stmt | expr) #functions;


declarations :
   types VAR;

prog :
   BRAO declarations*? lang BRAF <EOF>;