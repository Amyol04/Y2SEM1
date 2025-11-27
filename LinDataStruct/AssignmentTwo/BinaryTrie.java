package assignment2;

import java.util.HashMap;
import java.util.Map;

public class BinaryTrie {
    private int freq = 0;
    private Character c = null;
    private BinaryTrie left = null;
    private BinaryTrie right = null;

    // create a new leaf node for a Huffman code trie
    public BinaryTrie(char c, int freq)
    {
        this.freq = freq;
        this.c = c;
    }

    // create a new inner node for a Huffman code trie
    public BinaryTrie(BinaryTrie left, BinaryTrie right)
    {
        freq = left.freq + right.freq;
        this.left = left;
        this.right = right;
    }

    // compare two nodes of a Huffman code trie
    public Boolean compare(BinaryTrie T)
    {
        return freq<T.freq;
    }

    // create a code table for binary encoding
    public Map<Character, String> createCodeTable()
    {
        Map<Character, String> codeTable = new HashMap<Character, String>();
        if (c!=null) {
            codeTable.put(c,"");
        }
        else {
            if (left != null) {
                left.createCodeTable().forEach((c, b) -> {
                    codeTable.put(c, "0" + b);
                });
            }
            if (right != null) {
                right.createCodeTable().forEach((c, b) -> {
                    codeTable.put(c, "1" + b);
                });
            }
        }
        return codeTable;
    }

    public BinaryTrie getLeft()
    {
        return left;
    }

    public BinaryTrie getRight()
    {
        return right;
    }

    public Character getCharacter()
    {
        return c;
    }
}
