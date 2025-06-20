public class TryWithResources {
    public static void main(String[] args) {
        int num = 0;
        bufferedReader br = null;
        try{
            br = new bufferedReader(new inputStreamReader(System.in));
            num = Integer.parseInt((String) br.readline());
            System.out.println(num);
        }
        finally{
            br.close();
        }
    }
}
