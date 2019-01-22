public class JavaRecursion {

    public int triangle(int rows) {
        if (rows == 0)
        {
            return 0;
        }
        else
        {
            return triangle(rows-1) + rows;
        }
    }

    public int fibonacci(int n) {
        if (n == 0)
        {
            return 0;
        }
        if (n == 1)
        {
            return 1;
        }
        else
        {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        else if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2));
        }
        else {
            return countHi(str.substring(1));
        }
    }

    public int sumDigits(int n) {
        if (n < 10)
        {
            return n;
        }
        else
        {
            return sumDigits(n%10) + sumDigits(n/10);
        }
    }

    public String noX(String str) {
        if (str.length() < 2){
            if (str.equals("x")){
                return "";
            }
            return str;
        }
        if (str.substring(0,1).equals("x")){
            return noX(str.substring(1));
        }
        return str.substring(0,1) + noX(str.substring(1));
    }

    public int count11(String str) {
        if (str.length() < 2){
            return 0;
        }
        if (str.substring(0, 2).equals("11")){
            return 1 + count11(str.substring(2));
        }
        return count11(str.substring(1));
    }

    public int powerN(int base, int n) {
        if (n == 1)
        {
            return base;
        }
        else
        {
            return base * powerN(base, n - 1);
        }
    }

    public int count8(int n) {
        if (n < 10)
        {
            if (n == 8)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            int current;
            if ((n/10)%10 == 8 && n%10 == 8)
            {
                current = 2;
            }
            else if (n%10 == 8)
            {
                current = 1;
            }
            else
            {
                current = 0;
            }
            return current + count8(n/10);
        }
    }

}
