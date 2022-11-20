package CodingBat1014;

public class sumDigits {
    public static void main(String[] args) {
String str = "aa1bc2d3";
        System.out.println(sumDigits(str));
    }
    public static int sumDigits(String str) {

        char[] arr = str.toCharArray();
        int count =0;

        for (int i = 0; i < arr.length ; i++) {
        if (arr[i]=='1'){
            count=count+Integer.parseInt(arr[i]+"");
        }
            if (arr[i]=='2'){
                count=count+Integer.parseInt(arr[i]+"");
            }
            if (arr[i]=='3'){
                count=count+Integer.parseInt(arr[i]+"");
            }
            if (arr[i]=='4'){
                count=count+Integer.parseInt(arr[i]+"");
            }
            if (arr[i]=='5'){
                count=count+Integer.parseInt(arr[i]+"");
            }
            if (arr[i]=='6'){
                count=count+Integer.parseInt(arr[i]+"");
            }
            if (arr[i]=='7'){
                count=count+Integer.parseInt(arr[i]+"");
            }
            if (arr[i]=='8'){
                count=count+Integer.parseInt(arr[i]+"");
            }
            if (arr[i]=='9'){
                count=count+Integer.parseInt(arr[i]+"");
            }

        }
return count;
    }

}
