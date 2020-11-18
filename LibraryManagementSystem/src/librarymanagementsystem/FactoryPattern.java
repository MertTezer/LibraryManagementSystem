package librarymanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static librarymanagementsystem.LibraryManagementSystem.ErrorWindow;
import static librarymanagementsystem.LibraryManagementSystem.TextAddAuthor;
import static librarymanagementsystem.LibraryManagementSystem.TextAddID;
import static librarymanagementsystem.LibraryManagementSystem.TextAddName;
import static librarymanagementsystem.LibraryManagementSystem.TextAddYear;

public class FactoryPattern implements ActionListener{
    static JFrame SuccPage;

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand().equals("ADD BOOK")){
        
           try {
               BufferedWriter writeBook=new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\Desktop\\oop project\\book.txt",true));
               writeBook.write("---ID:");
               TextAddID.write(writeBook);
               writeBook.write("---Book Name:");
               TextAddName.write(writeBook);
               writeBook.write("---Book Author:");
               TextAddAuthor.write(writeBook);
               writeBook.write("---Book Year:");
               TextAddYear.write(writeBook);
               writeBook.newLine();
               writeBook.close();
           } catch (IOException ex) {
               Logger.getLogger(FactoryPattern.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           SuccPage=new JFrame("Succesfully!");
           JOptionPane.showMessageDialog(SuccPage,"Book add succesfully!");
       }
       if(e.getActionCommand().equals("ADD JOURNAL")){
           
           try {
               BufferedWriter writeBook=new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\Desktop\\oop project\\journal.txt",true));
               writeBook.write("---ID:");
               TextAddID.write(writeBook);
               writeBook.write("---Journal Name:");
               TextAddName.write(writeBook);
               writeBook.write("---Journal Producer:");
               TextAddAuthor.write(writeBook);
               writeBook.write("---Journal Year:");
               TextAddYear.write(writeBook);
               writeBook.newLine();
               writeBook.close();
           } catch (IOException ex) {
               Logger.getLogger(FactoryPattern.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           SuccPage=new JFrame("Succesfully!");
           JOptionPane.showMessageDialog(SuccPage,"Journal add succesfully!");
           
       }
       if(e.getActionCommand().equals("ADD DIGITAL")){
           try {
               BufferedWriter writeBook=new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\Desktop\\oop project\\digital.txt",true));
               writeBook.write("---ID:");
               TextAddID.write(writeBook);
               writeBook.write("---DigitalMedia Name:");
               TextAddName.write(writeBook);
               writeBook.write("---DigitalMedia Producer:");
               TextAddAuthor.write(writeBook);
               writeBook.write("---DigitalMedia Year:");
               TextAddYear.write(writeBook);
               writeBook.newLine();
               writeBook.close();
           } catch (IOException ex) {
               Logger.getLogger(FactoryPattern.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           SuccPage=new JFrame("Succesfully!");
           JOptionPane.showMessageDialog(SuccPage,"DigitalMedia add succesfully!");
           
           
       }
    }
    
}
  