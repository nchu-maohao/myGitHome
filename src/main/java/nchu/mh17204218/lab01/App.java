package nchu.mh17204218.lab01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

public class App {
	public static void main(String[] args) throws IOException {
      
		
		BufferedReader br1 = new BufferedReader(new FileReader("a.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("b.txt"));
		String id = br1.readLine();
		String password = br2.readLine();
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入账户：");
		String i = sc.nextLine();
		System.out.print("请输入密码：");
		String p = sc.nextLine();
		if(sha256hex(id).equals(sha256hex(i))&&sha256hex(password).equals(sha256hex(p))) {
			System.out.print("登录成功");
		}
		else
			System.out.print("登录失败");
		br1.close();
		br2.close();
}
	public static String sha256hex(String input) {
		return DigestUtils.sha256Hex(input);
	}
}