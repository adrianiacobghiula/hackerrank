package aig.hackerrank.interview_preparation_kit.greedy_algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ReverseShuffleMergeTest {

  @Test
  void testSampleExample() {
    String shuffleMerge = new ReverseShuffleMerge("abab").reverseShuffleMerge();
    assertThat(shuffleMerge).isEqualTo("ab");
  }

  @Test
  void testSample0() {
    String shuffleMerge = new ReverseShuffleMerge("eggegg").reverseShuffleMerge();
    assertThat(shuffleMerge).isEqualTo("egg");
  }

  @Test
  void testSample1() {
    String shuffleMerge = new ReverseShuffleMerge("abcdefgabcdefg").reverseShuffleMerge();
    assertThat(shuffleMerge).isEqualTo("agfedcb");
  }

  @Test
  void testSample2() {
    String shuffleMerge = new ReverseShuffleMerge("aeiouuoiea").reverseShuffleMerge();
    assertThat(shuffleMerge).isEqualTo("aeiou");
  }

  @Test
  void testSampleCustomCase0() {
    String shuffleMerge = new ReverseShuffleMerge("egeggg").reverseShuffleMerge();
    assertThat(shuffleMerge).isEqualTo("geg");
  }

  @Test
  void testSampleCustomCase1() {
    String shuffleMerge = new ReverseShuffleMerge("aabbccddeeff").reverseShuffleMerge();
    assertThat(shuffleMerge).isEqualTo("fedcba");
  }

  @Test
  void testSampleCase1() {
    String shuffleMerge =
        new ReverseShuffleMerge("bdabaceadaedaaaeaecdeadababdbeaeeacacaba").reverseShuffleMerge();
    assertThat(shuffleMerge).isEqualTo("aaaaaabaaceededecbdb");
  }

  @Test
  void testSampleCase2() {
    String shuffleMerge =
        new ReverseShuffleMerge(
                "djjcddjggbiigjhfghehhbgdigjicafgjcehhfgifadihiajgciagicdahcbajjbhifjiaajigdgdfhdiijjgaiejgegbbiigida")
            .reverseShuffleMerge();
    assertThat(shuffleMerge).isEqualTo("aaaaabccigicgjihidfiejfijgidgbhhehgfhjgiibggjddjjd");
  }

  @Test
  void testSampleCase4() {
    String shuffleMerge =
        new ReverseShuffleMerge(
                "fwfcrwgpfflojzfiljoqluudqxrymtegsydlyvvgmfgpwkqxixelvpnlvlrxlzxyyuwmvlmnnnfvvzloypchaaqxinfvraefxrwdtlaydcljlfxkmaznojjtjaesunggyjrkkfruyjlnqjksttnegzaenrhbefrybuzobtpglngfkrckbxognhzzqwaimpqoepkcjralekbrtgdziltaznrazwoljjgrjtfrmpwutzltlfyxcmrsvjkddhnkytdvbhydfxnsoyrnrmtahvhkdfogdeghjbtlgmckossrgsaoxijvpjickcunwjgkldcnprtkrfvytlyibsngvlbtkheeokwbalqmjksmjscqkhplkghgehgbjzzynmrppfonuvlpjlzeeqjztcexvcbecdstrggoemgpmsmmlroyglzdmunrfjtmqbkrrfqewpafhfmqhzhokzyjigiwkgkrkrhtqqvpgetwtzflcmxnsljuxcvivjsmjzyjptrofjfxocidxzefznuxnhzvjcgxpnymvkicnqqfchotgavqvwmivulgniatmeoqzymvsfjcqhcondbxqsukpulvuisjvzozedtepydvkoumpyvylzkqjvozhzrhkjfgkggwxjzesxtectvfvpkmfxddhjstomgfjqdyooxezsinfxwrknvtczgwwukwagjvdwiuwmbjigxnbrdyzepgeqfaezzekqvqdkkyiwpdfrjvxzxbltjrmulfceffmuzpzftodalvjejycdyzvgtggbaeedfvsstqomwmmdfsbxocfgqhkxjkqmradotmneufmbhgaklsrxkdkjlysgivqegsqtrrzpwrptelykgeatacslhqotootuhxloutefrksqwuiyvclfcmjkocjxgtqjshiyryccgesfgpjtxjohevathpvdmtppcbsnmsfezkbulprtphgcmqywrlefmbrebemjzfzhiqcolvhdduukstgrlo")
            .reverseShuffleMerge();
    assertThat(shuffleMerge).isEqualTo("aaaaaaaaaccddeikusbccfseagluimqvagocfqqcikvcjvhnuezxdcoxffortjyzjmsjvivcxujlsnxcfztwtegpvqqtgkwgijyzkohzhqmfhapweqbqmtfnumdzgolmmsmpgmeoggrtsdcebcvxectzjqeezjplvunofppmnyzzbgheghgklphkqcsjmsjmqabwkoeehktblvgnsbiltyvfrktrpcdkgjwnuckcijpvixosgrssokcmgltbhedgodkhvhtmrnryosnxfdyhbvdtykhddkjvsrmxyfltlztuwpmrftjrgjjlowzrnztizdgtrbkelrjkpeoqpmiwqzzhgoxbkrkfggptbozuyrfehrezenttskjqjyurfkkrjyggnusejtjjonzmkxfjldyltdwrxfervfixqhpyolzvvfnnnmlvmwuyyxzlxrlvlnpvlexixqkwpfmgvvyldysetmyrxqduulqojlfzjolffpgwrfwf");
  }
}
/*
aaaaaaaaaccd e ikusbdccfseagluimqvagocfqqcikvcjvhnuezxdcoxffortjyzjmsjvivcxujlsnxcfztwtegpvqqtgkwgijyzkohzhqmfhapweqbqmtfnumdzgolmmsmpgmeoggrtsdcebcvxectzjqeezjplvunofppmnyzzbgheghgklphkqcsjmsjmqabwkoeehktblvgnsbiltyvfrktrpcdkgjwnuckcijpvixosgrssokcmgltbhedgodkhvhtmrnryosnxfdyhbvdtykhddkjvsrmxyfltlztuwpmrftjrgjjlowzrnztizdgtrbkelrjkpeoqpmiwqzzhgoxbkrkfggptbozuyrfehrezenttskjqjyurfkkrjyggnusejtjjonzmkxfjldyltdwrxfervfixqhpyolzvvfnnnmlvmwuyyxzlxrlvlnpvlexixqkwpfmgvvyldysetmyrxqduulqojlfzjolffpgwrfwf

aaaaaaaaaccd d eikusbccfseagluimqvagocfqqcikvcjvhnuezxdcoxffortjyzjmsjvivcxujlsnxcfztwtegpvqqtgkwgijyzkohzhqmfhapweqbqmtfnumdzgolmmsmpgmeoggrtsdcebcvxectzjqeezjplvunofppmnyzzbgheghgklphkqcsjmsjmqabwkoeehktblvgnsbiltyvfrktrpcdkgjwnuckcijpvixosgrssokcmgltbhedgodkhvhtmrnryosnxfdyhbvdtykhddkjvsrmxyfltlztuwpmrftjrgjjlowzrnztizdgtrbkelrjkpeoqpmiwqzzhgoxbkrkfggptbozuyrfehrezenttskjqjyurfkkrjyggnusejtjjonzmkxfjldyltdwrxfervfixqhpyolzvvfnnnmlvmwuyyxzlxrlvlnpvlexixqkwpfmgvvyldysetmyrxqduul qojlfzjolff pgwrfwf
aaaaaaaaaccddeikusbccfseagluimqvagocfqqcikvcjvhnuezxdcoxffortjyzjmsjvivcxujlsnxcfztwtegpvqqtgkwgijyzkohzhqmfhapweqbqmtfnumdzgolmmsmpgmeoggrtsdcebcvxectzjqeezjplvunofppmnyzzbgheghgklphkqcsjmsjmqabwkoeehktblvgnsbiltyvfrktrpcdkgjwnuckcijpvixosgrssokcmgltbhedgodkhvhtmrnryosnxfdyhbvdtykhddkjvsrmxyfltlztuwpmrftjrgjjlowzrnztizdgtrbkelrjkpeoqpmiwqzzhgoxbkrkfggptbozuyrfehrezenttskjqjyurfkkrjyggnusejtjjonzmkxfjldyltdwrxfervfixqhpyolzvvfnnnmlvmwuyyxzlxrlvlnpvlexixqkwpfmgvvyldysetmyrxqduul qojlfzjolff pgwrfwf

 */