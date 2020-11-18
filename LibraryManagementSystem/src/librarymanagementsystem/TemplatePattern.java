package librarymanagementsystem;

import java.awt.FlowLayout;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;


public abstract class TemplatePattern {
    public abstract void createFrame();
    public abstract void createLabel();
    public abstract void readObj();   
    public void finalGUI(){
        createFrame();
        createLabel();
        readObj();
    }
}
class bookClass extends TemplatePattern{
    static JFrame WindowBookPage;
    static JLabel LabelBookPage;
    static JTextArea TextBookPage;
  
    @Override
    public void createFrame() {
        
        WindowBookPage =new JFrame();
        WindowBookPage.setBounds(111,111,656,491);
        WindowBookPage.setVisible(true);
        WindowBookPage.setLayout(null);   
    }
    @Override
    public void createLabel() {
        LabelBookPage= new JLabel();
        LabelBookPage.setSize(180, 56);
        LabelBookPage.setLocation(21,22);
        LabelBookPage.setFont(new Font("Roman",Font.ITALIC,36));
        LabelBookPage.setText("Books:");
        LabelBookPage.setVisible(true);
        WindowBookPage.add(LabelBookPage);
    }
    @Override
    public void readObj() {      
        TextBookPage=new JTextArea();
        TextBookPage.setBounds(16, 85, 569, 341);
        TextBookPage.setVisible(true);
        TextBookPage.setEditable(false);
        WindowBookPage.add(TextBookPage);     
        try{
        FileReader file= new FileReader("C:\\Users\\Lenovo\\Desktop\\oop project\\book.txt");
        BufferedReader readbook=new BufferedReader(file);
        TextBookPage.read(readbook, file);
        
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    
}

class journalClass extends TemplatePattern{
    
    static JFrame WindowJournalPage;
    static JLabel LabelJournalPage;
    static JTextArea TextJournalPage;
    
    @Override
    public void createFrame() {
        
        WindowJournalPage =new JFrame();
        WindowJournalPage.setBounds(111,111,656,491);
        WindowJournalPage.setVisible(true);
        WindowJournalPage.setLayout(null);
    }

    @Override
    public void createLabel() {
        
        LabelJournalPage= new JLabel();
        LabelJournalPage.setSize(180, 56);
        LabelJournalPage.setLocation(21,22);
        LabelJournalPage.setFont(new Font("Roman",Font.ITALIC,36));
        LabelJournalPage.setText("Journal:");
        LabelJournalPage.setVisible(true);
        WindowJournalPage.add(LabelJournalPage);
        
    }
    
    @Override
    public void readObj() {
        
        TextJournalPage=new JTextArea();
        TextJournalPage.setBounds(16, 85, 569, 341);
        TextJournalPage.setVisible(true);
        TextJournalPage.setEditable(false);
        WindowJournalPage.add(TextJournalPage);
        
        try{
        FileReader file= new FileReader("C:\\Users\\Lenovo\\Desktop\\oop project\\journal.txt");
        BufferedReader readjournal=new BufferedReader(file);
        TextJournalPage.read(readjournal, file);
        
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}

class digitalClass extends TemplatePattern{
    
    static JFrame WindowDigitalPage;
    static JLabel LabelDigitalPage;
    static JTextArea TextDigitalPage;

    @Override
    public void createFrame() {
        WindowDigitalPage =new JFrame();
        WindowDigitalPage.setBounds(111,111,656,491);
        WindowDigitalPage.setVisible(true);
        WindowDigitalPage.setLayout(null);
        
    }

    @Override
    public void createLabel() {
        
        LabelDigitalPage= new JLabel();
        LabelDigitalPage.setSize(250, 56);
        LabelDigitalPage.setLocation(21,22);
        LabelDigitalPage.setFont(new Font("Roman",Font.ITALIC,36));
        LabelDigitalPage.setText("Digital Media:");
        LabelDigitalPage.setVisible(true);
        WindowDigitalPage.add(LabelDigitalPage);
        
    }

    @Override
    public void readObj() {
        
        TextDigitalPage=new JTextArea();
        TextDigitalPage.setBounds(16, 85, 569, 341);
        TextDigitalPage.setVisible(true);
        TextDigitalPage.setEditable(false);
        
        WindowDigitalPage.add(TextDigitalPage);
        
        try{
        FileReader file= new FileReader("C:\\Users\\Lenovo\\Desktop\\oop project\\digital.txt");
        BufferedReader readbook=new BufferedReader(file);
        TextDigitalPage.read(readbook, null);
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
    
