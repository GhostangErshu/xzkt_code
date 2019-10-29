package Day1;

public class Method2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            int j =0;
            for(j=2;j<=i/2;j++){
                if(i%j==0)
                    break;
            }
            if(j==i/2+1)
                System.out.println(i);
        }
    }
}

