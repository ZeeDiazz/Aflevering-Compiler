grammar HDL0;

start : (h=hardware+ i=input+ o=output+ l=latches+ u=update+ s=simulate+) EOF # Begin;

hardware : '.hardware ' CIRCUITNAME # HardwareProg;
input : '.inputs' (' '*? ins=ID)+   # Ins;
output : '.outputs' (' '*? outs=ID)+    # Outs;
latches : '.latches' ' '*? latch+   # Lats;
update : '.update' ' '*? assignment_stmt+   # Udt;
simulate : '.simulate' ' '*? simulate_stmt+ # Simp;

latch : lat1=ID ' '* '->' ' '* lat2=ID  # Lat;

assignment_stmt : asig=ID ' '* '=' ' '* expression   # Asstmt;

simulate_stmt : var=ID ' '* '=' ' '* BINARY # Sstmt;

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

WHITESPACE : [ \n\t]+ -> skip;
