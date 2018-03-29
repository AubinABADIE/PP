grammar PP;

type : 
	'integer' 
	| 'boolean' 
	| 'array' 'of' type 
;

k : 
	'n' 
	| 'true' 
	|'false' 
;

uop : 
	'-' 
	| 'not' 
;

bop : 
	'+' 
	| '-' 
	| '*' 
	| '/' 
	| 'and' 
	| 'or' 
	| '<' 
	| '<=' 
	| '=' 
	| '!=' 
	| '>=' 
	| '>' 
;

phi : 
	'read' 
	| 'write' 
	| ID
;

e : 
	k 
	| ID
	| uop e 
	| e bop e 
	| phi '(' e* ')' 
	| e '[' e ']' 
	| 'new' 'array' 'of' 'type' '[' e ']' 
;


i : 
	ID ':=' e 
	| e '[' e ']' ':=' e 
	| 'if' e 'then' e 'else' e 
	| 'while' e 'do' i 
	| phi '(' e* ')' 
	| 'skip'
	| i ';' i
;

d : 
	ID '(' arg* ')' [ ':' type ]
	[ 'var' '(' ID ':' type ')'+ ]
	i
;
arg : '(' ID ':' type ')'

p : 
	[ 'var' '(' ID ':' type ')'+ ]
	d*
	i
;

ID : [a-z]+ ;
WS : [ \t\r\n]+ -> skip ;