grammar main;

start : (hardware input output latches update simulate) EOF;

hardware : '.hardware ' CIRCUITNAME;
input : '.inputs' (' '*? ins=ID)+;
output : '.outputs' (' '*? ID)+;
latches : '.latches' ' '*? latch+;
update : '.update' ' '*? assignment_stmt+;
simulate : '.simulate' ' '*? simulate_stmt+;

latch : ID ' '* '->' ' '* ID;

assignment_stmt : var=ID ' '* '=' ' '* expression;

simulate_stmt : var=ID ' '* '=' ' '* BINARY;

expression : var=ID   # Var
           | '(' e=expression ')'   # Condition
           | '!' e=expression # Negate
           | e1=expression ' '*? '&&' ' '*? e2=expression   # OG
           | e1=expression ' '*? '||' ' '*? e2=expression   # Eller
           ;

COMMENT : '//' .*? '\n' -> skip;
MULTILINE_COMMENT : '/*' .*? '*/' -> skip;
CIRCUITNAME : [a-z]+;
ID : [A-Z]+[A-Za-z0-9]+;
BINARY : [01]+;

WHITESPACE : [ \n\t] -> skip;
