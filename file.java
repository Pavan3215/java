import java.io.*;
class FileDemo
    {
       public static void main (String s[])throws IOException
          {
             String file1,file2;
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             try
                {
           System.out.println("Enter File To Read");
           file1=br.readLine();
           System.out.println("Enter File To Write");
           file2=br.readLine();
           FileInputStream f1=new FileInputStream (file1);
           FileOutputStream f2=new FileOutputStream (file2);
           int val=0;
           val=f1.read();
           while(val!=-1)
                     {
                 f2.write(val);
                 val=f1.read();
                     }
               f1.close();
               f2.close();
               f1=new FileInputStream (file2);
               val=0;
               System.out.println("Values Of File2...........");
               val=f1.read();
              while(val!=-1)
                         {
                     System.out.print((char)val);
                     val=f1.read();
                         }
                    f1.close();
                }
            catch(FileNotFoundException e)
                {
                  System.out.println("File is not available");
                 }
            catch(Exception e1)
                {
                      System.out.println(e1);
                }
          }
    }
