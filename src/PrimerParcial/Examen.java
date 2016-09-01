/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerParcial;

import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class Examen {
    
    public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    String str;
    String key;
    int keyLength;

    System.out.println("Amat Victoria Curam:");
    str=sc.nextLine();
    System.out.println("Enter encryption key:");
    key=sc.next();
    keyLength=key.length();
    
    for(;;)
    {
        System.out.println("1.Encrypt\n2.Decrypt\n3.Exit...");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            
                System.out.println("Amat Victoria Curam"+encrypt(str,keyLength));
                break;
            case 2:
               
                System.out.println("Todo Vale"+decrypt(encrypt(str,keyLength),keyLength));
                break;
            case 3:
                
                System.exit(0);
                break;
            default:
            System.out.println("No se pudo");
        }
    }
}
public static String encrypt(String str,int keyLength)
{
    String encrypted="";
    for(int i=0;i<str.length();i++)
    {
        
        int c=str.charAt(i);
        
        if(Character.isUpperCase(c))
        {
            c=c+(keyLength%26);
            
            if(c>'Z')
                c=c-26;
        }
       
        else if(Character.isLowerCase(c))
        {
            c=c+(keyLength%26);
            
            if(c>'z')
                c=c-26;
        }
        
        encrypted=encrypted+(char) c;
    }
    return encrypted;
}
public static String decrypt(String str,int keyLength)
{
    String decrypted="";
    for(int i=0;i<str.length();i++)
    {
        
        int c=str.charAt(i);
        
        if(Character.isUpperCase(c))
        {
            c=c-(keyLength%26);
            
            if(c<'A')
                c=c+26;
        }
        
        else if(Character.isLowerCase(c))
        {
            c=c-(keyLength%26);
           
            if(c<'a')
                c=c+26;
        }
        
        decrypted=decrypted+(char) c;
    }
    return decrypted;
}
}
   
