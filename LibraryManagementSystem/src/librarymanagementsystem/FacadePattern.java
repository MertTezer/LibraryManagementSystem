package librarymanagementsystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static librarymanagementsystem.LibraryManagementSystem.ComboSub;
import static librarymanagementsystem.LibraryManagementSystem.TextObjectType;
import static librarymanagementsystem.LibraryManagementSystem.TextAlisTarihi;
import static librarymanagementsystem.LibraryManagementSystem.TextSubMail;
import static librarymanagementsystem.LibraryManagementSystem.TextSubName;
import static librarymanagementsystem.LibraryManagementSystem.TextSubObjectID;
import static librarymanagementsystem.LibraryManagementSystem.TextSubPhone;
import static librarymanagementsystem.LibraryManagementSystem.TextSubSurname;

public interface FacadePattern{
    void Save();
}

class SaveBronze implements FacadePattern{
      
    @Override
    public void Save() {
        
        try {
            BufferedWriter writerBronze=new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\Desktop\\oop project\\bronzesub.txt"));
            writerBronze.write("--Sub Name:");
            TextSubName.write(writerBronze);
            writerBronze.write("--Sub Surname:");
            TextSubSurname.write(writerBronze);
            writerBronze.write("--Sub Mail:");
            TextSubMail.write(writerBronze);
            writerBronze.write("--Sub Phone:");
            TextSubPhone.write(writerBronze);
            writerBronze.write("--Object ID:");
            TextSubObjectID.write(writerBronze);
            writerBronze.write("--Object Type:");
            TextObjectType.write(writerBronze);
            writerBronze.write("--Taking Date:");
            TextAlisTarihi.write(writerBronze);
            writerBronze.close();
        } catch (IOException ex) {
           Logger.getLogger(FactoryPattern.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
class SaveSilver  implements FacadePattern{
   
    @Override
    public void Save() {

        try {
            BufferedWriter writerSilver=new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\Desktop\\oop project\\silversub.txt"));
            writerSilver.write("--Sub Name:");
            TextSubName.write(writerSilver);
            writerSilver.write("--Sub Surname:");
            TextSubSurname.write(writerSilver);
            writerSilver.write("--Sub Mail:");
            TextSubMail.write(writerSilver);
            writerSilver.write("--Sub Phone:");
            TextSubPhone.write(writerSilver);
            writerSilver.write("--Object ID:");
            TextSubObjectID.write(writerSilver);
            writerSilver.write("--Object Type:");
            TextObjectType.write(writerSilver);
            writerSilver.write("--Taking Date:");
            TextAlisTarihi.write(writerSilver);
            writerSilver.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(FactoryPattern.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
}

class SaveGold implements FacadePattern{
    
    @Override
    public void Save() {
       
        try {
             BufferedWriter writerGold=new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\Desktop\\oop project\\goldsub.txt"));
            writerGold.write("--Sub Name:");
            TextSubName.write(writerGold);
            writerGold.write("--Sub Surname:");
            TextSubSurname.write(writerGold);
            writerGold.write("--Sub Mail:");
            TextSubMail.write(writerGold);
            writerGold.write("--Sub Phone:");
            TextSubPhone.write(writerGold);
            writerGold.write("--Object ID:");
            TextSubObjectID.write(writerGold);
            writerGold.write("--Object Type:");
            TextObjectType.write(writerGold);
            writerGold.write("--Taking Date:");
            TextAlisTarihi.write(writerGold);
            writerGold.close();
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(FactoryPattern.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

