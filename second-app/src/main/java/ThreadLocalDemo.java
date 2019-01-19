import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadLocalDemo {

    static ThreadLocal<SimpleDateFormat> tl = new ThreadLocal<SimpleDateFormat>();

    public static void main(String[] args) {

        File file = new File("");

        try {
            InputStream inputStream = new FileInputStream("");
            Reader reader = new FileReader("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        Vector vector = new Vector();

        vector.add(new Object());


        Hashtable hashtable = new Hashtable();
        HashMap hashMap = new HashMap();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();

        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        try {
            if (tl.get() == null) {
                tl.set(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
            }
            String s = tl.get().format(new Date());
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

        int[] arr = new int[]{2,3,8,10,6,9,5};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
