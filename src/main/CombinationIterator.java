import java.util.NoSuchElementException;

/**
 * @author Yixiong J
 * @version 2019-10-03 20:50:00
 * https://leetcode.com/problems/iterator-for-combination/
 */
public class CombinationIterator {
    int[] pointers;
    char[] ch;
    boolean hasNext;
    public CombinationIterator(String characters, int combinationLength){
        pointers = new int[combinationLength];
        ch = characters.toCharArray();
        for(int i=0;i<pointers.length;i++){
            pointers[i]=i;
        }
        hasNext=true;
    }
    public String next(){
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        for(int p:pointers){
            sb.append(ch[p]);
        }
        hasNext=false;
        for(int i=0;i<pointers.length;i++){
            if (pointers[pointers.length - 1 - i] != ch.length - 1 - i) {
                hasNext = true;
                break;
            }
        }
        for(int i=pointers.length-1;i>=0;i--){
            if(i==pointers.length-1&&pointers[i]<ch.length-1){
                pointers[i]++;
                break;
            }
            else if(i<pointers.length-1&&pointers[i]<pointers[i+1]-1){
                pointers[i]++;
                for(int j = i+1;j<pointers.length;j++){
                    pointers[j]=pointers[j-1]+1;
                }
                break;
            }
        }
        return sb.toString();
    }
    public boolean hasNext(){
        return hasNext;
    }
}
