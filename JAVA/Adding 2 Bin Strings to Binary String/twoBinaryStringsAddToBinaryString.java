public class twoBinaryStringsAddToBinaryString
{
	public static void main(String[] args)
    {
        String ans = addBinaryString("001001101001000101010101"  , "101010101000101010101001001" );
        System.out.println(ans);


    }
    public static String addBinaryString(String a, String b)
	{
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }
            if (sum == 0 || sum == 1) {
                result.append(sum);
                carry = 0;
            }
            else if (sum == 2) {
                result.append("0");
                carry = 1;
            }
            else {
                result.append("1");
                carry = 1;
            }
            i--;
            j--;
        }
        if (carry == 1) {
            result.append("1");
        }

        String ans = result.reverse().toString();

        for (int k = 0; k < ans.length(); k++)
        {
            if(ans.charAt(k)=='1')
            {
                ans = ans.substring(k, ans.length() );
                break;
            }
        }

        return ans;
	}
}
