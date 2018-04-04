grammar PP;

type returns [Type value]: 
	'integer' {$value = new Integer();} 
	| 'boolean' {$value = new Boolean();} 
	| 'array' 'of' t = type {$value = new ArrayOf($t.value);} 
;

k returns [K value]: 
	n = number {$value = new ConstInt(Integer.parseInt($n.text));} 
	| 'true' {$value = new ConstBool(true);} 
	| 'false' {$value = new ConstBool(false);} 
;

uop returns [Uop value]: 
	'-' 
	| 'not' 
;

bop returns [Bop value]: 
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

phi returns [Phi value]: 
	'read' 
	| 'write' 
	| var
;

e returns [E value]: 
	k 
	| var
	| uop e 
	| e bop e 
	| phi '(' e* ')' 
	| e '[' e ']' 
	| 'new' 'array' 'of' type '[' e ']' 
;


i returns [I value]: 
	var ':=' e 
	| e '[' e ']' ':=' e 
	| 'if' e 'then' e 'else' e 
	| 'while' e 'do' i 
	| phi '(' e* ')' 
	| 'skip'
	| i ';' i
;

d returns [Procedures value]: 
	var '(' arg* ')' [ ':' type ]
	[ 'var' '(' var ':' type ')'+ ]
	i
;
arg : '(' var ':' type ')'

p returns [Programs value]: 
	[ 'var' '(' var ':' type ')'+ ]
	d*
	i
;

var : [a-z]+ ;
number : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;