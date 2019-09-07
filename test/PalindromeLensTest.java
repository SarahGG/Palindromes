import com.company.PalindromeLens;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeLensTest {
    private PalindromeLens blankPalindromeLens = new PalindromeLens("");
    private PalindromeLens smallLens = new PalindromeLens("babbab"); // has 11 palindrome substrings

    @Test
    public void settingStartIndexTo2ReturnsStartIndexOf2() {
        blankPalindromeLens.setStartIndex(2);
        Assert.assertEquals(blankPalindromeLens.getStartIndex(), 2);
    }

    @Test
    public void initializingBlankLensReturnsStartIndexOf0() {
        Assert.assertEquals(blankPalindromeLens.getStartIndex(), 0);
    }

    @Test
    public void initializingSmallLensReturnsStartIndexOf0() {
        Assert.assertEquals(smallLens.getStartIndex(), 0);
    }


    @Test
    public void settingEndIndexTo2ReturnsEndIndexOf2() {
        blankPalindromeLens.setEndIndex(2);
        Assert.assertEquals(blankPalindromeLens.getEndIndex(), 2);
    }

    @Test
    public void initializingBlankLensReturnsEndIndexOf0() {
        Assert.assertEquals(blankPalindromeLens.getEndIndex(), 0);
    }

    @Test
    public void newSmallLensReturnsEndIndexOf5() {
        Assert.assertEquals(smallLens.getEndIndex(), 5);
    }


    @Test
    public void settingPalindromeSizeTo2ReturnsPalindromeSizeOf2() {
        blankPalindromeLens.setPalindromeSize(2);
        Assert.assertEquals(blankPalindromeLens.getPalindromeSize(), 2);
    }

    @Test
    public void initializingBlankLensReturnsPalindromeSizeOf0() {
        Assert.assertEquals(blankPalindromeLens.getPalindromeSize(), 0);
    }

    @Test
    public void newSmallLensReturnsPalindromeSizeOf6() {
        Assert.assertEquals(smallLens.getPalindromeSize(), 6);
    }


    @Test
    public void settingIndexOffsetTo2ReturnsIndexOffsetOf2() {
        blankPalindromeLens.setIndexOffset(15);
        Assert.assertEquals(blankPalindromeLens.getIndexOffset(), 15);
    }

    @Test
    public void initializingBlankLensReturnsIndexOffsetOf0() {
        Assert.assertEquals(blankPalindromeLens.getIndexOffset(), 0);
    }

    @Test
    public void newSmallLensReturnsIndexOffsetOf0() {
        Assert.assertEquals(smallLens.getIndexOffset(), 0);
    }


    @Test
    public void settingMaxIndexOffsetTo8ReturnsIndexOffsetOf8() {
        blankPalindromeLens.setMaxIndexOffset(8);
        Assert.assertEquals(blankPalindromeLens.getMaxIndexOffset(), 8);
    }

    @Test
    public void initializingBlankLensReturnsMaxIndexOffsetOf0() {
        Assert.assertEquals(blankPalindromeLens.getIndexOffset(), 0);
    }

    @Test
    public void newSmallLensReturnsMaxIndexOffsetOf2() {
        Assert.assertEquals(smallLens.getMaxIndexOffset(),2);
    }
}
