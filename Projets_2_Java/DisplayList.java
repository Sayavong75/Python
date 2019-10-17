import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DisplayList {

    // Stocke le nom de la liste
    ArrayList nameList;

    // Constructeur avec paramètres
    public DisplayList(ArrayList nameList) {
        this.nameList = nameList;
    }

    // ************* ACCESSEURS *************
    //Retourne le nom de la liste
    public ArrayList getNameList() {
        return nameList;
    }

    public String viewList() {
        String str = "";
        for (int i = 0; i < nameList.size(); i++) {
//            str += (i + 1) + " - " + nameList.get(i) + "\n";
            if (i != nameList.size() - 1) {
                str += (i + 1) + " - " + nameList.get(i) + "\n";
            } else {
                str += (i + 1) + " - " + nameList.get(i) ;
            }
        }
        return str;
    }
}
