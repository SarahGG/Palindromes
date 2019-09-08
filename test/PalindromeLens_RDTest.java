import com.company.PalindromeLens_RD;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeLens_RDTest {
    private PalindromeLens_RD blankLens = new PalindromeLens_RD("");
    private PalindromeLens_RD smallLens = new PalindromeLens_RD("babbab"); // has 11 palindrome substrings

    @Test
    public void settingStartIndexTo17ReturnsStartIndexOf17() {
        blankLens.setStartIndex(17);
        Assert.assertEquals(blankLens.getStartIndex(), 17);
    }

    @Test
    public void initializingBlankLensReturnsStartIndexOf0() {
        Assert.assertEquals(blankLens.getStartIndex(), 0);
    }

    @Test
    public void initializingSmallLensReturnsStartIndexOf0() {
        Assert.assertEquals(smallLens.getStartIndex(), 0);
    }


    @Test
    public void settingEndIndexTo13ReturnsEndIndexOf13() {
        blankLens.setEndIndex(13);
        Assert.assertEquals(blankLens.getEndIndex(), 13);
    }

    @Test
    public void initializingBlankLensReturnsEndIndexOf0() {
        Assert.assertEquals(blankLens.getEndIndex(), 0);
    }

    @Test
    public void newSmallLensReturnsEndIndexOf5() {
        Assert.assertEquals(smallLens.getEndIndex(), 5);
    }


    @Test
    public void settingPalindromeSizeTo25ReturnsPalindromeSizeOf25() {
        blankLens.setPalindromeSize(25);
        Assert.assertEquals(blankLens.getPalindromeSize(), 25);
    }

    @Test
    public void initializingBlankLensReturnsPalindromeSizeOf0() {
        Assert.assertEquals(blankLens.getPalindromeSize(), 0);
    }

    @Test
    public void newSmallLensReturnsPalindromeSizeOf6() {
        Assert.assertEquals(smallLens.getPalindromeSize(), 6);
    }


    @Test
    public void settingIndexOffsetTo2ReturnsIndexOffsetOf2() {
        blankLens.setIndexOffset(15);
        Assert.assertEquals(blankLens.getIndexOffset(), 15);
    }

    @Test
    public void initializingBlankLensReturnsIndexOffsetOf0() {
        Assert.assertEquals(blankLens.getIndexOffset(), 0);
    }

    @Test
    public void newSmallLensReturnsIndexOffsetOf0() {
        Assert.assertEquals(smallLens.getIndexOffset(), 0);
    }


    @Test
    public void settingMaxIndexOffsetTo8ReturnsIndexOffsetOf8() {
        blankLens.setMaxIndexOffset(8);
        Assert.assertEquals(blankLens.getMaxIndexOffset(), 8);
    }

    @Test
    public void initializingBlankLensReturnsMaxIndexOffsetOf0() {
        Assert.assertEquals(blankLens.getIndexOffset(), 0);
    }

    @Test
    public void newSmallLensReturnsMaxIndexOffsetOf2() {
        Assert.assertEquals(smallLens.getMaxIndexOffset(),2);
    }
}
