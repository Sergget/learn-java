public class AppendStringTest  
{  
     public static void main(String[] args)  
            {  
              String text = "" ;  
              
              long beginTime = System.currentTimeMillis();  
              for ( int i= 0 ;i< 10000 ;i++)  
                     text = text + i;  
              long endTime = System.currentTimeMillis();  
              System.out.println("执行时间：" +(endTime-beginTime));  

              StringBuilder sb = new StringBuilder ( "" );  
              beginTime = System.currentTimeMillis();  
              for ( int i= 0 ;i< 10000 ;i++)  
                     sb.append(String.valueOf(i));  
              endTime = System.currentTimeMillis();  
              System.out.println("执行时间：" +(endTime-beginTime));  
            }  
} 