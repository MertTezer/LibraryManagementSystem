package librarymanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static librarymanagementsystem.FactoryPattern.SuccPage;
import static librarymanagementsystem.LibraryManagementSystem.TextDeleteID;

public class FactoryPatternDelete implements ActionListener {
    static JFrame DeletePage;
    @Override
    public void actionPerformed(ActionEvent e) {
        String deleteObject=TextDeleteID.getText();
        
        if(e.getActionCommand().equals("DELETE BOOK")){
            try {
                BufferedReader fileBook=new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\oop project\\book.txt"));
                String line=null;
                String input=" ";
                
                while((line=fileBook.readLine())!=null){
                    if(line.contains(deleteObject)){
                        line=" ";
                        JOptionPane.showMessageDialog(DeletePage,"Book delete succesfully!");
                    }
                    input += line+'\n';      
                }
                BufferedWriter FileBook=new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\Desktop\\oop project\\book.txt"));
                FileBook.write(input);
                FileBook.newLine();
                fileBook.close();
                FileBook.close();
                
            } 
            catch (Exception e1) {
                Logger.getLogger(FactoryPatternDelete.class.getName()).log(Level.SEVERE, null, e1);
            }
        }
        if(e.getActionCommand().equals("DELETE JOURNAL")){
            try {
                BufferedReader fileJournal=new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\oop project\\journal.txt"));
                String line=null;
                String input="";
                
                while((line=fileJournal.readLine())!=null){
                    if(line.contains(deleteObject)){
                        line=" ";
                        JOptionPane.showMessageDialog(DeletePage,"Book delete succesfully!");
                    }
                    input+=line+'\n';      
                }
                FileOutputStream FileJournal=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\oop project\\journal.txt");
                FileJournal.write(input.getBytes());
                fileJournal.close();
                FileJournal.close();
                
            } 
            catch (Exception e1) {
                Logger.getLogger(FactoryPatternDelete.class.getName()).log(Level.SEVERE, null, e1);
            }
            
        }
        if(e.getActionCommand().equals("DELETE DIGITAL")){
            try {
                BufferedReader fileDigital=new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\oop project\\digital.txt"));
                String line=null;
                String input=" ";
                
                while((line=fileDigital.readLine())!=null){
                    if(line.contains(deleteObject)){
                        line="";
                        JOptionPane.showMessageDialog(DeletePage,"Book delete succesfully!");
                    }
                    input+=line+'\n';      
                }
                FileOutputStream FileDigital=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\oop project\\digital.txt");
                FileDigital.write(input.getBytes());
                fileDigital.close();
                FileDigital.close();
                
            } 
            catch (Exception e1) {
                Logger.getLogger(FactoryPatternDelete.class.getName()).log(Level.SEVERE, null, e1);
            }
        
        }
    }
    
}
