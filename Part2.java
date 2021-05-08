
/**
 * 在这里给出对类 Part2 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
import edu.duke.*;
import java.io.File;

public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon){
        String result = "";
        int startIndex = dna.indexOf(startCodon);
        if (startIndex == -1)
        {
            return "";
        }
        int stopIndex = dna.indexOf(stopCodon, startIndex+3);
        if (stopIndex == -1){
            return "";
        }
        result = dna.substring(startIndex, stopIndex+3);
        return result;
    }
    
    public void testFindGeneSimple(){
        //String dna = "AATGCGTAATATGGT";
        //String dna = "";
        String dna = "aatgcgtaatatggt";
        System.out.println("DNA started is " + dna);
        String gene = findSimpleGene(dna, "atg", "taa");
        System.out.println("Gene is " + gene);
    }
}
