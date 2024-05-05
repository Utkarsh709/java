/*
import java.io.File;

public class filehandle1 {
    int pptxcounter=0;
    int docxcounter=0;
    int jpgcounter=0;

    public static void main(String[] args) throws 
Exception {
        filehandle1 f = new filehandle1();
        f.setNumbers("/home/utkarsh/Downloads");
    }
    public void setNumbers(String Path) {
        File file = new File(Path);
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.listFiles());
        System.out.println(file.listFiles().length);
        System.out.println(file.listFiles()[1]);
        for(int i=0;i<file.listFiles.length;i++){
          if(file.listFiles[i].endsWith("jpg"){
           jpgcounter++;
          }
              if(file.listFiles[i].endsWith("docx"){
           docxcounter++;
          }
              if(file.listFiles[i].endsWith("pptx"){
           pptxcounter++;
          }
        }
        System.out.println("jpg:"+jpgcounter);
        System.out.println("docx:"+docxcounter);
        System.out.println("pptx:"+pptxcounter);
        
        
    }
}

*/




import java.io.File;

class FileHandle1 {
    int pptxCounter = 0;
    int docxCounter = 0;
    int jpgCounter = 0;

    public static void main(String[] args) throws Exception {
        FileHandle1 f = new FileHandle1();
        f.setNumbers("/home/utkarsh/Downloads");
    }

    public void setNumbers(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
         System.out.println(files);
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
             System.out.println(files[i]);
                if (files[i].isFile()) {
                    String fileName = files[i].getName();
                    if (fileName.endsWith(".jpg")) {
                        jpgCounter++;
                    } else if (fileName.endsWith(".docx")) {
                        docxCounter++;
                    } else if (fileName.endsWith(".pptx")) {
                        pptxCounter++;
                    }
                }
            }
        }
        System.out.println("jpg: " + jpgCounter);
        System.out.println("docx: " + docxCounter);
        System.out.println("pptx: " + pptxCounter);
    }
}



