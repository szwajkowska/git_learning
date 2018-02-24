package aaa;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class aaa {



    public static void main(String[] args) {
        System.out.println("change");
        System.out.println("change2");
        copyTo();
        System.out.println("change on newImage");
    }

    public static void copyTo(){
        File newFile = new File("C:\\Users\\lukasz\\Desktop\\Ania\\X\\badName.txt");
        File oldFile = new File("C:\\Users\\lukasz\\Desktop\\Ania\\Y\\properName.txt");
        File dir = new File("C:\\Users\\lukasz\\Desktop\\Ania\\Y");
        try {
            if (oldFile.exists()){
//                FileUtils.forceDelete(oldFile);
                oldFile.delete();
            }
            FileUtils.copyFileToDirectory(newFile, dir);
            newFile.renameTo(new File("C:\\Users\\lukasz\\Desktop\\Ania\\Y\\properName.txt"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
