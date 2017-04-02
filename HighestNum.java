class HighestNum{
    public static void main (String[] args)
    {
        int a, b, c;
        System.out.println("Enter The first No :");
        a = Integer.parseInt(System.console().readLine());

        System.out.println("Enter The Second No :");
        b = Integer.parseInt(System.console().readLine());

        System.out.println("Enter The Third No :");
        c = Integer.parseInt(System.console().readLine());

        if (a > b && a > c)
        {
        	System.out.println("The Highest No. is : " + a);
        }
        else if(b > a && b > c)
        {
        	System.out.println("The Highest No. is : " + b);
        }
        else if(c > a && c > b)
        {
        	System.out.println("The Highest No. is : " + c);
        }
        else{
        	System.out.println("All nums are equal");
        }
    }
}