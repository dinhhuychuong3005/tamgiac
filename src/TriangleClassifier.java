public class TriangleClassifier {
    public static String TriangleClassifierTest(int a, int b,int c){
        int result1 = (int) Math.pow(a,2);
        int result2 = (int) Math.pow(b,2);
        int result3 = (int) Math.pow(c,2);
        if (a + b > c || a + c>b|| c + b > a){
            return "không phải tam giác";
        }else if(a==b&&b==c&&c==a){
            return "Tam Giac là tam giác đều";
        }
        else if(a==b||b==c||c==a){
            return "Tam giác là tam giác cân";
        }
        else if(result1+result2==result3|| result1+result3==result2 || result2+result3 == result1){
            return "Tam giác là tam giác vuông";
        }
        else {
            return "không phải tam giác";
        }
    }
}
