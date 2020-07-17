package day06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Create By ${user} on 2020/6/21.
 * 使用I/O流技术实现文件复制		a.txt   复制到  b.txt
 * kgkitgit
 */
public class HomeWork {
    public static void main(String[] args) throws IOException {
        //从文件a.txt中读取文件
        FileInputStream fis = new FileInputStream("D:\\Test\\a.txt");
        byte[] b = new byte[1024];
        int length = fis.read(b);
        String str = new String(b,0,length);
        System.out.println(str);
        fis.close();

        //把读出的字符串复制到b.txt
        FileOutputStream fos = new FileOutputStream("D:\\Test\\b.txt");
        byte[] b2 = str.getBytes();
        fos.write(b2);
        System.out.println("写入成功");
        fos.close();
    }
}
