 import java.math.RoundingMode;
import java.text.DecimalFormat;
    public class position {
        public static void main(String[] args) {
            double a=9.81;
            double t=10;
            double vi=0;
            double xi=0 ;
            double position;
            position=0.5*a*t*t+vi*t+xi;

            DecimalFormat df=new DecimalFormat("#.##");
            df.setRoundingMode(RoundingMode.CEILING);
            System.out.print("the position is:  ");
            System.out.print(df.format(position));

        }
    }


