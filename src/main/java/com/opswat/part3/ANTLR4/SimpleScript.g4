grammar SimpleScript;

script: command+ EOF;

command
    : PRINT STRING
    | ADD NUMBER NUMBER
    | SUBTRACT NUMBER NUMBER
    | EXIT
    ;

PRINT: 'print';
ADD: 'add';
SUBTRACT: 'subtract';
EXIT: 'exit';

STRING: '"' (~["\\])* '"';
NUMBER: [0-9]+;

WS: [ \t\r\n]+ -> skip;
