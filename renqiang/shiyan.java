package renqiang;

import java.util.Scanner;
class C{
	public static void main(String[] args) {
		String[]strings={"������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯"};
		shiyan.main(strings);
	}
}

public class shiyan {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0)
			throw new IllegalArgumentException("�������ַ�����");//����class C�е��������
		String res=args[0];
		
		for(int i=0;i<res.length();i++){
			char c=res.charAt(i);
			System.out.print(c);
			if((i+1)%14==0){//ÿ14���ַ����һ��������
				System.out.println("��");
				continue;
			}
			else if((i+1)%7 ==0)//ÿ7���ַ����һ��������
				System.out.print(",");
		}
		System.out.println("������Ҫ�����������ַ���");
		Scanner reader=new Scanner(System.in);//���ռ���������ַ�
		String find=reader.nextLine();
		countString(res,find);
	}

	private static void countString(String str, String s) {
		// TODO Auto-generated method stub
		int count=0;
		while(str.indexOf(s)!=-1){//��whileѭ�����ʵ���ַ����Ĳ�ѯ�����
			str=str.substring(str.indexOf(s)+1,str.length());
			count++;
		}
		System.out.println(s+"���ֵĴ����ǣ�"+count);//������
	}
}

