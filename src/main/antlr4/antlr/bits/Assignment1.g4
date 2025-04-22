/**
 * Write your info here
 * 
 * @name Jane Smith 
   @id 52-0234 
   @tutNumber 06
 */

grammar Assignment1;

/**
 * This rule is to check your grammar using "ANTLR Preview"
 */
test:
	/* (Rule1 | Rule2 | ... | RuleN)+ */ EOF; //Replace the non-fragment lexer rules here

// Write all the necessary lexer rules and fragment lexer rules here 



// dummy rule (to prevent compilation error), replace with your own rules for the assignment
BIT: '0' | '1';
