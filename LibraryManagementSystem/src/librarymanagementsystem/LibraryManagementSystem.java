package librarymanagementsystem;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.awt.Font;
import javafx.scene.control.ComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LibraryManagementSystem{
    //MAIN PAGE
    static JFrame WindowMain;
    static JLabel HeaderLabel;
    static JButton buttonBook;
    static JButton buttonJournal;
    static JButton buttonDigital;
    static JButton buttonAdmin;
    static JButton buttonSubs;
    
    //ADMIN ENTER PAGE
    static JFrame WindowAdminEnter;
    static JTextField adminNameText;
    static JTextField adminPasswordText;
    static JButton adminEnterButton;
    
    //ERROR PAGE
    static JFrame ErrorWindow;
    static JFrame SubWindow;
    
    //ADMIN ADD PART
    static JFrame WindowUpdatePage;
    static JLabel LabelAdd;
    static JTextField TextAddName;
    static JTextField TextAddID;
    static JTextField TextAddAuthor;
    static JTextField TextAddYear;
    static JButton ButtonAddBook;
    static JButton ButtonAddJournal;
    static JButton ButtonAddDigital;
    
    //ADMIN DELETE PART
    static JLabel LabelDelete;
    static JTextField TextDeleteID;
    static JButton ButtonDeleteBook;
    static JButton ButtonDeleteJournal;
    static JButton ButtonDeleteDigital;
    
    //SUBSCRİBE PAGE
    static JFrame WindowSubs;
    static JLabel SubLabel;
    static JTextField TextSubName;
    static JTextField TextSubSurname;
    static JTextField TextSubMail;
    static JTextField TextSubPhone;
    static JTextField TextSubObjectID;
    static JTextField TextAlisTarihi;
    static JTextField TextObjectType;
    static JComboBox ComboSub;
    static JButton buttonSubsAdd;
    
    public static void main(String[] args) {
        
    WindowMain=new JFrame("Library Management System");
    WindowMain.setBounds(111, 111, 600, 621);
    WindowMain.setLayout(null);
    WindowMain.setVisible(true);
    WindowMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    HeaderLabel=new JLabel();
    HeaderLabel.setSize(487, 53);
    HeaderLabel.setLocation(66,25);
    HeaderLabel.setFont(new Font("Roman",Font.ITALIC,26));
    HeaderLabel.setText("LIBRARY MANAGEMENT SYSTEM");
    HeaderLabel.setVisible(true);
    WindowMain.add(HeaderLabel);
    
    buttonBook=new JButton("BOOK");
    buttonBook.setBounds(66,117,136,53);
    buttonBook.setVisible(true);
    WindowMain.add(buttonBook);
    buttonBook.addActionListener(e->{
        TemplatePattern readFunction= new bookClass();  
        readFunction.finalGUI();
    });
    
    buttonJournal=new JButton("JOURNALS");
    buttonJournal.setBounds(232,117,136,53);
    buttonJournal.setVisible(true);
    WindowMain.add(buttonJournal);
    buttonJournal.addActionListener(e->{
        TemplatePattern readFunction= new journalClass(); 
        readFunction.finalGUI();
    });
    
    buttonDigital=new JButton("DİGİTAL MEDIA");
    buttonDigital.setBounds(385,117,136,53);
    buttonDigital.setVisible(true);
    WindowMain.add(buttonDigital);
    buttonDigital.addActionListener(e->{
        TemplatePattern readFunction=new digitalClass();
        readFunction.finalGUI();
    });
    
    buttonAdmin=new JButton("ADMIN");
    buttonAdmin.setBounds(385, 414, 136, 53);
    buttonAdmin.setVisible(true);
    WindowMain.add(buttonAdmin);
    buttonAdmin.addActionListener(e->{
        
        WindowAdminEnter=new JFrame();
        WindowAdminEnter.setBounds(111,111,366,350);
        WindowAdminEnter.setVisible(true);
        WindowAdminEnter.setLayout(null);
        
        adminNameText=new JTextField("Username");
        adminNameText.setBounds(109, 100, 150, 25);
        adminNameText.setVisible(true);
        WindowAdminEnter.add(adminNameText);
        
        adminPasswordText=new JPasswordField("Password");
        adminPasswordText.setBounds(109, 150, 150, 25);
        adminPasswordText.setVisible(true);
        WindowAdminEnter.add(adminPasswordText);
        
        adminEnterButton=new JButton("ENTER");
        adminEnterButton.setBounds(140, 200, 87, 40);
        adminEnterButton.setVisible(true);
        WindowAdminEnter.add(adminEnterButton);
        adminEnterButton.addActionListener(e1->{
            String adminName=adminNameText.getText();
            String adminPassword=adminPasswordText.getText();
            
            if(adminName.equals("admin")&& adminPassword.equals("admin")){
                
                WindowUpdatePage=new JFrame();
                WindowUpdatePage.setBounds(111,111,504,474);
                WindowUpdatePage.setVisible(true);
                WindowUpdatePage.setLayout(null);
                
                LabelAdd=new JLabel();
                LabelAdd.setSize(70, 70);
                LabelAdd.setLocation(85,29);
                LabelAdd.setFont(new Font("Roman",Font.ITALIC,20));
                LabelAdd.setText("ADD:");
                LabelAdd.setVisible(true);
                WindowUpdatePage.add(LabelAdd);
                
                LabelDelete= new JLabel();
                LabelDelete.setSize(90,70);
                LabelDelete.setLocation(348, 29);
                LabelDelete.setFont(new Font("Roman",Font.ITALIC,20));
                LabelDelete.setText("DELETE:");
                LabelDelete.setVisible(true);
                WindowUpdatePage.add(LabelDelete);
                
                TextAddID=new JTextField("ID");
                TextAddID.setBounds(31, 90, 149, 31);
                TextAddID.setVisible(true);
                WindowUpdatePage.add(TextAddID);
                
                TextAddName=new JTextField("Name");
                TextAddName.setBounds(31, 137, 149, 31);
                TextAddName.setVisible(true);
                WindowUpdatePage.add(TextAddName);
                
                TextAddAuthor=new JTextField("Author");
                TextAddAuthor.setBounds(31, 184, 149, 31);
                TextAddAuthor.setVisible(true);
                WindowUpdatePage.add(TextAddAuthor);
                
                TextAddYear=new JTextField("Year");
                TextAddYear.setBounds(31, 230, 149, 31);
                TextAddYear.setVisible(true);
                WindowUpdatePage.add(TextAddYear);
                
                ButtonAddBook=new JButton("ADD BOOK");
                ButtonAddBook.setBounds(31,294,140,31);
                ButtonAddBook.setVisible(true);
                ButtonAddBook.addActionListener(new FactoryPattern());
                WindowUpdatePage.add(ButtonAddBook);
                
                ButtonAddJournal=new JButton("ADD JOURNAL");
                ButtonAddJournal.setBounds(31,341,140,31);
                ButtonAddJournal.setVisible(true);
                ButtonAddJournal.addActionListener(new FactoryPattern());
                WindowUpdatePage.add(ButtonAddJournal);
                
                ButtonAddDigital=new JButton("ADD DIGITAL");
                ButtonAddDigital.setBounds(31,388,140,31);
                ButtonAddDigital.setVisible(true);
                ButtonAddDigital.addActionListener(new FactoryPattern());
                WindowUpdatePage.add(ButtonAddDigital);
                
                TextDeleteID=new JTextField("ID");
                TextDeleteID.setBounds(302, 90, 149, 31);
                TextDeleteID.setVisible(true);
                WindowUpdatePage.add(TextDeleteID);
                
                ButtonDeleteBook=new JButton("DELETE BOOK");
                ButtonDeleteBook.setBounds(306,159,140,31);
                ButtonDeleteBook.setVisible(true);
                ButtonDeleteBook.addActionListener(new FactoryPatternDelete());
                WindowUpdatePage.add(ButtonDeleteBook);
                
                ButtonDeleteJournal=new JButton("DELETE JOURNAL");
                ButtonDeleteJournal.setBounds(306,206,140,31);
                ButtonDeleteJournal.setVisible(true);
                ButtonDeleteJournal.addActionListener(new FactoryPatternDelete());
                WindowUpdatePage.add(ButtonDeleteJournal);
                
                ButtonDeleteDigital=new JButton("DELETE DIGITAL");
                ButtonDeleteDigital.setBounds(306,253,140,31);
                ButtonDeleteDigital.setVisible(true);
                ButtonDeleteDigital.addActionListener(new FactoryPatternDelete());
                WindowUpdatePage.add(ButtonDeleteDigital); 
                
                ErrorWindow=new JFrame("ALERT");
                JOptionPane.showMessageDialog(ErrorWindow,"Please Check the Reservations");
            }
            else{
                ErrorWindow=new JFrame("MessageBox");
                JOptionPane.showMessageDialog(ErrorWindow,"Wrong Name or Password!");
            }
            
        });
         
    });
    
    buttonSubs=new JButton("SUBSCRIBE");
    buttonSubs.setBounds(66,414,136,53);
    buttonSubs.setVisible(true);
    buttonSubs.addActionListener(e1->{
        
        WindowSubs=new JFrame("Subscribe");
        WindowSubs.setBounds(111, 111, 505, 400);
        WindowSubs.setVisible(true);
        WindowSubs.setLayout(null);
        
        SubLabel=new JLabel();
        SubLabel.setSize(200, 39);
        SubLabel.setLocation(186,24);
        SubLabel.setFont(new Font("Roman",Font.ITALIC,24));
        SubLabel.setText("SUBSCRIBE");
        SubLabel.setVisible(true);
        WindowSubs.add(SubLabel);
        
        TextSubName=new JTextField("Name");
        TextSubName.setBounds(37,100,149,25);
        TextSubName.setVisible(true);
        WindowSubs.add(TextSubName);
        
        TextSubSurname=new JTextField("Surname");
        TextSubSurname.setBounds(37, 150, 149, 25);
        TextSubSurname.setVisible(true);
        WindowSubs.add(TextSubSurname);
        
        TextSubMail=new JTextField("Mail");
        TextSubMail.setBounds(37, 200, 149, 25);
        TextSubMail.setVisible(true);
        WindowSubs.add(TextSubMail);
        
        TextSubPhone=new JTextField("Phone");
        TextSubPhone.setBounds(37, 250, 149, 25);
        TextSubPhone.setVisible(true);
        WindowSubs.add(TextSubPhone);
        
        TextSubObjectID=new JTextField("ID");
        TextSubObjectID.setBounds(296, 100, 149, 25);
        TextSubObjectID.setVisible(true);
        WindowSubs.add(TextSubObjectID);
        
        TextAlisTarihi=new JTextField("Date");
        TextAlisTarihi.setBounds(296, 150, 149, 25);
        TextAlisTarihi.setVisible(true);
        WindowSubs.add(TextAlisTarihi);
        
        TextObjectType=new JTextField("Object Type");
        TextObjectType.setBounds(296, 200, 149, 25);
        TextObjectType.setVisible(true);
        WindowSubs.add(TextObjectType);
        
        ComboSub=new JComboBox();
        ComboSub.setBounds(295,250,149,25);
        ComboSub.setVisible(true);
        ComboSub.addItem("Bronze");
        ComboSub.addItem("Silver");
        ComboSub.addItem("Gold");
        WindowSubs.add(ComboSub);
        
        buttonSubsAdd=new JButton("SAVE");
        buttonSubsAdd.setBounds(186,314,106,39);
        buttonSubsAdd.setVisible(true); 
        buttonSubsAdd.addActionListener(e2->{
            
            if(ComboSub.getSelectedItem().equals("Bronze")){
                FacadePatternMaker savebronze=new FacadePatternMaker();
                savebronze.SaveSubBronze();
                SubWindow=new JFrame("MessageBox");
                JOptionPane.showMessageDialog(ErrorWindow,"You have been registered!!! \n Your usage time is 1 week");
                
            }
            if(ComboSub.getSelectedItem().equals("Silver")){
                FacadePatternMaker savesilver=new FacadePatternMaker();
                savesilver.SaveSubSilver();
                SubWindow=new JFrame("MessageBox");
                JOptionPane.showMessageDialog(ErrorWindow,"You have been registered!!! \n Your usage time is 15 days!!");
            }
            if(ComboSub.getSelectedItem().equals("Gold")){
                FacadePatternMaker savegold=new FacadePatternMaker();
                savegold.SaveSubGold();
                SubWindow=new JFrame("MessageBox");
                JOptionPane.showMessageDialog(ErrorWindow,"You have been registered!!! \n Your usage time is 1 month!!");
            }
        });
        WindowSubs.add(buttonSubsAdd);
        
        
    });
    WindowMain.add(buttonSubs);
   
      
    }
}
