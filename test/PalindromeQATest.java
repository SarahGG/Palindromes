import com.company.PalindromeQA;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeQATest {

    @Test
    public void ABBAReturns6() {
        int palindromes = PalindromeQA.calculatePalindromes("ABBA");
        Assert.assertEquals(palindromes, 6);
    }

    @Test
    public void ABABAReturns9() {
        int palindromes = PalindromeQA.calculatePalindromes("ABABA");
    }

    @Test
    public void TACOCATIsPalindromeReturnsTrue() {
        boolean isPalindrome = PalindromeQA.isPalindrome("TACOCAT");
        Assert.assertTrue(isPalindrome);
    }

    @Test
    public void TACODOGIsPalindromeReturnsFalse() {
        boolean isPalindrome = PalindromeQA.isPalindrome("TACODOG");
        Assert.assertFalse(isPalindrome);
    }
}
