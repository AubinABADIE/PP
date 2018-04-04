grammar PP;

type returns [Type value]: 
	'integer' {$value = new Integer();} 
	| 'boolean' {$value = new Boolean();} 
	| 'array' 'of' t = type {$value = new ArrayOf($t.value);} 
;

exp returns [E value]: 
	number {$value = new ConstInt(Integer.parseInt($c.text));} 
	| 'true' {$value = new ConstBool(true);} 
	| 'false' {$value = new ConstBool(false);} 

	| '-' a = exp {$value = new Inv($a.value);} 
	| 'not' b = exp {$value = new Not($b.value);} 

	| c = exp '+' d = exp {$value = new Plus($c.value, $d.value);}
	| e = exp '-' f = exp {$value = new Minus($e.value, $f.value);}
	| g = exp '*' h = exp {$value = new Multiply($g.value, $h.value);}
	| i = exp '/' j = exp {$value = new Divide($i.value, $j.value);}
	| k = exp 'and' l = exp {$value = new And($k.value, $l.value);}
	| m = exp 'or' n = exp {$value = new Or($m.value, $n.value);}
	| o = exp '<' p = exp {$value = new StrictlySmaller($o.value, $p.value);}
	| q = exp '<=' r = exp {$value = new SmallerOrEqual($q.value, $r.value);}
	| s = exp '=' t = exp {$value = new Equal($s.value, $t.value);}
	| u = exp '!=' v = exp {$value = new Different($u.value, $v.value);}
	| w = exp '>=' x = exp {$value = new GreaterOrEqual($w.value, $x.value);}
	| y = exp '>' z = exp {$value = new StrictlyGreater($y.value, $z.value);}
 
	| 'read' {$value = new Read();}
	| 'write' {$value = new Write();}
	| var {$value = new Var();}

	| aa = exp '[' bb = exp ']' {$value = new EofE($aa.value, $bb.value);}
	| 'new' 'array' 'of' cc = type '[' dd = exp ']' {$value = new NewArrayOf($cc.value, $dd.value);}
;


i returns [I value]: 
	a = var ':=' b = exp {$value = new ($a.text, $b.value);}
	| c = exp '[' d = exp ']' ':=' e = exp {$value = new EofEEqualsE($c.value, $d.value, $e.value);}
	| 'if' f = exp 'then' g = exp 'else' h = exp {$value = new If($f.value, $g.value, $h.value);}
	| 'while' i = exp 'do' j = exp {$value = new While($i.value, $j.value);}
	| phi '(' exp* ')' 
	| 'skip' {$value = new Skip();}
	| k = i ';' l = i {$value = new IPointVirguleI($k.value, $l.value);}
;

d returns [D value]: 
	var '(' arg* ')' [ ':' type ]
	[ 'var' '(' var ':' type ')'+ ]
	i
;
arg : '(' var ':' type ')'

p returns [P value]: 
	[ 'var' '(' var ':' type ')'+ ]
	d*
	i
;

var : [a-z]+ ;
number : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;