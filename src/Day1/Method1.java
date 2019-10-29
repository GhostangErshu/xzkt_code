package Day1;

public class Method1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000000; i++) {
            int count = 0;
            for(int j=2;j<Math.sqrt(i);j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0)
                System.out.println(i);
        }
    }
}

