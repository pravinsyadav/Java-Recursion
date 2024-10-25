public class Occurance {
    public static int first = -1;    // here we cannot start from index 0 because we have to start from invalid value 
    public static int last = -1;      // because we are going to compare first and last with idx and it will confuse index with 0 so that's why we take -1

    public static void findOcu(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
            first = idx;
            }
            else{
            last = idx;
            }
        }

        findOcu(str, idx+1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOcu(str, 0, 'a');
    }
}