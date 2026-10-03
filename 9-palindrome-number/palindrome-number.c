bool isPalindrome(int x) {
    long num1=x,num2=0;
        while(x!=0)
        {
            num2=num2*10+(x%10);
            x=x/10;
        }
        if(num2==num1 && num1>=0)
        return true;
        else return false;
    
}