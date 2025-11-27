package assignment2;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Huffman {
    BinaryTrie codeTrie;
    Map<Character, String> codeTable;

    public Huffman(String s)
    {
        Map<Character,Integer> freq = new HashMap<Character,Integer>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);       // count the frequencies of each character in s
        }

        Collection<BinaryTrie> L = new LinkedList<BinaryTrie>();
        freq.forEach((c,f) -> {  L.add(new BinaryTrie(c,f)); } );       // create a binary trie for each character
        HeapOfBinaryTries H = new HeapOfBinaryTries(L.toArray(new BinaryTrie[L.size()])); // store these tries in the heap data structure

        codeTrie = findOptimalCode(H);              // calculate the optimal Huffman code as binary trie
        codeTable = codeTrie.createCodeTable();     // calculate the code table to facilitate encoding
    }

    private static BinaryTrie findOptimalCode(HeapOfBinaryTries H) {
        // TASK 3.B

        while(H.size() > 1){
            BinaryTrie left = H.extractMin();
            BinaryTrie right = H.extractMin();

            BinaryTrie combined = new BinaryTrie(left, right);

            H.insert(combined);
        }

        return H.extractMin();

    }

    public void printCodeTable() {
        codeTable.forEach((c,b) -> {
            System.out.println("'" + c + "' -> " + b);
        });
    }

    public String encode(String s)
    {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(codeTable.get(c));
        }
        return sb.toString();
    }

    public String decode(String s)
    {
        BinaryTrie n=codeTrie;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c=='0') {
                n = n.getLeft();
            } else if (c=='1') {
                n = n.getRight();
            }
            if (n.getCharacter()!=null) {
                sb.append(n.getCharacter());
                n=codeTrie;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "this is a small sentence to find the optimal binary code for";
        System.out.println(s);
        Huffman code = new Huffman(s);
        code.printCodeTable();
        String b = code.encode(s);
        System.out.println(b);
        String t = code.decode(b);
        System.out.println(t);
    }
}
