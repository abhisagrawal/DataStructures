package StringAndArray;

class ReverseStringUsingRecurrsion{
    StringBuilder temp;
    
    ReverseStringUsingRecurrsion(String sb){
        temp = new StringBuilder(sb);
    }
    
    public void reverseString(int pos){
        if(pos==(temp.length()-1)){
            char ch = temp.charAt(pos);
            temp = new StringBuilder();
            temp.append(ch);
            return;
        }else{
            char ch = temp.charAt(pos);
            reverseString(pos+1);
            temp.append(ch);
        }
    }
    
    public static void main(String args[]){
        ReverseStringUsingRecurrsion obj = new ReverseStringUsingRecurrsion("abcdefgh");
        System.out.println("String before reversal:"+obj.temp);
        obj.reverseString(0);
        System.out.println("String After reversal:"+obj.temp);
    }
}