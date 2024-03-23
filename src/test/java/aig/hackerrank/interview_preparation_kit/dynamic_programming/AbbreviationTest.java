package aig.hackerrank.interview_preparation_kit.dynamic_programming;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class AbbreviationTest {

  Abbreviation classUnderTest = new Abbreviation();

  @ParameterizedTest
  @MethodSource("exampleStream")
  void testSample0(String a, String b, String expected) {
    String answer = classUnderTest.abbreviation(a, b);
    assertThat(answer).isEqualTo(expected);
  }

  private static Stream<Arguments> exampleStream() {
    return Stream.of(
        Arguments.of("a", "A", "YES"),
        Arguments.of("aa", "A", "YES"),
        Arguments.of("aaA", "A", "YES"),
        Arguments.of("Aaa", "A", "YES"),
        Arguments.of("aAa", "A", "YES"),
        Arguments.of("aAa", "AA", "YES"),
        Arguments.of("bAa", "AA", "YES"),
        Arguments.of("aAa", "AAA", "YES"),
        Arguments.of("aAaA", "AAA", "YES"),
        Arguments.of("aAaAA", "AAA", "YES"),
        Arguments.of("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij",
            "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA",
            "YES"),
        Arguments.of("ThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydog"
                + "ThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydog"
                + "ThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydog"
                + "ThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydog"
                + "ThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydog"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "ThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydog"
                + "ThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydog"
                + "ThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydog"
                + "ThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydog"
                + "ThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydog"
                + "ThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydog"
                + "ThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydog"
                + "ThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydog"
                + "ThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydogThequickbrownfoxjumpsoverthelaydog",
            "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAZ",
            "NO"),
        Arguments.of("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij",
            "JIHGFEDCBAJIHGFEDCBAJIHGFEDCBAJIHGFEDCBA",
            "YES"),
        Arguments.of("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"
                + "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij",
            "ZZZZZZZZZZZZZZZZZZZZZZZ",
            "NO"),
        Arguments.of("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
            "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
                + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAZ",
            "NO")
        ,
        Arguments.of("A", "A", "YES"),
        Arguments.of("b", "A", "NO"),
        Arguments.of("AA", "A", "NO"),
        Arguments.of("dd", "A", "NO"),
        Arguments.of("Pi", "P", "YES"),
        Arguments.of("AfPZN", "APZNC", "NO"),
        Arguments.of("AaaB", "AB", "YES"),
        Arguments.of("AaaB", "AAB", "YES"),
        Arguments.of("LDJAN", "LJJM", "NO"),
        Arguments.of("UMKFW", "UMKFW", "YES"),
        Arguments.of("KXzQ", "K", "NO"),
        Arguments.of("AbcDE", "ABDE", "YES"),
        Arguments.of("daBcd", "ABC", "YES"),

        Arguments.of(
            "ERreEerREeerErrrrRRyeReErrerrereEEeRRErRrrereeeeerErereerReRereeeeCrreErREreeerrRrRERreeererererEeEEeerrerrereeRRerreeerrreRererereeSerEeeRereerrReErrrereErrerrrreererrsRRecerEreeRrrreRereerErrRRrrEeEererRrrreRerReRrereererereEeereEereesrERreReeerReErEeeeeRererReereRereerRrrRRerrerreeereEeeereerrEreeERreReRrEErRRerEereeeRreeErReerrEerEeEreerrTeeeEErreRErrerreeeeereeEeerERErRrereerreerRrrreerEreeRrErreeeRReRerrreerrEreerrerEeEeerreeeeEeerRrrerrsrerrereReREerEerrRerRErereRreerRreRReEeeeRerRereeerRerererrerrrreeReeERereeeesrrEerrrreeeeerrrrereeeeeerRrRrreeereRrreeseERrrrerReeeerreeeeereEerErrrRrreeeerRerrrrrErRreREeeerrrrrrrErrreerrRrereerrRrEEErsREeeerReEeErrrrRrRererereeererreereeRreerrerREeEReereerrrrrrereereeeerEeeeerreerSrReererrRereREreereErEReEReeeerrerEeeEeeRreeeRreeeEreeeeEreerrrEeereeerrrrERrRERReeerreEeJEEeSEeeeEeEeeRrRrrreeeRerrreerEreeererEereeeeRRrreReRrEerreEreeeerEErRrRrrrrerrereeEERErerreerrRrrreeeErEeErEreRrErRrErrreeeereeerrrrSeReeeeRerrrrerrEreerEeeeeeeerrreerreRerrREr",
            "ERREREERERRREERREERRERRREEEERRREREEECEREERRRERREEEERRREERRERRRRSERERERERERERRRRRREERREREERRREEERERRRRRRREREEESEREREREEEERRERERRRERRRRREEREREERERREERRERRERREREEEERRTEEEEREEREEEEEEEERERRRRERREERREREERRREREREEREEREEERRRERERERREEREERRERRERERERRRREEERRREERRRRREREREREEEEERRRRRRRREERRERRERRRERERRREEERRRRERRERERRRERRRREREERREEESREEREERRRERREEEERRERERREEREREEREERREEEEEERRRSRERREREEEERERREREEERRERREEEEEEEREEERERRERREREEJEESEEEEEEERRRREEREREEEEEERERRRRRRREEEEREERRREEREEERRREEEEREERRERRERRRSREEERERREERRRRER",
            "YES"),
        Arguments.of(
            "rReRRREreEreERRrreeeRrrrErReerreererEreEEseeEeErreEEereeerrerREreeeeerreeerrEEEReErrEeeeeREesrRerereRrreRreRRrreeEeEeERerrreweRrrEREEerRrrreRRrrEREreEerrrerrRerReeeerrErrreREreerrrRrreeereEseErreerrEreererRreereerrreeRrreEreerreRRErRERereEEerReReeEERrEEeeEeEeereeReeeeeReEerEREReseereRereEeeerEreEEereerEeEesrerrRerrererrerrReERrreeereeeeRerrEeeEerreRRrrRErseeErrEeeeerreeRErrRrRerrrrrerRErrerEeeeerrreerrreErrerEeeeeRRererrEReEeeererErErErRerrerErRrrRRrerrErrerrreErerrrreerreERReRerererErreRrererreRrReEERRereeeErEreeREEeeeErReRrreerRrRrreeRrRrEEEEereeerErrrerreErErrRRrreErReReRerrrerEereRreerererReERREeeeeeEeRerRerReeSrreesreeeeREeErresreeReeRrerrrrererrrrrreerrrrrrRREEerrerrErRRRereeerrREEreeEeerrEeeereeerReRerrrEEerrEEReEeerErerRrErSerErRRreERrerEeeerereEreEeerrREEEReereeRErerRrrrReeReEERrrerereereeErEEREeRSreRrRrreerrrReErReErerreerrrRrseererrerererrrreEeeRReRrerreeRerrRRerRPeeRerrreeRrrREereeEErererrRRRererrrerEEerrRrrReerRereeEerrsREEReEerEreEErrrsErreErereeerrrrRrrEeeErReEeReEeeeeEe",
            "RRRREERERREERRERREEEEEEEEEERRREREEERRREEEEEEREESRRRRRRREEERRRREERRERREREEREREEERERRREERRRRESERERRERRRREEEEERREREREEEERREEERREEEEEEREEEREEERERERREEREREEEEEERRREREERRREERRRRRREEREEEERERREREREERRREEREREERREREREEREERERERRRERERERERRRREERRRERERRRERRREERREEEEEREREEREEEERRRREERRRRERRREEEERERERERRRERRREEREEREERERREEEERRRESRESEREESRERRRRRRRERRRREEERERRRRERREEEEEEEEERRRRRREREEREEEERRESRRRRRREREEEEREERREEERRERRRREEERREEEEEERRSRRRERRERREERREERRRREERRRRRRRRRRPRRREEEEEEERRREEERRRRRERREEREEEEEREREEEERREEEREEREE",
            "NO"),
        Arguments.of(
            "yllyyyyllyyllyyyyllylyylyyyllllyyyyyyyllllylllylyylyllyylylyllyllllylyylylllyllyyllyyllylllyyyyyyllyyyyllllylyyyllllylyllylyyyllyllyyylylyyllllyllyyyyyllylyllllllllyyyllyllyyylyylyyyyyyyylyyyllyylyylyyllylyllllyyyyllyylyyyyyyyyylyyyyllyylyylllyylylyylyyylllylyllylyyyylyllylylllylllllyylylyylllllyylylyylllylyyyyllyyyyyyylyllyyllllyllyyylyyllllllyyllyylllyylllyllyyyyylyllyllyyyllylyyyyllyylyllyyyyyyyylllyyyyyylyylyylylyyyyyyylllyyyyylylyllllyyyylyyllylyyylyllyyllyyyyyyyyylylllylylllyllylllyllylyllylyllylyllyyllllylllllyyyylllylllyllyllyylllyyyyllyllylylylyylyylyylyyylylllylylyylllllyyyllylylyylylllllyylyllyyylylyyyylyylyllylyyllylyllyyyylyyyyylyyyylclyylylylylyllyyylyyyllllllllylyllyylylylllyylylylylyyylyllyylyyllyyyyyyylllyyyyylllylyyllyylylyylllyyylylyyyllyllyyllylyllyylylylyylylyyyylyllllyyyylylylylllllllllylyllyllylllyyylylyyllylllylyylyylylyyylylyylyyyyllyyllylylyllyylyllylyyyyllyllyllylyyyllllylylllyllllyylllyyyyylylyllyllylylylllyyyllllylylyllllyylyllyyyyylyyyyylyllylyyyyylyylelyy",
            "LLYYYLYYLLYYYLLYLYYLYYYLLLLYYYYYYYLLLLYLLLYLYYLLLYYLYLYLLYLLLLYLYYLYLYLLYYLLYYLLYLLLYYYYYYLLYYYYLLLLYYYYLLLLYLYLLYLYYYLLYLLYYYLYLLLLYLLYYYYYLYLYLLLLLLLLYYYLLYLLYYYYLYYYYYYYLYYYLLYYLYYLYYLYLYLLLLYYYYLLLYYYYYYYYYYYLLYYLYYLLYYLYLYYLYYYLLLYLYLYLYYLYLLYLYLLLYLLLLYYLYLYYLLLLYYLYYYLLLYLYYYLYYYYYYYLYLYYLLLYLLYYYYLLLLLLYYLLYYLLLYYLLLYLYYYYYLYLLYLYYYLLLYYYYLLYYLYLLYYYYYYLLLYYYYYYLYYLYYLYLYYYYYLLYYLYLYLLLLYYYYYLLYLYYYLYLLYLLYYYYYYYYYLYLLLYLYLLLYLLYLLLYLYLYLYLYLYLYLLYLLLLYLLLLLYYYYLLYLLLLLYLYYLLLYYYYLLYLYLYLLYYLYYLYYLYYYLYLLLYLYLYYLLLLLYYYLLYLYLYYLYLLLLYYLYLLYYYLYYYYLYYLLLLYYLYYLLYYYYLYYYYLYYYLLYYLYLYLYLYLYYYLYYYLLLLLLLLYLYLLYLYLYLLYYLYLYLYYYLYYYLYYLLYYYYYYYLLLYYYYYLLYLYYLLYYLYLYYLLLYYYLYLYYYLLYLLYLLYLYLYYLYLLYLYLYYYLYLLLLYYYYLYLYLYLLLLLLLLYLYLYLLYLLLYYYLYLYLLYLLYLYYLYYLYLYYYLYLYYLYYYYLLYYLLYLYLLYYLLLYYYYYYLLYLYLYYLLLYLYLLYLLLYYLLLYYYYYLYLYLLYLYLYLLLLYYYLLLLLYLYLLLLYYLYLLYYYYYLYYYYYLYLYLYYYYYLYYLLYY",
            "YES"),
        Arguments.of(
            "rararaarraraaraArarrrraaaqararraararrrrrrraarrrrarAarraaaarraaryrraaarrraararrardaaarrrRaaarrRraaRarrrrrarraraaaaarrrarrararraarrararrrraraaaaarrarrrrraaarrrrarrrarararraraaaaaarrrararrrraRaraAraaraARARaraarraarararaarrarrArAraAarrrrarrrrRrrraraaraaarrraraaarrrarrrraRarararrraraaraaarraaaaaAaaarrrararraaaaararRaaarraaaRrarraraaaaraaarrrarraarraaraaarrraaaaararrrwraraaaraarraaarrraaararaaarraraaaaarrrrarrrraaaarrarrrrrararararararrArarraaaaraAArrrarrrArrArrAraarRrraraaaAraaarrrarraarnraaaaarraaraaaaraaararaaarrarraarraararraaraAaraaaraaaaaaaaArrrrrarararaaraarRaarrrrraarrraraararaaararaarraAraaaaArrAraarArrararrraarrararrrarRarrrrrrarrrrarraarraarrarrraraaaaararAarararaarraaRararrArarAaraaarrrrraaaaarrrraararraaraaraauaraaaaraaarrrarrrrrraarroaraarrrrarraraRrrraaaaarrraarraarrrraararrrrhraarrarrraaaaarararRrarArrrraraaaarArraarraarraraaaraarrrAaaaraaraaaaraaararaArrrraaarrararrarrraararaarrrrrarArrarrrraaaraarrrraaRarrrrararaaararrrarrararaaarararraarRraaarRrrrrraraarrraraarraraarrRarar",
            "RARARAARRARAAAARRRRRAAAARARRAARARRRRRRRAARRRRARAARRAAAARRAARRRAAARRRAARARRARAAARRRRAAARRRRAARARRRRRARRARAAAAARRRARRARARRAARRARARRRRARAAAAARRARRRRRAAARRRRARRRARARARRARAAAAAARRRARARRRRARARAARAARAARARARAARRAARARARAARARRARARAAARRRRARRRRRRRRARAARAARRRARAAARRRARRRRARARARARRRARAARAAARRAAAAAAAAARRRARARAAAAARARRAARRAAARRARRARAAAARAARRRARRAARRAARAAARRRAAAAARARRRRARAAARAARRAAARRRAARARAAARRARAAAAARRRRARRRRAAAARRARRRRRARARARARARARRARARRAAAARAAARRRARRRARRARRARAARRRRAAAAARAAARRRRRAAAAAAARRAARAAARAARARAAARRARRAARRAARARRAARAAAAAARAAAAAAAAARRRRRAARARAARAARRARRRRRAARRARAARRAAARARAARRAARAAAAARRARAARARARARRRAARRARARRRARRARRRRRRARRRRARRAARRAARRARRRARAAAAARARAARARAAARRAARARARRARARAARAAARRRRRAAAARRRAARARRAAAARAAARAAAARAAARRRARRRRRRAARRARAARRRRARRARARRRRAAAAARRRAARRAARRRAARARRRRRARARRRAAAAARARARRRARARRRRARAAARARAARAARRAAAARAARRRAAAARARAAAARAARARAARRRRAAARRARRRARRRARARAARRRRRARARRARRRAAARAARRRRAAARRRRARARAAARARRRARARRAAARARARRARRRAARRRRRRRARAARRARAARRARAARRRARAR",
            "NO"),
        Arguments.of(
            "rrrrrrRRRrrrrrrRrrrrarrRrRrrrrrrrRrRrRrRrrrRrrrrrRrrrrrrRrrrrrRRrRrRRrrrrrrRrrRrrArrrRrrrarrrrrrrrrRrrRrrrrrRrRarrrrrrrrrrrrrRrrrrrrrrRrrrRrRrrrRrRrrrrRrrrrrrrrRrrrrrrrRsrrrrrRrRrrrarrRrrrrrRrrRrrRrrRrrarRrarrrrrrrrrrrrarrrRrrrRrRrrRrrrrrrrrrrRrrrrrRRRrRrrrrrrrrrrararrrrRrRrrrrrRrrRrrRrrrrrrrrRrrRrrrrrRrRrrRrrrrrrrrRrrrrrRRrrrrRrrrrrrRrrrrrRrrrrrRrrrRrrrRrrrrrarRrrRRrrrRrrrrRrrrrrraRrRrrrrrRarrrrrrrrrRrrrrrrrrRRrrarRrrrrrrrRrrrrrrrrrrrRrrRrrrrRrrarRrrrRrrRrrrrrRrrrrRrrrRrRrrrrRrRrrRrrrrrrrRrrrrrrrrrRrrrrrrrrrrrrrrrrrRrrrrRRrRrarrrRRrrrrrrrrrrrrrrrrRrrrrrrrrrrrrrRrrRrrrRrrrrrrrrRrrrrrrRrrRrrrrrRrrrrrRRrrRRrrrRrRRRRrrRrrrrRRARrrrrrrrrrrRRrrrrrRrrrrrRrrrRrrrrrrrrraRrRrrrrRrArrrrrrrRrrrrrrrrrrrrrrrrRrrrrrRRrrrkrrrrrrRRrarrRrrrrrrrRrrrrRRrRrrrrrrRrRrrrrrrrrrrRrrrrRrrarrRRrRrrrrrArrrRRrrrrrrRrrrrrrrrRrrrrRrrRrRRrrrrRrrrrrrRRrarrRrrRrkrrrrrrrrrrrrRArrrRrrrrRrrRrRRrrrrrRrRrrrRrrrrrrrrrrRrrrrRRRrrrrrRrRrRrrrRrArrrRrrRrrarrrrrrrRCrrrrrrrrrrrrrrrraRrrrrraarrrrrRrrRArrrrrrRrrrRRrrrrrrrrrrrrrrrrRrR",
            "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRARRRRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRARRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRRARRRRRAARRRRRRRRRRRRRRRRRRRRRRRRRRRRR",
            "NO"),
        Arguments.of(
            "bbbbbbbbbbbbbbbbbbbbbbobbBbbbobbbbbbtbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbtbbbotbbbbbbbbbbbbbbbbbbbbbbBbbbbbbbbbbbbbbbbbbbbbbbbobbbbbbbbbbbbbbbbbbtbbbbbbbbBbbbbbbbbbbbbbbbtbtbbbbbbBbbbbbbbbbbbobbbbbbbbbbbbbbbbbbobbbbbbbbbbobbbBbbbbbbbbbbtbbbbbbbbbbbtbbbbbbbobbbbbbbbbbbbobbbbbbbobbbbbbbbbbbbbbbbtbbbbbbbbbbbbbbbbbbBbbbbbbbbbobbbBbbtbbbbbbbbbbboBobbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbobbtbbbtbbbbbbbbbbbbbbbobbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbBtbbbbbbbbbbbbbbbbbbbbbbbtbbbbbbbbbbbbbbbbbbbbbbbbbbbtbbbbbbtbbbbcbbbbbbbbtbbbbbbbbbbbbbbbbobbbbbbbbbbbbbbbbbbbbbbbbBbbbbbbbbbbbbbbbbbbbbbbbbobbBbbbbbbbbbbbbbbbobbbbbbbbbbbbobbbbbbbbbBbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbobbbbbbbbbbbbbbbbbbbbbbBbbbbBbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbobbbbbbbbBbbbbbbbbbbbBbbBbbbbbbbbbbbbbbbbbbbbbbbbtbbbbbbbbbbbbbbbbbbbbbbbtbbbobbbbbbbbbbbbbbbbbbbtbbbbbbbbbbbbbbbbtbobBbbbbbbbbbbbBoobbbbbbbbbbbbbbbbbbbobbbbbbbobbbbbbbbobobbbtbbBbtbbbbtbbbbbbbbbbbbbbbbbbbbbtbbbobbtbbbbbb",
            "BBBBBBBBBBBBBBBBBBBBOBBBBOBBBBBBTBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBTBBBOBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBTBBBBBBBBBBBBBBBBBTBBBBBBBBBBBBBBOBBBBBBBBBBBBBOBBBBBBBBOBBBBBBBBBBBBBBBBBBBBTBBBBBBOBBBBBBBOBBOBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBTBBBBBBBBBOOBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBOBBTBBBTBBBBBBBBBBBBOBBBBBBBBBBBBBBBBBBBBBBBBBBBTBBBBBBBBBBBBBBBBBBTBBBBBBBBBBBBBBBBBBBBTBBBBTBBBBBBBBBBTBBBBBBBBBBBBBOBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBOBBBBBBBBBBBBBBBBBBBBBBBBBOBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBOBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBOBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBTBBBBBBBBBBBBBBBBBBBBTBBBOBBBBBBBBBBBBBTBBBBBBBBBBBBBBBTOBBBBBBBOBBBBBBBBBBBBBBBBOBBBBBBOBBBBBOBBTBBBBBBBBBBBBBBBBBBBBBBTBBBBBTBBBBB",
            "NO"),
        Arguments.of(
            "rrrarrrrrrrrrrrrrrrrrrrrrrrrrarrrrrrrrrrrrrrrrrrrrrrrrrrrrrarrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrbrrrrrrrrrrrrrrarrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrarrrrrrrrrrrrarrrrrrrrrrarrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrarrrrrrrrrrrrrrrrrrrrrrrorrrrrrrrrrrrrrrrrrrrrrrrrkrrrrrrrrrrrrrrrrrrarrrrrrrrrrrrrrrrrrrrarrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrarrrrarrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrmrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrarrrrrrrrrrrrrrrarrrrrrrrrrrrrrrrrrrrrrrrrrrarrrrrrrrrrrrrrrrrrarrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrarrrrrrrarrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrarrrrrrrrrrarrrrrrrrrrrrrrrrrrrrrrrarrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrraarrrrrarrararrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrarrrrrrrrrrrrrrrarrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrarrrrrrrrrrrrrrrrrrrrrrrrrrrrr",
            "RRRARRRRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRRARRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRARRARARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRARRRRRRRRRRRRRRRRRRRRRRRRR",
            "YES"),
        Arguments.of(
            "bbbbbbbbbbbbbbbbbbbbbbbbbbbibbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbibbbbbbbibbbbbbbbbbbbbbbbbbbbubbbbbbbbbbbbbbibbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbtbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbtbbbbbbbbbbbttbbbtbbbbbbbbbbbbbbtbbbtbibbbbbbbbbbbbbbibbbbbbbbbbbbbbbbbbbbbbbbbbbbbbtbbbbbtbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbtibbbbbbibbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbtbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbubbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbibbbbbbbbbbbbbbbbbbbbibbbbbbbbbbbbbbbbbbbbbbbbbbiibbbibbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbibbbbbbbbbbbbbbbbbbbbbbbibbbbbbbibbibbbbbbbibbbbbbibbbbbbbbbibbbbibbbbbibbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbtbbbbbbbbbbbbbbbbbbbbibbbbbbbbbbbbbbbbtbbbbbbbbbbbbbbbbbbbbbbbbtbbbtbbbbtbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbtbtbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbibbbbbbbbbbbbbbbbbbbtbbbbibbbbbbbbbbbbbbbbbbbbbibbbbbbbbbbbbbbbbbibbbbbbbbbbbbbbbbb",
            "BBBBBBBBBBBBBBBBBBBBIBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBIBBBBBIBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBIBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBTBBBBBBBTTBBTBBBBBBBBBBBBBTBBBBBBBBBBBBBBIBBBBBBBBBBBBBBBBBBBBBBBBBBBTBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBTIBBBBBBIBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBTBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBIBBBBBBBBBBBBBBBBBBBBBIIBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBIBBBBBBBBBBBBBBBBBBBBBBBIBBBBBBBBIBBBBBIBBBBBBIBBBBBBBBIBBBBBBBBBBBBBBBBBBBBBBBBBBBBTBBBBBBBBBBBBBBBBBBBBBBBBBBBBBTBBBBBBBBBBBBBBBBBBBBTBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBTBTBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBIBBBBBBBBBBBBBBBBBBIBBBBBBBBBBBBBBBBIBBBBBBBBBBBBBBBIBBBBBBBBBBBBBBBB",
            "YES"),
        Arguments.of(
            "bbbbrtbbbbbbbbbbbbBbbbbbbobbbbbbbbbbrbbbbbbbsbbbbbbbbbbbbbbbbbbbbbbbsbbbbbbbbbobbbBbbrbbbbbbBbbbbbbbbbbbbbbbbbbbbbbbBsBbrbbbbbbbbbbbbbbbbbbbBbbbbbbbbbbbbBotbbbbbbbbbBbbbbbbbbbbbbbbbbbbrbbbbbBbbbbbbbbrbbbbbbbrbbbsbbbbobbbbbrbbbbbbbbBbbbbbbbbbbbbbbbbbbbbbbbbsbbbbbobbbbbbBbbbbBbbBbbbbbbbbbbbbbbbbbbbbbbtbbbbBbbbbbbbrbbbbbsbbbbbbrbbbobbbbbbbbbbbBbbbbbbbbbrbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbtbbbbbbbtbBbbsbbbbbbbbbbbbbbbbbbbbbbbbbbbtbbbbbbbbbbbbbbbrbbbbbbbbbbbbbbbbbbbbbbbbbbbBbbbbbbbbbbbbbbbbbbrbbbsbbBbsbbbbBbbbbbbbbbbbbbbbbbbbbbbbbbobBsBbbbbbbbbbbbrbbbbbbbbbbbbbbbbbsBbbbbbbbbbbbBbbbbbbbbbbbbbbrbbbbsbbbobtbbbbbbbbbbbObbbrbbbbBsbsbbbbbbbrbObbbobbbbbbbbobbbbtbtbosbbbbbbbbbbbbsbbObbbbbbrbbbbbBbbbbbrbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbsobBbbbbbbbbbbbbbbbbbbbbbbbbbbrBbbbobbbbobBbbbbbbbbbbbbbbrbbbbbbobbbbbbbbbbbBbBtbbbbbbrbbbbbbBbbbbbbtnbbbbbbBbbbbbtbtbbbbbbbbbbbbbrtbbbbbbbbbbrbbbbsoBobbbbbbbsbbbBbbbbbbbbbbbbbbobbsbbbbbbbbbbsbbobBbbbbbbbbbbosBbbbbbbbbbbbbbobbbbbobbbjbbbsbbBbbbbbbbbs",
            "BBBBRTBBBBBBBBBBBBBBBBOBBBBBBBBBRBBBBBBSBBBBBBBBBBBBBBBBBBBSBBBBBBBBOBBBBRBBBBBBBBBBBBBBBBBBBBBBBBBBSBRBBBBBBBBBBBBBBBBBBBBBBBBBBBBBOTBBBBBBBBBBBBBBBBBBBBBRBBBBBBBBBBBBRBBBRBBBSBBBOBRBBBBBBBBBBBBBBBBBBBBBBBBBBSBBBBBOBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBRBBSBBBBRBBBOBBBBBBBBBBBBBBBBRBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBTBBBTBBBSBBBBBBBBBBBBBBBBBBBBBBTBBBBBBBBBBBBBBRBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBRBBSBBBSBBBBBBBBBBBBBBBBBBBBBBBBBBBBBSBBBBBBBBRBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBRBBBSBBBOBTBBBBBBBBBBBRBBBBBSBBBBRBOBBOBBBBBOBTBTBOSBBBBBBBBBSBBBBBBBRBBBBBBBBBRBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBSOBBBBBBBBBBBBBBBBBBBBBBBBBBBOBBBOBBBBBBBBBBBRBBBOBBBBBBBBBBBBTBBBBBBRBBBBBBBBBBBBTBBBBBBBBBBTBBBBBBRTBBBBBBBBBRBBSOBOBBBBSBBBBBBBBBBBBBBBBOBBSBBBBBBBBBBOBBBBBBBBOBBBBBBBBBBBBBOBBBBOBBBBBBSBBBBBBB",
            "NO"),
        Arguments.of(
            "ssssssssssssssssssssiisssissstsssssssssssssssssssssssssstsssslssssgsissstsssssssssslssssssssssssisssssssssisssssitssssssstslsssssssssssssssssssssstsssssssssssssbssssstsssssspssssssssssssssssssssssssssspssssssssssssssssssspssssssssssitsslissssssssssssssssssssssssssssssssssssssssssssssisssssslsslsssstsssssssssssslsssssssisssssssssssstsssssisssssssssssslsssssssssssssssssssssssssssssssssssssssssssssssssslstsssssssssssissssssssisssssssssspsssssssssssssssssssssssspsssssissssssssissssssssstspsssssstssssssssssslssslspssssssssssssssssisssssssssssssssssisssspssssssssssisssssssssssssssssstsssssssissssssssssssssssspslsssssssssstssssspsssssnssssslsssssssssssssssssssssissssssssssssssstsslssssssssssspsssssssssssisssssssssssssssstssssssssstsssslssspsssssssssssssspississspssssssssssstsssslpssssssssissssssssssssssssssssssstssssssssssssisssssssssssssslsssssssssssstsssssssssssisssssssssssssssssssssssssssstssssissssssssssssssssssssssssssspslsssssssissssssissssssssssssssspssssssssssssssssssssssssssissssssls",
            "SSSSSSSSSSSSSSSSSIISSSSSTSSSSSSSSSSSSSSSSSSSSSSSSSSSLSSSSSISSTSSSSSSSSLSSSSSSSSSISSSSSSSSSSSITSSSSSTSLSSSSSSSSSSSSSSSSSSTSSSSSSSSSSSSSTSSSSSPSSSSSSSSSSSSSSSSSSSSSSSPSSSSSSSSSSSSSSSSSSSSITSSISSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSISSSSSLSSLSSSTSSSSSSSSSLSSSSSSISSSSSSSSSSSTSSSSISSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSLSTSSSSSSSSSSISSSSSSSSSSSSSSSPSSSSSSSSSSSSSSSSSSSPSSSSSSSSISSSSSSSSSPSSSSSSSSSSSSLSSSSPSSSSSSSSSSSSSSSSISSSSSSSSSSSSSSSISSSPSSSSSSSSISSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSPSLSSSSSSSTSSSPSSSSSSSLSSSSSSSSSSSSSSSSISSSSSSSSSSSSSSTSLSSSSSSSSSSSPSSSSSSSISSSSSSSSSSSSSTSSSSSSSSTSSSSSSSSSSSSSSSPISSISSSPSSSSSSSSSSTSSSSLPSSSSISSSSSSSSSSSSSSSSSSSSSSTSSSSSSSSSSSISSSSSSSSLSSSSSSSSTSSSSSSSSSSSSSSSSSSSSSSSSSSSSSTSSSSSSSSSSSSSSSSSSSSSSPLSSSSSSISSSSSISSSSSSSSSSPSSSSSSSSSSSSSSSSSSSSSISSSS",
            "YES")
    );
  }
}

// aaaaAaAb Fa <- AAA B F
//    AB