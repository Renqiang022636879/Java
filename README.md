# 字符串实验
* 班级：计G191
* 学号：2019322052
* 姓名：任强
## 一、实验目的
* 掌握字符串String及其方法的使用
* 掌握异常处理
## 二、要求:
* 1、	每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
* 2、	允许提供参数，统计古诗中某个字或词出现的次数
* 3、	考虑操作中可能出现的异常，在程序中设计异常处理程序
三、实验代码  

package renqiang;

import java.util.Scanner;
class C{
	public static void main(String[] args) {
		String[]strings={"汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝"};
		shiyan.main(strings);
	}
}

public class shiyan {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0)
			throw new IllegalArgumentException("请输入字符串：");//调用class C中的数组参数
		String res=args[0];
		
		for(int i=0;i<res.length();i++){
			char c=res.charAt(i);
			System.out.print(c);
			if((i+1)%14==0){//每14个字符添加一个“。”
				System.out.println("。");
				continue;
			}
			else if((i+1)%7 ==0)//每7个字符添加一个“，”
				System.out.print(",");
		}
		System.out.println("输入想要搜索数量的字符：");
		Scanner reader=new Scanner(System.in);//接收键盘输入的字符
		String find=reader.nextLine();
		countString(res,find);
	}

	private static void countString(String str, String s) {
		// TODO Auto-generated method stub
		int count=0;
		while(str.indexOf(s)!=-1){//用while循环语句实现字符串的查询与计数
			str=str.substring(str.indexOf(s)+1,str.length());
			count++;
		}
		System.out.println(s+"出现的次数是："+count);//输出结果
	}
}


## 四、效果的实现
![image](https://github.com/Renqiang022636879/Java/blob/master/renqiang.png)
## 五、实验总结   
    通过本次实验掌握字符串的基本知识，掌握String类和StringBuffer类的特点及常用方法的使用，掌握String类和StringBuffer类的区别，掌握equao
    方法与==的区别，但是在本次练习中，由于知识上的失误和不小心犯下的低级错误，但是我来努力改正。
