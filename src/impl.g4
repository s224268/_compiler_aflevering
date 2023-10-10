grammar impl;

start : p=prog EOF ;

OUTPUTS : '.outputs';

INPUTS : '.inputs';

HW : '.hardware';

LATCHES : '.latches';

UPDATE : '.update';

SIMULATE : '.simulate';

BINARY: [01]+;

prog : HW ident=IDENTIFIER next=inputs;

//in=INPUTS may be unnecessary
inputs : in=INPUTS ident=IDENTIFIER+ next=outputs;

outputs : out=OUTPUTS put=IDENTIFIER+ next=latches;

latches : LATCHES latch* next=update;
latch : ident1=IDENTIFIER '->' ident2=IDENTIFIER;

update : UPDATE s=stmn* next=simulate;

simulate : SIMULATE IDENTIFIER '=' BINARY;

IDENTIFIER : [a-zA-Z] [a-zA-Z0-9]*;

COMMENT : '//' ~[\n]* -> skip;
MULTICOMMENT : '/*' (~[*] | '*'~[/])* '*/' -> skip;
WS : [ \n\t\r]+ -> skip;

stmn : i=IDENTIFIER '=' e=exp;

exp : i=IDENTIFIER           # Ident
    | op='!' e=exp           # Not
    | e1=exp op='&&' e2=exp  # And
    | e1=exp op='||' e2=exp  # Or
    | '(' e=exp ')'          # Paren
    ;