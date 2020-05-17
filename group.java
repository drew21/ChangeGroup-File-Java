import java.nio.file.attribute.DosFileAttributeView;

import java.nio.file.Files;

import java.nio.file.Path;

import java.nio.file.Paths;

//import java.nio.file.attribute.FileTime;

//import java.time.Instant;

 

public class word {

    public static void main(String[] args){

 

        try{

            Path path = Paths.get("readonly.txt");

                                                                                                                                                                                                                               

            //Files.createFile(path);

            DosFileAttributeView dos = Files.getFileAttributeView(path,DosFileAttributeView.class);

            dos.setReadOnly(true);

                                                                                                                                                                                                                                File targetFile = new File("readonly.text");

                                                                                                                                                                                                                                                                                                                                                                Files.getFileAttributeView(targetFile.toPath(), PosixFileAttributeView.class LinkOption.NOFOLLOW_LINKS).setGroup(group);

            //Files.delete(path); Access denied exception

 

            //dos.setHidden(true);            //can change attributes all we want

            //dos.setTimes(null,FileTime.from(Instant.now()),null);

            dos.setReadOnly(false);

                                                                                                                                                                                                                               

            Files.delete(path);

                                                                                                                                                                                                                               

        }

        catch(IOException e){

            e.printStackTrace();

        }

    }

}