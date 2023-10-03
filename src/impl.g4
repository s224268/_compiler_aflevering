grammar impl;

start : (prog) EOF ;

OUTPUTS : '.outputs';

INPUTS : '.inputs';

HW : '.hardware';

LATCHES : '.latches';

UPDATE : '.update';

SIMULATE : '.simulate';

BINARY: [01]+;

skippable : (WS | MULTICOMMENT | COMMENT)+;

prog : HW ident=IDENTIFIER inputs;

inputs : in=INPUTS ident=IDENTIFIER+ outputs;

outputs : out=OUTPUTS ident=IDENTIFIER+ latches;

latches : LATCHES latch* update;
latch : ident1=IDENTIFIER '->' ident2=IDENTIFIER;

update : UPDATE stmn* simulate;

simulate : SIMULATE IDENTIFIER '=' BINARY;

IDENTIFIER : [a-zA-Z] [a-zA-Z0-9]*;

COMMENT : '//' ~[\n]* -> skip;
MULTICOMMENT : '/*' (~[*] | '*'~[/])* '*/' -> skip;
WS : [ \n\t\r]+ -> skip;

stmn : IDENTIFIER '=' exp;

exp : i=IDENTIFIER           #identifier
    | op='!' e=exp           #not
    | e1=exp op='&&' e2=exp  #and
    | e1=exp op='||' e2=exp  #or
    | '(' e=exp ')'          #paren
    ;