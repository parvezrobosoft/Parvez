package Firstevaluation;

public class DaysToYear {
     static String daysToYear(int n)
    {
        int years=0;
        int months=0;
        int days=0;
        int given=n;
        float leap =.25f;
        while(true)
        {
            if(n>=365&&leap!=1)
            {
                years++;
                n-=365;
            }
           else
            if (n>=366&&leap==1)
            {
                years++;
                n-=366;
            }
           else {
               break;
           }
           leap+=.25f;
        }


        months=n/30;

        days=n%30;

        return given+" Days = "+ years+" years "+months+" months "+days+" days ";
    }

    public static void main(String[] args) {

        int n=1627;
        System.out.println(daysToYear(n));

    }
}
