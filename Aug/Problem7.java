public class Problem7{
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        while(index>=0 && digits[index]==9){
            digits[index] = 0;
            index--;
        }
        if(index>=0){
            digits[index] = digits[index] + 1;            
        }
        else{
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for(int i=0;i<digits.length;i++){
                newDigits[i+1] = digits[i];
            }
            return newDigits;
        }
        return digits;
    }
}