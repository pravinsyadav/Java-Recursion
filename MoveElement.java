public class MoveElement {
    public static void moveEle(String str, int idx, int count, char element, String neString){
        if(idx == str.length()){
            for(int i = 0; i< count; i++){
                neString += element;
            }
            System.out.println(neString);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == element){
            count++;
            moveEle(str, idx+1, count, element, neString);
        }else{
            neString += currChar;
            moveEle(str, idx+1, count, element, neString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveEle(str, 0, 0, 'x', "");
    }
}