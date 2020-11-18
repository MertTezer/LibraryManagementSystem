package librarymanagementsystem;

public class FacadePatternMaker {
    private FacadePattern Bronze;
    private FacadePattern Silver;
    private FacadePattern Gold;
    
    public FacadePatternMaker(){
        Bronze=new SaveBronze();
        Silver=new SaveSilver();
        Gold=new SaveGold();
    }
    
    public void SaveSubBronze(){
        Bronze.Save();
    }
     public void SaveSubSilver(){
         Silver.Save();
     }
     public void SaveSubGold(){
         Gold.Save();
     }
}