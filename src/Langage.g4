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

//INT : ('0' .. '9')+;
//FLOAT : INT '.' INT;
NUM : ('0' .. '9')+('.')?('0'..'9')*;
VAR : ('a' .. 'z')+('a'..'z'|'A'..'Z'|'0'..'9')*; //VAR : [a-z][a-zA-Z0-9]*?;
WS : [ \t\n] -> skip;
CHAR : '\'' . '\'';
PARO : '(';
PARF : ')';
BRAO : '{';
BRAF : '}';
BOOL : ('true' | 'false');

// ***************** parser rules:

comp :
     '<'
   | '>'
   | '<='
   | '>='
   | '=='
   | '!=';

variable: VAR;
character:CHAR; // TODO

op : // TODO
     '+'
   | '*'
   | '-'
   | '/'
   | '%';

expr :
    NUM                         #number
  | variable                    #var
  | character                   #char // TODO
  | '"' .* '"'                  #string // TODO
  | left = expr op right = expr #operation;

bexp :
    ('true' | 'false')              #boolean
  | '!' bexp                        #not // TODO
  | PARO bexp  PARF                 #blockCondition // TODO
  | land = bexp '&&' rand = bexp    #and // TODO
  | lor = bexp '||' ror = bexp      #or // TODO
  | left = expr comp right = expr   #compare;

stmt :
    'skip'               #skip
  | variable '=' expr    #affectExpr
  | variable '=' bexp    #affectBool
  | stmt ';' stmt        #doubleStmt // TODO
  | BRAO lang BRAF       #block // TODO
  | variable '--'        #decrementVar // TODO
  | variable '++'        #incrementVar;

elseif :
    'else' 'if' PARO bexp PARF 'then' lang;

elseCond:
    'else' lang;

cond :
    'if' PARO ifE= bexp PARF 'then' ifB=lang elseCond? 'end';

loop :
    'for' PARO init=stmt ';' bexp ';' incr=stmt PARF 'do' lang 'end' #for
    | 'while' PARO bexp PARF 'do' lang 'end' #while;

lang :
    (stmt|cond|loop)*?;

prog :
    lang <EOF>;