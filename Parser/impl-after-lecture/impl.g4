grammar impl;

// taking only part of last week's impl:

start   : e=exp EOF  ;

exp : x=IDENTIFIER	          # Var
    | f=FLOAT			  # Const
    | e1=exp op=('*'|'/') e2=exp  # Mult
    | e1=exp op=('+'|'-') e2=exp  # Add
    | '(' e=exp ')'   	  	  # Paren
    ;
    
IDENTIFIER : [a-zA-Z] [a-zA-Z_0-9]* ;  // x17y

// Just using FLOAT this time, including integer values (the '.' is optional)
FLOAT      : [0-9]+ ('.' [0-9]+)? ;

WHITESPACE : [ \t\n]+ -> skip;

COMMENT : '//' ~[\n]* -> skip;
LONGCOMMENT : '/*' (~[*] | '*'~[/])* '*/' -> skip;
