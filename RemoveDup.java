public class RemoveDup {
    public static boolean[] map = new boolean[26];  // here we declared boolean type map array as a static so that we can access it at any position in code.
    // here we know the java stores default value as 'false' for boolean. 
    
    public static void removeDuplicates(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);         // base condition
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a']== true){
            removeDuplicates(str, idx+1, newString);         // recursion 
        }else{
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString);         // recursion
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicates(str, 0, "");
    }
}
