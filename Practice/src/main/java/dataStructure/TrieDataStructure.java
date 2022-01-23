package dataStructure;
//Node of the trieNode
class trieNode{
    trieNode []node = new trieNode[26];
    boolean isEnd;
    trieNode()
    {
        for(int i=0;i<26;i++)
        {
            node[i]=null;
        }
        isEnd = false;
    }
};
public class TrieDataStructure {
    public void insert(trieNode root,String str)
    {
        trieNode crawl = root;
        int index ;
        for(int i=0;i<str.length();i++)
        {
            index = str.charAt(i)-'a';
            if(crawl.node[index]==null) {
                crawl.node[index] = new trieNode();
            }
            crawl = crawl.node[index];
        }
        crawl.isEnd=true;
    }
    public boolean search(trieNode root, String str)
    {
        trieNode crawl = root;
        int index ;
        for(int i=0;i<str.length();i++)
        {
            index = str.charAt(i)-'a';
            if(crawl.node[index]==null)
                return false;
            crawl = crawl.node[index];
        }
        return crawl.isEnd;
    }
    public static void main(String[] args) {
        trieNode root = new trieNode();
        String []input = new String[]{"the", "a", "there", "answer", "any","by", "bye", "their"};
        String []check = new String[]{"the", "ab", "theret", "answer", "anyone","by", "bye", "theirgoal"};

        TrieDataStructure ob = new TrieDataStructure();
        //putting values in the trie
        System.out.println("----------------- Inserting the values --------------");
        System.out.println("-----------------------------------------------------");
        for(int i=0;i<input.length;i++)
        {
            ob.insert(root,input[i]);
            System.out.println("\"" +input[i]+"\"" +" is inserted in trie");
        }
        //checking if the values present in the trie

        System.out.println("-------------- Searching the values -----------------");
        System.out.println("-----------------------------------------------------");
        for(int i=0;i<check.length;i++)
        {
            System.out.println("\"" +check[i]+"\"" +" Is available in trie : "+ob.search(root,check[i]));
        }
    }
}
