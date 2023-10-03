grammar impl;

start : p=prog EOF ;

OUTPUTS : '.outputs';

INPUTS : '.inputs';

HW : '.hardware';

LATCHES : '.latches';

UPDATE : '.update';

SIMULATE : '.simulate';

BINARY: [01]+;

skippable : (WS | MULTICOMMENT | COMMENT)+;

prog : HW ident=IDENTIFIER next=inputs;

//in=INPUTS may be unnecessary
inputs : in=INPUTS ident=IDENTIFIER+ next=outputs;

outputs : out=OUTPUTS put=output+ next=latches;
output  : ident=IDENTIFIER;

latches : LATCHES latch* next=update;
latch : ident1=IDENTIFIER '->' ident2=IDENTIFIER;

update : UPDATE stmn* simulate;

simulate : SIMULATE IDENTIFIER '=' BINARY;

IDENTIFIER : [a-zA-Z] [a-zA-Z0-9]*;

COMMENT : '//' ~[\n]* -> skip;
MULTICOMMENT : '/*' (~[*] | '*'~[/])* '*/' -> skip;
WS : [ \n\t\r]+ -> skip;

stmn : IDENTIFIER '=' exp;

exp : i=IDENTIFIER           # Ident
    | op='!' e=exp           # Not
    | e1=exp op='&&' e2=exp  # And
    | e1=exp op='||' e2=exp  # Or
    | '(' e=exp ')'          # Paren
    ;