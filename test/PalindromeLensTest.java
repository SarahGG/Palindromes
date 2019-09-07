import com.company.PalindromeLens;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeLensTest {
    private PalindromeLens blankPalindromeLens = new PalindromeLens();

    @Test
    public void settingStartIndexTo2ReturnsStartIndexOf2() {
        blankPalindromeLens.setStartIndex(2);
        Assert.assertEquals(blankPalindromeLens.getStartIndex(), 2);
    }

    @Test
    public void initializingBlankLensReturnsStartIndexOf0() {
        Assert.assertEquals(blankPalindromeLens.getStartIndex(), 0);
    }
}
