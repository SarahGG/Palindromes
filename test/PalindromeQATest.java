import com.company.PalindromeQA;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeQATest {

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
