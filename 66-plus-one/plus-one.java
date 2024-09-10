class Solution {
    public int[] plusOne(int[] digits) {
       int carry = 0;
       int n = digits.length - 1;
       while(n >= 0){
        if(digits[n] == 9){
            digits[n] = 0;
            carry = 1;
            n--;
        }else{
            digits[n] = digits[n] + 1;
            carry = 0;
            break;
        }
       }
       if(n < 0 && carry == 1){
            int[] temp = new int[digits.length + 1];
            temp[0] = 1;
            for(int i = 1; i< temp.length; i++){
                temp[i] = digits[i-1];
            }
            return temp;
       }
return digits;
    }
}