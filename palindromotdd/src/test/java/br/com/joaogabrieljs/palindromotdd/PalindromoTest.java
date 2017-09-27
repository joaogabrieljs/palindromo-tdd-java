package br.com.joaogabrieljs.palindromotdd;

import br.com.joaogabrieljs.palindromotdd.Palindromo;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PalindromoTest 
    extends TestCase
{
	
    public PalindromoTest( String testName )
    {
        super( testName );
    }


    public static Test suite()
    {
        return new TestSuite( PalindromoTest.class );
    }

    public void testEhPalindromo()
    {
    	String frasePalindromo1 = "Socorram-me subi no onibus em Marrocos";
        assertTrue(new Palindromo().ehPalindromo(frasePalindromo1));
        
        String frasePalindromo2 = "Anotaram a data da maratona";
        assertTrue(new Palindromo().ehPalindromo(frasePalindromo2));
    }
    
    public void testNaoEhPalindromo()
    {
    	String frasePalindromo = "Essa frase não é Palindromo";
        assertFalse(new Palindromo().ehPalindromo(frasePalindromo));
    }
}
