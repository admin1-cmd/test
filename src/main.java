import java.io.*;
import java.util.Scanner;

class main{
    public static void main(String[] args) throws FileNotFoundException {
        try {
            BufferedReader  br =  new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
            String b="";
            StringBuffer sb = new StringBuffer();
            try {
                while((b = br.readLine())!=null){
                    //得到文件内容放到sb中
                    sb.append(b+'\n');
                    //这里可以写自己想对每一行的处理代码
                }
                String s = sb.toString();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1])));
                bw.write(s);
                bw.flush();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch ( FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
