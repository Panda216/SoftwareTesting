package cn.tjuscs.st;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test{	
public static List<String> getList(String[][]a){		
Random r=new Random();		
List<String> strs=new ArrayList<String>();		
int n=1;		
//���㹲�ж�������� ����Ϊ�������鳤�ȵĻ�		
for(int i=0;i<a.length;i++){			
n*=a[i].length;		
}		
for(int i=0;i<n;i++){			
String c="";			
for(int j=0;j<a.length;j++){
//ÿһ��������ȡһ�����Ԫ��				
int index=r.nextInt(a[j].length);//������ķ�Χ���������ĳ���				
c+=a[j][index];			
}			
//�жϼ������Ƿ������Ԫ��,��������+1,������ӵ����������			
if(strs.contains(c)){				
n++;			
}else{				
strs.add(c);			
}		
}		
Collections.sort(strs);//�������һ��		
return strs;	
}	
public static void main(String[] args) {		
String[][]a={{"a","c"},{"d","e"},{"f","g"},{"h","i"},{"c","y"}};		
List<String>strs=getList(a);		
for(String s:strs){			
System.out.println(s);		
}		
System.out.println("����"+strs.size()+"��");	
}
}