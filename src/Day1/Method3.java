package Day1;

public class Method3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100_0000; i++) {
//            int j =0;
            int count = 0;
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    //不是0就代表有可整除因子
                    count++;
                    break;
                }
            }
            //正常退出
            if(count==0)
//            if(j==i)
                System.out.println(i);
        }
    }
}

