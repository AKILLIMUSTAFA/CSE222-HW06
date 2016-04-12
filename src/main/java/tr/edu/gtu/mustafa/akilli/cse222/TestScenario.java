package tr.edu.gtu.mustafa.akilli.cse222;

/**
 * HW06_131044017_Mustafa_Akilli
 *
 * File:   TestScenario
 *
 * Description:
 *
 * Test Scenario
 *
 * @author Mustafa_Akilli
 * @since Tuesday 13 April 2016 by Mustafa_Akilli
 */
public class TestScenario
{
    public static void main( String[] args )
    {
        HuffmanTree huffmanTree = new HuffmanTree();

        // Create symbol array
        HuffmanTree.HuffData[] symbols = {
                new HuffmanTree.HuffData(186, '_'),
                new HuffmanTree.HuffData(103, 'e'),
                new HuffmanTree.HuffData(80, 't'),
                new HuffmanTree.HuffData(64, 'a'),
                new HuffmanTree.HuffData(63, 'o'),
                new HuffmanTree.HuffData(57, 'i'),
                new HuffmanTree.HuffData(57, 'n'),
                new HuffmanTree.HuffData(51, 's'),
                new HuffmanTree.HuffData(48, 'r'),
                new HuffmanTree.HuffData(47, 'h'),
                new HuffmanTree.HuffData(32, 'd'),
                new HuffmanTree.HuffData(32, 'l'),
                new HuffmanTree.HuffData(23, 'u'),
                new HuffmanTree.HuffData(22, 'c'),
                new HuffmanTree.HuffData(21, 'f'),
                new HuffmanTree.HuffData(20, 'm'),
                new HuffmanTree.HuffData(18, 'w'),
                new HuffmanTree.HuffData(16, 'y'),
                new HuffmanTree.HuffData(15, 'g'),
                new HuffmanTree.HuffData(15, 'p'),
                new HuffmanTree.HuffData(13, 'b'),
                new HuffmanTree.HuffData(8, 'v'),
                new HuffmanTree.HuffData(5, 'k'),
                new HuffmanTree.HuffData(1, 'j'),
                new HuffmanTree.HuffData(1, 'q'),
                new HuffmanTree.HuffData(1, 'x'),
                new HuffmanTree.HuffData(1, 'z')
        };

        // Build hufffman tree
        huffmanTree.buildTree(symbols);

        System.out.println("PART 1 TEST");

        (huffmanTree).toString();

        System.out.println("********************");

        System.out.println("mustafa : " + huffmanTree.encode("mustafa",huffmanTree.huffTree));
        System.out.println("akilli  : " + huffmanTree.encode("akilli",huffmanTree.huffTree));
        System.out.println("&       : " + huffmanTree.encode("*",huffmanTree.huffTree));


    }
}
