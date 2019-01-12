package com.mkyong.file;

import java.io.File; 

class CreateFile {  
  public static void main(String[] args)
  {  
    
      File f = new File("Suru.txt"); 

      if (f.createNewFile()) 
      {  
        System.out.println("File created: " + f.getName());  
      } else {  
        System.out.println("File already exists.");  
      }  
   
  }  
} 
